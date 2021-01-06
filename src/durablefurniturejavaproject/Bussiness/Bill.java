/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package durablefurniturejavaproject.Bussiness;

import durablefurniturejavaproject.DataAccess.SqlDataAcess;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.sql.Date;
import java.sql.ResultSet;
import java.util.List;

/**
 *
 * @author Redmibook 14
 */
public class Bill {

    int BillId;
    String ClientName;
    String Address;
    Date Date;
    String PhoneNumber;
    String Email;
    int StaffId;
    double TotalPrice;
    List<Product> listProduct = new ArrayList<Product>();
    SqlDataAcess db =new SqlDataAcess();

    public void InsertBill() throws SQLException {
        db = new SqlDataAcess();
        String sqlInsertBill = "Insert into bill (ClientName,Address,Date,PhoneNumber,Email,StaffId,TotalPrice) values (?,?,?,?,?,?,?)";
        db.OpenConnection();
        PreparedStatement stmt1 = db.connection.prepareCall(sqlInsertBill);
        stmt1.setString(1, ClientName);
        stmt1.setString(2, Address);
        stmt1.setDate(3, (java.sql.Date) Date);
        stmt1.setString(4, PhoneNumber);
        stmt1.setString(5, Email);
        stmt1.setInt(6, StaffId);
        stmt1.setDouble(7, TotalPrice);
        stmt1.execute();
        stmt1.closeOnCompletion();
        String sqlGetBillId = "SELECT MAX(BillId) as BillId from bill";
        ResultSet rs = db.ExecuteQuery(sqlGetBillId);
        rs.next();
        int billid = rs.getInt("BillId");
        for (int i = 0; i < listProduct.size(); i++) {
            String sqlInsertProductBill = "insert into productbill(BillId,ProductId,Quantity) values(?,?,?)";
            PreparedStatement stmt2 = db.connection.prepareCall(sqlInsertProductBill);
            stmt2.setInt(1, billid);
            stmt2.setInt(2, listProduct.get(i).getProductId());
            stmt2.setInt(3, listProduct.get(i).getQuantity());
            stmt2.execute();
            stmt2.closeOnCompletion();
            String sqlUpdateProductQuantity = "Update product set UnitInStock = (select (product.UnitInStock - productbill.Quantity) FROM product,bill,productbill where product.ProductId = productbill.ProductId and productbill.BillId = bill.BillId and bill.BillId = ? ) where product.ProductId = ?";
            PreparedStatement stmt3 = db.connection.prepareCall(sqlUpdateProductQuantity);
            stmt3.setInt(1, billid);
            stmt3.setInt(2, listProduct.get(i).getProductId());
            stmt3.execute();
            stmt3.closeOnCompletion();
        }
        db.CloseConnection();

    }
    
    List<Bill> billlist = new ArrayList();

    public List<Bill> GetAllBill() throws SQLException{
            String sql = "Select * from bill";
             List<Bill> lstBill = new ArrayList<Bill>();
             ResultSet rs = db.ExecuteQuery(sql);
            while (rs.next()) {
            Bill b = new Bill();
            b.BillId = rs.getInt("BillId");
            b.ClientName = rs.getString("ClientName");
            b.Address = rs.getString("Address");
            b.Date = rs.getDate("Date");
            b.PhoneNumber = rs.getString("PhoneNumber");
            b.Email = rs.getString("Email");
            b.StaffId = rs.getInt("StaffId");
            b.TotalPrice = rs.getDouble("TotalPrice");
            lstBill.add(b);
            }
            billlist = lstBill;
            
            return  lstBill;
    }
     public boolean DeleteBill(int BillId) throws SQLException {

        String sql = "Delete from bill where BillId  = ?";
        PreparedStatement stmt = null;
        db.OpenConnection();
        stmt = db.connection.prepareCall(sql);
        stmt.setInt(1, BillId);
        int res = stmt.executeUpdate();
        db.CloseConnection();
        return res == 1;
    }
    

    public int getBillId() {
        return BillId;
    }

    public void setBillId(int BillId) {
        this.BillId = BillId;
    }

    public String getClientName() {
        return ClientName;
    }

    public void setClientName(String ClientName) {
        this.ClientName = ClientName;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public Date getDate() {
        return Date;
    }

    public void setDate(Date Date) {
        this.Date = Date;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(String PhoneNumber) {
        this.PhoneNumber = PhoneNumber;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public int getStaffId() {
        return StaffId;
    }

    public void setStaffId(int StaffId) {
        this.StaffId = StaffId;
    }

    public double getTotalPrice() {
        return TotalPrice;
    }

    public void setTotalPrice(double TotalPrice) {
        this.TotalPrice = TotalPrice;
    }

    public List<Product> getListProduct() {
        return listProduct;
    }

    public void setListProduct(List<Product> listProduct) {
        this.listProduct = listProduct;
    }

}

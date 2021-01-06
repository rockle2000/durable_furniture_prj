/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package durablefurniturejavaproject.Bussiness;

import durablefurniturejavaproject.DataAccess.SqlDataAcess;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Admin
 */
public class ProductBill {
    int BillId;
    int Productid;
    int Quantity;

    public ProductBill(int BillId, int Productid, int Quantity) {
        this.BillId = BillId;
        this.Productid = Productid;
        this.Quantity = Quantity;
    }
SqlDataAcess db =new SqlDataAcess();
    public ProductBill() {
    }
public boolean DeleteProductBill(int BillId) throws SQLException {

        String sql = "Delete from productbill where BillId  = ?";
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

    public int getProductid() {
        return Productid;
    }

    public void setProductid(int Productid) {
        this.Productid = Productid;
    }

    public int getQuantity() {
        return Quantity;
    }

    public void setQuantity(int Quantity) {
        this.Quantity = Quantity;
    }
     
    
}

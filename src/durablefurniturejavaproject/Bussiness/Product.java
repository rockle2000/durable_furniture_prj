/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package durablefurniturejavaproject.Bussiness;

import java.util.List;
import durablefurniturejavaproject.DataAccess.SqlDataAcess;
import java.util.ArrayList;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.PreparedStatement;
/**
 *
 * @author Redmibook 14
 */
public class Product {

    int ProductId;
    String ProductName;
    int BrandId;
    int CategoryId;
    int Status;
    String Description;
    String Size;
    String Material;
    String Color;
    Double Price;
    int Quantity;

    
     public List<Product> getListProduct() throws SQLException {
        List<Product> lstProduct = new ArrayList<Product>();
        String sql = "select * from product";
        ResultSet rs = db.ExecuteQuery(sql);
        while (rs.next()) {
            Product prd = new Product();
            prd.setProductId(rs.getInt("ProductId"));
            prd.setProductName(rs.getString("ProductName"));
            prd.setBrandId(rs.getInt("BrandId"));
            prd.setCategoryId(rs.getInt("CategoryId"));
            prd.setStatus(rs.getInt("Status"));
            prd.setDescription(rs.getString("Description"));
            lstProduct.add(prd);
        }
        return lstProduct;
    }
     public List<Product> getListProduct(String searchText) throws SQLException {
        List<Product> lstProduct = new ArrayList<Product>();
        String sql = "select * from product where ProductName like '%"+searchText+"%' ";
        //PreparedStatement stmt = db.connection.prepareCall(sql);
        //stmt.setString(1, searchText);
        //ResultSet rs = stmt.executeQuery();
        ResultSet rs = db.ExecuteQuery(sql);

        while (rs.next()) {
            Product prd = new Product();
            prd.setProductId(rs.getInt("ProductId"));
            prd.setProductName(rs.getString("ProductName"));
            prd.setBrandId(rs.getInt("BrandId"));
            prd.setCategoryId(rs.getInt("CategoryId"));
            prd.setStatus(rs.getInt("Status"));
            prd.setDescription(rs.getString("Description"));
            lstProduct.add(prd);
        }
        db.CloseConnection();
        return lstProduct;
    }

    public Double getPrice() {
        return Price;
    }

    public void setPrice(Double Price) {
        this.Price = Price;
    }

    public int getQuantity() {
        return Quantity;
    }

    public void setQuantity(int Quantity) {
        this.Quantity = Quantity;
    }
    public String getSize() {
        return Size;
    }

    public void setSize(String Size) {
        this.Size = Size;
    }

    public String getMaterial() {
        return Material;
    }

    public void setMaterial(String Material) {
        this.Material = Material;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String Color) {
        this.Color = Color;
    }
    SqlDataAcess db = new SqlDataAcess();

   
    public int getProductId() {
        return ProductId;
    }

    public void setProductId(int ProductId) {
        this.ProductId = ProductId;
    }

    public String getProductName() {
        return ProductName;
    }

    public void setProductName(String ProductName) {
        this.ProductName = ProductName;
    }

    public int getBrandId() {
        return BrandId;
    }

    public void setBrandId(int BrandId) {
        this.BrandId = BrandId;
    }

    public int getCategoryId() {
        return CategoryId;
    }

    public void setCategoryId(int CategoryId) {
        this.CategoryId = CategoryId;
    }

    public int getStatus() {
        return Status;
    }

    public void setStatus(int Status) {
        this.Status = Status;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }

}

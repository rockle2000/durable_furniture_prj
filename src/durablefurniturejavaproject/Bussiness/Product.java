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
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Redmibook 14
 */
public class Product {

    int ProductId;
    String ProductName;
    int BrandId;
    int CategoryId;
    int SizeId;
    int ColorId;
    int MaterialId;
    String Status;
    String CategoryName;
    String BrandName;
    String Description;
    String SizeName;
    String MaterialName;
    String ColorName;
    Double UnitPrice;
    int UnitInStock;
    int Quantity;
    List<Product> listProduct = new ArrayList<Product>();

    public List<Product> getListProduct(String searchText) throws SQLException {
        List<Product> lstProduct = new ArrayList<Product>();
        if (searchText.equals("")) {
            String sql = "select brand.BrandId,brand.BrandName,category.CategoryName,category.CategoryId,product.ProductName,product.ProductId,size.SizeName,size.SizeId,color.ColorName,color.ColorId,material.MaterialName,material.MaterialId,product.UnitInStock,product.Description,product.UnitPrice,product.Status  from category,brand,product,color,size,material  where product.BrandId = brand.BrandId and product.CategoryId = category.CategoryId  and product.SizeId = size.SizeId and product.ColorId = color.ColorId and product.MaterialId = material.MaterialId ";
            ResultSet rs = db.ExecuteQuery(sql);
            while (rs.next()) {
                Product prd = new Product();
                prd.setProductId(rs.getInt("ProductId"));
                prd.setProductName(rs.getString("ProductName"));
                prd.setBrandId(rs.getInt("BrandId"));
                prd.setCategoryId(rs.getInt("CategoryId"));
                prd.setColorId(rs.getInt("ColorId"));
                prd.setSizeId(rs.getInt("SizeId"));
                prd.setMaterialId(rs.getInt("MaterialId"));
                prd.setUnitPrice(rs.getDouble("UnitPrice"));
                prd.setDescription(rs.getString("Description"));
                prd.setBrandName(rs.getString("BrandName"));
                prd.setCategoryName(rs.getString("CategoryName"));
                prd.setColorName(rs.getString("ColorName"));
                prd.setSizeName(rs.getString("SizeName"));
                prd.setMaterialName(rs.getString("MaterialName"));
                prd.setUnitInStock(rs.getInt("UnitInStock"));
                prd.setStatus(rs.getString("Status"));
                lstProduct.add(prd);
            }
            listProduct = lstProduct;
        } else {

            for (Product p : listProduct) {
                if (p.getCategoryName().contains(searchText) || p.getBrandName().contains(searchText) || p.getProductName().contains(searchText)) {
                    lstProduct.add(p);
                }
            }
        }

        return lstProduct;
    }
    
    public List<Product> getListProductInStock() throws SQLException {
        List<Product> lstProduct = new ArrayList<Product>();
       
            String sql = "select brand.BrandId,brand.BrandName,category.CategoryName,category.CategoryId,product.ProductName,product.ProductId,size.SizeName,size.SizeId,color.ColorName,color.ColorId,material.MaterialName,material.MaterialId,product.UnitInStock,product.Description,product.UnitPrice,product.Status  from category,brand,product,color,size,material  where product.BrandId = brand.BrandId and product.CategoryId = category.CategoryId  and product.SizeId = size.SizeId and product.ColorId = color.ColorId and product.MaterialId = material.MaterialId and Status = 'In Stock'";
            ResultSet rs = db.ExecuteQuery(sql);
            while (rs.next()) {
                Product prd = new Product();
                prd.setProductId(rs.getInt("ProductId"));
                prd.setProductName(rs.getString("ProductName"));
                prd.setBrandId(rs.getInt("BrandId"));
                prd.setCategoryId(rs.getInt("CategoryId"));
                prd.setColorId(rs.getInt("ColorId"));
                prd.setSizeId(rs.getInt("SizeId"));
                prd.setMaterialId(rs.getInt("MaterialId"));
                prd.setUnitPrice(rs.getDouble("UnitPrice"));
                prd.setDescription(rs.getString("Description"));
                prd.setBrandName(rs.getString("BrandName"));
                prd.setCategoryName(rs.getString("CategoryName"));
                prd.setColorName(rs.getString("ColorName"));
                prd.setSizeName(rs.getString("SizeName"));
                prd.setMaterialName(rs.getString("MaterialName"));
                prd.setUnitInStock(rs.getInt("UnitInStock"));
                prd.setStatus(rs.getString("Status"));
                lstProduct.add(prd);
            }
        return lstProduct;
    }

    public Boolean InsertProduct() throws SQLException {
        db = new SqlDataAcess();
        String sql = "insert into product(ProductName,CategoryId,BrandId,ColorId,SizeId,MaterialId,UnitInStock,UnitPrice,Status,Description) value (?,?,?,?,?,?,?,?,?,?)";
        db.OpenConnection();
        PreparedStatement stmt = db.connection.prepareCall(sql);
        stmt.setString(1, ProductName);
        stmt.setInt(2, CategoryId);
        stmt.setInt(3, BrandId);
        stmt.setInt(4, ColorId);
        stmt.setInt(5, SizeId);
        stmt.setInt(6, MaterialId);
        stmt.setInt(7, UnitInStock);
        stmt.setDouble(8, UnitPrice);
        stmt.setString(9, Status);
        stmt.setString(10, Description);
        return stmt.execute();
    }

    public Boolean UpdateProduct() throws SQLException {
        db = new SqlDataAcess();
        String sql = "update product set ProductName = ?,CategoryId=?,BrandId=?,ColorId=?,SizeId=?,MaterialId=?,UnitInStock=?,UnitPrice=?,Status=?,Description=? where ProductId = ?";
        db.OpenConnection();
        PreparedStatement stmt = db.connection.prepareCall(sql);
        stmt.setString(1, ProductName);
        stmt.setInt(2, CategoryId);
        stmt.setInt(3, BrandId);
        stmt.setInt(4, ColorId);
        stmt.setInt(5, SizeId);
        stmt.setInt(6, MaterialId);
        stmt.setInt(7, UnitInStock);
        stmt.setDouble(8, UnitPrice);
        stmt.setString(9, Status);
        stmt.setString(10, Description);
        stmt.setInt(11, ProductId);
        return stmt.execute();
    }
     public boolean DeleteProduct() {
        String sql = "Delete from product where ProductId = ?";
        PreparedStatement stmt = null;
        try {
            db.OpenConnection();
            stmt = db.connection.prepareCall(sql);
            stmt.setInt(1, ProductId);
            
            stmt.execute();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(Brand.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    public int getSizeId() {
        return SizeId;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String Status) {
        this.Status = Status;
    }

    public int getQuantity() {
        return Quantity;
    }

    public void setQuantity(int Quantity) {
        this.Quantity = Quantity;
    }
  

    public SqlDataAcess getDb() {
        return db;
    }

    public void setDb(SqlDataAcess db) {
        this.db = db;
    }

    public void setSizeId(int SizeId) {
        this.SizeId = SizeId;
    }

    public int getColorId() {
        return ColorId;
    }

    public void setColorId(int ColorId) {
        this.ColorId = ColorId;
    }

    public int getMaterialId() {
        return MaterialId;
    }

    public void setMaterialId(int MaterialId) {
        this.MaterialId = MaterialId;
    }

    public String getSizeName() {
        return SizeName;
    }

    public void setSizeName(String SizeName) {
        this.SizeName = SizeName;
    }

    public String getMaterialName() {
        return MaterialName;
    }

    public void setMaterialName(String MaterialName) {
        this.MaterialName = MaterialName;
    }

    public String getColorName() {
        return ColorName;
    }

    public void setColorName(String ColorName) {
        this.ColorName = ColorName;
    }

    public Double getUnitPrice() {
        return UnitPrice;
    }

    public void setUnitPrice(Double UnitPrice) {
        this.UnitPrice = UnitPrice;
    }

    public int getUnitInStock() {
        return UnitInStock;
    }

    public void setUnitInStock(int UnitInStock) {
        this.UnitInStock = UnitInStock;
    }

    public String getCategoryName() {
        return CategoryName;
    }

    public void setCategoryName(String CategoryName) {
        this.CategoryName = CategoryName;
    }

    public String getBrandName() {
        return BrandName;
    }

    public void setBrandName(String BrandName) {
        this.BrandName = BrandName;
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

    public String getDescription() {
        return Description;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }

}

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
    int SizeId;
    int ColorId;
    int MaterialId;

    String CategoryName;
    String BrandName;
    String Description;
    String SizeName;
    String MaterialName;
    String ColorName;
    Double UnitPrice;
    int UnitInStock;
    List<Product> listProduct = new ArrayList<Product>();

    public List<Product> getListProduct(String searchText) throws SQLException {
        List<Product> lstProduct = new ArrayList<Product>();
        if (searchText.equals("")) {
            String sql = "select brand.BrandId,brand.BrandName,category.CategoryName,category.CategoryId,product.ProductName,product.ProductId,size.SizeName,size.SizeId,color.ColorName,color.ColorId,material.MaterialName,material.MaterialId,product.UnitInStock,product.Description,product.UnitPrice   from category,brand,product,color,size,material  where product.BrandId = brand.BrandId and product.CategoryId = category.CategoryId  and product.SizeId = size.SizeId and product.ColorId = color.ColorId and product.MaterialId = material.MaterialId ";
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

   
    public int getSizeId() {
        return SizeId;
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

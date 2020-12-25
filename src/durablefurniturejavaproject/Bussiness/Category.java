/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package durablefurniturejavaproject.Bussiness;

import durablefurniturejavaproject.DataAccess.SqlDataAcess;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author T480s
 */
public class Category {

    public int CategoryId;
    public String CategoryName;
    public String Image;

    SqlDataAcess db = new SqlDataAcess();

    public Category(int CategoryId, String CategoryName, String Image) {
        this.CategoryId = CategoryId;
        this.CategoryName = CategoryName;
        this.Image = Image;
    }

    public Category() {
    }

    public List<Category> GetAllCategory() {
        List<Category> cateList = new ArrayList<>();
        String sql = "SELECT * FROM category";
        try {
            ResultSet rs = db.ExecuteQuery(sql);
            while (rs.next()) {
                Category cate = new Category(rs.getInt("CategoryId"), rs.getString("CategoryName"), rs.getString("Image"));
                cateList.add(cate);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Brand.class.getName()).log(Level.SEVERE, null, ex);
        }
        db.CloseConnection();
        return cateList;
    }

    public boolean InsertCategory(String CategoryName, String Image) throws SQLException {
        String sql = "INSERT category (CategoryName,Image) VALUES(?,?)";
        PreparedStatement stmt = null;
        db.OpenConnection();
        stmt = db.connection.prepareCall(sql);
        stmt.setString(1, CategoryName);
        stmt.setString(2, Image);
        int res = stmt.executeUpdate();
        db.CloseConnection();
        return res == 1;
    }

    public boolean UpdateCategory(int CategoryId, String CategoryName, String Image) throws SQLException {
        String sql = "Update category SET CategoryName = ?, Image = ? WHERE CategoryId = ?";
        PreparedStatement stmt = null;
        db.OpenConnection();
        stmt = db.connection.prepareCall(sql);
        stmt.setString(1, CategoryName);
        stmt.setString(2, Image);
        stmt.setInt(3, CategoryId);
        int res = stmt.executeUpdate();
        db.CloseConnection();
        return res == 1;
    }

    public boolean DeleteCategory(int CategoryId) throws SQLException {
        String sql = "Delete from category where CategoryId = ?";
        PreparedStatement stmt = null;
        db.OpenConnection();
        stmt = db.connection.prepareCall(sql);
        stmt.setInt(1, CategoryId);
        int res = stmt.executeUpdate();
        db.CloseConnection();
        return res == 1;
    }

    public int getCategoryId() {
        return CategoryId;
    }

    public void setCategoryId(int CategoryId) {
        this.CategoryId = CategoryId;
    }

    public String getCategoryName() {
        return CategoryName;
    }

    public void setCategoryName(String CategoryName) {
        this.CategoryName = CategoryName;
    }

    public String getImage() {
        return Image;
    }

    public void setImage(String Image) {
        this.Image = Image;
    }

}

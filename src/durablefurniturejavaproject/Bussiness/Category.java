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

    public List<Category> GetAllCategory() throws SQLException {
        List<Category> ls = new ArrayList<Category>();
        String sql = "SELECT * FROM category";

        ResultSet rs = db.ExecuteQuery(sql);
        while (rs.next()) {
            Category cate = new Category(rs.getInt("CategoryId"), rs.getString("CategoryName"), rs.getString("Image"));
            ls.add(cate);
        }
        db.CloseConnection();
        return ls;
    }

    public boolean InsertCategory() throws SQLException {
        String sql = "INSERT category (CategoryName,Image) VALUES(?,?)";
        db.OpenConnection();
        PreparedStatement stmt = null;
        stmt = db.connection.prepareCall(sql);
        stmt.setString(1, CategoryName);
        stmt.setString(2, Image);
        return stmt.execute();

    }

    public boolean UpdateCategory() throws SQLException {
        String sql = "Update category SET CategoryName = ?, Image = ? WHERE CategoryId = ?";
        PreparedStatement stmt = null;
        db.OpenConnection();
        stmt = db.connection.prepareCall(sql);
        stmt.setString(1, CategoryName);
        stmt.setString(2, Image);
        stmt.setInt(3, CategoryId);
        stmt.execute();
        return stmt.execute();
    }

    public boolean DeleteCategory() throws SQLException {
        String sql = "Delete from brand where CategoryId = ?";
        PreparedStatement stmt = null;
        db.OpenConnection();
        stmt = db.connection.prepareCall(sql);
        stmt.setInt(1, CategoryId);
        return stmt.execute();

    }

    @Override
    public String toString() {
        return CategoryName; //To change body of generated methods, choose Tools | Templates.
    }

}

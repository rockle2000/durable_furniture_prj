/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package durablefurniturejavaproject.Bussiness;

import durablefurniturejavaproject.DataAccess.SqlDataAcess;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Redmibook 14
 */
public class ProductImage {

    int ProductId;
    String Img;
    SqlDataAcess db = new SqlDataAcess();

    int getProductMaxId() throws SQLException {
        String sql = "Select Max(ProductId) as id from product";
        db.OpenConnection();
        ResultSet rs = db.ExecuteQuery(sql);
        rs.next();
        int productid = rs.getInt("id");
        return productid;
    }

    public boolean InsertProductImage(String Image) throws SQLException {
        String sql = "INSERT productimage (ProductId,Img) VALUES(?,?)";
        PreparedStatement stmt = null;

        db.OpenConnection();
        stmt = db.connection.prepareCall(sql);
        stmt.setInt(1, getProductMaxId());
        stmt.setString(2, Image);
        return stmt.execute();
    }

    public List<ProductImage> getImagesByProductId(int productId) throws SQLException {
        String sql = "select * from productimage where ProductId = " + productId;
        db.OpenConnection();
        ResultSet rs = db.ExecuteQuery(sql);
        List<ProductImage> ls = new ArrayList<ProductImage>();
        while (rs.next()) {
            ProductImage prdImg = new ProductImage();
            prdImg.setImg(rs.getString("Img"));
            ls.add(prdImg);
        }
        db.CloseConnection();
        return ls;
    }

    public void get1TopImageByProductId() throws SQLException {

        String sql = "SELECT * FROM productimage WHERE  ProductId = " + ProductId + " LIMIT 1";
        db.OpenConnection();
        ResultSet rs = db.ExecuteQuery(sql);

        if (rs.next()) {
            Img = (rs.getString("Img"));
        }
    }

    public boolean DeleteImageByName() throws SQLException {
        db = new SqlDataAcess();
        String sql = "delete from productimage where Img=?";
        db.OpenConnection();
        PreparedStatement stmt = db.connection.prepareCall(sql);
        stmt.setString(1, Img);
        return stmt.execute();
    }

    public boolean Delete() throws SQLException {
        db = new SqlDataAcess();
        String sql = "delete from productimage where ProductId=?";
        db.OpenConnection();
        PreparedStatement stmt = db.connection.prepareCall(sql);
        stmt.setInt(1, ProductId);

        return stmt.execute();

    }

    public int getProductId() {
        return ProductId;
    }

    public void setProductId(int ProductId) {
        this.ProductId = ProductId;
    }

    public String getImg() {
        return Img;
    }

    public void setImg(String Img) {
        this.Img = Img;
    }

}

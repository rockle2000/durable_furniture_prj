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

/**
 *
 * @author Redmibook 14
 */
public class ProductImage {

    int ProductId;
    String ProductImage;
    SqlDataAcess db = new SqlDataAcess();

    int getProductMaxId() throws SQLException {
        String sql = "Select Max(ProductId) as id from product";
        db.OpenConnection();
        ResultSet rs = db.ExecuteQuery(sql);
        rs.next();
        int productid = rs.getInt("id");
        return productid;
    }

    public boolean InsertProductImage(String Image) {
        String sql = "INSERT productimage (ProductId,Img) VALUES(?,?)";
        PreparedStatement stmt = null;
        try {
            db.OpenConnection();
            stmt = db.connection.prepareCall(sql);
            stmt.setInt(1, getProductMaxId());
            stmt.setString(2, Image);
            stmt.execute();
            db.CloseConnection();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(Brand.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    public int getProductId() {
        return ProductId;
    }

    public void setProductId(int ProductId) {
        this.ProductId = ProductId;
    }

    public String getProductImage() {
        return ProductImage;
    }

    public void setProductImage(String ProductImage) {
        this.ProductImage = ProductImage;
    }

}

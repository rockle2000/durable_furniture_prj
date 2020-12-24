/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package durablefurniturejavaproject.Bussiness;

import durablefurniturejavaproject.DataAccess.SqlDataAcess;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.sql.ResultSet;
import java.sql.PreparedStatement;

/**
 *
 * @author Redmibook 14
 */
public class ProductColor {

    int ColorId;
    String ColorName;
    SqlDataAcess db;

    public List<ProductColor> GetColor() throws SQLException {
        List<ProductColor> colors = new ArrayList<ProductColor>();
        db = new SqlDataAcess();
        String sql = "select * from color";
        db.OpenConnection();
        ResultSet rs = db.ExecuteQuery(sql);
        while (rs.next()) {
            ProductColor prodCl = new ProductColor();
            prodCl.setColorId(rs.getInt("ColorId"));
            prodCl.setColorName(rs.getString("ColorName"));
            colors.add(prodCl);
        }
        db.CloseConnection();
        return colors;
    }

    public Boolean InsertColor() throws SQLException {
        db = new SqlDataAcess();
        String sql = "insert into color(ColorName) value (?)";
        db.OpenConnection();
        PreparedStatement stmt = db.connection.prepareCall(sql);
        stmt.setString(1, ColorName);
        return stmt.execute();
    }

    public Boolean DeleteColor() throws SQLException {
        db = new SqlDataAcess();
        String sql = "delete from color where ColorName=?";
        db.OpenConnection();
        PreparedStatement stmt = db.connection.prepareCall(sql);
        stmt.setString(1, ColorName);

        return stmt.execute();
    }

    public int getColorId() {
        return ColorId;
    }

    public void setColorId(int ColorId) {
        this.ColorId = ColorId;
    }

    public String getColorName() {
        return ColorName;
    }

    public void setColorName(String ColorName) {
        this.ColorName = ColorName;
    }

    @Override
    public String toString() {
        return ColorName;
    }
}

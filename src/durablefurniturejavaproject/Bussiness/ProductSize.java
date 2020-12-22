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

/**
 *
 * @author Redmibook 14
 */
public class ProductSize {
    int SizeId;
    String SizeName;
    SqlDataAcess db;
    public List<ProductSize> GetSize() throws SQLException{
       List<ProductSize> ls = new ArrayList<ProductSize>();
       db = new  SqlDataAcess();
       String sql = "select * from size";
       db.OpenConnection();    
       ResultSet rs =  db.ExecuteQuery(sql);
       while(rs.next()){
           ProductSize prodsz = new ProductSize();
           prodsz.setSizeId(rs.getInt("SizeId"));
           prodsz.setSizeName(rs.getString("SizeName"));
           ls.add(prodsz);
       }
       db.CloseConnection();
       return ls;
    }
      public Boolean InsertSize() throws SQLException {
        db = new SqlDataAcess();
        String sql = "insert into size(SizeName) value (?)";
        db.OpenConnection();
        PreparedStatement stmt = db.connection.prepareCall(sql);
        stmt.setString(1, SizeName);

        return stmt.execute();
    }

    public Boolean DeleteSize() throws SQLException {
        db = new SqlDataAcess();
        String sql = "delete from size where SizeId=?";
        db.OpenConnection();
        PreparedStatement stmt = db.connection.prepareCall(sql);
        stmt.setInt(1, SizeId);
        return stmt.execute();
    }
    public int getSizeId() {
        return SizeId;
    }

    public void setSizeId(int SizeId) {
        this.SizeId = SizeId;
    }

    public String getSizeName() {
        return SizeName;
    }

    public void setSizeName(String SizeName) {
        this.SizeName = SizeName;
    }

    @Override
    public String toString() {
        return SizeName; //To change body of generated methods, choose Tools | Templates.
    }
    
}

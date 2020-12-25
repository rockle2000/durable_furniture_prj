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
public class ProductMaterial {
    int MaterialId;
    String MaterialName;
    SqlDataAcess db;
    public List<ProductMaterial> GetMaterial() throws SQLException{
          List<ProductMaterial> mtrs = new ArrayList<ProductMaterial>();
       db = new  SqlDataAcess();
       String sql = "select * from material";
       db.OpenConnection();    
       ResultSet rs =  db.ExecuteQuery(sql);
       while(rs.next()){
           ProductMaterial prodMr = new ProductMaterial();
           prodMr.setMaterialId(rs.getInt("MaterialId"));
           prodMr.setMaterialName(rs.getString("MaterialName"));
           mtrs.add(prodMr);
       }
       db.CloseConnection();
       return mtrs;
    }
    public Boolean InsertMaterial() throws SQLException {
        db = new SqlDataAcess();
        String sql = "insert into material(MaterialName) value (?)";
        db.OpenConnection();
        PreparedStatement stmt = db.connection.prepareCall(sql);
        stmt.setString(1, MaterialName);

        return stmt.execute();
    }

    public Boolean DeleteMaterial() throws SQLException {
        db = new SqlDataAcess();
        String sql = "delete from material where MaterialId=?";
        db.OpenConnection();
        PreparedStatement stmt = db.connection.prepareCall(sql);
        stmt.setInt(1, MaterialId);
        return stmt.execute();
    }
    
    public int getMaterialId() {
        return MaterialId;
    }

    public void setMaterialId(int MaterialId) {
        this.MaterialId = MaterialId;
    }

    public String getMaterialName() {
        return MaterialName;
    }

    public void setMaterialName(String MaterialName) {
        this.MaterialName = MaterialName;
    }

    @Override
    public String toString() {
        return MaterialName; //To change body of generated methods, choose Tools | Templates.
    }
    
}

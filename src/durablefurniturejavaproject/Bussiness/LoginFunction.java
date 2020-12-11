/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package durablefurniturejavaproject.Bussiness;

import durablefurniturejavaproject.DataAccess.SqlDataAcess;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author Redmibook 14
 */
public class LoginFunction {

    public int Login(String Username, String Password) throws SQLException {
        SqlDataAcess db = new SqlDataAcess();
        String sql = "Select StaffId from staff where Username = ? and Password =?";
        PreparedStatement stmt = null;
        db.OpenConnection();
        stmt = db.connection.prepareCall(sql);
        stmt.setString(1, Username);
        stmt.setString(2, Password);
        ResultSet rs = stmt.executeQuery();
       
        if(rs.next()){
            return rs.getInt("StaffId");
        }
        return -1;
    }

  
}

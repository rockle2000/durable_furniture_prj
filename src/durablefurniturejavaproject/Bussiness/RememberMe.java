/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package durablefurniturejavaproject.Bussiness;

import durablefurniturejavaproject.DataAccess.SqlDataAcess;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Redmibook 14
 */
public class RememberMe {

    String username;
    String password;
    SqlDataAcess db;

    public void getRememberedInfo() throws SQLException {
        db = new SqlDataAcess();
        db.OpenConnection();
        String sql = "select * from remember_me";
        ResultSet rs = db.ExecuteQuery(sql);
        if (rs.next()) {
            username = rs.getString("username");
            password = rs.getString("password");
            db.CloseConnection();
        }
    }

    public boolean remember() throws SQLException {
        db = new SqlDataAcess();
        String sql = "INSERT remember_me (username,password) VALUES(?,?)";
        PreparedStatement stmt = null;
        db.OpenConnection();
        stmt = db.connection.prepareCall(sql);
        stmt.setString(1, username);
        stmt.setString(2, password);
        return stmt.execute();

    }

    public void unRemember() throws SQLException {
        db = new SqlDataAcess();
        String sql = "TRUNCATE TABLE remember_me";
        db.OpenConnection();
        PreparedStatement stmt = db.connection.prepareCall(sql);
        stmt.execute();
        db.CloseConnection();

    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}

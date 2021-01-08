/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package durablefurniturejavaproject.DataAccess;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.ResultSet;

/**
 *
 * @author Redmibook 14
 */
public class SqlDataAcess {
    public Connection connection = null;
    public void OpenConnection(){
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/durablefurnituredb?serverTimezone=UTC","root","");
        } catch (SQLException ex) {
            Logger.getLogger(SqlDataAcess.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void CloseConnection(){
         try {
            connection.close();
        } catch (SQLException ex) {
            Logger.getLogger(SqlDataAcess.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
   
     public ResultSet ExecuteQuery(String query) throws SQLException{
        OpenConnection();
        Statement statement = connection.createStatement();
        ResultSet result =  statement.executeQuery(query);
        return result;
       
    }
    
}

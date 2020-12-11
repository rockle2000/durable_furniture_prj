/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package durablefurniturejavaproject.Bussiness;

import durablefurniturejavaproject.DataAccess.SqlDataAcess;
import java.sql.SQLException;
import java.sql.ResultSet;

/**
 *
 * @author Redmibook 14
 */
public class Staff {

    int StaffId;
    String FullName;
    int BirthYear;
    String Address;
    String PhoneNumber;
    String Email;
    int Level;
    String Username;
    String Password;

    public Staff() {
    }

    public void GetStaffInfo(int StaffId) throws SQLException {
        SqlDataAcess db = new SqlDataAcess();
        ResultSet rs = db.ExecuteQuery(String.format("Select * from staff where StaffId = "+StaffId));
        while (rs.next()) {
            this.StaffId = rs.getInt("StaffId");
            this.FullName = rs.getString("FullName");
            this.BirthYear = rs.getInt("BirthYear");
            this.Address = rs.getString("Address");
            this.PhoneNumber = rs.getString("PhoneNumber");
            this.Email = rs.getString("Email");
            this.Level = rs.getInt("Level");
            this.Username = rs.getString("Username");
            this.Password = rs.getString("Password");
        }
        db.CloseConnection();
    }

    public int getStaffId() {
        return StaffId;
    }

    public void setStaffId(int StaffId) {
        this.StaffId = StaffId;
    }

    public String getFullName() {
        return FullName;
    }

    public void setFullName(String FullName) {
        this.FullName = FullName;
    }

    public int getBirthYear() {
        return BirthYear;
    }

    public void setBirthYear(int BirthYear) {
        this.BirthYear = BirthYear;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(String PhoneNumber) {
        this.PhoneNumber = PhoneNumber;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public int getLevel() {
        return Level;
    }

    public void setLevel(int Level) {
        this.Level = Level;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String Username) {
        this.Username = Username;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

}

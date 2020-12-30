/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package durablefurniturejavaproject.Bussiness;

import durablefurniturejavaproject.DataAccess.SqlDataAcess;
import java.sql.PreparedStatement;
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
    String Avatar;
    SqlDataAcess db;

    public Staff() {
    }

    public void GetStaffInfo(int StaffId) throws SQLException {
        SqlDataAcess db = new SqlDataAcess();
        ResultSet rs = db.ExecuteQuery(String.format("Select * from staff where StaffId = " + StaffId));
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

    public int UserNameIsExist() throws SQLException {
        db = new SqlDataAcess();
        String sql = "Select COUNT(*) as count from staff where Username = ?";
        db.OpenConnection();
        PreparedStatement stmt = db.connection.prepareCall(sql);
        stmt.setString(1, Username);
        ResultSet rs = stmt.executeQuery();
        rs.next();
        return rs.getInt("count");
    }
    public int PhoneNumberIsExist() throws SQLException {
        db = new SqlDataAcess();
        String sql = "Select COUNT(*) as count from staff where PhoneNumber = ?";
        db.OpenConnection();
        PreparedStatement stmt = db.connection.prepareCall(sql);
        stmt.setString(1, PhoneNumber);
        ResultSet rs = stmt.executeQuery();
        rs.next();
        return rs.getInt("count");
    }
     public int EmailIsExist() throws SQLException {
        db = new SqlDataAcess();
        String sql = "Select COUNT(*) as count from staff where Email = ?";
        db.OpenConnection();
        PreparedStatement stmt = db.connection.prepareCall(sql);
        stmt.setString(1, Email);
        ResultSet rs = stmt.executeQuery();
        rs.next();
        return rs.getInt("count");
    }

    public String InsertStaff() throws SQLException {
        db = new SqlDataAcess();
        if (UserNameIsExist() > 0) {
            return "User name is existed!";
        } if (PhoneNumberIsExist() > 0) {
            return "Phone number is existed!";
        } if (EmailIsExist() > 0) {
            return "Email is existed!";
        } else {
            String sql = "Insert into staff (FullName,BirthYear,Address,PhoneNumber,Email,Avatar,Level,Username,Password) values (?,?,?,?,?,?,?,?,?)";
            PreparedStatement stmt = db.connection.prepareCall(sql);
            stmt.setString(1, FullName);
            stmt.setInt(2, BirthYear);
            stmt.setString(3, Address);
            stmt.setString(4, PhoneNumber);
            stmt.setString(5, Email);
            stmt.setString(6, Avatar);
            stmt.setInt(7, Level);
            stmt.setString(8, Username);
            stmt.setString(9, Password);
            stmt.execute();
            return "Success";
        }
    }

    public int Login(String Username, String Password) throws SQLException {
        SqlDataAcess db = new SqlDataAcess();
        String sql = "Select StaffId from staff where Username = ? and Password =?";
        PreparedStatement stmt = null;
        db.OpenConnection();
        stmt = db.connection.prepareCall(sql);
        stmt.setString(1, Username);
        stmt.setString(2, Password);
        ResultSet rs = stmt.executeQuery();

        if (rs.next()) {
            return rs.getInt("StaffId");
        }
        return -1;
    }

    public int getStaffId() {
        return StaffId;
    }

    public void setStaffId(int StaffId) {
        this.StaffId = StaffId;
    }

    public String getAvatar() {
        return Avatar;
    }

    public void setAvatar(String Avatar) {
        this.Avatar = Avatar;
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

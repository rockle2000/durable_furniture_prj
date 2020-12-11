/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package durablefurniturejavaproject.Bussiness;

import durablefurniturejavaproject.DataAccess.SqlDataAcess;
import java.sql.PreparedStatement;
import java.util.List;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author T480s
 */
public class Brand {

    public int BrandId;
    public String BrandName;
    public String Image;

    SqlDataAcess db = new SqlDataAcess();

    public Brand() {

    }

    public Brand(int BrandId, String BrandName, String Image) {
        this.BrandId = BrandId;
        this.BrandName = BrandName;
        this.Image = Image;
    }

    public List<Brand> GetAllBrand() {
        List<Brand> brandList = new ArrayList<>();
        String sql = "SELECT * FROM brand";
        try {
            ResultSet rs = db.ExecuteQuery(sql);
            while (rs.next()) {
                Brand brand = new Brand(rs.getInt("BrandId"), rs.getString("BrandName"), rs.getString("Image"));
                brandList.add(brand);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Brand.class.getName()).log(Level.SEVERE, null, ex);
        }
        db.CloseConnection();
        return brandList;
    }

    public boolean InsertBrand(String BrandName, String Image) {
        String sql = "INSERT brand (BrandName,Image) VALUES(?,?)";
        PreparedStatement stmt = null;
        try {
            db.OpenConnection();
            stmt = db.connection.prepareCall(sql);
            stmt.setString(1, BrandName);
            stmt.setString(2, Image);
            stmt.execute();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(Brand.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    public boolean UpdateBrand(int BrandId, String BrandName, String Image) {
        String sql = "Update brand SET BrandName = ?, Image = ? WHERE BrandId = ?";
        PreparedStatement stmt = null;
        try {
            db.OpenConnection();
            stmt = db.connection.prepareCall(sql);
            stmt.setString(1, BrandName);
            stmt.setString(2, Image);
            stmt.setInt(3, BrandId);
            stmt.execute();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(Brand.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    public boolean DeleteBrand(int BrandId) {

        String sql = "Delete from brand where BrandId = ?";
        PreparedStatement stmt = null;
        try {
            db.OpenConnection();
            stmt = db.connection.prepareCall(sql);
            stmt.setInt(1, BrandId);
            
            stmt.execute();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(Brand.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    public int getBrandId() {
        return BrandId;
    }

    public void setBrandId(int BrandId) {
        this.BrandId = BrandId;
    }

    public String getBrandName() {
        return BrandName;
    }

    public void setBrandName(String BrandName) {
        this.BrandName = BrandName;
    }

    public String getImage() {
        return Image;
    }

    public void setImage(String Image) {
        this.Image = Image;
    }

}

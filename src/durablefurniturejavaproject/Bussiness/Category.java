/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package durablefurniturejavaproject.Bussiness;

import durablefurniturejavaproject.DataAccess.SqlDataAcess;

/**
 *
 * @author T480s
 */
public class Category {
    public int CategoryId;
    public String CategoryName;
    public String Image;
    
    SqlDataAcess db = new SqlDataAcess();

    public Category(int CategoryId, String CategoryName, String Image) {
        this.CategoryId = CategoryId;
        this.CategoryName = CategoryName;
        this.Image = Image;
    }

    public Category() {
    }
    
    
}

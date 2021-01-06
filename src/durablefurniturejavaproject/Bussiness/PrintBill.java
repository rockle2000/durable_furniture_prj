/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package durablefurniturejavaproject.Bussiness;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;

/**
 *
 * @author Redmibook 14
 */
public class PrintBill {

    public void printBill(Staff staff, Bill bill, List<Product> products) throws IOException {
        // Create Blank document
        XWPFDocument document = new XWPFDocument();

        // Create new Paragraph
        XWPFParagraph paragraph1 = document.createParagraph();
        XWPFRun run = paragraph1.createRun();
        run.setText("StaffId : " + staff.getStaffId());

        XWPFParagraph paragraph2 = document.createParagraph();
        run = paragraph2.createRun();
        run.setText("Staff Name :" + staff.FullName);

        XWPFParagraph paragraph3 = document.createParagraph();
        run = paragraph3.createRun();
        run.setText("-----------List product-----------");

        for (Product product : products) {
            XWPFParagraph paragraph4 = document.createParagraph();
            run = paragraph4.createRun();
            run.setText("Product name : " + product.getProductName() + " - product price : " + product.UnitPrice);
        }
        XWPFParagraph paragraph5 = document.createParagraph();
        run = paragraph5.createRun();
        run.setText("-----------Total : " + bill.TotalPrice + " -----------");
        // Write the Document in file system
        DateTimeFormatter dtf;
        LocalDateTime now = LocalDateTime.now();
        now = LocalDateTime.now();
        dtf = DateTimeFormatter.ofPattern("HH_mm_ss");
        FileOutputStream out = new FileOutputStream(new File("C:/HoaDonNgay_" + bill.getDate() +"_"+dtf.format(now)+ ".docx"));
        document.write(out);
        out.close();
        document.close();
        System.out.println("successully");
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package durablefurniturejavaproject.Common;

import durablefurniturejavaproject.Bussiness.Brand;
import durablefurniturejavaproject.Bussiness.ProductBill;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;
import java.util.UUID;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Redmibook 14
 */
public class BrandJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CategoryJPanel
     */
    DefaultTableModel tblModel;
    Brand brand = new Brand();
    ProductBill productbill = new ProductBill();
    public BrandJPanel() {
        initComponents();
        tblModel = (DefaultTableModel) tblBrand.getModel();
        GetBrandList();
    }

    private void GetBrandList() {
        List<Brand> brandList = brand.GetAllBrand();
        tblModel.setRowCount(0);
        brandList.forEach(b -> {
            tblModel.addRow(new Object[]{b.getBrandId(), b.getBrandName(), b.getImage()});
        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblBrand = new javax.swing.JTable();
        txtBrandId = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnSave = new javax.swing.JButton();
        txtBrandName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        btnAddImage = new javax.swing.JButton();
        lblPicture = new javax.swing.JLabel();
        btnDelete = new javax.swing.JButton();
        btnRefresh = new javax.swing.JButton();

        setBackground(new java.awt.Color(40, 81, 163));
        setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        setPreferredSize(new java.awt.Dimension(1040, 645));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setPreferredSize(new java.awt.Dimension(1010, 150));

        tblBrand.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tblBrand.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Brand Id", "Brand Name", "Image"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblBrand.setMinimumSize(new java.awt.Dimension(1040, 340));
        tblBrand.setPreferredSize(new java.awt.Dimension(1040, 150));
        tblBrand.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblBrandMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblBrand);
        if (tblBrand.getColumnModel().getColumnCount() > 0) {
            tblBrand.getColumnModel().getColumn(0).setResizable(false);
            tblBrand.getColumnModel().getColumn(1).setResizable(false);
            tblBrand.getColumnModel().getColumn(2).setResizable(false);
        }

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, -1));

        txtBrandId.setEditable(false);
        txtBrandId.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        add(txtBrandId, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 260, 350, -1));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Description");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 430, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Brand Name");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 330, -1, -1));

        btnSave.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnSave.setText("Add");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        add(btnSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 580, 140, 40));

        txtBrandName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        add(txtBrandName, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 350, 350, -1));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Brand Image");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 220, -1, -1));

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 450, 780, -1));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Brand ID");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 240, -1, -1));

        btnAddImage.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnAddImage.setText("Choose Image");
        btnAddImage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddImageActionPerformed(evt);
            }
        });
        add(btnAddImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 220, 130, 20));

        lblPicture.setForeground(new java.awt.Color(255, 255, 255));
        lblPicture.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        add(lblPicture, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 240, 280, 170));

        btnDelete.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 580, 140, 40));

        btnRefresh.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnRefresh.setText("Refresh");
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });
        add(btnRefresh, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 580, 140, 40));
    }// </editor-fold>//GEN-END:initComponents

    String anh = "";
    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        String name = txtBrandName.getText();
        String image = "".equals(anh) ? "" : anh;
        String currentDir = System.getProperty("user.dir") + "/Images";
        if ("Add".equals(btnSave.getText())) {
            if ("".equals(txtBrandName.getText())) {
                JOptionPane.showMessageDialog(this, "Brand's name can not be null", "Error", JOptionPane.INFORMATION_MESSAGE);
                return;
            }
            if ("".equals(anh) || anh == null) {
                JOptionPane.showMessageDialog(this, "Brand's image can not be null", "Error", JOptionPane.INFORMATION_MESSAGE);
                return;
            }
            try {
                if (brand.InsertBrand(name, image)) {
                    try {
                        ImageIO.write(image_add, "jpg", new File(currentDir + "/Brands/" + anh));
                    } catch (IOException ex) {
                        Logger.getLogger(BrandJPanel.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    JOptionPane.showMessageDialog(this, "Add new brand successfully", "Message", JOptionPane.PLAIN_MESSAGE);
                    GetBrandList();
                    RefreshData();
                } else {
                    JOptionPane.showMessageDialog(this, "Add brand failed", "Message", JOptionPane.PLAIN_MESSAGE);
                }
            } catch (SQLException ex) {
                Logger.getLogger(BrandJPanel.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if ("Edit".equals(btnSave.getText())) {
            //Sửa brand nhưng không sửa ảnh
            if ("".equals(image)) {
                try {
                    if (brand.UpdateBrand(Integer.parseInt(txtBrandId.getText()), name, imageLink)) {
                        JOptionPane.showMessageDialog(this, "Edit brand successfully", "Message", JOptionPane.PLAIN_MESSAGE);
                        GetBrandList();
                        RefreshData();
                        btnSave.setText("Add");
                    } else {
                        JOptionPane.showMessageDialog(this, "Edit brand failed", "Message", JOptionPane.PLAIN_MESSAGE);
                    }
                    //Sửa brand nhưng sửa ảnh
                } catch (SQLException ex) {
                    Logger.getLogger(BrandJPanel.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else {
                File file = new File(System.getProperty("user.dir") + "/Images/Brands/" + imageLink);
                try {
                    if (brand.UpdateBrand(Integer.parseInt(txtBrandId.getText()), name, image) && file.delete()) {
                        try {
                            ImageIO.write(image_add, "jpg", new File(currentDir + "/Brands/" + anh));
                        } catch (IOException ex) {
                            Logger.getLogger(BrandJPanel.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        JOptionPane.showMessageDialog(this, "Edit brand successfully", "Message", JOptionPane.PLAIN_MESSAGE);
                        GetBrandList();
                        RefreshData();
                        btnSave.setText("Add");
                    } else {
                        JOptionPane.showMessageDialog(this, "Edit brand failed", "Message", JOptionPane.PLAIN_MESSAGE);
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(BrandJPanel.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void RefreshData() {
        txtBrandId.setText("");
        txtBrandName.setText("");
        btnSave.setText("Add");
        lblPicture.setIcon(null);
    }
    BufferedImage image_add;
    private void btnAddImageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddImageActionPerformed
        // TODO add your handling code here:
        JFileChooser chooser = new JFileChooser();
        chooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
        chooser.setCurrentDirectory(new File("D:"));
        String currentDir = System.getProperty("user.dir") + "/Images";
//        System.out.println(UUID.randomUUID().toString().replace("-", ""));
//        System.out.println(currentDir);
        File theDir = new File(currentDir + "/Brands");
        if (!theDir.exists()) {
            theDir.mkdirs();
        }
        int returnVal = chooser.showOpenDialog(null);
        if (returnVal == JFileChooser.APPROVE_OPTION) {
//            System.out.println("You chose to open this directory: " + chooser.getSelectedFile().getAbsolutePath());
            BufferedImage img;
//            BufferedImage image_add;
            try {
                img = ImageIO.read(new File(chooser.getSelectedFile().getAbsolutePath()));
                Image dimg = img.getScaledInstance(lblPicture.getWidth(), lblPicture.getHeight(), Image.SCALE_SMOOTH);
                lblPicture.setIcon(new ImageIcon(dimg));
                image_add = ImageIO.read(chooser.getSelectedFile());
                anh = UUID.randomUUID().toString().replace("-", "") + chooser.getSelectedFile().getName();
//                ImageIO.write(image_add, "jpg", new File(currentDir + "/Brands/" + anh));
            } catch (IOException e) {

            }
        }
    }//GEN-LAST:event_btnAddImageActionPerformed
    //current image 
    String imageLink;
    private void tblBrandMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblBrandMouseClicked
        // TODO add your handling code here:
        btnSave.setText("Edit");
        int row = tblBrand.rowAtPoint(evt.getPoint());
        int col = tblBrand.columnAtPoint(evt.getPoint());

        if (row >= 0 && col >= 0) {
            txtBrandId.setText(tblBrand.getModel().getValueAt(row, 0).toString());
            txtBrandName.setText(tblBrand.getModel().getValueAt(row, 1).toString());
            imageLink = tblBrand.getModel().getValueAt(row, 2).toString();
            if (!"".equals(imageLink)) {
                imageLink = tblBrand.getModel().getValueAt(row, 2).toString();
//                System.out.println(imageLink);
                BufferedImage img;
                try {
                    img = ImageIO.read(new File(System.getProperty("user.dir") + "/Images/Brands/" + imageLink));
                    Image dimg = img.getScaledInstance(lblPicture.getWidth(), lblPicture.getHeight(), Image.SCALE_SMOOTH);
                    lblPicture.setIcon(new ImageIcon(dimg));
                } catch (IOException e) {

                }
            }
        }
    }//GEN-LAST:event_tblBrandMouseClicked

    // Xóa brand
    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        if (!"".equals(txtBrandId.getText())) {
            // Chọn Yes 
            int reply = JOptionPane.showConfirmDialog(null, "Do you sure you want to delete this brand ?", "Message", JOptionPane.YES_NO_OPTION);
            if (reply == JOptionPane.YES_OPTION) {
                File file = new File(System.getProperty("user.dir") + "/Images/Brands/" + imageLink);
                try {
                    if (brand.DeleteBrand(Integer.parseInt(txtBrandId.getText())) && file.delete()) {
                        JOptionPane.showMessageDialog(this, "Delete brand successfully", "Message", JOptionPane.PLAIN_MESSAGE);
                        GetBrandList();
                        RefreshData();
                    } else {
                        JOptionPane.showMessageDialog(this, "Delete brand failed", "Message", JOptionPane.PLAIN_MESSAGE);
                    }
                } catch (SQLException e) {
                    JOptionPane.showMessageDialog(this, "Delete brand failed", "Message", JOptionPane.PLAIN_MESSAGE);
                }
            } else {
                // chọn NO nên k xóa
            }
        } else {
            JOptionPane.showMessageDialog(this, "You must choose a brand to delete", "Message", JOptionPane.PLAIN_MESSAGE);
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    // Refresh dữ liệu
    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        // TODO add your handling code here:
        RefreshData();
    }//GEN-LAST:event_btnRefreshActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddImage;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JButton btnSave;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel lblPicture;
    private javax.swing.JTable tblBrand;
    private javax.swing.JTextField txtBrandId;
    private javax.swing.JTextField txtBrandName;
    // End of variables declaration//GEN-END:variables
}

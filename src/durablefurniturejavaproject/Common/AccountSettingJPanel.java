/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package durablefurniturejavaproject.Common;

import durablefurniturejavaproject.Bussiness.CryptWithMD5;
import durablefurniturejavaproject.Bussiness.Staff;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import java.util.UUID;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Redmibook 14
 */
public class AccountSettingJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CategoryJPanel
     */
    public int staffId;
    public Staff Staff;
    String currentDir = System.getProperty("user.dir") + "/Images/Staffs/";

    public AccountSettingJPanel(int StaffId) throws SQLException {
        initComponents();
        staffId = StaffId;
        Staff = new Staff();
        Staff.GetStaffInfo(StaffId);
        ShowInfor();
    }

    void ShowInfor() {
        txtStaffId.setText(String.valueOf(staffId));
        txtFullName.setText(String.valueOf(Staff.getFullName()));
        txtDob.setText(String.valueOf(Staff.getBirthYear()));
        txtPhone.setText(String.valueOf(Staff.getPhoneNumber()));
        txtEmail.setText(String.valueOf(Staff.getEmail()));
        txtAddress.setText(String.valueOf(Staff.getAddress()));
        txtUserName.setText(String.valueOf(Staff.getUsername()));
        txtLevel.setText(String.valueOf(Staff.getLevel()));
//        cbLevel.getModel().setSelectedItem(String.valueOf(Staff.getLevel()));

        boolean isManager = Staff.getLevel() != 0;
        txtFullName.setEnabled(isManager);
        txtDob.setEnabled(isManager);
        txtPhone.setEnabled(isManager);
        txtEmail.setEnabled(isManager);
        txtAddress.setEnabled(isManager);
        txtUserName.setEnabled(isManager);
        ImageIcon imageIcon = new ImageIcon(new ImageIcon(System.getProperty("user.dir") + "/Images/Staffs/" + Staff.getAvatar()).getImage().getScaledInstance(280, 170, Image.SCALE_DEFAULT));
        lblAvatar.setIcon(imageIcon);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        btnUpdate = new javax.swing.JButton();
        txtPhone = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        lblAvatar = new javax.swing.JLabel();
        txtFullName = new javax.swing.JTextField();
        txtDob = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        btnChangeAvatar = new javax.swing.JButton();
        txtFieldAddColor1 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtStaffId = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtAddress = new javax.swing.JTextField();
        txtUserName = new javax.swing.JTextField();
        txtLevel = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        txtRetype = new javax.swing.JPasswordField();
        txtCurrentPass = new javax.swing.JPasswordField();
        jLabel10 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(40, 81, 163));
        setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        setPreferredSize(new java.awt.Dimension(1040, 645));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(40, 81, 163));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setPreferredSize(new java.awt.Dimension(1050, 640));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Email");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 380, -1, -1));

        btnUpdate.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        jPanel1.add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 470, 280, 30));

        txtPhone.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel1.add(txtPhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 330, 280, 30));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Staff Avatar");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, -1, -1));

        lblAvatar.setForeground(new java.awt.Color(255, 255, 255));
        lblAvatar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel1.add(lblAvatar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 280, 170));

        txtFullName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel1.add(txtFullName, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 190, 280, 30));

        txtDob.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel1.add(txtDob, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 260, 280, 30));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Full Name");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 170, -1, -1));

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Staff ID");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 100, -1, -1));

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Phone Number");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 310, -1, -1));

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Address");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 450, -1, -1));

        btnChangeAvatar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnChangeAvatar.setText("Change Avatar");
        btnChangeAvatar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChangeAvatarActionPerformed(evt);
            }
        });
        jPanel1.add(btnChangeAvatar, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 290, 130, 20));

        txtFieldAddColor1.setText("jTextField2");
        jPanel1.add(txtFieldAddColor1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 260, 210, 0));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Birth Year");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 240, -1, -1));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Current password");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 240, -1, 20));

        jLabel14.setBackground(new java.awt.Color(255, 255, 255));
        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Username");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 170, -1, -1));

        txtStaffId.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtStaffId.setEnabled(false);
        jPanel1.add(txtStaffId, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 120, 280, 30));

        txtEmail.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel1.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 400, 280, 30));

        jLabel12.setBackground(new java.awt.Color(255, 255, 255));
        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Level");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 100, -1, -1));

        txtAddress.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAddressActionPerformed(evt);
            }
        });
        jPanel1.add(txtAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 470, 280, 30));

        txtUserName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel1.add(txtUserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 190, 280, 30));

        txtLevel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtLevel.setEnabled(false);
        jPanel1.add(txtLevel, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 120, 280, 30));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Retype password");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 380, -1, 20));
        jPanel1.add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 330, 280, 30));
        jPanel1.add(txtRetype, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 400, 280, 30));
        jPanel1.add(txtCurrentPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 260, 280, 30));

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("New password");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 310, -1, 20));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
    }// </editor-fold>//GEN-END:initComponents
    private void RefreshData() {
        ShowInfor();
        anh = "";
        txtPassword.setText("");
        txtRetype.setText("");
        txtCurrentPass.setText("");
    }

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        String image = "".equals(anh) ? "" : anh;
//
//        Staff st = new Staff();
        Staff.setFullName(txtFullName.getText());
        Staff.setBirthYear(Integer.parseInt(txtDob.getText()));
        Staff.setAddress(txtAddress.getText());
        Staff.setPhoneNumber(txtPhone.getText());
        Staff.setEmail(txtEmail.getText());
        Staff.setUsername(txtUserName.getText());
        
        String currentPass = Staff.getPassword();
        if (!currentPass.equals(CryptWithMD5.cryptWithMD5(txtCurrentPass.getText())) && !txtCurrentPass.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Current password is incorrect", "Error", JOptionPane.PLAIN_MESSAGE);
            return;
        }
        if (!txtRetype.getText().equals(txtPassword.getText())) {
            JOptionPane.showMessageDialog(this, "Retype password is incorrect", "Error", JOptionPane.PLAIN_MESSAGE);
            return;
        }
        if ((txtPassword.getText().isEmpty() || txtPassword.getText() == null) && (txtRetype.getText().isEmpty() || txtRetype.getText() == null)) {
//            Staff.setPassword(Staff.getPassword());
        } else {
            Staff.setPassword(CryptWithMD5.cryptWithMD5(txtPassword.getText()));
        }
        //Sua thong tin khong sua anh
        if ("".equals(image)) {
            try {
                String res = Staff.UpdateStaffInfor();
//                System.out.println("Kết quả: " + res);
                if ("Success".equals(res)) {
                    JOptionPane.showMessageDialog(this, "Update account successfully", "Message", JOptionPane.PLAIN_MESSAGE);
                    RefreshData();
                    return;
                } else {
                    JOptionPane.showMessageDialog(this, res, "Message", JOptionPane.PLAIN_MESSAGE);
                    return;
                }
            } catch (SQLException ex) {
            }
        } else {
            //Sua thong tin sua anh
            File file = new File(currentDir + Staff.getAvatar());
            Staff.setAvatar(image);
            try {
                String res = Staff.UpdateStaffInfor();
                if ("Success".equals(res) && file.delete()) {
                    ImageIO.write(image_add, "jpg", new File(currentDir + anh));
                    JOptionPane.showMessageDialog(this, "Update account successfully", "Message", JOptionPane.PLAIN_MESSAGE);
                    RefreshData();
                    return;
                } else {
                    JOptionPane.showMessageDialog(this, res, "Message", JOptionPane.PLAIN_MESSAGE);
                    return;
                }
            } catch (SQLException | IOException ex) {
            }
        }

    }//GEN-LAST:event_btnUpdateActionPerformed

    BufferedImage image_add;
    String anh = "";
    private void btnChangeAvatarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChangeAvatarActionPerformed
        // TODO add your handling code here:

        JFileChooser chooser = new JFileChooser();
        chooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
        chooser.setCurrentDirectory(new File("D:"));
//        System.out.println(UUID.randomUUID().toString().replace("-", ""));
//        System.out.println(currentDir);
        File theDir = new File(currentDir);
        if (!theDir.exists()) {
            theDir.mkdirs();
        }
        int returnVal = chooser.showOpenDialog(null);
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            BufferedImage img;
            try {
                img = ImageIO.read(new File(chooser.getSelectedFile().getAbsolutePath()));
                Image dimg = img.getScaledInstance(lblAvatar.getWidth(), lblAvatar.getHeight(), Image.SCALE_SMOOTH);
                lblAvatar.setIcon(new ImageIcon(dimg));
                image_add = ImageIO.read(chooser.getSelectedFile());
                anh = UUID.randomUUID().toString().replace("-", "") + chooser.getSelectedFile().getName();
            } catch (IOException e) {

            }
        }
    }//GEN-LAST:event_btnChangeAvatarActionPerformed

    private void txtAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAddressActionPerformed
    static Boolean txtFieldAddColorIsShowing = false;
    static Boolean txtFieldAddMaterialIsShowing = false;
    static Boolean txtFieldAddSizeIsShowing = false;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnChangeAvatar;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblAvatar;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JPasswordField txtCurrentPass;
    private javax.swing.JTextField txtDob;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtFieldAddColor1;
    private javax.swing.JTextField txtFullName;
    private javax.swing.JTextField txtLevel;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtPhone;
    private javax.swing.JPasswordField txtRetype;
    private javax.swing.JTextField txtStaffId;
    private javax.swing.JTextField txtUserName;
    // End of variables declaration//GEN-END:variables
}

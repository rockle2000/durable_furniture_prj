/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package durablefurniturejavaproject.Common;

import durablefurniturejavaproject.Bussiness.CryptWithMD5;
import durablefurniturejavaproject.Bussiness.Staff;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;
import java.util.UUID;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Redmibook 14
 */
public class StaffManageJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CategoryJPanel
     */
    DefaultTableModel tblModel;
    Staff staff = new Staff();

    public StaffManageJPanel() {
        initComponents();
        try {
            GetStaffList();
        } catch (SQLException ex) {
            Logger.getLogger(StaffManageJPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void GetStaffList() throws SQLException {
        tblModel = (DefaultTableModel) tblStaff.getModel();
        tblModel.setRowCount(0);
        btnEdit.setEnabled(false);
        btnDelete.setEnabled(false);
        List<Staff> staffList = staff.GetAllStaff();
        staffList.forEach(s -> {
            tblModel.addRow(new Object[]{s.getStaffId(), s.getFullName(), s.getBirthYear(), s.getAddress(), s.getPhoneNumber(), s.getEmail(), s.getLevel(), s.getUsername(), s.getAvatar()});
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

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtFieldAddColor1 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblStaff = new javax.swing.JTable();
        txtStaffID = new javax.swing.JTextField();
        txtFullName = new javax.swing.JTextField();
        txtUserName = new javax.swing.JTextField();
        txtBirthYear = new javax.swing.JTextField();
        txtPhonenumber = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        btnDelete = new javax.swing.JButton();
        txtAddress1 = new javax.swing.JTextField();
        btnEdit = new javax.swing.JButton();
        CbBLevel = new javax.swing.JComboBox<>();
        lblPicture = new javax.swing.JLabel();
        btnChooseImage = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        btnSave = new javax.swing.JButton();
        txtReTypePassword = new javax.swing.JPasswordField();
        jLabel13 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();

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
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 460, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Full Name");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 280, -1, -1));

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Staff ID");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 220, -1, -1));

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Phone Number");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 400, -1, -1));

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Address");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 220, -1, -1));

        txtFieldAddColor1.setText("jTextField2");
        jPanel1.add(txtFieldAddColor1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 260, 210, 0));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Birth Year");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 340, -1, -1));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Password");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 400, -1, 20));

        jLabel14.setBackground(new java.awt.Color(255, 255, 255));
        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Username");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 340, -1, -1));

        jLabel12.setBackground(new java.awt.Color(255, 255, 255));
        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Level");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 280, -1, -1));

        jScrollPane1.setPreferredSize(new java.awt.Dimension(1010, 150));

        tblStaff.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tblStaff.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "StaffID", "FullName", "Birdday", "Add", "Phone", "Email", "Level", "Usename", "Avatar"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tblStaff.setMinimumSize(new java.awt.Dimension(1040, 340));
        tblStaff.setPreferredSize(new java.awt.Dimension(1040, 150));
        tblStaff.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblStaffMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblStaff);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, -1));

        txtStaffID.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtStaffID.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtStaffID.setEnabled(false);
        txtStaffID.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                txtStaffIDMouseReleased(evt);
            }
        });
        jPanel1.add(txtStaffID, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 240, 270, -1));

        txtFullName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtFullName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtFullNameKeyReleased(evt);
            }
        });
        jPanel1.add(txtFullName, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 300, 270, -1));

        txtUserName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtUserName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtUserNameKeyReleased(evt);
            }
        });
        jPanel1.add(txtUserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 360, 270, -1));

        txtBirthYear.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtBirthYear.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBirthYearKeyReleased(evt);
            }
        });
        jPanel1.add(txtBirthYear, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 360, 270, -1));

        txtPhonenumber.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtPhonenumber.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPhonenumberKeyReleased(evt);
            }
        });
        jPanel1.add(txtPhonenumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 420, 270, -1));

        txtEmail.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtEmail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtEmailKeyReleased(evt);
            }
        });
        jPanel1.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 480, 270, -1));

        btnDelete.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        jPanel1.add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 550, 140, 40));

        txtAddress1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtAddress1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtAddress1KeyReleased(evt);
            }
        });
        jPanel1.add(txtAddress1, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 240, 270, -1));

        btnEdit.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnEdit.setText("Edit");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });
        jPanel1.add(btnEdit, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 550, 140, 40));

        CbBLevel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        CbBLevel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", " " }));
        jPanel1.add(CbBLevel, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 300, 270, -1));

        lblPicture.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel1.add(lblPicture, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, 260, 160));

        btnChooseImage.setText("Choose Image");
        btnChooseImage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChooseImageActionPerformed(evt);
            }
        });
        jPanel1.add(btnChooseImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 410, -1, 20));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Avatar");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, 53, -1));

        btnSave.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnSave.setText("Add");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        jPanel1.add(btnSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 550, 140, 40));

        txtReTypePassword.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtReTypePassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtReTypePasswordKeyReleased(evt);
            }
        });
        jPanel1.add(txtReTypePassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 480, 240, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Re-type Password");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 460, 110, -1));

        txtPassword.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPasswordKeyReleased(evt);
            }
        });
        jPanel1.add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 420, 240, -1));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1040, 620));
    }// </editor-fold>//GEN-END:initComponents

    String imageLink;
    private void tblStaffMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblStaffMouseClicked
        // TODO add your handling code here:
        //bntEdit.setText("Edi      t");
        btnDelete.setEnabled(false);
        btnEdit.setEnabled(false);
        btnSave.setEnabled(false);
        txtPassword.setText("");
        txtReTypePassword.setText("");
        int row = tblStaff.rowAtPoint(evt.getPoint());
        int col = tblStaff.columnAtPoint(evt.getPoint());
        if (row >= 0 && col >= 0) {
            txtStaffID.setText(tblStaff.getModel().getValueAt(row, 0).toString());
            txtFullName.setText(tblStaff.getModel().getValueAt(row, 1).toString());
            txtBirthYear.setText(tblStaff.getModel().getValueAt(row, 2).toString());
            txtAddress1.setText(tblStaff.getModel().getValueAt(row, 3).toString());
            txtPhonenumber.setText(tblStaff.getModel().getValueAt(row, 4).toString());
            txtEmail.setText(tblStaff.getModel().getValueAt(row, 5).toString());
            //CbBLevel.(tblStaff.getModel().getValueAt(row, 6).toString());
            CbBLevel.setSelectedItem(tblStaff.getModel().getValueAt(row, 6).toString());
            txtUserName.setText(tblStaff.getModel().getValueAt(row, 7).toString());
            // imageLink = tblStaff.getModel().getValueAFt(row, 8).toString();
            if (tblStaff.getModel().getValueAt(row, 8) == null || tblStaff.getModel().getValueAt(row, 8) == "") {

                lblPicture.setIcon(null);

            } else {
                imageLink = tblStaff.getModel().getValueAt(row, 8).toString();
                BufferedImage img;
                try {
                    img = ImageIO.read(new File(System.getProperty("user.dir") + "/Images/Staffs/" + imageLink));
                    Image dimg = img.getScaledInstance(lblPicture.getWidth(), lblPicture.getHeight(), Image.SCALE_SMOOTH);
                    lblPicture.setIcon(new ImageIcon(dimg));
                } catch (IOException e) {

                }
            }

        }
    }//GEN-LAST:event_tblStaffMouseClicked

    private void txtBirthYearKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBirthYearKeyReleased
        // TODO add your handling code here:
        checkFormValidation();
        if (evt.getKeyChar() == KeyEvent.VK_ENTER) {
            txtAddress1.requestFocus();
        }
        String strNumber = "1234567890";
        Boolean isValid = true;
        for (char c : txtBirthYear.getText().toCharArray()) {
            if (strNumber.indexOf(c) < 0) {
                isValid = false;
            }
        }
        if (Integer.parseInt(txtBirthYear.getText()) >= 2020 && Integer.parseInt(txtBirthYear.getText()) < 1950) {
            JOptionPane.showMessageDialog(this, "You are only allowed to enter between 1950 and 2020");
        }
        if (isValid == false) {
            btnEdit.setEnabled(false);
            return;
        }
        btnEdit.setEnabled(true);
    }//GEN-LAST:event_txtBirthYearKeyReleased

    void refeshForm() throws SQLException {
        txtStaffID.setText("");
        txtFullName.setText("");
        txtBirthYear.setText("");
        txtAddress1.setText("");
        txtEmail.setText("");
        txtPhonenumber.setText("");
        CbBLevel.setSelectedIndex(0);
        txtPassword.setText("");
        txtUserName.setText("");
        txtReTypePassword.setText("");
        lblPicture.setIcon(null);
        btnDelete.setEnabled(false);
        btnEdit.setEnabled(false);
        btnSave.setEnabled(false);

    }
    String anh;
    JFileChooser chooser;
    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        if (txtStaffID.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Cannot detele because there is no StaffId");
            btnEdit.setEnabled(false);
            return;
        }
        if (!txtPassword.getText().equals(txtReTypePassword.getText())) {
            btnDelete.setEnabled(false);
            return;
        }
        if (!txtStaffID.getText().equals("")) {
            int reply = JOptionPane.showConfirmDialog(null, "Do you sure you want to delete this Staff ?", "Message", JOptionPane.YES_NO_OPTION);
            if (reply == JOptionPane.YES_OPTION) {
                int staffID = Integer.parseInt(txtStaffID.getText());
                Staff s = new Staff();
                s.setStaffId(staffID);
                File file = new File(System.getProperty("user.dir") + "/Images/Staffs/" + anh);
                try {
                    if (s.DeleteStaff() && file.delete()) {
                        JOptionPane.showMessageDialog(this, "Delete Staff successfully", "Message", JOptionPane.PLAIN_MESSAGE);
                        GetStaffList();
                        refeshForm();
                    }
                    JOptionPane.showMessageDialog(this, "Delete Staff successfully", "Message", JOptionPane.PLAIN_MESSAGE);
                    GetStaffList();
                    refeshForm();

                } catch (SQLException e) {
                    JOptionPane.showMessageDialog(this, "Delete Stff failed", "Message", JOptionPane.PLAIN_MESSAGE);
                }
            } else {
                // chọn NO nên k xóa
            }
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        // TODO add your handling code here:
        if (txtStaffID.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Cannot edit because there is no StaffId");
            btnEdit.setEnabled(false);
            return;
        }
        if (!txtPassword.getText().equals(txtReTypePassword.getText())) {
            btnEdit.setEnabled(false);
            return;
        }
        String currentDir = System.getProperty("user.dir") + "/Images";
        Staff staff = new Staff();
        staff.setStaffId(Integer.parseInt(txtStaffID.getText()));
        staff.setFullName(txtFullName.getText());
        staff.setBirthYear(Integer.parseInt(txtBirthYear.getText()));
        staff.setAddress(txtAddress1.getText());
        staff.setPhoneNumber(txtPhonenumber.getText());
        staff.setEmail(txtEmail.getText());
        staff.setUsername(txtUserName.getText());
        staff.setPassword(CryptWithMD5.cryptWithMD5(txtPassword.getText()));
        String value = CbBLevel.getSelectedItem().toString();
        staff.setLevel(Integer.parseInt(value));
        staff.setAvatar(imageLink);

        System.out.println(staff.getAvatar());
        BufferedImage image = null;
        try {
            if (chooser != null) {
                image = ImageIO.read(chooser.getSelectedFile());
                chooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
                chooser.setCurrentDirectory(new File("D:"));
                anh = UUID.randomUUID().toString().replace("-", "") + chooser.getSelectedFile().getName();
                staff.setAvatar(anh);
            }
            String UpdateStaffMessage = staff.UpdateStaff();
            JOptionPane.showMessageDialog(null, UpdateStaffMessage);
            GetStaffList();
            refeshForm();
            if (UpdateStaffMessage.equals("Success")) {
                if (image != null) {
                    ImageIO.write(image, "jpg", new File(currentDir + "/Staffs/" + anh));
                }
            }

        } catch (SQLException ex) {
            Logger.getLogger(RegisterJPanel.class
                    .getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(RegisterJPanel.class
                    .getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_btnEditActionPerformed

    private void btnChooseImageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChooseImageActionPerformed
        chooser = new JFileChooser();
        chooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
        chooser.setCurrentDirectory(new File("D:"));
        String currentDir = System.getProperty("user.dir") + "/Images";
        System.out.println(UUID.randomUUID().toString().replace("-", ""));
        System.out.println(currentDir);
        File theDir = new File(currentDir + "/Staffs");
        if (!theDir.exists()) {
            theDir.mkdirs();
        }
        int returnVal = chooser.showOpenDialog(null);
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            System.out.println("You chose to open this directory: " + chooser.getSelectedFile().getAbsolutePath());
            BufferedImage img;

            try {
                img = ImageIO.read(new File(chooser.getSelectedFile().getAbsolutePath()));
                Image dimg = img.getScaledInstance(lblPicture.getWidth(), lblPicture.getHeight(), Image.SCALE_SMOOTH);
                lblPicture.setIcon(new ImageIcon(dimg));

            } catch (IOException e) {

            }
        }
    }//GEN-LAST:event_btnChooseImageActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        if (!txtStaffID.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Cannot add new when STaffID is present");
            btnSave.setEnabled(false);
            return;
        }
        if (!txtPassword.getText().equals(txtReTypePassword.getText())) {
            btnSave.setEnabled(false);
            return;
        }
        if (txtFullName.getText().equals("") && txtBirthYear.getText().equals("") && txtAddress1.getText().equals("")
                && txtPhonenumber.getText().equals("") && txtEmail.getText().equals("") && txtUserName.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "You must fill all field!");
            return;
        };
        String currentDir = System.getProperty("user.dir") + "/Images";
        Staff staff = new Staff();
        staff.setFullName(txtFullName.getText());
        staff.setBirthYear(Integer.parseInt(txtBirthYear.getText()));
        staff.setAddress(txtAddress1.getText());
        staff.setPhoneNumber(txtPhonenumber.getText());
        staff.setEmail(txtEmail.getText());
        staff.setUsername(txtUserName.getText());
        staff.setPassword(CryptWithMD5.cryptWithMD5(txtPassword.getText()));
        String value = CbBLevel.getSelectedItem().toString();
        staff.setLevel(Integer.parseInt(value));
        BufferedImage image = null;
        try {
            if (chooser != null) {
                image = ImageIO.read(chooser.getSelectedFile());
                chooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
                chooser.setCurrentDirectory(new File("D:"));
                anh = UUID.randomUUID().toString().replace("-", "") + chooser.getSelectedFile().getName();
                staff.setAvatar(anh);
            }
            String insertStaffMessage = staff.InsertStaff();
            GetStaffList();
            refeshForm();
            JOptionPane.showMessageDialog(null, insertStaffMessage);
            if (insertStaffMessage.equals("Success")) {
                if (image != null) {
                    ImageIO.write(image, "jpg", new File(currentDir + "/Staffs/" + anh));
                }
            }

        } catch (SQLException ex) {
            Logger.getLogger(RegisterJPanel.class
                    .getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(RegisterJPanel.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void txtReTypePasswordKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtReTypePasswordKeyReleased

        checkFormValidation();
        if (evt.getKeyChar() == KeyEvent.VK_ENTER) {
            btnDelete.doClick();
            btnEdit.doClick();
            btnSave.doClick();
        }
    }//GEN-LAST:event_txtReTypePasswordKeyReleased

    private void checkFormValidation() {

        String number = "0123456789";
        String invalidChar = "~!@#$%^&*()_+<>?,./;'[]{}\"\\:-=`";
        String invalidCharPassword = "~!@#$%^&*()_+<>?,./;'[]{}\"\\:-=` ";
        String invalidCharAddress = "~!@#$%^&*()_+<>?./;'[]{}\":=`";
        if (txtFullName.getText().equals("") || txtBirthYear.getText().equals("")
                || txtAddress1.getText().equals("") || txtPhonenumber.getText().equals("")
                || txtUserName.getText().equals("") || txtPassword.getText().equals("")) {
            btnDelete.setEnabled(false);
            btnEdit.setEnabled(false);
            btnSave.setEnabled(false);
            return;
        }
        for (char c : txtBirthYear.getText().toCharArray()) {
            if (number.indexOf(c) < 0) {
                btnDelete.setEnabled(false);
                btnEdit.setEnabled(false);
                btnSave.setEnabled(false);
                return;
            }
        }
        for (char c : txtFullName.getText().toCharArray()) {
            if (number.indexOf(c) > 0 || invalidChar.indexOf(c) > 0) {
                btnDelete.setEnabled(false);
                btnEdit.setEnabled(false);
                btnSave.setEnabled(false);
                return;
            }
        }
        for (char c : txtPhonenumber.getText().toCharArray()) {
            if (number.indexOf(c) < 0) {
                btnDelete.setEnabled(false);
                btnEdit.setEnabled(false);
                btnSave.setEnabled(false);
                return;
            }
        }
        for (char c : txtUserName.getText().toCharArray()) {
            if (invalidChar.indexOf(c) > 0) {
                btnDelete.setEnabled(false);
                btnEdit.setEnabled(false);
                btnSave.setEnabled(false);
                return;
            }
        }
        for (char c : txtPassword.getText().toCharArray()) {
            if (invalidCharPassword.indexOf(c) > 0) {
                btnDelete.setEnabled(false);
                btnEdit.setEnabled(false);
                btnSave.setEnabled(false);
                return;
            }
        }
        for (char c : txtAddress1.getText().toCharArray()) {
            if (invalidCharAddress.indexOf(c) > 0) {
                btnDelete.setEnabled(false);
                btnEdit.setEnabled(false);
                btnSave.setEnabled(false);
                return;
            }
        }
        String regex = "^(.+)@(.+)$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(txtEmail.getText());
        if (!matcher.matches()) {
            btnDelete.setEnabled(false);
            btnEdit.setEnabled(false);
            btnSave.setEnabled(false);
            return;
        }

        if (!txtPassword.getText().equals(txtReTypePassword.getText())) {
            btnDelete.setEnabled(false);
            btnEdit.setEnabled(false);
            btnSave.setEnabled(false);
            return;
        }
        btnDelete.setEnabled(true);
        btnEdit.setEnabled(true);
        btnSave.setEnabled(true);

    }
    private void txtPasswordKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPasswordKeyReleased

        checkFormValidation();
        if (evt.getKeyChar() == KeyEvent.VK_ENTER) {
            txtReTypePassword.requestFocus();
        }
    }//GEN-LAST:event_txtPasswordKeyReleased

    private void txtFullNameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFullNameKeyReleased
        // TODO add your handling code here:
        checkFormValidation();
        if (evt.getKeyChar() == KeyEvent.VK_ENTER) {
            txtBirthYear.requestFocus();
        }
    }//GEN-LAST:event_txtFullNameKeyReleased

    private void txtUserNameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUserNameKeyReleased
        // TODO add your handling code here:
        checkFormValidation();
        if (evt.getKeyChar() == KeyEvent.VK_ENTER) {
            txtEmail.requestFocus();
        }
    }//GEN-LAST:event_txtUserNameKeyReleased

    private void txtPhonenumberKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPhonenumberKeyReleased
        // TODO add your handling code here:
        checkFormValidation();
        if (evt.getKeyChar() == KeyEvent.VK_ENTER) {
            txtUserName.requestFocus();
        }
    }//GEN-LAST:event_txtPhonenumberKeyReleased

    private void txtEmailKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEmailKeyReleased
        // TODO add your handling code here:
        checkFormValidation();
        if (evt.getKeyChar() == KeyEvent.VK_ENTER) {
            txtPassword.requestFocus();
        }
    }//GEN-LAST:event_txtEmailKeyReleased

    private void txtAddress1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAddress1KeyReleased
        checkFormValidation();
        if (evt.getKeyChar() == KeyEvent.VK_ENTER) {
            txtPhonenumber.requestFocus();
        }        // TODO add your handling code here:
    }//GEN-LAST:event_txtAddress1KeyReleased

    private void txtStaffIDMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtStaffIDMouseReleased
        // TODO add your handling code here:
        if (!txtStaffID.getText().equals("")) {
            btnSave.setEnabled(false);
        }
    }//GEN-LAST:event_txtStaffIDMouseReleased
    static Boolean txtFieldAddColorIsShowing = false;
    static Boolean txtFieldAddMaterialIsShowing = false;
    static Boolean txtFieldAddSizeIsShowing = false;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CbBLevel;
    private javax.swing.JButton btnChooseImage;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnSave;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblPicture;
    private javax.swing.JTable tblStaff;
    private javax.swing.JTextField txtAddress1;
    private javax.swing.JTextField txtBirthYear;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtFieldAddColor1;
    private javax.swing.JTextField txtFullName;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtPhonenumber;
    private javax.swing.JPasswordField txtReTypePassword;
    private javax.swing.JTextField txtStaffID;
    private javax.swing.JTextField txtUserName;
    // End of variables declaration//GEN-END:variables
}

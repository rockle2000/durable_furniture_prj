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
import java.util.UUID;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author Redmibook 14
 */
public class RegisterJPanel extends javax.swing.JPanel {

    /**
     * Creates new form RegisterJPanel
     */
    public RegisterJPanel(LoginFrame loginFrame) {
        initComponents();
        this.loginFrame = loginFrame;
    }
    LoginFrame loginFrame;

    private void checkFormValidation() {
        String number = "0123456789";
        String invalidChar = "~!@#$%^&*()_+<>?,./;'[]{}\"\\:-=`";
        String invalidCharPassword = "~!@#$%^&*()_+<>?,./;'[]{}\"\\:-=` ";
        String invalidCharAddress = "~!@#$%^&*()_+<>?./;'[]{}\":=`";
        if (txtFullName.getText().equals("") || txtBirthYear.getText().equals("")
                || txtAddress.getText().equals("") || txtPhoneNumber.getText().equals("")
                || txtUserName.getText().equals("") || txtPassword.getText().equals("")) {
            btnRegister.setEnabled(false);
            return;
        }
        for (char c : txtBirthYear.getText().toCharArray()) {
            if (number.indexOf(c) < 0) {
                btnRegister.setEnabled(false);
                return;
            }
        }
        for (char c : txtFullName.getText().toCharArray()) {
            if (number.indexOf(c) > 0 || invalidChar.indexOf(c) > 0) {
                btnRegister.setEnabled(false);
                return;
            }
        }
        for (char c : txtPhoneNumber.getText().toCharArray()) {
            if (number.indexOf(c) < 0) {
                btnRegister.setEnabled(false);
                return;
            }
        }
        for (char c : txtUserName.getText().toCharArray()) {
            if (invalidChar.indexOf(c) > 0) {
                btnRegister.setEnabled(false);
                return;
            }
        }
        for (char c : txtPassword.getText().toCharArray()) {
            if (invalidCharPassword.indexOf(c) > 0) {
                btnRegister.setEnabled(false);
                return;
            }
        }
        for (char c : txtAddress.getText().toCharArray()) {
            if (invalidCharAddress.indexOf(c) > 0) {
                btnRegister.setEnabled(false);
                return;
            }
        }
        String regex = "^(.+)@(.+)$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(txtEmail.getText());
        if (!matcher.matches()) {
            btnRegister.setEnabled(false);
            return;
        }

        if (!txtPassword.getText().equals(txtReTypePassword.getText())) {
            btnRegister.setEnabled(false);
            return;
        }
        btnRegister.setEnabled(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtFullName = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtBirthYear = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtPhoneNumber = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtAddress = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtUserName = new javax.swing.JTextField();
        btnRegister = new javax.swing.JButton();
        lblPicture = new javax.swing.JLabel();
        btnChooseImage = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        txtReTypePassword = new javax.swing.JPasswordField();

        setBackground(new java.awt.Color(40, 81, 163));
        setPreferredSize(new java.awt.Dimension(600, 450));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Password");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 80, -1));

        txtFullName.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtFullName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtFullNameKeyReleased(evt);
            }
        });
        add(txtFullName, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 120, 240, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Avatar");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, 53, -1));

        txtBirthYear.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtBirthYear.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBirthYearKeyReleased(evt);
            }
        });
        add(txtBirthYear, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 170, 240, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("BirthYear");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 150, 80, -1));

        txtPhoneNumber.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtPhoneNumber.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPhoneNumberKeyReleased(evt);
            }
        });
        add(txtPhoneNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 220, 240, -1));

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Please enter valid information to enable Register button.");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, 300, -1));

        txtAddress.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtAddress.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtAddressKeyReleased(evt);
            }
        });
        add(txtAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 240, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Address");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 80, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Re-type Password");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 300, 110, -1));

        txtUserName.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtUserName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtUserNameKeyReleased(evt);
            }
        });
        add(txtUserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 240, -1));

        btnRegister.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnRegister.setText("Register");
        btnRegister.setEnabled(false);
        btnRegister.setPreferredSize(new java.awt.Dimension(250, 30));
        btnRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterActionPerformed(evt);
            }
        });
        add(btnRegister, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 370, -1, -1));

        lblPicture.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        add(lblPicture, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, 200, 130));

        btnChooseImage.setText("Choose Image");
        btnChooseImage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChooseImageActionPerformed(evt);
            }
        });
        add(btnChooseImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 180, -1, 20));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Full Name");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 100, 53, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("User Name");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 80, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Email");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 250, 80, -1));

        txtEmail.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtEmail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtEmailKeyReleased(evt);
            }
        });
        add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 270, 240, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Phone Number");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 200, 80, -1));

        txtPassword.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPasswordKeyReleased(evt);
            }
        });
        add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 240, -1));

        txtReTypePassword.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtReTypePassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtReTypePasswordKeyReleased(evt);
            }
        });
        add(txtReTypePassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 320, 240, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void txtFullNameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFullNameKeyReleased
        checkFormValidation();
        if (evt.getKeyChar() == KeyEvent.VK_ENTER) {
            txtBirthYear.requestFocus();
        }
    }//GEN-LAST:event_txtFullNameKeyReleased

    private void txtBirthYearKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBirthYearKeyReleased
        checkFormValidation();
        if (evt.getKeyChar() == KeyEvent.VK_ENTER) {
            txtAddress.requestFocus();
        }
    }//GEN-LAST:event_txtBirthYearKeyReleased

    private void txtPhoneNumberKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPhoneNumberKeyReleased
        checkFormValidation();
        if (evt.getKeyChar() == KeyEvent.VK_ENTER) {
            txtUserName.requestFocus();
        }
    }//GEN-LAST:event_txtPhoneNumberKeyReleased

    private void txtEmailKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEmailKeyReleased
        checkFormValidation();
        if (evt.getKeyChar() == KeyEvent.VK_ENTER) {
            txtPassword.requestFocus();
        }
    }//GEN-LAST:event_txtEmailKeyReleased

    private void txtUserNameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUserNameKeyReleased
        checkFormValidation();
        if (evt.getKeyChar() == KeyEvent.VK_ENTER) {
            txtEmail.requestFocus();
        }
    }//GEN-LAST:event_txtUserNameKeyReleased

    private void txtPasswordKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPasswordKeyReleased
        checkFormValidation();
        if (evt.getKeyChar() == KeyEvent.VK_ENTER) {
            txtReTypePassword.requestFocus();
        }

    }//GEN-LAST:event_txtPasswordKeyReleased

    private void txtReTypePasswordKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtReTypePasswordKeyReleased
        checkFormValidation();
        if (evt.getKeyChar() == KeyEvent.VK_ENTER) {
            btnRegister.doClick();
        }

    }//GEN-LAST:event_txtReTypePasswordKeyReleased

    private void txtAddressKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAddressKeyReleased
        checkFormValidation();
        if (evt.getKeyChar() == KeyEvent.VK_ENTER) {
            txtPhoneNumber.requestFocus();
        }
    }//GEN-LAST:event_txtAddressKeyReleased
    String anh;
    JFileChooser chooser;
    private void btnChooseImageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChooseImageActionPerformed
        chooser = new JFileChooser();
        chooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
        chooser.setCurrentDirectory(new File("D:"));
        String currentDir = System.getProperty("user.dir") + "/Images";
//        System.out.println(UUID.randomUUID().toString().replace("-", ""));
//        System.out.println(currentDir);
        File theDir = new File(currentDir + "/Staffs");
        if (!theDir.exists()) {
            theDir.mkdirs();
        }
        int returnVal = chooser.showOpenDialog(null);
        if (returnVal == JFileChooser.APPROVE_OPTION) {
//            System.out.println("You chose to open this directory: " + chooser.getSelectedFile().getAbsolutePath());
            BufferedImage img;

            try {
                img = ImageIO.read(new File(chooser.getSelectedFile().getAbsolutePath()));
                Image dimg = img.getScaledInstance(lblPicture.getWidth(), lblPicture.getHeight(), Image.SCALE_SMOOTH);
                lblPicture.setIcon(new ImageIcon(dimg));

            } catch (IOException e) {

            }
        }
    }//GEN-LAST:event_btnChooseImageActionPerformed

    private void btnRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterActionPerformed
        String currentDir = System.getProperty("user.dir") + "/Images";
        Staff staff = new Staff();
        staff.setFullName(txtFullName.getText());
        staff.setBirthYear(Integer.parseInt(txtBirthYear.getText()));
        staff.setAddress(txtAddress.getText());
        staff.setPhoneNumber(txtPhoneNumber.getText());
        staff.setEmail(txtEmail.getText());
        staff.setUsername(txtUserName.getText());
        staff.setPassword(CryptWithMD5.cryptWithMD5(txtPassword.getText()));
        staff.setLevel(0);
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
            JOptionPane.showMessageDialog(null, insertStaffMessage);
            if (insertStaffMessage.equals("Success")) {
                if (image != null) {
                    ImageIO.write(image, "jpg", new File(currentDir + "/Staffs/" + anh));
                }
                loginFrame.registerPanelShowHide();
            }

        } catch (SQLException ex) {
            Logger.getLogger(RegisterJPanel.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(RegisterJPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnRegisterActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnChooseImage;
    private javax.swing.JButton btnRegister;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lblPicture;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtBirthYear;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtFullName;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtPhoneNumber;
    private javax.swing.JPasswordField txtReTypePassword;
    private javax.swing.JTextField txtUserName;
    // End of variables declaration//GEN-END:variables
}

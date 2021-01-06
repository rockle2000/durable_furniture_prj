/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package durablefurniturejavaproject.Common;

import durablefurniturejavaproject.Bussiness.Bill;
import durablefurniturejavaproject.Bussiness.PrintBill;
import durablefurniturejavaproject.Bussiness.Product;
import durablefurniturejavaproject.Bussiness.ProductImage;
import durablefurniturejavaproject.Bussiness.Staff;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.math.BigDecimal;
import java.sql.SQLException;

import java.util.ArrayList;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JSeparator;
import javax.swing.JTextField;

/**
 *
 * @author Redmibook 14
 */
public class SellProductJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CategoryJPanel
     */
    public SellProductJPanel(Staff staff) {
        initComponents();
        jScrollPane2.getVerticalScrollBar().setUnitIncrement(15);

        txtStaffId.setText(String.valueOf(staff.getStaffId()));
        this.staff = staff;
    }
    Staff staff;

    private void validationForm() {
        String number = "0123456789";
        if (txtClientName.getText().equals("") || txtPhoneNumber.getText().equals("") || lblTotalPrice.getText().equals("0")) {
            btnSubmit.setEnabled(false);
            return;
        }
        for (char c : txtPhoneNumber.getText().toCharArray()) {
            if (number.indexOf(c) < 0) {
                btnSubmit.setEnabled(false);
                return;
            }
        }
        if (!txtEmail.getText().equals("")) {
            String regex = "^(.+)@(.+)$";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(txtEmail.getText());
            if (!matcher.matches()) {
                btnSubmit.setEnabled(false);
                return;
            }
        }

        btnSubmit.setEnabled(true);
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
        txtPhoneNumber = new javax.swing.JTextField();
        txtClientName = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtFieldAddColor1 = new javax.swing.JTextField();
        txtStaffId = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtAddress = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        btnChooseProduct = new javax.swing.JButton();
        btnSubmit = new javax.swing.JButton();
        lblTotalPrice = new javax.swing.JLabel();
        lbl = new javax.swing.JLabel();

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
        jLabel2.setText("Client Email");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 40, 130, -1));

        txtPhoneNumber.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtPhoneNumber.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPhoneNumberKeyReleased(evt);
            }
        });
        jPanel1.add(txtPhoneNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 110, 280, -1));

        txtClientName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtClientName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtClientNameKeyReleased(evt);
            }
        });
        jPanel1.add(txtClientName, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, 280, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Cart");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, -1, -1));

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Staff ID");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, -1, -1));

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Client Phone Number");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 90, 180, -1));

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Client Address");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 40, 100, -1));

        txtFieldAddColor1.setText("jTextField2");
        jPanel1.add(txtFieldAddColor1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 260, 210, 0));

        txtStaffId.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtStaffId.setEnabled(false);
        jPanel1.add(txtStaffId, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, 280, -1));

        txtEmail.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtEmail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtEmailKeyReleased(evt);
            }
        });
        jPanel1.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 60, 280, -1));

        txtAddress.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtAddress.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtAddressKeyReleased(evt);
            }
        });
        jPanel1.add(txtAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 60, 280, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Client Name");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, -1, -1));

        jScrollPane2.setHorizontalScrollBar(null);
        jScrollPane2.setPreferredSize(new java.awt.Dimension(1010, 320));

        jPanel2.setBackground(new java.awt.Color(40, 83, 160));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel2.setPreferredSize(new java.awt.Dimension(1010, 2000));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1006, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1996, Short.MAX_VALUE)
        );

        jScrollPane2.setViewportView(jPanel2);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 230, -1, 350));

        jPanel3.setBackground(new java.awt.Color(40, 83, 160));
        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel3.setPreferredSize(new java.awt.Dimension(1010, 100));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Image");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Name");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Brand");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Category");

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Color");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Size");

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Price");

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Quantity");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel3)
                .addGap(90, 90, 90)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(90, 90, 90)
                .addComponent(jLabel5)
                .addGap(90, 90, 90)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(90, 90, 90)
                .addComponent(jLabel12)
                .addGap(90, 90, 90)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(90, 90, 90)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 73, Short.MAX_VALUE)
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(24, 24, 24))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 170, -1, 70));

        btnChooseProduct.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnChooseProduct.setLabel("Choose Product");
        btnChooseProduct.setPreferredSize(new java.awt.Dimension(81, 23));
        btnChooseProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChooseProductActionPerformed(evt);
            }
        });
        jPanel1.add(btnChooseProduct, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 110, 280, -1));

        btnSubmit.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnSubmit.setText("Submit");
        btnSubmit.setToolTipText("");
        btnSubmit.setEnabled(false);
        btnSubmit.setPreferredSize(new java.awt.Dimension(81, 23));
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });
        jPanel1.add(btnSubmit, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 593, 280, 30));

        lblTotalPrice.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblTotalPrice.setForeground(new java.awt.Color(255, 255, 255));
        lblTotalPrice.setText("0");
        jPanel1.add(lblTotalPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 600, 250, 20));

        lbl.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbl.setForeground(new java.awt.Color(255, 255, 255));
        lbl.setText("Total Price : ");
        jPanel1.add(lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 600, 100, 20));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    public void takeListProductIdToSellProductForm(List<Integer> listIdToCartOnOtherForm) {
        this.lsProductIdInCartOnThisForm = listIdToCartOnOtherForm;
    }
    List<Integer> lsProductIdInCartOnThisForm = new ArrayList<Integer>();
    List<Product> listProduct = new ArrayList<Product>();
    List<Product> productsInCart = new ArrayList<Product>();

    private void btnChooseProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChooseProductActionPerformed
        ChooseProductToBuyJFrame cptbjf;
        Product prd = new Product();
        try {
            listProduct = prd.getListProductInStock();
            System.out.println(listProduct.size());
        } catch (SQLException ex) {
            Logger.getLogger(SellProductJPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            cptbjf = new ChooseProductToBuyJFrame(this, lsProductIdInCartOnThisForm, listProduct);
            cptbjf.setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(SellProductJPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnChooseProductActionPerformed

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        for (Product prd : productsInCart) {
            if (prd.getQuantity() > prd.getUnitInStock()) {
                JOptionPane.showMessageDialog(this, "Product in stock is not enough!!");
                return;
            }
        }
        Bill bill = new Bill();
        bill.setClientName(txtClientName.getText());
        long millis = System.currentTimeMillis();
        java.sql.Date date = new java.sql.Date(millis);
        bill.setDate(date);
        bill.setEmail(txtEmail.getText());
        bill.setPhoneNumber(txtPhoneNumber.getText());
        bill.setStaffId(Integer.parseInt(txtStaffId.getText()));
        bill.setListProduct(productsInCart);
        bill.setTotalPrice(Integer.parseInt(lblTotalPrice.getText()));
        PrintBill printBill = new PrintBill();
        try {
            bill.InsertBill();
            printBill.printBill(staff, bill, bill.getListProduct());
            JOptionPane.showMessageDialog(this, "Create bill success!");
            refeshForm();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, ex);
        } 
        catch (IOException ex) {
            Logger.getLogger(SellProductJPanel.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_btnSubmitActionPerformed
    private void refeshForm() {
        txtClientName.setText("");
        txtAddress.setText("");
        txtPhoneNumber.setText("");
        txtEmail.setText("");
        lsProductIdInCartOnThisForm = new ArrayList<Integer>();
        showProductInCart();
    }
    private void txtClientNameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtClientNameKeyReleased
        validationForm();
    }//GEN-LAST:event_txtClientNameKeyReleased

    private void txtAddressKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAddressKeyReleased
        validationForm();
    }//GEN-LAST:event_txtAddressKeyReleased

    private void txtPhoneNumberKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPhoneNumberKeyReleased
        validationForm();
    }//GEN-LAST:event_txtPhoneNumberKeyReleased

    private void txtEmailKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEmailKeyReleased
        validationForm();
    }//GEN-LAST:event_txtEmailKeyReleased
    public void showTotalPrice() {
        int totalPrice = 0;
        for (int i = 0; i < productsInCart.size(); i++) {
            totalPrice += productsInCart.get(i).getUnitPrice();
        }
        lblTotalPrice.setText(String.valueOf(totalPrice));
    }

    public void showProductInCart() {
        jPanel2.removeAll();
        productsInCart = new ArrayList<Product>();
        for (int i = 0; i < listProduct.size(); i++) {
            for (int j = 0; j < lsProductIdInCartOnThisForm.size(); j++) {
                if (listProduct.get(i).getProductId() == lsProductIdInCartOnThisForm.get(j)) {
                    productsInCart.add(listProduct.get(i));
                }
            }
        }

        int X = 20;
        int Y = 20;
        int increaseVariableX = 130;
        int increaseVariableY = 120;

        for (Product prd : productsInCart) {
            ProductImage prdImg = new ProductImage();
            prdImg.setProductId(prd.getProductId());
            try {
                prdImg.get1TopImageByProductId();
            } catch (SQLException ex) {
                Logger.getLogger(ChooseProductToBuyJFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
            JLabel lblImage = new JLabel();
            lblImage.setForeground(Color.white);
            lblImage.setBounds(X, Y, 110, 80);
            X += increaseVariableX;
            //
            JLabel lblProductName = new JLabel();
            lblProductName.setBounds(X + 5, Y, 150, 90);
            String string = prd.getProductName();
            String breakLineString = "<html>";
            int lengthBeforeBreakline = 15;
            for (int i = 0; i < string.length(); i++) {
                breakLineString += string.charAt(i);
                if (i > lengthBeforeBreakline) {
                    if (string.charAt(i) != ' ') {
                        continue;
                    }
                    breakLineString += "<br>";
                    lengthBeforeBreakline += 15;
                }

            }
            breakLineString += "</html>";
            lblProductName.setText(breakLineString);
            lblProductName.setForeground(Color.white);
            X += increaseVariableX;
            //
            JLabel lblBrand = new JLabel();
            lblBrand.setBounds(X + 10, Y + 20, 170, 50);
            lblBrand.setText(prd.getBrandName());
            lblBrand.setForeground(Color.white);
            X += increaseVariableX;
            //
            JLabel lblCategory = new JLabel();
            lblCategory.setBounds(X + 10, Y + 20, 160, 50);
            lblCategory.setText(prd.getCategoryName());
            lblCategory.setForeground(Color.white);
            X += increaseVariableX;
            //

            JTextField txtColor = new JTextField();
            txtColor.setEnabled(false);
            txtColor.setBounds(X + 15, Y + 20, 40, 40);
            txtColor.setText(prd.getColorName());
            txtColor.setBackground(new Color(Integer.parseInt(prd.getColorName())));
            txtColor.setForeground(Color.white);
            X += increaseVariableX;
            //
            JLabel lblSize = new JLabel();
            lblSize.setBounds(X + 15, Y + 20, 160, 50);
            lblSize.setText(prd.getSizeName());
            lblSize.setForeground(Color.white);
            X += increaseVariableX;
            //
            JLabel lblPrice = new JLabel();
            lblPrice.setBounds(X, Y + 20, 160, 50);
            lblPrice.setText(prd.getUnitPrice().toString());
            lblPrice.setForeground(Color.white);
            X += increaseVariableX;
            //
            JLabel lblProductId = new JLabel();
            lblProductId.setText(String.valueOf(prd.getProductId()));
            JTextField txtQuantity = new JTextField();
            txtQuantity.setBounds(X - 40, Y + 20, 80, 20);
            txtQuantity.setText("1");
            txtQuantity.setHorizontalAlignment(JTextField.CENTER);
            txtQuantity.setFont(new Font("Helvetica Neue", Font.BOLD, 14));
            txtQuantity.setEnabled(false);
            JButton buttonPlus = new JButton();
            buttonPlus.setBounds(X, Y + 40, 40, 20);
            buttonPlus.setText("+");
            buttonPlus.setFont(new Font("Helvetica Neue", Font.PLAIN, 14));
            JButton buttonMinus = new JButton();
            buttonMinus.setBounds(X - 40, Y + 40, 40, 20);
            buttonMinus.setText("-");
            int productid = prd.getProductId();
            buttonMinus.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    int minus = Integer.parseInt(txtQuantity.getText()) - 1;
                    txtQuantity.setText(String.valueOf(minus));

                    for (int i = 0; i < productsInCart.size(); i++) {
                        if (productsInCart.get(i).getProductId() == Integer.parseInt(lblProductId.getText())) {
                            productsInCart.get(i).setQuantity(minus);
                            lblTotalPrice.setText(new BigDecimal(Double.parseDouble(lblTotalPrice.getText()) - productsInCart.get(i).getUnitPrice()).toPlainString());
                        }
                    }
                    if (Integer.parseInt(txtQuantity.getText()) <= 0) {
                        int delete = JOptionPane.showConfirmDialog(null, "Do you want to delete this product?");
                        if (delete == 0) {
                            for (int i = 0; i < lsProductIdInCartOnThisForm.size(); i++) {
                                if (lsProductIdInCartOnThisForm.get(i) == Integer.parseInt(lblProductId.getText())) {
                                    lsProductIdInCartOnThisForm.remove(i);
                                }
                            }
                            for (int i = 0; i < productsInCart.size(); i++) {
                                if (productsInCart.get(i).getProductId() == Integer.parseInt(lblProductId.getText())) {
                                    productsInCart.remove(i);
                                }
                            }
                            showProductInCart();
                        } else {
                            txtQuantity.setText("1");
                            for (int i = 0; i < productsInCart.size(); i++) {
                                if (productsInCart.get(i).getProductId() == Integer.parseInt(lblProductId.getText())) {
                                    productsInCart.get(i).setQuantity(minus);
                                    lblTotalPrice.setText(new BigDecimal(Double.parseDouble(lblTotalPrice.getText()) + productsInCart.get(i).getUnitPrice()).toPlainString());
                                }
                            }
                        }
                    }

                }
            });
            buttonPlus.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    int plus = Integer.parseInt(txtQuantity.getText()) + 1;
                    txtQuantity.setText(String.valueOf(plus));
                    for (int i = 0; i < productsInCart.size(); i++) {
                        if (productsInCart.get(i).getProductId() == Integer.parseInt(lblProductId.getText())) {
                            productsInCart.get(i).setQuantity(plus);
                            lblTotalPrice.setText(new BigDecimal(Double.parseDouble(lblTotalPrice.getText()) + productsInCart.get(i).getUnitPrice()).toPlainString());
                        }
                    }
                }

            });

            ///////////////////
            JSeparator seperator = new JSeparator();
            seperator.setBounds(0, Y + 100, 1000, 10);
            /////////////////
            if (prdImg.getImg() == null) {
                lblImage.setIcon(null);
                lblImage.setText("No Image");
            } else {
                BufferedImage img;
                try {
                    img = ImageIO.read(new File(System.getProperty("user.dir") + "/Images/Products/" + prdImg.getImg()));
                    Image dimg = img.getScaledInstance(lblImage.getWidth(), lblImage.getHeight(), Image.SCALE_SMOOTH);
                    lblImage.setIcon(new ImageIcon(dimg));
                } catch (IOException ex) {
                    Logger.getLogger(ProductGalleryJFrame.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            jPanel2.add(lblImage);
            jPanel2.add(lblProductName);
            jPanel2.add(lblBrand);
            jPanel2.add(lblCategory);
            jPanel2.add(txtColor);
            jPanel2.add(lblSize);
            jPanel2.add(lblPrice);
            jPanel2.add(seperator);
            jPanel2.add(buttonPlus);
            jPanel2.add(buttonMinus);
            jPanel2.add(txtQuantity);
            jPanel2.add(lblProductId);
            X = 20;
            Y += increaseVariableY;

        }
        showTotalPrice();
        jPanel2.repaint();
        validationForm();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnChooseProduct;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
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
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbl;
    private javax.swing.JLabel lblTotalPrice;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtClientName;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtFieldAddColor1;
    private javax.swing.JTextField txtPhoneNumber;
    private javax.swing.JTextField txtStaffId;
    // End of variables declaration//GEN-END:variables
}

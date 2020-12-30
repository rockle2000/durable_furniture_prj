/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package durablefurniturejavaproject.Common;

import durablefurniturejavaproject.Bussiness.Brand;
import durablefurniturejavaproject.Bussiness.Category;
import durablefurniturejavaproject.Bussiness.Product;
import durablefurniturejavaproject.Bussiness.ProductColor;
import durablefurniturejavaproject.Bussiness.ProductImage;
import durablefurniturejavaproject.Bussiness.ProductSize;
import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JSeparator;
import javax.swing.JTextField;

/**
 *
 * @author Redmibook 14
 */
public class ChooseProductToBuyJFrame extends javax.swing.JFrame {

    /**
     * Creates new form ChooseProductToBuyJFrame
     */
    public ChooseProductToBuyJFrame(SellProductJPanel sellProductJPanel, List<Integer> lsProductInSelProductForm, List<Product> listProductSendFromSellProductForm) throws SQLException {
        initComponents();
        this.setLocationRelativeTo(null);
        this.sellProductJPanel = sellProductJPanel;
        this.listProductIdInThisForm = lsProductInSelProductForm;
        jScrollPane1.getVerticalScrollBar().setUnitIncrement(15);
        Product prd = new Product();
        lsProduct = listProductSendFromSellProductForm;
        showComboboxProductSize();
        showCheckedCheckBox();
        showComboBoxBrand();
        showComboBoxCategory();
        showComboboxProductColor();
        showProduct(lsProduct);
    }
    SellProductJPanel sellProductJPanel;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButtonSubmit = new javax.swing.JButton();
        cbBoxCategory = new javax.swing.JComboBox<>();
        cbBoxSize = new javax.swing.JComboBox<>();
        cbBoxColor = new javax.swing.JComboBox<>();
        cbBoxBrand = new javax.swing.JComboBox<>();
        lbl = new javax.swing.JLabel();
        lbl1 = new javax.swing.JLabel();
        lbl2 = new javax.swing.JLabel();
        lbl3 = new javax.swing.JLabel();
        lbl4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel2 = new javax.swing.JPanel();
        txtSearch = new javax.swing.JTextField();
        txtShowColor = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1140, 645));
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(40, 83, 160));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1140, 645));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonSubmit.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonSubmit.setText("Submit");
        jButtonSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSubmitActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonSubmit, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 550, 160, 40));

        cbBoxCategory.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cbBoxCategory.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbBoxCategoryItemStateChanged(evt);
            }
        });
        jPanel1.add(cbBoxCategory, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 30, 140, -1));

        cbBoxSize.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cbBoxSize.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbBoxSizeItemStateChanged(evt);
            }
        });
        jPanel1.add(cbBoxSize, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 30, 140, -1));

        cbBoxColor.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cbBoxColor.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbBoxColorItemStateChanged(evt);
            }
        });
        cbBoxColor.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                cbBoxColorPropertyChange(evt);
            }
        });
        jPanel1.add(cbBoxColor, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 30, 90, -1));

        cbBoxBrand.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cbBoxBrand.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbBoxBrandItemStateChanged(evt);
            }
        });
        jPanel1.add(cbBoxBrand, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 30, 140, -1));

        lbl.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbl.setForeground(new java.awt.Color(255, 255, 255));
        lbl.setText("Size");
        jPanel1.add(lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 10, -1, -1));

        lbl1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbl1.setForeground(new java.awt.Color(255, 255, 255));
        lbl1.setText("Search");
        jPanel1.add(lbl1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        lbl2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbl2.setForeground(new java.awt.Color(255, 255, 255));
        lbl2.setText("Category");
        jPanel1.add(lbl2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 10, -1, -1));

        lbl3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbl3.setForeground(new java.awt.Color(255, 255, 255));
        lbl3.setText("Brand");
        jPanel1.add(lbl3, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 10, -1, -1));

        lbl4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbl4.setForeground(new java.awt.Color(255, 255, 255));
        lbl4.setText("Color");
        jPanel1.add(lbl4, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 10, -1, -1));

        jScrollPane1.setHorizontalScrollBar(null);
        jScrollPane1.setPreferredSize(new java.awt.Dimension(1110, 450));

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel2.setPreferredSize(new java.awt.Dimension(1110, 600));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1106, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 596, Short.MAX_VALUE)
        );

        jScrollPane1.setViewportView(jPanel2);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, -1, 370));

        txtSearch.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSearchKeyReleased(evt);
            }
        });
        jPanel1.add(txtSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 140, -1));

        txtShowColor.setEnabled(false);
        txtShowColor.setPreferredSize(new java.awt.Dimension(7, 23));
        jPanel1.add(txtShowColor, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 30, 59, -1));

        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setText("Price");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel8.setText("Id");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setText("Size");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setText("Color");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("Category");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("Brand");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("Name");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("Image");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel2)
                .addGap(115, 115, 115)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(110, 110, 110)
                .addComponent(jLabel4)
                .addGap(110, 110, 110)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(105, 105, 105)
                .addComponent(jLabel6)
                .addGap(105, 105, 105)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(110, 110, 110)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(24, 24, 24))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 99, 1109, 70));

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1140, 645);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSubmitActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButtonSubmitActionPerformed

    private void cbBoxColorItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbBoxColorItemStateChanged
        ProductColor productCl = (ProductColor) cbBoxColor.getSelectedItem();
        if (!productCl.getColorName().equals("Choose")) {
            ProductColor prdCl = (ProductColor) cbBoxColor.getSelectedItem();
            txtShowColor.setBackground(new Color(Integer.parseInt(prdCl.getColorName())));
        } else {
            txtShowColor.setBackground(Color.WHITE);
        }
        searchProduct();
    }//GEN-LAST:event_cbBoxColorItemStateChanged

    private void txtSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyReleased

        searchProduct();

    }//GEN-LAST:event_txtSearchKeyReleased

    private void cbBoxColorPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_cbBoxColorPropertyChange
        if (cbBoxColor.getSelectedIndex() > 0) {

        }
    }//GEN-LAST:event_cbBoxColorPropertyChange

    private void cbBoxBrandItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbBoxBrandItemStateChanged
        searchProduct();
    }//GEN-LAST:event_cbBoxBrandItemStateChanged

    private void cbBoxCategoryItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbBoxCategoryItemStateChanged
        searchProduct();
    }//GEN-LAST:event_cbBoxCategoryItemStateChanged

    private void cbBoxSizeItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbBoxSizeItemStateChanged
        searchProduct();
    }//GEN-LAST:event_cbBoxSizeItemStateChanged
    List<Product> lsProduct;
    List<Integer> listProductIdInThisForm;
    List<JCheckBox> listCheckBox = new ArrayList<JCheckBox>();

    public void showComboboxProductSize() throws SQLException {
        ProductSize prodSize = new ProductSize();
        List<ProductSize> ls = new ArrayList<ProductSize>();
        ls = prodSize.GetSize();
        prodSize.setSizeName("Choose");
        cbBoxSize.addItem(prodSize);
        for (ProductSize prdsz : ls) {
            cbBoxSize.addItem(prdsz);
        }
    }

    public void showComboBoxBrand() {
        Brand brand = new Brand();
        List<Brand> ls = new ArrayList<Brand>();
        ls = brand.GetAllBrand();
        brand.setBrandName("Choose");
        cbBoxBrand.addItem(brand);
        for (Brand br : ls) {
            cbBoxBrand.addItem(br);
        }
    }

    public void showComboBoxCategory() throws SQLException {
        Category cate = new Category();
        List<Category> ls = new ArrayList<Category>();
        ls = cate.GetAllCategory();
        cate.CategoryName = "Choose";
        cbBoxCategory.addItem(cate);
        for (Category catel : ls) {
            cbBoxCategory.addItem(catel);
        }
    }

    public void showComboboxProductColor() throws SQLException {
        ProductColor prodColor = new ProductColor();
        List<ProductColor> ls = new ArrayList<ProductColor>();
        ls = prodColor.GetColor();
        prodColor.setColorName("Choose");
        cbBoxColor.addItem(prodColor);
        for (ProductColor prdcl : ls) {
            cbBoxColor.addItem(prdcl);
        }
    }

    private void showCheckedCheckBox() {
        for (int i = 0; i < listProductIdInThisForm.size(); i++) {
            for (int j = 0; j < listCheckBox.size(); j++) {
                if (listProductIdInThisForm.get(i).toString().equals(listCheckBox.get(j).getText())) {
                    listCheckBox.get(j).setSelected(true);
                }
            }
        }
    }

    private void searchProduct() {
        if (cbBoxBrand.getSelectedItem() != null && cbBoxCategory.getSelectedItem() != null && cbBoxColor.getSelectedItem() != null && cbBoxSize.getSelectedItem() != null) {
            List<Product> lsProductFiltered = new ArrayList<Product>();

            for (Product prd : lsProduct) {
                if ((prd.getProductName().contains(txtSearch.getText())) && ((prd.getBrandName().equals(cbBoxBrand.getSelectedItem().toString())) || cbBoxBrand.getSelectedItem().toString().equals("Choose"))
                        && ((prd.getCategoryName().equals(cbBoxCategory.getSelectedItem().toString())) || cbBoxCategory.getSelectedItem().toString().equals("Choose"))
                        && ((prd.getColorName().equals(cbBoxColor.getSelectedItem().toString())) || cbBoxColor.getSelectedItem().toString().equals("Choose"))
                        && ((prd.getSizeName().equals(cbBoxSize.getSelectedItem().toString())) || cbBoxSize.getSelectedItem().toString().equals("Choose"))) {
                    lsProductFiltered.add(prd);
                }
            }
            jPanel2.removeAll();
            try {
                showProduct(lsProductFiltered);
            } catch (SQLException ex) {
                Logger.getLogger(ChooseProductToBuyJFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
            showCheckedCheckBox();
        }
    }

    private void showProduct(List<Product> lsProduct) throws SQLException {
        int X = 20;
        int Y = 20;
        int increaseVariableX = 160;
        int increaseVariableY = 120;
        int flag = 0;
        for (Product prd : lsProduct) {
            flag += 1;
            ProductImage prdImg = new ProductImage();
            prdImg.setProductId(prd.getProductId());
            try {
                prdImg.get1TopImageByProductId();
            } catch (SQLException ex) {
                Logger.getLogger(ChooseProductToBuyJFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
            JLabel lblImage = new JLabel();
            lblImage.setBounds(X, Y, 110, 80);
            X += increaseVariableX;
            //
            JLabel lblProductName = new JLabel();
            lblProductName.setBounds(X, Y, 160, 90);

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

            X += increaseVariableX;
            //
            JLabel lblBrand = new JLabel();
            lblBrand.setBounds(X + 5, Y + 30, 160, 20);
            lblBrand.setText(prd.getBrandName());
            X += increaseVariableX;
            //
            JLabel lblCategory = new JLabel();
            lblCategory.setBounds(X - 10, Y + 30, 160, 20);
            lblCategory.setText(prd.getCategoryName());
            X += increaseVariableX;
            //
            JTextField txtColor = new JTextField();
            txtColor.setBounds(X - 20, Y + 20, 40, 40);
            txtColor.setBackground(new Color(Integer.parseInt(prd.getColorName())));
            txtColor.setText(prd.getColorName());
            txtColor.setEnabled(false);
            X += increaseVariableX;
            //
            JLabel lblSize = new JLabel();
            lblSize.setBounds(X - 38, Y + 30, 160, 20);
            lblSize.setText(prd.getSizeName());
            X += increaseVariableX;
            //
            JLabel lblPrice = new JLabel();
            lblPrice.setBounds(X - 58, Y + 30, 160, 20);
            lblPrice.setText(prd.getUnitPrice().toString());
            X += increaseVariableX;

            //
            JSeparator seperator = new JSeparator();
            seperator.setBounds(15, Y + 100, 1050, 10);

            //
            JCheckBox cbId = new JCheckBox();
            cbId.setBounds(X - 108, Y + 30, 160, 20);
            String productIdStr = String.valueOf(prd.getProductId());
            cbId.setText(productIdStr);
            listCheckBox.add(cbId);
            cbId.addItemListener(new ItemListener() {
                public void itemStateChanged(ItemEvent e) {

                    if (e.getStateChange() == ItemEvent.SELECTED && !listProductIdInThisForm.contains(Integer.parseInt(cbId.getText()))) {
                        listProductIdInThisForm.add(Integer.parseInt(cbId.getText()));

                    }
                    if (e.getStateChange() == ItemEvent.DESELECTED) {
                        for (int i = 0; i < listProductIdInThisForm.size(); i++) {
                            if (listProductIdInThisForm.get(i) == Integer.parseInt(cbId.getText())) {
                                listProductIdInThisForm.remove(i);
                            }
                        }
                    }
                    sellProductJPanel.showProductInCart();
                    sellProductJPanel.takeListProductIdToSellProductForm(listProductIdInThisForm);
                }
            });
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
            jPanel2.add(cbId);
            jPanel2.add(seperator);

            X = 20;
            Y += increaseVariableY;
            if (flag == 5) {
                break;
            }
        }

        jPanel2.revalidate();
        jPanel2.repaint();

    }
    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<Brand> cbBoxBrand;
    private javax.swing.JComboBox<Category> cbBoxCategory;
    private javax.swing.JComboBox<ProductColor> cbBoxColor;
    private javax.swing.JComboBox<ProductSize> cbBoxSize;
    private javax.swing.JButton jButtonSubmit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl;
    private javax.swing.JLabel lbl1;
    private javax.swing.JLabel lbl2;
    private javax.swing.JLabel lbl3;
    private javax.swing.JLabel lbl4;
    private javax.swing.JTextField txtSearch;
    private javax.swing.JTextField txtShowColor;
    // End of variables declaration//GEN-END:variables
}

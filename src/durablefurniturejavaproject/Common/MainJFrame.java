/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package durablefurniturejavaproject.Common;

import de.javasoft.synthetica.simple2d.SyntheticaSimple2DLookAndFeel;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Label;
import java.awt.Panel;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import static javax.swing.JOptionPane.showMessageDialog;
import javax.swing.JPanel;
import javax.swing.UIManager;
import durablefurniturejavaproject.Bussiness.Staff;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Redmibook 14
 */
public class MainJFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainJFrame
     */
    public MainJFrame(int staffId,int Level) throws SQLException {
        initComponents();
        this.setLocationRelativeTo(null);
        StaffId = staffId;
        level = Level;
        Staff.GetStaffInfo(StaffId);
        ShowHomePage(Staff);
        if (Staff.getLevel() == 0) {
            jPanel9.remove(sidebarStaff);
        }
        jLabel5.setText(Staff.getFullName());
    }
    public int StaffId;
    public int level;
    public Staff Staff = new Staff();

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel5 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        txtSearch = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        sidebarHomeIcon = new javax.swing.JLabel();
        SidebarManager = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        sidebarBill = new javax.swing.JLabel();
        sidebarBrand = new javax.swing.JLabel();
        sidebarCategory = new javax.swing.JLabel();
        sidebarAnalyze = new javax.swing.JLabel();
        sidebarProduct1 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        sidebarUser = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jPanel8 = new javax.swing.JPanel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        sidebarLogout = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        sidebarSellProduct = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        sidebarStaff = new javax.swing.JLabel();
        sidebarAccount = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(0, 0));
        setResizable(false);

        jPanel5.setPreferredSize(new java.awt.Dimension(1200, 800));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setPreferredSize(new java.awt.Dimension(1050, 50));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/loupe.png"))); // NOI18N
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 41, 39));

        jSeparator1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jSeparator1.setPreferredSize(new java.awt.Dimension(50, 20));
        jPanel4.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 40, 243, 10));

        txtSearch.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtSearch.setBorder(null);
        txtSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSearchKeyReleased(evt);
            }
        });
        jPanel4.add(txtSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 243, 30));

        jLabel4.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/user-avatar-with-check-mark.png"))); // NOI18N
        jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 0, 40, 40));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("User");
        jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 10, 210, 30));

        jPanel1.setBackground(new java.awt.Color(12, 43, 90));
        jPanel1.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        jPanel1.setMinimumSize(new java.awt.Dimension(100, 800));
        jPanel1.setPreferredSize(new java.awt.Dimension(170, 800));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        sidebarHomeIcon.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        sidebarHomeIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/iconfinder_Menu_2001884.png"))); // NOI18N
        sidebarHomeIcon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        sidebarHomeIcon.setPreferredSize(new java.awt.Dimension(64, 200));
        sidebarHomeIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sidebarHomeIconMouseClicked(evt);
            }
        });
        jPanel1.add(sidebarHomeIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, -1, 110));

        SidebarManager.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        SidebarManager.setForeground(new java.awt.Color(255, 255, 255));
        SidebarManager.setText("Manager");
        SidebarManager.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        SidebarManager.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SidebarManagerMouseClicked(evt);
            }
        });
        jPanel1.add(SidebarManager, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, -1, -1));

        jPanel6.setBackground(new java.awt.Color(0, 0, 0));
        jPanel6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(40, 81, 163), 2, true));
        jPanel6.setPreferredSize(new java.awt.Dimension(165, 10));

        sidebarBill.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        sidebarBill.setForeground(new java.awt.Color(255, 255, 255));
        sidebarBill.setText("Bill");
        sidebarBill.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        sidebarBill.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sidebarBillMouseClicked(evt);
            }
        });

        sidebarBrand.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        sidebarBrand.setForeground(new java.awt.Color(255, 255, 255));
        sidebarBrand.setText("Brand");
        sidebarBrand.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        sidebarBrand.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sidebarBrandMouseClicked(evt);
            }
        });

        sidebarCategory.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        sidebarCategory.setForeground(new java.awt.Color(255, 255, 255));
        sidebarCategory.setText("Category");
        sidebarCategory.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        sidebarCategory.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sidebarCategoryMouseClicked(evt);
            }
        });

        sidebarAnalyze.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        sidebarAnalyze.setForeground(new java.awt.Color(255, 255, 255));
        sidebarAnalyze.setText("Analyze");
        sidebarAnalyze.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        sidebarProduct1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        sidebarProduct1.setForeground(new java.awt.Color(255, 255, 255));
        sidebarProduct1.setText("Product");
        sidebarProduct1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        sidebarProduct1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sidebarProduct1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sidebarBill, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sidebarProduct1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sidebarBrand, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sidebarCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sidebarAnalyze, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(sidebarBill)
                .addGap(10, 10, 10)
                .addComponent(sidebarProduct1)
                .addGap(10, 10, 10)
                .addComponent(sidebarBrand)
                .addGap(10, 10, 10)
                .addComponent(sidebarCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(sidebarAnalyze))
        );

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(3, 200, -1, 10));

        jPanel7.setBackground(new java.awt.Color(12, 43, 90));
        jPanel7.setPreferredSize(new java.awt.Dimension(170, 300));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        sidebarUser.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        sidebarUser.setForeground(new java.awt.Color(255, 255, 255));
        sidebarUser.setText("User");
        sidebarUser.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        sidebarUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sidebarUserMouseClicked(evt);
            }
        });
        jPanel7.add(sidebarUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, 80, 30));
        jPanel7.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 150, 10));

        jPanel8.setBackground(new java.awt.Color(12, 43, 90));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel8.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 225, 150, 10));
        jPanel8.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 150, 10));

        sidebarLogout.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        sidebarLogout.setForeground(new java.awt.Color(255, 255, 255));
        sidebarLogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/iconfinder_gnome-session-logout_28390.png"))); // NOI18N
        sidebarLogout.setText("Logout");
        sidebarLogout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        sidebarLogout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                sidebarLogoutMousePressed(evt);
            }
        });
        jPanel8.add(sidebarLogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 150, 40));
        jPanel8.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 150, 10));

        sidebarSellProduct.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        sidebarSellProduct.setForeground(new java.awt.Color(255, 255, 255));
        sidebarSellProduct.setText("Sell Product");
        sidebarSellProduct.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        sidebarSellProduct.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                sidebarSellProductMousePressed(evt);
            }
        });
        jPanel8.add(sidebarSellProduct, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 150, -1));

        jPanel7.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 170, 230));

        jPanel9.setBackground(new java.awt.Color(0, 0, 0));
        jPanel9.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(40, 81, 163), 2, true));
        jPanel9.setPreferredSize(new java.awt.Dimension(165, 200));

        sidebarStaff.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        sidebarStaff.setForeground(new java.awt.Color(255, 255, 255));
        sidebarStaff.setText("Staff");
        sidebarStaff.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        sidebarStaff.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sidebarStaffMouseClicked(evt);
            }
        });

        sidebarAccount.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        sidebarAccount.setForeground(new java.awt.Color(255, 255, 255));
        sidebarAccount.setText("Account");
        sidebarAccount.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        sidebarAccount.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sidebarAccountMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sidebarAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sidebarStaff, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(sidebarAccount)
                .addGap(10, 10, 10)
                .addComponent(sidebarStaff))
        );

        jPanel7.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(3, 90, -1, 10));

        jPanel1.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, -1, 430));

        jPanel2.setBackground(new java.awt.Color(40, 81, 163));
        jPanel2.setPreferredSize(new java.awt.Dimension(1050, 648));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel3.setBackground(java.awt.SystemColor.controlHighlight);
        jPanel3.setPreferredSize(new java.awt.Dimension(1050, 200));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI Light", 1, 36)); // NOI18N
        jLabel1.setText("Durable Furniture");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 280, 38));

        jLabel2.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        jLabel2.setText("Associated with time");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 130, 20));

        jLabel7.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/iconfinder_furniture_living_room_house-36_3799038.png"))); // NOI18N
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 0, 70, 80));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
///The even sidebar
    private void sidebarUserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sidebarUserMouseClicked
        if (jPanel9.getBounds().height != 10) {
            Thread th = new Thread() {
                public void run() {
                    try {
                        for (int i = 70; i >= 10;) {
                            Thread.sleep(3);
                            jPanel9.setBounds(3, 90, 165, i);
                            i -= 5;
                        }
                        for (int i = 160; i >= 110;) {
                            Thread.sleep(3);
                            jPanel8.setBounds(0, i, 165, 250);
                            i -= 5;
                        }

                    } catch (Exception e) {
                        System.out.println(e);
                    }

                }

            };
            th.start();

        } else {
            Thread th = new Thread() {
                public void run() {
                    try {
                        int jPanel7Position = 110;
                        for (int i = 10; i <= 70;) {
                            Thread.sleep(3);
                            jPanel9.setBounds(3, 90, 165, i);
                            jPanel8.setBounds(0, jPanel7Position + i, 165, 250);
                            i += 5;
                        }

                    } catch (Exception e) {
                        System.out.println(e);
                    }

                }

            };
            th.start();

        }
       
    }//GEN-LAST:event_sidebarUserMouseClicked

    private void SidebarManagerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SidebarManagerMouseClicked
        int jPanel7Position = 200;
        Thread th1 = new Thread() {

            public void run() {
                try {
                    for (int i = 5; i <= 200;) {
                        Thread.sleep(1);
                        jPanel6.setBounds(3, 200, 165, i);

                        jPanel7.setBounds(0, jPanel7Position + i, 170, 430);
                        i += 5;
                    }

                } catch (Exception e) {
                    System.out.println(e);
                }
            }
        };
        Thread th2 = new Thread() {
            public void run() {
                try {
                    for (int i = 200; i >= 10;) {
                        Thread.sleep(1);
                        jPanel6.setBounds(3, 200, 165, i);
                        i -= 5;
                    }
                    for (int i = 400; i >= 205;) {
                        Thread.sleep(1);
                        jPanel7.setBounds(0, i, 170, 430);
                        i -= 5;
                    }

                } catch (Exception e) {
                    System.out.println(e);
                }
            }

        };
        if (jPanel6.getBounds().height == 10) {

            th1.start();

        } else {

            th2.start();

        }

    }//GEN-LAST:event_SidebarManagerMouseClicked
    JLabel labelForMakerForm = new JLabel();
    private void sidebarCategoryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sidebarCategoryMouseClicked

        Component[] components = jPanel2.getComponents();

        if (labelForMakerForm.getText() != "Categories") {
            jPanel2.removeAll();
            CategoryJPanel catePanel = new CategoryJPanel();
            //catePanel.setBounds(5, 5, 1040, 591);
            labelForMakerForm.setForeground(Color.WHITE);
            labelForMakerForm.setText("Categories");
            labelForMakerForm.setFont(new Font("Soege UI", Font.BOLD, 22));
            labelForMakerForm.setBounds(10, 0, 200, 40);
            jPanel2.add(labelForMakerForm);
            jPanel2.add(catePanel);
            Thread th = new Thread() {
                public void run() {
                    try {
                        for (int i = 0; i <= 645;) {
                            Thread.sleep(1);
                            catePanel.setBounds(5, -640 + i, 1020, 640);
                            i += 15;

                        }

                    } catch (Exception e) {
                        System.out.println(e);
                    }
                }
            };
            th.start();
            jPanel2.validate();

        }


    }//GEN-LAST:event_sidebarCategoryMouseClicked
    void addLabel() {

    }
    private void sidebarBrandMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sidebarBrandMouseClicked
        if (labelForMakerForm.getText() != "Brands") {
            jPanel2.removeAll();
            labelForMakerForm.setForeground(Color.WHITE);
            labelForMakerForm.setText("Brands");
            labelForMakerForm.setFont(new Font("Soege UI", Font.BOLD, 22));
            labelForMakerForm.setBounds(10, 0, 200, 40);
            BrandJPanel brandPanel = new BrandJPanel();
            //brandPanel.setBounds(5, 5, 1040, 591);
            jPanel2.add(labelForMakerForm);
            jPanel2.add(brandPanel);
            Thread th = new Thread() {
                public void run() {
                    try {
                        for (int i = 0; i <= 1034;) {
                            Thread.sleep(1);
                            brandPanel.setBounds(-1020 + i, 5, 1020, 640);
                            i += 25;

                        }

                    } catch (Exception e) {
                        System.out.println(e);
                    }
                }
            };
            th.start();

            jPanel2.validate();
        }
    }//GEN-LAST:event_sidebarBrandMouseClicked
    ///
    ProductJPanel prodPanel;
    private void sidebarProduct1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sidebarProduct1MouseClicked
        if (labelForMakerForm.getText() != "Products") {
            jPanel2.removeAll();
            labelForMakerForm.setForeground(Color.WHITE);
            labelForMakerForm.setText("Products");
            labelForMakerForm.setFont(new Font("Soege UI", Font.BOLD, 22));
            labelForMakerForm.setBounds(10, 0, 200, 40);
            prodPanel = new ProductJPanel();
            //brandPanel.setBounds(5, 5, 1040, 591);
            jPanel2.add(labelForMakerForm);
            jPanel2.add(prodPanel);
            Thread th = new Thread() {
                public void run() {
                    try {
                        for (int i = 0; i <= 1025;) {
                            Thread.sleep(1);
                            prodPanel.setBounds(-1020 + i, 5, 1020, 640);
                            i += 25;

                        }

                    } catch (Exception e) {
                        System.out.println(e);
                    }
                }
            };
            th.start();
            jPanel2.validate();

        }

    }//GEN-LAST:event_sidebarProduct1MouseClicked
    void ShowHomePage(Staff staff) {
        if (labelForMakerForm.getText() != "Home") {
            jPanel2.removeAll();
            labelForMakerForm.setForeground(Color.WHITE);
            labelForMakerForm.setText("Home");
            labelForMakerForm.setFont(new Font("Soege UI", Font.BOLD, 22));
            labelForMakerForm.setBounds(10, 0, 200, 40);
            HomeJPanel homePanel = new HomeJPanel(staff);
            //brandPanel.setBounds(5, 5, 1040, 591);
            jPanel2.add(labelForMakerForm);
            jPanel2.add(homePanel);
            Thread th = new Thread() {
                public void run() {
                    try {
                        for (int i = 0; i <= 1025;) {
                            Thread.sleep(1);
                            homePanel.setBounds(-1020 + i, 5, 1020, 640);
                            i += 25;

                        }

                    } catch (Exception e) {
                        System.out.println(e);
                    }
                }
            };
            th.start();
            jPanel2.validate();

        }
    }
    private void sidebarHomeIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sidebarHomeIconMouseClicked
        ShowHomePage(Staff);
    }//GEN-LAST:event_sidebarHomeIconMouseClicked

    private void sidebarAccountMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sidebarAccountMouseClicked
        //add new try catch block
        if (labelForMakerForm.getText() != "Account") {
            try {
                jPanel2.removeAll();
                labelForMakerForm.setForeground(Color.WHITE);
                labelForMakerForm.setText("Account");
                labelForMakerForm.setFont(new Font("Soege UI", Font.BOLD, 22));
                labelForMakerForm.setBounds(10, 0, 200, 40);
                AccountSettingJPanel accoutSettingPanel = new AccountSettingJPanel(StaffId);
                //brandPanel.setBounds(5, 5, 1040, 591);
                jPanel2.add(labelForMakerForm);
                jPanel2.add(accoutSettingPanel);
                Thread th = new Thread() {
                    public void run() {
                        try {
                            for (int i = 0; i <= 1025;) {
                                Thread.sleep(1);
                                accoutSettingPanel.setBounds(-1020 + i, 5, 1020, 640);
                                i += 25;
                                
                            }
                            
                        } catch (Exception e) {
                            System.out.println(e);
                        }
                    }
                };
                th.start();
                jPanel2.validate();
            } catch (SQLException ex) {
                Logger.getLogger(MainJFrame.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }//GEN-LAST:event_sidebarAccountMouseClicked

    private void sidebarStaffMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sidebarStaffMouseClicked
        if (labelForMakerForm.getText() != "Staffs") {
            jPanel2.removeAll();
            labelForMakerForm.setForeground(Color.WHITE);
            labelForMakerForm.setText("Staffs");
            labelForMakerForm.setFont(new Font("Soege UI", Font.BOLD, 22));
            labelForMakerForm.setBounds(10, 0, 200, 40);
            StaffManageJPanel staffManagePanel = new StaffManageJPanel();
            //brandPanel.setBounds(5, 5, 1040, 591);
            jPanel2.add(labelForMakerForm);
            jPanel2.add(staffManagePanel);
            Thread th = new Thread() {
                public void run() {
                    try {
                        for (int i = 0; i <= 1025;) {
                            Thread.sleep(1);
                            staffManagePanel.setBounds(-1020 + i, 5, 1020, 640);
                            i += 25;

                        }

                    } catch (Exception e) {
                        System.out.println(e);
                    }
                }
            };
            th.start();
            jPanel2.validate();

        }
    }//GEN-LAST:event_sidebarStaffMouseClicked

    private void txtSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyReleased
        if (labelForMakerForm.getText() == "Products") {
            try {
                prodPanel.showTableProduct(txtSearch.getText());
            } catch (SQLException ex) {
                Logger.getLogger(MainJFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }//GEN-LAST:event_txtSearchKeyReleased

    private void sidebarSellProductMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sidebarSellProductMousePressed

        if (labelForMakerForm.getText() != "SellProduct") {
            jPanel2.removeAll();
            SellProductJPanel sellPrdPanel = new SellProductJPanel(Staff);
            //catePanel.setBounds(5, 5, 1040, 591);
            labelForMakerForm.setForeground(Color.WHITE);
            labelForMakerForm.setText("SellProduct");
            labelForMakerForm.setFont(new Font("Soege UI", Font.BOLD, 22));
            labelForMakerForm.setBounds(10, 0, 200, 40);
            jPanel2.add(labelForMakerForm);
            jPanel2.add(sellPrdPanel);
            Thread th = new Thread() {
                public void run() {
                    try {
                        for (int i = 0; i <= 645;) {
                            Thread.sleep(1);
                            sellPrdPanel.setBounds(5, -640 + i, 1020, 640);
                            i += 15;

                        }

                    } catch (Exception e) {
                        System.out.println(e);
                    }
                }
            };
            th.start();
            jPanel2.validate();

        }
    }//GEN-LAST:event_sidebarSellProductMousePressed

    private void sidebarLogoutMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sidebarLogoutMousePressed
        LoginFrame loginFrame = new LoginFrame();
        loginFrame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_sidebarLogoutMousePressed

    private void sidebarBillMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sidebarBillMouseClicked
        // TODO add your handling code here:
       
        if (labelForMakerForm.getText() != "Bills") {
            jPanel2.removeAll();
            labelForMakerForm.setForeground(Color.WHITE);
            labelForMakerForm.setText("Bills");
            labelForMakerForm.setFont(new Font("Soege UI", Font.BOLD, 22));
            labelForMakerForm.setBounds(10, 0, 200, 40);
            BillJPanel billJPanel = new BillJPanel(level);
            //brandPanel.setBounds(5, 5, 1040, 591);
            jPanel2.add(labelForMakerForm);
            jPanel2.add(billJPanel);
            Thread th = new Thread() {
                public void run() {
                    try {
                        for (int i = 0; i <= 1025;) {
                            Thread.sleep(1);
                            billJPanel.setBounds(-1020 + i, 5, 1020, 640);
                            i += 25;

                        }

                    } catch (Exception e) {
                        System.out.println(e);
                    }
                }
            };
            th.start();
            jPanel2.validate();

        }
    }//GEN-LAST:event_sidebarBillMouseClicked

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel SidebarManager;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JLabel sidebarAccount;
    private javax.swing.JLabel sidebarAnalyze;
    private javax.swing.JLabel sidebarBill;
    private javax.swing.JLabel sidebarBrand;
    private javax.swing.JLabel sidebarCategory;
    private javax.swing.JLabel sidebarHomeIcon;
    private javax.swing.JLabel sidebarLogout;
    private javax.swing.JLabel sidebarProduct1;
    private javax.swing.JLabel sidebarSellProduct;
    private javax.swing.JLabel sidebarStaff;
    private javax.swing.JLabel sidebarUser;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package durablefurniturejavaproject.Common;

import durablefurniturejavaproject.Bussiness.Bill;
import durablefurniturejavaproject.Bussiness.ProductBill;
import durablefurniturejavaproject.Bussiness.Staff;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Admin
 */
public class BillJPanel extends javax.swing.JPanel {

    /**
     * Creates new form BillJPanel
     */
    DefaultTableModel tblModel;
    Bill bill = new Bill();
        ProductBill productbill = new ProductBill();
    int ab;

    public BillJPanel(int level) {

        ab = level;
        initComponents();
        try {
            GetBillList();
        } catch (SQLException ex) {
            Logger.getLogger(StaffManageJPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    BillJPanel() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void GetBillList() throws SQLException {
        tblModel = (DefaultTableModel) tblBill.getModel();
        tblModel.setRowCount(0);
        List<Bill> billlist = bill.GetAllBill();
        billlist.forEach(s -> {
            tblModel.addRow(new Object[]{s.getBillId(), s.getClientName(), s.getAddress(), s.getDate().toString(), s.getPhoneNumber(), s.getEmail(), s.getStaffId(), s.getTotalPrice()});
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

        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtFieldAddColor1 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblBill = new javax.swing.JTable();
        txtEmail = new javax.swing.JTextField();
        txtBillID = new javax.swing.JTextField();
        btnRefresh = new javax.swing.JButton();
        btnDelete1 = new javax.swing.JButton();
        txtTotal = new javax.swing.JTextField();
        txtAddress = new javax.swing.JTextField();
        txtDate = new javax.swing.JTextField();
        txtClientName = new javax.swing.JTextField();
        txtPhone = new javax.swing.JTextField();
        txtStaffID = new javax.swing.JTextField();

        setBackground(new java.awt.Color(40, 81, 163));

        jPanel3.setBackground(new java.awt.Color(40, 81, 163));
        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel3.setPreferredSize(new java.awt.Dimension(1050, 640));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Phon Number");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 450, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Client Name");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, -1, -1));

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Bill ID");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, -1, -1));

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Date");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 390, -1, -1));

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Email");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 210, -1, -1));

        txtFieldAddColor1.setText("jTextField2");
        jPanel3.add(txtFieldAddColor1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 260, 210, 0));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Address");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, -1, -1));

        jLabel14.setBackground(new java.awt.Color(255, 255, 255));
        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Total Price");
        jPanel3.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 330, -1, -1));

        jLabel12.setBackground(new java.awt.Color(255, 255, 255));
        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("StaffID");
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 270, -1, -1));

        jScrollPane1.setPreferredSize(new java.awt.Dimension(1010, 150));

        tblBill.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tblBill.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "BillID", "ClientName", "Address", "Date", "PhoneNumber", "Email", "Sraffld", "TotalPrice"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Double.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tblBill.setMinimumSize(new java.awt.Dimension(1040, 340));
        tblBill.setPreferredSize(new java.awt.Dimension(1040, 150));
        tblBill.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblBillMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblBill);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 810, 170));

        txtEmail.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtEmail.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtEmail.setEnabled(false);
        jPanel3.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 230, 270, -1));

        txtBillID.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtBillID.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtBillID.setEnabled(false);
        jPanel3.add(txtBillID, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, 270, -1));

        btnRefresh.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnRefresh.setText("Refresh");
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });
        jPanel3.add(btnRefresh, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 580, 140, 40));

        btnDelete1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnDelete1.setText("Delete");
        btnDelete1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDelete1ActionPerformed(evt);
            }
        });
        jPanel3.add(btnDelete1, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 460, 140, 40));

        txtTotal.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtTotal.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtTotal.setEnabled(false);
        jPanel3.add(txtTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 350, 270, -1));

        txtAddress.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtAddress.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtAddress.setEnabled(false);
        jPanel3.add(txtAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 350, 270, -1));

        txtDate.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtDate.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtDate.setEnabled(false);
        jPanel3.add(txtDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 410, 270, -1));

        txtClientName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtClientName.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtClientName.setEnabled(false);
        jPanel3.add(txtClientName, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, 270, -1));

        txtPhone.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtPhone.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtPhone.setEnabled(false);
        jPanel3.add(txtPhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 470, 270, -1));

        txtStaffID.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtStaffID.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtStaffID.setEnabled(false);
        jPanel3.add(txtStaffID, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 290, 270, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 975, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(125, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 568, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(127, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tblBillMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblBillMouseClicked
        // TODO add your handling code here:
        if (ab == 0) {
            btnDelete1.setEnabled(false);
        }
        String desc;

        int row = tblBill.rowAtPoint(evt.getPoint());
        int col = tblBill.columnAtPoint(evt.getPoint());
        if (row >= 0 && col >= 0) {
            txtBillID.setText(tblBill.getModel().getValueAt(row, 0).toString());
            txtClientName.setText(tblBill.getModel().getValueAt(row, 1).toString());
            //txtAddress.setText(tblBill.getModel().getValueAt(row, 2).toString());
            if (tblBill.getModel().getValueAt(row, 2) == null || tblBill.getModel().getValueAt(row, 2) == "") {
                desc = "";
            } else {
                desc = tblBill.getModel().getValueAt(row, 2).toString();
                // txtAddress.setText(desc);
            }
            txtAddress.setText(desc);
            txtDate.setText(tblBill.getModel().getValueAt(row, 3).toString());
            txtPhone.setText(tblBill.getModel().getValueAt(row, 4).toString());
            txtEmail.setText(tblBill.getModel().getValueAt(row, 5).toString());
            txtStaffID.setText(tblBill.getModel().getValueAt(row, 6).toString());
            txtTotal.setText(tblBill.getModel().getValueAt(row, 7).toString());
        }
    }//GEN-LAST:event_tblBillMouseClicked

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRefreshActionPerformed

    private void btnDelete1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDelete1ActionPerformed
        // TODO add your handling code here:
        if(ab == 1){     
            try {
                if(productbill.DeleteProductBill(Integer.parseInt(txtBillID.getText()))){
                if (bill.DeleteBill(Integer.parseInt(txtBillID.getText()))) {
                    JOptionPane.showMessageDialog(this, "Delete bill successfully", "Message", JOptionPane.PLAIN_MESSAGE);
                    GetBillList();
                    RefreshData();
                } else {
                    JOptionPane.showMessageDialog(this, "Delete bill failed", "Message", JOptionPane.PLAIN_MESSAGE);
                }
                
                
                }
                // chọn NO nên k xóa
            } catch (SQLException ex) {
                Logger.getLogger(BillJPanel.class.getName()).log(Level.SEVERE, null, ex);
            }
            }
        
    }//GEN-LAST:event_btnDelete1ActionPerformed

    private void RefreshData() {
       DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        txtBillID.setText("");
        txtClientName.setText("");
        txtAddress.setText("");
        txtDate.setText("");
        txtPhone.setText("");
        txtEmail.setText("");
        txtStaffID.setText("");
        txtTotal.setText("");
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete1;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblBill;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtBillID;
    private javax.swing.JTextField txtClientName;
    private javax.swing.JTextField txtDate;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtFieldAddColor1;
    private javax.swing.JTextField txtPhone;
    private javax.swing.JTextField txtStaffID;
    private javax.swing.JTextField txtTotal;
    // End of variables declaration//GEN-END:variables
}

package UI;

import Classes.Ware;
import Classes.Warehouse;
import static UI.WarehouseListUI.loadTable;
import java.awt.Dimension;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class WareManagementUI extends javax.swing.JFrame {

    public WareManagementUI() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnFindWare = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnBackWareManagement = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblWares = new javax.swing.JTable();
        btnAddWare = new javax.swing.JButton();
        btnDeleteWare = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(235, 253, 253));

        btnFindWare.setFont(new java.awt.Font("B Nazanin", 1, 14)); // NOI18N
        btnFindWare.setIcon(new javax.swing.ImageIcon(getClass().getResource("/searchResized.png"))); // NOI18N
        btnFindWare.setText("جست و جو");
        btnFindWare.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFindWareActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("B Nazanin", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("مدیریت کالاها");
        jLabel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel1.setPreferredSize(new java.awt.Dimension(90, 40));

        btnBackWareManagement.setFont(new java.awt.Font("B Nazanin", 1, 14)); // NOI18N
        btnBackWareManagement.setIcon(new javax.swing.ImageIcon(getClass().getResource("/undoResized.png"))); // NOI18N
        btnBackWareManagement.setText("بازگشت");
        btnBackWareManagement.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackWareManagementActionPerformed(evt);
            }
        });

        tblWares.setFont(new java.awt.Font("B Nazanin", 0, 14)); // NOI18N
        tblWares.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "قیمت کالا", "نوع کالا", "نام کالا", "شماره کالا"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblWares);

        btnAddWare.setFont(new java.awt.Font("B Nazanin", 1, 14)); // NOI18N
        btnAddWare.setIcon(new javax.swing.ImageIcon(getClass().getResource("/add.png"))); // NOI18N
        btnAddWare.setText("افزودن کالا ");
        btnAddWare.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddWareActionPerformed(evt);
            }
        });

        btnDeleteWare.setFont(new java.awt.Font("B Nazanin", 1, 14)); // NOI18N
        btnDeleteWare.setIcon(new javax.swing.ImageIcon(getClass().getResource("/close (1).png"))); // NOI18N
        btnDeleteWare.setText("حذف کالا");
        btnDeleteWare.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteWareActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(21, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(btnBackWareManagement)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnFindWare)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAddWare)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDeleteWare)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(19, 19, 19))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(169, 169, 169))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnBackWareManagement, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnFindWare)
                        .addComponent(btnAddWare)
                        .addComponent(btnDeleteWare)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddWareActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddWareActionPerformed
        WareRegistrationJframe.main(new String[0]);
        setVisible(false);
    }//GEN-LAST:event_btnAddWareActionPerformed

    private void btnBackWareManagementActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackWareManagementActionPerformed
        HomePageUI.main(new String[0]);
        setVisible(false);
    }//GEN-LAST:event_btnBackWareManagementActionPerformed

    private void btnDeleteWareActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteWareActionPerformed
        try {
            int rowID = tblWares.getSelectedRow();
            int tableID = Integer.valueOf(tblWares.getModel().getValueAt(rowID, 0).toString());
            String rowText = tblWares.getModel().getValueAt(rowID, 2).toString();

            int reply = JOptionPane.showConfirmDialog(null, "آیا مایلید \"" + rowText + "\" حذف کنید؟", "", JOptionPane.YES_NO_OPTION);
            if (reply == JOptionPane.YES_OPTION) {
                Ware.deleteWare(tableID);
                JOptionPane.showMessageDialog(null, "با موفقیت حذف شد!");
                loadTable();
            }
            
        } catch (Exception ex) {
            
        }
    }//GEN-LAST:event_btnDeleteWareActionPerformed

    private void btnFindWareActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFindWareActionPerformed
        String delRow = JOptionPane.showInputDialog(null, "نام کالا را وارد کنید :", "جستجو کالا", JOptionPane.PLAIN_MESSAGE);
        Vector<Ware> result = Ware.findWare(delRow);
        
        DefaultTableModel tableModel = new DefaultTableModel();
        int columnCount = 6;

        tableModel.addColumn("شماره کالا");
        tableModel.addColumn("انبار");
        tableModel.addColumn("نام کالا");
        tableModel.addColumn("نوع کالا");
        tableModel.addColumn("قیمت کالا");
        tableModel.addColumn("تعداد موجودی");
        
        Object[] row = new Object[columnCount];
        
        for (Ware wh : result) {
            row[0] = wh.getWareID();
            row[1] = Warehouse.findWarehouse(wh.getWarehouseID());
            row[2] = wh.getWare_Name();
            row[3] = wh.getWare_Kind();
            row[4] = wh.getWare_Price();
            row[5] = wh.getWare_Size();
            tableModel.addRow(row);
        }

        tblWares.setModel(tableModel);
    }//GEN-LAST:event_btnFindWareActionPerformed

    public static void loadTable() {
        // Load table
        DefaultTableModel tableModel = new DefaultTableModel();
        int columnCount = 6;

        tableModel.addColumn("شماره کالا");
        tableModel.addColumn("انبار");
        tableModel.addColumn("نام کالا");
        tableModel.addColumn("نوع کالا");
        tableModel.addColumn("قیمت کالا");        
        tableModel.addColumn("تعداد موجودی");
        
        Object[] row = new Object[columnCount];

        for (Ware wh : Ware.WaresHolder) {
            row[0] = wh.getWareID();
            row[1] = Warehouse.findWarehouse(wh.getWarehouseID());
            row[2] = wh.getWare_Name();
            row[3] = wh.getWare_Kind();
            row[4] = wh.getWare_Price();
            row[5] = wh.getWare_Size();
            tableModel.addRow(row);
        }

        tblWares.setModel(tableModel);

//        Dimension tableSize =  tblWarehouses.getPreferredSize();
//        tblWarehouses.getColumnModel().getColumn(0).setPreferredWidth(Math.round(tableSize.width*0.35f));
//        tblWarehouses.getColumnModel().getColumn(1).setPreferredWidth(Math.round(tableSize.width*0.85f));
//        tblWarehouses.getColumnModel().getColumn(2).setPreferredWidth(Math.round(tableSize.width*0.25f));
    }
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(WareManagementUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(WareManagementUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(WareManagementUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(WareManagementUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                WareManagementUI wmui = new WareManagementUI();
                wmui.setVisible(true);
                wmui.setLocationRelativeTo(null);
                
                loadTable();
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddWare;
    private javax.swing.JButton btnBackWareManagement;
    private javax.swing.JButton btnDeleteWare;
    private javax.swing.JButton btnFindWare;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private static javax.swing.JTable tblWares;
    // End of variables declaration//GEN-END:variables
}

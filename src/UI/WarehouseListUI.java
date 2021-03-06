package UI;

import java.awt.Dimension;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import Classes.Warehouse;

public class WarehouseListUI extends javax.swing.JFrame {

    public WarehouseListUI() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblWarehouses = new javax.swing.JTable();
        btnBackWarehouse = new javax.swing.JButton();
        btnAddWarehouse = new javax.swing.JButton();
        btnDeleteWarehouse = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("B Nazanin", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("لیست انبارها");
        jLabel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel1.setPreferredSize(new java.awt.Dimension(90, 40));

        tblWarehouses.setFont(new java.awt.Font("B Nazanin", 0, 12)); // NOI18N
        tblWarehouses.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "وضعیت انبار", "نام انبار", "شماره انبار"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tblWarehouses.setToolTipText("");
        tblWarehouses.setColumnSelectionAllowed(true);
        tblWarehouses.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tblWarehouses.setName(""); // NOI18N
        jScrollPane1.setViewportView(tblWarehouses);

        btnBackWarehouse.setFont(new java.awt.Font("B Nazanin", 1, 12)); // NOI18N
        btnBackWarehouse.setIcon(new javax.swing.ImageIcon(getClass().getResource("/undoResized.png"))); // NOI18N
        btnBackWarehouse.setText("بازگشت");
        btnBackWarehouse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackWarehouseActionPerformed(evt);
            }
        });

        btnAddWarehouse.setFont(new java.awt.Font("B Nazanin", 1, 12)); // NOI18N
        btnAddWarehouse.setIcon(new javax.swing.ImageIcon(getClass().getResource("/add.png"))); // NOI18N
        btnAddWarehouse.setText("اضافه کردن انبار");
        btnAddWarehouse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddWarehouseActionPerformed(evt);
            }
        });

        btnDeleteWarehouse.setFont(new java.awt.Font("B Nazanin", 1, 12)); // NOI18N
        btnDeleteWarehouse.setIcon(new javax.swing.ImageIcon(getClass().getResource("/close (1).png"))); // NOI18N
        btnDeleteWarehouse.setText("حذف انبار");
        btnDeleteWarehouse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteWarehouseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(119, 119, 119)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(btnBackWarehouse)
                                .addGap(18, 18, 18)
                                .addComponent(btnAddWarehouse)
                                .addGap(18, 18, 18)
                                .addComponent(btnDeleteWarehouse)))
                        .addGap(0, 43, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBackWarehouse)
                    .addComponent(btnAddWarehouse)
                    .addComponent(btnDeleteWarehouse))
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddWarehouseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddWarehouseActionPerformed
        String newRow = JOptionPane.showInputDialog(null, "نام انبار جدید را وارد کنید", "افزودن انبار", JOptionPane.PLAIN_MESSAGE);
        
        if (!newRow.isEmpty()) {
            Warehouse.insertWarehouse(new Warehouse(0, newRow, 0));
            JOptionPane.showMessageDialog(null, "با موفقیت اضافه شد!");
        }
        
        loadTable();
    }//GEN-LAST:event_btnAddWarehouseActionPerformed

    private void btnDeleteWarehouseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteWarehouseActionPerformed
        try {
            int rowID = tblWarehouses.getSelectedRow();
            int tableID = Integer.valueOf(tblWarehouses.getModel().getValueAt(rowID, 0).toString());
            String rowText = tblWarehouses.getModel().getValueAt(rowID, 1).toString();

            int reply = JOptionPane.showConfirmDialog(null, "آیا مایلید \"" + rowText + "\" حذف کنید؟", "", JOptionPane.YES_NO_OPTION);
            if (reply == JOptionPane.YES_OPTION) {
                boolean result = Warehouse.deleteWarehouse(tableID);
                if(result)
                    JOptionPane.showMessageDialog(null, "با موفقیت حذف شد!");
                loadTable();
            }
            
        } catch (Exception ex) {
            
        }
    }//GEN-LAST:event_btnDeleteWarehouseActionPerformed

    private void btnBackWarehouseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackWarehouseActionPerformed
        HomePageUI.main(new String[0]);
        setVisible(false);
    }//GEN-LAST:event_btnBackWarehouseActionPerformed

    public static void loadTable() {
        // Load table
        DefaultTableModel tableModel = new DefaultTableModel();
        int columnCount = 3;

        tableModel.addColumn("شماره انبار");
        tableModel.addColumn("نام انبار");
        tableModel.addColumn("وضعیت انبار");

        Object[] row = new Object[columnCount];

        for (Warehouse wh : Warehouse.WarehousesHolder) {
            row[0] = wh.getWarehouse_ID();
            row[1] = wh.getName();
            row[2] = wh.getState();
            tableModel.addRow(row);
        }

        tblWarehouses.setModel(tableModel);

        Dimension tableSize =  tblWarehouses.getPreferredSize();
        tblWarehouses.getColumnModel().getColumn(0).setPreferredWidth(Math.round(tableSize.width*0.35f));
        tblWarehouses.getColumnModel().getColumn(1).setPreferredWidth(Math.round(tableSize.width*0.85f));
        tblWarehouses.getColumnModel().getColumn(2).setPreferredWidth(Math.round(tableSize.width*0.25f));
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
            java.util.logging.Logger.getLogger(WarehouseListUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(WarehouseListUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(WarehouseListUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(WarehouseListUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                WarehouseListUI whlui = new WarehouseListUI();
                whlui.setVisible(true);
                whlui.setLocationRelativeTo(null);
                
                loadTable();
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddWarehouse;
    private javax.swing.JButton btnBackWarehouse;
    private javax.swing.JButton btnDeleteWarehouse;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private static javax.swing.JTable tblWarehouses;
    // End of variables declaration//GEN-END:variables
}

package UI;

import Classes.Ware;
import Classes.Warehouse;
import javax.swing.DefaultCellEditor;
import javax.swing.JComboBox;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import Functions.CheckBoxCellRenderer;
import javax.swing.JOptionPane;

public class WareRegistrationJframe extends javax.swing.JFrame {

    public WareRegistrationJframe() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblAddWare = new javax.swing.JTable();
        btnBackRegisterWare = new javax.swing.JButton();
        btnSubmitWare = new javax.swing.JButton();
        btnAddRowWare = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(235, 253, 253));

        jLabel1.setFont(new java.awt.Font("B Nazanin", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ثبت کالا");
        jLabel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel1.setPreferredSize(new java.awt.Dimension(90, 40));

        tblAddWare.setFont(new java.awt.Font("B Nazanin", 0, 14)); // NOI18N
        tblAddWare.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "انبار", "نوع کالا", "نام کالا", "قیمت کالای واحد", "تعداد کالا"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblAddWare);
        if (tblAddWare.getColumnModel().getColumnCount() > 0) {
            tblAddWare.getColumnModel().getColumn(3).setResizable(false);
        }

        btnBackRegisterWare.setFont(new java.awt.Font("B Nazanin", 1, 14)); // NOI18N
        btnBackRegisterWare.setIcon(new javax.swing.ImageIcon(getClass().getResource("/undoResized.png"))); // NOI18N
        btnBackRegisterWare.setText("بازگشت");
        btnBackRegisterWare.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackRegisterWareActionPerformed(evt);
            }
        });

        btnSubmitWare.setFont(new java.awt.Font("B Nazanin", 1, 14)); // NOI18N
        btnSubmitWare.setIcon(new javax.swing.ImageIcon(getClass().getResource("/enter.png"))); // NOI18N
        btnSubmitWare.setText("ثبت کالا");
        btnSubmitWare.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitWareActionPerformed(evt);
            }
        });

        btnAddRowWare.setIcon(new javax.swing.ImageIcon(getClass().getResource("/add.png"))); // NOI18N
        btnAddRowWare.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddRowWareActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 639, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnBackRegisterWare)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSubmitWare)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAddRowWare, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(251, 251, 251)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnAddRowWare)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnBackRegisterWare)
                        .addComponent(btnSubmitWare)))
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackRegisterWareActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackRegisterWareActionPerformed
        WareManagementUI.main(new String[0]);
        setVisible(false);
    }//GEN-LAST:event_btnBackRegisterWareActionPerformed

    private void btnAddRowWareActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddRowWareActionPerformed
        DefaultTableModel dtm = (DefaultTableModel) tblAddWare.getModel();
        dtm.addRow(new Object[]{null, null, null, null, null, null, null});
        
        repaintTable();
    }//GEN-LAST:event_btnAddRowWareActionPerformed

    private void btnSubmitWareActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitWareActionPerformed
        DefaultTableModel dtm = (DefaultTableModel) tblAddWare.getModel();
        
        String warehouse, ware_kind, ware_name;
        int ware_price, ware_size;
        
        for(int row = 0; row < dtm.getRowCount(); row++) {
            warehouse = dtm.getValueAt(row, 0).toString();
            ware_kind = dtm.getValueAt(row, 1).toString();
            ware_name = dtm.getValueAt(row, 2).toString();
            ware_price = Integer.valueOf(dtm.getValueAt(row, 3).toString());
            ware_size = Integer.valueOf(dtm.getValueAt(row, 4).toString());
            
            Ware tmpWare = new Ware(0, Warehouse.findWarehouse(warehouse), ware_kind, ware_name, ware_price, ware_size);
            Ware.insertWare(tmpWare);
        }
        
        JOptionPane.showMessageDialog(null, "کالا (ها) با موفقیت اضافه شدند!");
        
        initializeTable();
    }//GEN-LAST:event_btnSubmitWareActionPerformed

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
            java.util.logging.Logger.getLogger(WareRegistrationJframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(WareRegistrationJframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(WareRegistrationJframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(WareRegistrationJframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                WareRegistrationJframe wrjf = new WareRegistrationJframe();
                wrjf.setVisible(true);
                wrjf.setLocationRelativeTo(null);
                
                initializeTable();
            }
        });
    }
    
    private static void initializeTable() {
        DefaultTableModel dtm = (DefaultTableModel) tblAddWare.getModel();
        dtm.getDataVector().removeAllElements();
        dtm.setRowCount(1);
        tblAddWare.setModel(dtm);

        repaintTable();
    }
    
    private static void repaintTable() {
        TableColumn tmpColum = tblAddWare.getColumnModel().getColumn(0);
        String[] DATA = new String[Warehouse.WarehousesHolder.size()];
        for (int i = 0; i < Warehouse.WarehousesHolder.size(); i++)
            DATA[i] = Warehouse.WarehousesHolder.get(i).getName();
        JComboBox comboBox = new JComboBox(DATA);

        DefaultCellEditor defaultCellEditor=new DefaultCellEditor(comboBox);
        tmpColum.setCellEditor(defaultCellEditor);
        tmpColum.setCellRenderer(new CheckBoxCellRenderer(comboBox));
        tblAddWare.repaint();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddRowWare;
    private javax.swing.JButton btnBackRegisterWare;
    private javax.swing.JButton btnSubmitWare;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private static javax.swing.JTable tblAddWare;
    // End of variables declaration//GEN-END:variables
}

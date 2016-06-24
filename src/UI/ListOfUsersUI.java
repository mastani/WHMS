package UI;

import Classes.Customer;
import Classes.Warehouse;
import Classes.WarehouseKeeper;
import static UI.WarehouseListUI.loadTable;
import java.awt.Dimension;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ListOfUsersUI extends javax.swing.JFrame {

    public ListOfUsersUI() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblUsers = new javax.swing.JTable();
        btnBackUsers = new javax.swing.JButton();
        btnDeleteUser = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("B Nazanin", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("لیست کاربران  ");
        jLabel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel1.setName(""); // NOI18N
        jLabel1.setPreferredSize(new java.awt.Dimension(90, 40));

        tblUsers.setFont(new java.awt.Font("B Nazanin", 0, 12)); // NOI18N
        tblUsers.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "آدرس", "شماره تلفن", "تاریخ تولد", "نام و نام خانوادگی", "کد پرسنلی"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tblUsers.setToolTipText("");
        tblUsers.setColumnSelectionAllowed(true);
        tblUsers.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tblUsers.setName(""); // NOI18N
        jScrollPane1.setViewportView(tblUsers);

        btnBackUsers.setFont(new java.awt.Font("B Nazanin", 1, 14)); // NOI18N
        btnBackUsers.setIcon(new javax.swing.ImageIcon(getClass().getResource("/undoResized.png"))); // NOI18N
        btnBackUsers.setText("بازگشت");
        btnBackUsers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackUsersActionPerformed(evt);
            }
        });

        btnDeleteUser.setFont(new java.awt.Font("B Nazanin", 1, 14)); // NOI18N
        btnDeleteUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/close (1).png"))); // NOI18N
        btnDeleteUser.setText("حذف کاربر");
        btnDeleteUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteUserActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("B Nazanin", 1, 14)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/printer_new-Resized.png"))); // NOI18N
        jButton1.setText("چاپ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 547, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(203, 203, 203)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(btnBackUsers)
                                .addGap(18, 18, 18)
                                .addComponent(btnDeleteUser)
                                .addGap(18, 18, 18)
                                .addComponent(jButton1)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBackUsers)
                    .addComponent(btnDeleteUser)
                    .addComponent(jButton1))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackUsersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackUsersActionPerformed
        HomePageUI.main(new String[0]);
        setVisible(false);
    }//GEN-LAST:event_btnBackUsersActionPerformed

    private void btnDeleteUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteUserActionPerformed
        try {
            int rowID = tblUsers.getSelectedRow();
            int tableID = Integer.valueOf(tblUsers.getModel().getValueAt(rowID, 0).toString());
            String rowText = tblUsers.getModel().getValueAt(rowID, 1).toString();

            int reply = JOptionPane.showConfirmDialog(null, "آیا مایلید \"" + rowText + "\" حذف کنید؟", "", JOptionPane.YES_NO_OPTION);
            if (reply == JOptionPane.YES_OPTION) {
                WarehouseKeeper.deleteWarehouseKeeper(tableID);
                JOptionPane.showMessageDialog(null, "با موفقیت حذف شد!");
                loadTable();
            }
            
        } catch (Exception ex) {
            
        }
    }//GEN-LAST:event_btnDeleteUserActionPerformed

    public static void loadTable() {
        // Load table
        DefaultTableModel tableModel = new DefaultTableModel();
        int columnCount = 5;

        tableModel.addColumn("کد پرسنلی");
        tableModel.addColumn("نام و نام خانوادگی");
        tableModel.addColumn("تاریخ تولد");
        tableModel.addColumn("شماره تلفن");
        tableModel.addColumn("آدرس");

        Object[] row = new Object[columnCount];

        for (WarehouseKeeper ps : WarehouseKeeper.WarehouseKeeperHolder) {
            row[0] = ps.getPersonnelCode();
            row[1] = ps.getName() + " " + ps.getSurName();
            row[2] = ps.getBirthDate().toString();
            row[3] = ps.getCellNumber();
            row[4] = ps.getAddress();
            tableModel.addRow(row);
        }

        tblUsers.setModel(tableModel);

        Dimension tableSize =  tblUsers.getPreferredSize();
        tblUsers.getColumnModel().getColumn(0).setPreferredWidth(Math.round(tableSize.width*0.1f));
        //tblCustomers.getColumnModel().getColumn(1).setPreferredWidth(Math.round(tableSize.width*0.85f));
        //tblCustomers.getColumnModel().getColumn(2).setPreferredWidth(Math.round(tableSize.width*0.25f));
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
            java.util.logging.Logger.getLogger(ListOfUsersUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListOfUsersUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListOfUsersUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListOfUsersUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ListOfUsersUI louui = new ListOfUsersUI();
                louui.setVisible(true);
                louui.setLocationRelativeTo(null);
                
                loadTable();
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBackUsers;
    private javax.swing.JButton btnDeleteUser;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private static javax.swing.JTable tblUsers;
    // End of variables declaration//GEN-END:variables
}

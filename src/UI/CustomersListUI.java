package UI;

import Classes.Person;
import Classes.Warehouse;
import static UI.WarehouseListUI.loadTable;
import java.awt.Dimension;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class CustomersListUI extends javax.swing.JFrame {

    public CustomersListUI() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCustomers = new javax.swing.JTable();
        btnBackCustomer = new javax.swing.JButton();
        btnAddCustomer = new javax.swing.JButton();
        btnDeleteCustomer = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("B Nazanin", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("لیست مشتریان ");
        jLabel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel1.setPreferredSize(new java.awt.Dimension(90, 40));

        tblCustomers.setFont(new java.awt.Font("B Nazanin", 0, 12)); // NOI18N
        tblCustomers.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "شماره تلفن مشتری", "نام مشتری", "شماره مشتری"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tblCustomers.setToolTipText("");
        tblCustomers.setColumnSelectionAllowed(true);
        tblCustomers.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tblCustomers.setName(""); // NOI18N
        jScrollPane1.setViewportView(tblCustomers);

        btnBackCustomer.setFont(new java.awt.Font("B Nazanin", 1, 12)); // NOI18N
        btnBackCustomer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/undoResized.png"))); // NOI18N
        btnBackCustomer.setText("بازگشت");
        btnBackCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackCustomerActionPerformed(evt);
            }
        });

        btnAddCustomer.setFont(new java.awt.Font("B Nazanin", 1, 12)); // NOI18N
        btnAddCustomer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/add.png"))); // NOI18N
        btnAddCustomer.setText("اضافه کردن مشتری");
        btnAddCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddCustomerActionPerformed(evt);
            }
        });

        btnDeleteCustomer.setFont(new java.awt.Font("B Nazanin", 1, 12)); // NOI18N
        btnDeleteCustomer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/close (1).png"))); // NOI18N
        btnDeleteCustomer.setText("حذف مشتری");
        btnDeleteCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteCustomerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(230, 230, 230))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnBackCustomer)
                        .addGap(18, 18, 18)
                        .addComponent(btnAddCustomer)
                        .addGap(18, 18, 18)
                        .addComponent(btnDeleteCustomer)
                        .addContainerGap(273, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBackCustomer)
                    .addComponent(btnAddCustomer)
                    .addComponent(btnDeleteCustomer))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackCustomerActionPerformed
        HomePageUI.main(new String[0]);
        setVisible(false);
    }//GEN-LAST:event_btnBackCustomerActionPerformed

    private void btnDeleteCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteCustomerActionPerformed
        try {
            int rowID = tblCustomers.getSelectedRow();
            int tableID = Integer.valueOf(tblCustomers.getModel().getValueAt(rowID, 0).toString());
            String rowText = tblCustomers.getModel().getValueAt(rowID, 1).toString();

            int reply = JOptionPane.showConfirmDialog(null, "آیا مایلید \"" + rowText + "\" حذف کنید؟", "", JOptionPane.YES_NO_OPTION);
            if (reply == JOptionPane.YES_OPTION) {
                Person
                Warehouse.deleteWarehouse(tableID);
                JOptionPane.showMessageDialog(null, "با موفقیت حذف شد!");
                loadTable();
            }
            
        } catch (Exception ex) {
            
        }
    }//GEN-LAST:event_btnDeleteCustomerActionPerformed

    private void btnAddCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddCustomerActionPerformed
        String newRow = JOptionPane.showInputDialog(null, "نام مشتری را وارد کنید", "افزودن مشتری", JOptionPane.PLAIN_MESSAGE);
        
        if (!newRow.isEmpty()) {
            Warehouse.insertWarehouse(new Warehouse(0, newRow, 0));
            JOptionPane.showMessageDialog(null, "با موفقیت اضافه شد!");
        }
        
        loadTable();
    }//GEN-LAST:event_btnAddCustomerActionPerformed

    public static void loadTable() {
        // Load table
        DefaultTableModel tableModel = new DefaultTableModel();
        int columnCount = 5;

        tableModel.addColumn("شماره مشتری");
        tableModel.addColumn("نام مشتری");
        tableModel.addColumn("تاریخ تولد");
        tableModel.addColumn("شماره تلفن");
        tableModel.addColumn("آدرس");

        Object[] row = new Object[columnCount];

        for (Person ps : Person.PersonsHolder) {
            row[0] = ps.getID();
            row[1] = ps.getName() + " " + ps.getSurName();
            row[2] = ps.getBirthDate().toString();
            row[3] = ps.getCellNumber();
            row[4] = ps.getAddress();
            tableModel.addRow(row);
        }

        tblCustomers.setModel(tableModel);

        Dimension tableSize =  tblCustomers.getPreferredSize();
        tblCustomers.getColumnModel().getColumn(0).setPreferredWidth(Math.round(tableSize.width*0.1f));
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
            java.util.logging.Logger.getLogger(CustomersListUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CustomersListUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CustomersListUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CustomersListUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                CustomersListUI clui = new CustomersListUI();
                clui.setVisible(true);
                clui.setLocationRelativeTo(null);
                
                loadTable();
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddCustomer;
    private javax.swing.JButton btnBackCustomer;
    private javax.swing.JButton btnDeleteCustomer;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private static javax.swing.JTable tblCustomers;
    // End of variables declaration//GEN-END:variables
}

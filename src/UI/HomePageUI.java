package UI;

import Classes.*;

public class HomePageUI extends javax.swing.JFrame {

    public HomePageUI() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnCustomersList = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnFactorsList = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        btnWaresManagement = new javax.swing.JButton();
        txtWarehouseList = new javax.swing.JButton();
        btnUserList = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("WareHouse Main Page");
        setBackground(new java.awt.Color(235, 253, 253));
        setResizable(false);

        btnCustomersList.setFont(new java.awt.Font("B Nazanin", 1, 14)); // NOI18N
        btnCustomersList.setText("لیست مشتریان");
        btnCustomersList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCustomersListActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("B Nazanin", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("سیستم مدیریت انبار");
        jLabel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel1.setPreferredSize(new java.awt.Dimension(90, 40));

        btnFactorsList.setFont(new java.awt.Font("B Nazanin", 1, 14)); // NOI18N
        btnFactorsList.setText("فاکتورهای پیش رو");
        btnFactorsList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFactorsListActionPerformed(evt);
            }
        });

        jButton6.setFont(new java.awt.Font("B Nazanin", 1, 14)); // NOI18N
        jButton6.setText("ثبت سفارش");

        btnWaresManagement.setFont(new java.awt.Font("B Nazanin", 1, 14)); // NOI18N
        btnWaresManagement.setText("مدیریت کالاها");
        btnWaresManagement.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnWaresManagementActionPerformed(evt);
            }
        });

        txtWarehouseList.setFont(new java.awt.Font("B Nazanin", 1, 14)); // NOI18N
        txtWarehouseList.setText("لیست انبارها");
        txtWarehouseList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtWarehouseListActionPerformed(evt);
            }
        });

        btnUserList.setFont(new java.awt.Font("B Nazanin", 1, 14)); // NOI18N
        btnUserList.setText("لیست کاربران");
        btnUserList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUserListActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnCustomersList, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnWaresManagement, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtWarehouseList, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnFactorsList, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnUserList, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(45, 45, 45))
            .addGroup(layout.createSequentialGroup()
                .addGap(117, 117, 117)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnWaresManagement)
                    .addComponent(txtWarehouseList))
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCustomersList)
                    .addComponent(btnFactorsList))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton6)
                    .addComponent(btnUserList))
                .addContainerGap(52, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtWarehouseListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtWarehouseListActionPerformed
        WarehouseListUI.main(new String[0]);
        setVisible(false);
    }//GEN-LAST:event_txtWarehouseListActionPerformed

    private void btnCustomersListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCustomersListActionPerformed
        CustomersListUI.main(new String[0]);
        setVisible(false);
    }//GEN-LAST:event_btnCustomersListActionPerformed

    private void btnFactorsListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFactorsListActionPerformed
        FactorsUI.main(new String[0]);
        setVisible(false);
    }//GEN-LAST:event_btnFactorsListActionPerformed

    private void btnWaresManagementActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnWaresManagementActionPerformed
        WareManagementUI.main(new String[0]);
        setVisible(false);
    }//GEN-LAST:event_btnWaresManagementActionPerformed

    private void btnUserListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUserListActionPerformed
        ListOfUsersUI.main(new String[0]);
        setVisible(false);
    }//GEN-LAST:event_btnUserListActionPerformed

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
            java.util.logging.Logger.getLogger(HomePageUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomePageUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomePageUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomePageUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                HomePageUI hpui = new HomePageUI();
                hpui.setVisible(true);
                hpui.setLocationRelativeTo(null);
            }
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCustomersList;
    private javax.swing.JButton btnFactorsList;
    private javax.swing.JButton btnUserList;
    private javax.swing.JButton btnWaresManagement;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton txtWarehouseList;
    // End of variables declaration//GEN-END:variables
}

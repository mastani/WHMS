package UI;

import Classes.*;
import Functions.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.print.PageFormat;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.util.Date;
import java.util.function.Function;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultCellEditor;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

public class OrderUI extends javax.swing.JFrame {

    public OrderUI() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnBackOrder = new javax.swing.JButton();
        btnPrint = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblOrder = new javax.swing.JTable();
        btnAddRow = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        btnRegisterOrder = new javax.swing.JButton();
        lblSum = new javax.swing.JLabel();
        comboName = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("B Nazanin", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ثبت سفارش");
        jLabel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel1.setPreferredSize(new java.awt.Dimension(90, 40));

        btnBackOrder.setFont(new java.awt.Font("B Nazanin", 1, 14)); // NOI18N
        btnBackOrder.setIcon(new javax.swing.ImageIcon(getClass().getResource("/undoResized.png"))); // NOI18N
        btnBackOrder.setText("بازگشت");
        btnBackOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackOrderActionPerformed(evt);
            }
        });

        btnPrint.setFont(new java.awt.Font("B Nazanin", 1, 14)); // NOI18N
        btnPrint.setIcon(new javax.swing.ImageIcon(getClass().getResource("/printer_new-Resized.png"))); // NOI18N
        btnPrint.setText("چاپ فاکتور");
        btnPrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrintActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("B Nazanin", 0, 14)); // NOI18N
        jLabel3.setText("نام مشتری :");

        tblOrder.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "نام کالا", "تعداد", "فی", "جمع"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblOrder);

        btnAddRow.setIcon(new javax.swing.ImageIcon(getClass().getResource("/add.png"))); // NOI18N
        btnAddRow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddRowActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("B Nazanin", 1, 14)); // NOI18N
        jLabel5.setText("جمع کل");

        btnRegisterOrder.setFont(new java.awt.Font("B Nazanin", 1, 14)); // NOI18N
        btnRegisterOrder.setText("ثبت سفارش");
        btnRegisterOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterOrderActionPerformed(evt);
            }
        });

        lblSum.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblSum.setText("0");

        comboName.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(lblSum, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnAddRow))
                            .addComponent(jScrollPane1)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(159, 159, 159)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnBackOrder)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnRegisterOrder)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnPrint)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(comboName, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(comboName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnAddRow)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(lblSum)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 79, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBackOrder)
                    .addComponent(btnPrint)
                    .addComponent(btnRegisterOrder))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackOrderActionPerformed
        HomePageUI.main(new String[0]);
        setVisible(false);
    }//GEN-LAST:event_btnBackOrderActionPerformed

    private void btnAddRowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddRowActionPerformed
        DefaultTableModel dtm = (DefaultTableModel) tblOrder.getModel();
        dtm.addRow(new Object[]{null, null, null, null, null, null, null});
        
        repaintTable();
    }//GEN-LAST:event_btnAddRowActionPerformed

    private void btnRegisterOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterOrderActionPerformed
        Object item = comboName.getSelectedItem();        
        int customer_ID = ((ComboItem)item).getKey();
        Date order_time = new Date();
        int personnel_code = Person.currentPersonnel;
        
        Orders temp = new Orders(0, order_time, customer_ID, personnel_code);
        int order_ID = Orders.insertOrder(temp);
        
        DefaultTableModel dtm = (DefaultTableModel) tblOrder.getModel();
        for(int row = 0; row < dtm.getRowCount(); row++) {
            String ware_name = dtm.getValueAt(row, 0).toString();
            int ware_ID = Ware.findWareWithName(ware_name).getWareID();
            int ware_size = Integer.valueOf(dtm.getValueAt(row, 1).toString());
            
            Orders.insertOrderWares(order_ID, ware_ID, ware_size);
        }
        
        JOptionPane.showMessageDialog(null, "با موفقیت ثبت شد!");
    }//GEN-LAST:event_btnRegisterOrderActionPerformed

    private void btnPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrintActionPerformed
        PrinterJob pjob = PrinterJob.getPrinterJob();
        PageFormat preformat = pjob.defaultPage();
        preformat.setOrientation(PageFormat.LANDSCAPE);
        PageFormat postformat = pjob.pageDialog(preformat);
        //If user does not hit cancel then print.
        if (preformat != postformat) {
            //Set print component
            pjob.setPrintable(new Printer(orui), postformat);
            if (pjob.printDialog()) {
                try {
                    pjob.print();
                } catch (PrinterException ex) {
                    Logger.getLogger(OrderUI.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }//GEN-LAST:event_btnPrintActionPerformed

    static OrderUI orui;
    
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
            java.util.logging.Logger.getLogger(OrderUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OrderUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OrderUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OrderUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                orui = new OrderUI();
                orui.setVisible(true);
                orui.setLocationRelativeTo(null);
                
                for (Customer ps : Customer.CustomersHolder) {
                    comboName.addItem(new ComboItem(ps.getCustommerID(), ps.getName() + " " + ps.getSurName()));
                }
                
                initializeTable();
                
                Functions.alignCenter(tblOrder, 0);
                Functions.alignCenter(tblOrder, 1);
                Functions.alignCenter(tblOrder, 2);
                Functions.alignCenter(tblOrder, 3);
            }
        });
    }
    
    private static void initializeTable() {
        DefaultTableModel dtm = (DefaultTableModel) tblOrder.getModel();
        dtm.getDataVector().removeAllElements();
        dtm.setRowCount(1);
        tblOrder.setModel(dtm);

        repaintTable();
    }
    
    private static void repaintTable() {
        TableColumn tmpColum = tblOrder.getColumnModel().getColumn(0);
        String[] DATA = new String[Ware.WaresHolder.size()];
        for (int i = 0; i < Ware.WaresHolder.size(); i++)
            DATA[i] = Ware.WaresHolder.get(i).getWare_Name();
        JComboBox comboBox = new JComboBox(DATA);

        DefaultCellEditor defaultCellEditor = new DefaultCellEditor(comboBox);
        
        comboBox.addItemListener(new ItemListener() {

            @Override
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    Ware temp = Ware.findWareWithName(e.getItem().toString());
                    int rowID = tblOrder.getSelectedRow();
                    tblOrder.getModel().setValueAt(temp.getWare_Price(), rowID, 2);
                    
                    eVal(rowID);
                }
            }
        });
        
        tblOrder.getModel().addTableModelListener(new TableModelListener() {

            @Override
            public void tableChanged(TableModelEvent e) {
                if (e.getType() == TableModelEvent.UPDATE) {
                    int rowID = e.getFirstRow();
                    int columnID = e.getColumn();

                    if (columnID == 1) {
                        eVal(rowID);
                    }
                }
            }
        });
        
        tmpColum.setCellEditor(defaultCellEditor);
        tmpColum.setCellRenderer(new CheckBoxCellRenderer(comboBox));
        tblOrder.repaint();
    }
    
    public static void eVal(int rowID) {
        try {
            String val1 = tblOrder.getModel().getValueAt(rowID, 1).toString();
            String val2 = tblOrder.getModel().getValueAt(rowID, 2).toString();                

            if(val2.length() > 0) {
                int calc = Integer.valueOf(val1) * Integer.valueOf(val2);
                tblOrder.getModel().setValueAt(calc, rowID, 3);
            }
            
            // Sum price
            int sum = 0;
            
            DefaultTableModel dtm = (DefaultTableModel) tblOrder.getModel();
            for(int row = 0; row < dtm.getRowCount(); row++) {
                sum += Integer.valueOf(dtm.getValueAt(row, 3).toString());
            }
            
            lblSum.setText(String.valueOf(sum));
        } catch (Exception ex) {
            
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddRow;
    private javax.swing.JButton btnBackOrder;
    private javax.swing.JButton btnPrint;
    private javax.swing.JButton btnRegisterOrder;
    private static javax.swing.JComboBox comboName;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private static javax.swing.JLabel lblSum;
    private static javax.swing.JTable tblOrder;
    // End of variables declaration//GEN-END:variables
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurantsystem.component.billing;

import java.io.FileOutputStream;
import java.io.PrintWriter;
import javax.swing.JOptionPane;
import restaurantsystem.component.order.OrderManagement;
import restaurantsystem.MainMenu;


public class BillingManagement extends javax.swing.JFrame {

    private BillingHelper t;
    private String name;
    private String quantity;
    private double totalPrice = 0;
    private double sum = 0;

    public void setName(String name) {
        this.name = name;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public String getQuantity() {
        return quantity;
    }

    /**
     * Creates new form BillManagement
     */
    public BillingManagement() {
        initComponents();
        display();
        performFileRelatedTask();
    }

    public void display() {
        t = new BillingHelper();
        text.setText(t.getFullNames().toString());
        totalPriceArea.setText(t.getTotal());
    }

    private void performFileRelatedTask() {
        //  RestaurentManagement r= new RestaurentManagement();
        // r.setVisible(true);
        // this.dispose();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        text = new javax.swing.JTextArea();
        totalPriceArea = new javax.swing.JTextField();
        backButton = new javax.swing.JButton();
        paymentButton = new javax.swing.JButton();
        printReciptButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 51, 255));

        jPanel1.setBackground(new java.awt.Color(0, 153, 255));

        text.setEditable(false);
        text.setBackground(new java.awt.Color(204, 204, 255));
        text.setColumns(20);
        text.setRows(5);
        jScrollPane1.setViewportView(text);

        totalPriceArea.setEditable(false);
        totalPriceArea.setBackground(new java.awt.Color(255, 102, 102));

        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        paymentButton.setText("Payment");
        paymentButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paymentButtonActionPerformed(evt);
            }
        });

        printReciptButton.setText("Print Recipt");
        printReciptButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printReciptButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(142, 142, 142)
                                .addComponent(paymentButton)
                                .addGap(18, 18, 18)
                                .addComponent(printReciptButton))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(totalPriceArea, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(totalPriceArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(paymentButton)
                    .addComponent(printReciptButton)
                    .addComponent(backButton))
                .addContainerGap(53, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // TODO add your handling code here:

        OrderManagement om = new OrderManagement();
        om.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backButtonActionPerformed

    private void paymentButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paymentButtonActionPerformed
        // TODO add your handling code here:
       
        t = new BillingHelper();

        MainMenu rm = new MainMenu();
        rm.setVisible(true);
        this.dispose();
        try {
            PrintWriter pw1 = new PrintWriter(new FileOutputStream("temp.txt"));
            PrintWriter pw2 = new PrintWriter(new FileOutputStream("storage/order.txt"));
            PrintWriter pw3 = new PrintWriter(new FileOutputStream("totalBill.txt", true));
            pw3.println(t.getFullNames() + "\t");

            pw1.close();;
            pw2.close();
            pw3.close();
        } catch (Exception e) {
        }
    }//GEN-LAST:event_paymentButtonActionPerformed

    private void printReciptButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printReciptButtonActionPerformed
        // TODO add your handling code here:
        try {

            boolean complete = text.print();
            if (complete) {

                JOptionPane.showMessageDialog(null, "Done printing");
            } else {
                JOptionPane.showMessageDialog(null, "Printing cancel", "Printer", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_printReciptButtonActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(BillingManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BillingManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BillingManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BillingManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BillingManagement().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton paymentButton;
    private javax.swing.JButton printReciptButton;
    public javax.swing.JTextArea text;
    private javax.swing.JTextField totalPriceArea;
    // End of variables declaration//GEN-END:variables
}

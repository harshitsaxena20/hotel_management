
import java.sql.*;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

public class waterbills extends javax.swing.JFrame {
        Connection cn;
        Statement stmt;
        Statement stmt1;
        ResultSet rs; 
        int years,months;
        DefaultComboBoxModel day=new DefaultComboBoxModel();
        DefaultComboBoxModel month=new DefaultComboBoxModel();
        DefaultComboBoxModel year=new DefaultComboBoxModel();
    
    public waterbills() {
        initComponents();
        try {
            cn=DriverManager.getConnection("jdbc:mysql://localhost/DMD","root","");
            stmt=(Statement) cn.createStatement();
            stmt1=(Statement) cn.createStatement();
        } catch (SQLException ex) {
             System.out.println(ex.getMessage());
        }
        
        dayCB.setModel(day);
        monthCB.setModel(month);
        yearCB.setModel(year);
        int y;
        for(y=2010;y<=2020;y++){
            year.addElement(y);
        }
        
        int m;
        for(m=1;m<=12;m++){
            month.addElement(m);
                    }
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        billnoTF = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        yearCB = new javax.swing.JComboBox();
        monthCB = new javax.swing.JComboBox();
        dayCB = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        amountTF = new javax.swing.JTextField();
        sumbitBTN = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        billnoTF2 = new javax.swing.JTextField();
        dateofbillTF2 = new javax.swing.JTextField();
        amountTF2 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        checkBTN = new javax.swing.JButton();
        newBTN2 = new javax.swing.JButton();
        newBTN = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("WATER BILL");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 60, -1, -1));

        jLabel2.setForeground(new java.awt.Color(240, 240, 240));
        jLabel2.setText("BILLNO.");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 100, -1, -1));

        billnoTF.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        billnoTF.setOpaque(false);
        getContentPane().add(billnoTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 100, 75, -1));

        jLabel13.setForeground(new java.awt.Color(240, 240, 240));
        jLabel13.setText("YEAR");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 150, -1, -1));

        jLabel14.setForeground(new java.awt.Color(240, 240, 240));
        jLabel14.setText("MONTH");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 170, -1, -1));

        jLabel15.setForeground(new java.awt.Color(240, 240, 240));
        jLabel15.setText("DAY");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 200, -1, -1));

        yearCB.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(yearCB, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 140, 70, -1));

        monthCB.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        monthCB.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                monthCBItemStateChanged(evt);
            }
        });
        getContentPane().add(monthCB, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 170, 70, -1));

        dayCB.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(dayCB, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 200, 70, -1));

        jLabel3.setForeground(new java.awt.Color(240, 240, 240));
        jLabel3.setText("AMOUNT");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 260, -1, -1));

        jLabel4.setText("DATE OF BILL");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 110, -1, -1));

        amountTF.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(240, 240, 240)));
        amountTF.setOpaque(false);
        getContentPane().add(amountTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 260, 75, -1));

        sumbitBTN.setBackground(new java.awt.Color(102, 102, 255));
        sumbitBTN.setForeground(new java.awt.Color(102, 0, 153));
        sumbitBTN.setText("SUMBIT");
        sumbitBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sumbitBTNActionPerformed(evt);
            }
        });
        getContentPane().add(sumbitBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 310, -1, -1));

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setOpaque(false);

        jLabel5.setForeground(new java.awt.Color(102, 255, 255));
        jLabel5.setText("SEE PREVIOUS BILL DETAILS>>>>");

        jLabel6.setForeground(new java.awt.Color(102, 255, 255));
        jLabel6.setText("BILL NO.");

        billnoTF2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(240, 240, 240)));
        billnoTF2.setOpaque(false);
        billnoTF2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                billnoTF2ActionPerformed(evt);
            }
        });

        dateofbillTF2.setEditable(false);
        dateofbillTF2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(240, 240, 240)));
        dateofbillTF2.setOpaque(false);

        amountTF2.setEditable(false);
        amountTF2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(240, 240, 240)));
        amountTF2.setOpaque(false);

        jLabel8.setForeground(new java.awt.Color(102, 255, 255));
        jLabel8.setText("AMOUNT IN RUPEES");

        jLabel7.setForeground(new java.awt.Color(102, 255, 255));
        jLabel7.setText("DATE OF BILL");

        checkBTN.setText("CHECK");
        checkBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkBTNActionPerformed(evt);
            }
        });

        newBTN2.setText("NEW");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(159, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(72, 72, 72))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(checkBTN)
                        .addGap(18, 18, 18)
                        .addComponent(newBTN2)
                        .addGap(57, 57, 57))))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(55, 55, 55)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel7)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(13, 13, 13)
                                    .addComponent(jLabel6))
                                .addComponent(jLabel8))
                            .addGap(44, 44, 44)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(dateofbillTF2, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(billnoTF2, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(amountTF2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addContainerGap(128, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 192, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(checkBTN)
                    .addComponent(newBTN2))
                .addContainerGap())
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(68, 68, 68)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(billnoTF2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(28, 28, 28)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel7)
                        .addComponent(dateofbillTF2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(27, 27, 27)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel8)
                        .addComponent(amountTF2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(80, Short.MAX_VALUE)))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 100, -1, -1));

        newBTN.setBackground(new java.awt.Color(102, 102, 255));
        newBTN.setForeground(new java.awt.Color(102, 0, 153));
        newBTN.setText("NEW");
        newBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newBTNActionPerformed(evt);
            }
        });
        getContentPane().add(newBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 360, -1, -1));

        jLabel10.setFont(new java.awt.Font("Georgia", 1, 36)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(204, 204, 255));
        jLabel10.setText("SAMUNDRA RESORTS");
        jLabel10.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 10, -1, -1));

        jButton6.setBackground(new java.awt.Color(102, 51, 0));
        jButton6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setText("BACK");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 420, -1, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bill.jpg"))); // NOI18N
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 840, 470));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void monthCBItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_monthCBItemStateChanged
        // TODO add your handling code here:
        months = (int) monthCB.getSelectedItem();
        years = (int) yearCB.getSelectedItem();
        dayCB.removeAllItems();
        if (months == 1 || months == 3 || months == 5 || months == 7 || months == 8 || months == 10 || months == 12) {
            for (int d = 1; d <= 31; d++) {
                day.addElement(d);
            }
        } else if (months == 4 || months == 6 || months == 9 || months == 11) {
            for (int d = 1; d <= 30; d++) {
                day.addElement(d);
            }
        } else if (months == 2) {
            if (years % 4 == 0) {
                for (int d = 1; d <= 29; d++) {
                    day.addElement(d);
                }
            } else {
                for (int d = 1; d <= 28; d++) {
                    day.addElement(d);
                }
            }
        }
    }//GEN-LAST:event_monthCBItemStateChanged

    private void billnoTF2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_billnoTF2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_billnoTF2ActionPerformed

    private void sumbitBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sumbitBTNActionPerformed
        int billno=Integer.parseInt(billnoTF.getText());
        String day=dayCB.getSelectedItem().toString();
        String year=yearCB.getSelectedItem().toString();
        String month=monthCB.getSelectedItem().toString();
        Double amount=Double.parseDouble(amountTF.getText());
        String date=(year+":"+month+":"+day);
        try {
            stmt.executeUpdate("insert Into waterbill(AmountPaid,dateofbill,billno) values("+ amount + ",'" + date + "'," + billno+")");
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        
        
        
        
    }//GEN-LAST:event_sumbitBTNActionPerformed

    private void newBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newBTNActionPerformed
        // TODO add your handling code here
        billnoTF.setText("");
        amountTF.setText("");
        yearCB.setSelectedIndex(0);
        monthCB.setSelectedIndex(0);
        dayCB.setSelectedIndex(0);
        
    }//GEN-LAST:event_newBTNActionPerformed

    private void checkBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkBTNActionPerformed
        // TODO add your handling code here:
        try {
            int billno=Integer.parseInt(billnoTF2.getText()); 
            rs = stmt1.executeQuery("SELECT*FROM waterbill WHERE billno="+billno+"");
            rs.first();
            dateofbillTF2.setText(rs.getString("dateofbill"));
            amountTF2.setText(rs.getString("amountpaid"));
            
            
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        
    }//GEN-LAST:event_checkBTNActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        int ch2= JOptionPane.showConfirmDialog(null,"Do you want to go back?");
        if(ch2==0){
        
        this.dispose();
        }
    }//GEN-LAST:event_jButton6ActionPerformed
    public static void main(String args[]) {
        /*
         * Set the Nimbus look and feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(waterbills.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(waterbills.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(waterbills.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(waterbills.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new waterbills().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField amountTF;
    private javax.swing.JTextField amountTF2;
    private javax.swing.JTextField billnoTF;
    private javax.swing.JTextField billnoTF2;
    private javax.swing.JButton checkBTN;
    private javax.swing.JTextField dateofbillTF2;
    private javax.swing.JComboBox dayCB;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox monthCB;
    private javax.swing.JButton newBTN;
    private javax.swing.JButton newBTN2;
    private javax.swing.JButton sumbitBTN;
    private javax.swing.JComboBox yearCB;
    // End of variables declaration//GEN-END:variables
}

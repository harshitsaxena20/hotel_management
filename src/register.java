
import java.sql.*;
import javax.swing.JOptionPane;




public class register extends javax.swing.JFrame {
    loginuser u=new loginuser();
         Connection cn;
         Statement stmt;
         Statement stmt1;
         ResultSet rs;
    public register() {
        initComponents();
        
        try {
            cn=DriverManager.getConnection("jdbc:mysql://localhost/DMD","root","");
            stmt=(Statement) cn.createStatement();
            stmt1=(Statement) cn.createStatement();
        } catch (SQLException ex) {
             System.out.println(ex.getMessage());
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        nameTF = new javax.swing.JTextField();
        usernameTF = new javax.swing.JTextField();
        emailidTF = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        passwordTF1 = new javax.swing.JPasswordField();
        passwordTF2 = new javax.swing.JPasswordField();
        seeBTN1 = new javax.swing.JButton();
        seeBTN2 = new javax.swing.JButton();
        redLBL = new javax.swing.JLabel();
        sumbitBTN = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Georgia", 1, 36)); // NOI18N
        jLabel4.setText("SAMUNDRA RESORTS");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 20, -1, -1));

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setOpaque(false);

        nameTF.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        nameTF.setOpaque(false);

        usernameTF.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        usernameTF.setOpaque(false);

        emailidTF.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        emailidTF.setOpaque(false);

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("EMAILID");

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("RE ENTER PASSWORD");

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("PASSWORD");

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("USERNAME");

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("NAME");

        passwordTF1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        passwordTF1.setOpaque(false);

        passwordTF2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        passwordTF2.setOpaque(false);

        seeBTN1.setBackground(new java.awt.Color(0, 0, 0));
        seeBTN1.setForeground(new java.awt.Color(255, 255, 255));
        seeBTN1.setText("*");
        seeBTN1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                seeBTN1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                seeBTN1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                seeBTN1MouseExited(evt);
            }
        });
        seeBTN1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seeBTN1ActionPerformed(evt);
            }
        });

        seeBTN2.setBackground(new java.awt.Color(0, 0, 0));
        seeBTN2.setForeground(new java.awt.Color(255, 255, 255));
        seeBTN2.setText("*");
        seeBTN2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                seeBTN2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                seeBTN2MouseExited(evt);
            }
        });
        seeBTN2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seeBTN2ActionPerformed(evt);
            }
        });

        redLBL.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        redLBL.setForeground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel6)
                        .addGap(10, 10, 10)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(usernameTF, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)
                            .addComponent(nameTF))
                        .addGap(48, 48, 48))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(emailidTF, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(passwordTF2, javax.swing.GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE)
                                    .addComponent(passwordTF1))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(seeBTN1)
                                    .addComponent(seeBTN2))))
                        .addGap(44, 44, 44))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(redLBL, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(75, 75, 75))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(nameTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(usernameTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(passwordTF1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(seeBTN1))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(passwordTF2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(seeBTN2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addComponent(redLBL, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emailidTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(22, 22, 22))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 100, -1, -1));

        sumbitBTN.setBackground(new java.awt.Color(102, 102, 0));
        sumbitBTN.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        sumbitBTN.setForeground(new java.awt.Color(102, 0, 51));
        sumbitBTN.setText("REGISTER");
        sumbitBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sumbitBTNActionPerformed(evt);
            }
        });
        getContentPane().add(sumbitBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 410, -1, -1));

        jButton2.setBackground(new java.awt.Color(102, 102, 0));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(102, 0, 51));
        jButton2.setText("NEW");
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 410, -1, -1));

        jButton3.setBackground(new java.awt.Color(102, 102, 0));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(102, 0, 51));
        jButton3.setText("BACK");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 410, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/login.jpg"))); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 910, 530));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void seeBTN1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seeBTN1ActionPerformed
        // TODO add your handling code here:
        passwordTF1.setEchoChar((char)0);
    }//GEN-LAST:event_seeBTN1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        int ch2= JOptionPane.showConfirmDialog(null,"Do you want to go back?");
        if(ch2==0){
        login l = new login();
        l.show();
        this.dispose();
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void sumbitBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sumbitBTNActionPerformed
        String name=nameTF.getText().toString();
        String username=usernameTF.getText().toString();
        String emailid=emailidTF.getText().toString();
        String checkpass1=passwordTF1.getText().toString();
        String checkpass2=passwordTF2.getText().toString();
        String password=null;
        if(checkpass1.equals(checkpass2)){
            
            password=passwordTF1.getText().toString();
            try {
            stmt.executeUpdate("insert Into LOGIN(NAME,USERNAME,PASSWORD,ADMIN,EMAILID) values("
                        + "'" + name + "'"
                        + ",'" + username + "'"
                        + ",'" + password + "'"
                        + ",'no'"
                        + ",'" + emailid + "')");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        int ch2= JOptionPane.showConfirmDialog(null,"REGISTERED,DO YOU WANT TO GO AHEAD?");
        u.setUsername(""+username);
        if(ch2==0){
        homepage h= new homepage(u);
         h.show();
         this.dispose();
        }    
        else if(ch2==0){
        welcome w=new welcome();
        w.show();
        this.dispose();
        }    
            
        }
        else{
            redLBL.setText("PASSWORD DOES NOT MATCH");
        }
   
        
        
        
    }//GEN-LAST:event_sumbitBTNActionPerformed

    private void seeBTN2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seeBTN2ActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_seeBTN2ActionPerformed

    private void seeBTN1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_seeBTN1MouseClicked
        // TODO add your handling code here:
        passwordTF1.setEchoChar((char)0);
    }//GEN-LAST:event_seeBTN1MouseClicked

    private void seeBTN1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_seeBTN1MouseExited
        // TODO add your handling code here:
        passwordTF1.setEchoChar(('*'));
    }//GEN-LAST:event_seeBTN1MouseExited

    private void seeBTN1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_seeBTN1MouseEntered
        // TODO add your handling code here:
        passwordTF1.setEchoChar((char)0);
    }//GEN-LAST:event_seeBTN1MouseEntered

    private void seeBTN2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_seeBTN2MouseEntered
        // TODO add your handling code here:
        passwordTF2.setEchoChar((char)0);
    }//GEN-LAST:event_seeBTN2MouseEntered

    private void seeBTN2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_seeBTN2MouseExited
        // TODO add your handling code here:
        passwordTF2.setEchoChar('*');
    }//GEN-LAST:event_seeBTN2MouseExited

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new register().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField emailidTF;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField nameTF;
    private javax.swing.JPasswordField passwordTF1;
    private javax.swing.JPasswordField passwordTF2;
    private javax.swing.JLabel redLBL;
    private javax.swing.JButton seeBTN1;
    private javax.swing.JButton seeBTN2;
    private javax.swing.JButton sumbitBTN;
    private javax.swing.JTextField usernameTF;
    // End of variables declaration//GEN-END:variables
}

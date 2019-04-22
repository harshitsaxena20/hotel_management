

import java.sql.*;

import javax.swing.JOptionPane;




public class admin extends javax.swing.JFrame {
    
    Connection cn;
         Statement stmt;
         Statement stmt1;
         ResultSet rs;
         String ue=null;
         String pw=null;
         String admin=null;
   public admin() {
        initComponents();
        try {
            cn=DriverManager.getConnection("jdbc:mysql://localhost/DMD","root","");
            stmt= cn.createStatement();
            stmt1=cn.createStatement();
        } catch (SQLException ex) {
             System.out.println(ex.getMessage());
        }
    }

   
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        adminidTF = new javax.swing.JTextField();
        passwordTF = new javax.swing.JPasswordField();
        seeBTN1 = new javax.swing.JButton();
        loginBTN = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        redLBL = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel4.setFont(new java.awt.Font("Georgia", 1, 36)); // NOI18N
        jLabel4.setText("SAMUNDRA RESORTS");

        jLabel1.setText("ADMIN ID");

        jLabel2.setText("PASSWORD");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setText("ONLY FOR ADMINISTRATORS>>>");

        seeBTN1.setText("*");
        seeBTN1.addMouseListener(new java.awt.event.MouseAdapter() {
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

        loginBTN.setFont(new java.awt.Font("Traditional Arabic", 1, 24)); // NOI18N
        loginBTN.setText("LOGIN");
        loginBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginBTNActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton3.setText("BACK");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        redLBL.setForeground(new java.awt.Color(255, 51, 102));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(loginBTN)
                .addGap(144, 144, 144)
                .addComponent(jButton3)
                .addGap(27, 27, 27))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGap(98, 98, 98)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(adminidTF)
                            .addComponent(passwordTF, javax.swing.GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE))
                        .addGap(33, 33, 33)
                        .addComponent(seeBTN1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addComponent(jLabel4))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(190, 190, 190)
                        .addComponent(redLBL, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(91, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLabel3)
                        .addGap(48, 48, 48)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(adminidTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(passwordTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(seeBTN1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(redLBL, javax.swing.GroupLayout.DEFAULT_SIZE, 14, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(loginBTN)
                        .addGap(15, 15, 15))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton3)
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void seeBTN1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seeBTN1ActionPerformed
        // TODO add your handling code here:
        passwordTF.setEchoChar((char) 0);
    }//GEN-LAST:event_seeBTN1ActionPerformed

    private void loginBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginBTNActionPerformed
        // TODO add your handling code here:
        
        
         try {
        String username=(adminidTF.getText());
        cn=DriverManager.getConnection("jdbc:mysql://localhost/DMD","root","");
        stmt=cn.createStatement();
        rs=stmt.executeQuery("SELECT*FROM LOGIN WHERE USERNAME='"+username+"'");
            rs.first();
                ue = rs.getString("USERNAME");
            pw = rs.getString("PASSWORD");
            admin=rs.getString("admin");
        }
        
            catch(Exception e){
                e.printStackTrace();
                              }
        String pass=passwordTF.getText();
        if(pass.equals(pw)){
            if(admin.equals("yes")){
                passwordTF.setText("");
         reception r= new reception();
         r.show();
        this.dispose();
            }
        }
        
        else{
            JOptionPane.showMessageDialog(null,"Enter Correct Username and Password");
            redLBL.setText("INVALID USERNAME OR PASSWORD");
            passwordTF.setText("");
            adminidTF.setText("");
        }
    }//GEN-LAST:event_loginBTNActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        int ch2 = JOptionPane.showConfirmDialog(null, "LEAVE THIS FORM?");
        if (ch2 == 0) {
           
            this.dispose();
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void seeBTN1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_seeBTN1MouseEntered
        // TODO add your handling code here:
         passwordTF.setEchoChar((char)0);
    }//GEN-LAST:event_seeBTN1MouseEntered

    private void seeBTN1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_seeBTN1MouseExited
        // TODO add your handling code here:
         passwordTF.setEchoChar(('*'));
    }//GEN-LAST:event_seeBTN1MouseExited

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
            java.util.logging.Logger.getLogger(admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new admin().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField adminidTF;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JButton loginBTN;
    private javax.swing.JPasswordField passwordTF;
    private javax.swing.JLabel redLBL;
    private javax.swing.JButton seeBTN1;
    // End of variables declaration//GEN-END:variables
}

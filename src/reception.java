

import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class reception extends javax.swing.JFrame {
         Connection cn;
         Statement stmt;
         Statement stmt1;
         Statement stmt2;
         Statement stmt3;
         Statement stmt4;
         ResultSet rs;
         ResultSet update;
  DefaultTableModel adminm=new DefaultTableModel();
    public reception() {
        initComponents();
        
        adminm=(DefaultTableModel)adminTB.getModel();
        try {
            cn=DriverManager.getConnection("jdbc:mysql://localhost/DMD","root","");
            stmt= cn.createStatement();
            stmt1=cn.createStatement();
            stmt2=cn.createStatement();
            stmt3=cn.createStatement();
            stmt4=cn.createStatement();
            String query="select*from login";
            rs=stmt.executeQuery(query);
            adminm.setRowCount(0);
            fillJTable();
            
            
        } catch (SQLException ex) {
             System.out.println(ex.getMessage());
        } 
        
    }
  void fillJTable(){
      try{
     adminm.setRowCount(0);
      while(rs.next()){
                int uid=rs.getInt("uid");
                String name=rs.getString("name");
                String username=rs.getString("username");
                String password=rs.getString("PASSWORD");
                String emailid=rs.getString("emailid");
                String admin=rs.getString("admin");               
                adminm.addRow(new Object[]{uid,name,username,password,admin,emailid});
                
      }
      rs.beforeFirst();
      }catch(SQLException ex){
          System.out.println(ex.getMessage());
      }
  }
  void Display(){
      try{
          uidTF.setText(""+rs.getInt("uid"));
         nameTF.setText(rs.getString("name"));
         usernameTF.setText(rs.getString("username"));
         passwordTF.setText(rs.getString("password"));
         emailTF.setText(rs.getString("emailid"));
         String admin=rs.getString("admin");
         if(admin.equals("yes")){
            yesRBT.setSelected(true);
        }
        else if(admin.equals("no")){
            noRBT.setSelected(true);
        }
      }catch(SQLException ex){
          System.out.println(ex.getMessage());
      }
  }
  
  
  
  

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        adminTB = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        yesRBT = new javax.swing.JRadioButton();
        noRBT = new javax.swing.JRadioButton();
        nameTF = new javax.swing.JTextField();
        usernameTF = new javax.swing.JTextField();
        passwordTF = new javax.swing.JTextField();
        emailTF = new javax.swing.JTextField();
        updateRBT = new javax.swing.JButton();
        deleteRBT = new javax.swing.JButton();
        firstBTN = new javax.swing.JButton();
        previousBTN = new javax.swing.JButton();
        nextRBT = new javax.swing.JButton();
        lastBTN = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        uidTF = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel4.setFont(new java.awt.Font("Georgia", 1, 36)); // NOI18N
        jLabel4.setText("SAMUNDRA RESORTS");

        adminTB.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        adminTB.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "USER ID", "NAME", "USERNAME", "PASSWORD", "ADMIN", "EMAIL"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        adminTB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                adminTBMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(adminTB);
        if (adminTB.getColumnModel().getColumnCount() > 0) {
            adminTB.getColumnModel().getColumn(0).setMinWidth(50);
            adminTB.getColumnModel().getColumn(0).setMaxWidth(80);
            adminTB.getColumnModel().getColumn(5).setMinWidth(300);
            adminTB.getColumnModel().getColumn(5).setMaxWidth(400);
        }

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setText("BACK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setText("Name");

        jLabel2.setText("Username");

        jLabel3.setText("Password");

        jLabel5.setText("Email ");

        jLabel6.setText("Admin");

        buttonGroup1.add(yesRBT);
        yesRBT.setText("Yes");

        buttonGroup1.add(noRBT);
        noRBT.setText("No");

        updateRBT.setText("UPDATE");
        updateRBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateRBTActionPerformed(evt);
            }
        });

        deleteRBT.setText("DELETE");
        deleteRBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteRBTActionPerformed(evt);
            }
        });

        firstBTN.setText("<<");
        firstBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstBTNActionPerformed(evt);
            }
        });

        previousBTN.setText("<");
        previousBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                previousBTNActionPerformed(evt);
            }
        });

        nextRBT.setText(">");
        nextRBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextRBTActionPerformed(evt);
            }
        });

        lastBTN.setText(">>");
        lastBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lastBTNActionPerformed(evt);
            }
        });

        jLabel7.setText("User ID");

        uidTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uidTFActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(83, 83, 83)
                                .addComponent(yesRBT)
                                .addGap(33, 33, 33)
                                .addComponent(noRBT))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(passwordTF, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(usernameTF, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel1)
                                        .addComponent(jLabel7))
                                    .addGap(63, 63, 63)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(nameTF, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(uidTF, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(70, 70, 70)
                                .addComponent(emailTF, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(updateRBT)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(firstBTN)
                                .addGap(32, 32, 32)
                                .addComponent(previousBTN)))
                        .addGap(18, 18, 18)
                        .addComponent(nextRBT)
                        .addGap(28, 28, 28)
                        .addComponent(lastBTN)))
                .addContainerGap(149, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(98, 309, Short.MAX_VALUE)
                .addComponent(deleteRBT)
                .addGap(112, 112, 112))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(uidTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(nameTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(usernameTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(passwordTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(yesRBT)
                    .addComponent(noRBT))
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(emailTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(firstBTN)
                    .addComponent(previousBTN)
                    .addComponent(nextRBT)
                    .addComponent(lastBTN))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deleteRBT)
                    .addComponent(updateRBT))
                .addGap(24, 24, 24))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1)))
                .addGap(35, 35, 35))
            .addGroup(layout.createSequentialGroup()
                .addGap(203, 203, 203)
                .addComponent(jLabel4)
                .addContainerGap(208, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 292, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        int ch = JOptionPane.showConfirmDialog(null, "Do you want to leave?");

        if (ch == 0) {
            this.dispose();

        } else {
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void adminTBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adminTBMouseClicked
        // TODO add your handling code here:
        uidTF.setText(""+adminTB.getModel().getValueAt(adminTB.getSelectedRow(),0));
        nameTF.setText(""+adminTB.getModel().getValueAt(adminTB.getSelectedRow(),1));
        usernameTF.setText(""+adminTB.getModel().getValueAt(adminTB.getSelectedRow(),2));
        passwordTF.setText(""+adminTB.getModel().getValueAt(adminTB.getSelectedRow(), 3));
        emailTF.setText(""+adminTB.getModel().getValueAt(adminTB.getSelectedRow(), 5));
        String admin=adminTB.getModel().getValueAt(adminTB.getSelectedRow(), 4).toString();
        if(admin.equals("yes")){
            yesRBT.setSelected(true);
        }
        else if(admin.equals("no")){
            noRBT.setSelected(true);
        }
        
        
        
        
    }//GEN-LAST:event_adminTBMouseClicked

    private void updateRBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateRBTActionPerformed
        // TODO add your handling code here:
        int uid =Integer.parseInt(uidTF.getText());
        String name=nameTF.getText().toString();
        String username=usernameTF.getText().toString();
        String password=passwordTF.getText().toString();
        String email=emailTF.getText().toString();
        String admin = null;
        if(yesRBT.isSelected()==true){
            admin="yes";
        }
        if(noRBT.isSelected()==true){
            admin="no";
        }
        try {
            stmt1.executeUpdate("UPDATE LOGIN SET NAME='" + name + "',USERNAME='" + username + "',password='" + password + "',emailid='" + email + "',admin='" + admin + "',username='" + username + "' where uid=" +uid+ ""); 
            adminm.fireTableDataChanged();
            String query="select*from login";
            rs=stmt.executeQuery(query);
            } catch (SQLException ex) {
            System.out.println(ex.getMessage());
                                        }
                fillJTable();
        
        
    }//GEN-LAST:event_updateRBTActionPerformed

    private void deleteRBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteRBTActionPerformed
        // TODO add your handling code here:
        int uid=Integer.parseInt(uidTF.getText());
        try {
            stmt2.executeUpdate("DELETE FROM LOGIN WHERE uid="+ uid +"");
            adminm.fireTableDataChanged();
            String query="select*from login";
            rs=stmt.executeQuery(query);
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        fillJTable();
    }//GEN-LAST:event_deleteRBTActionPerformed

    private void uidTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uidTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_uidTFActionPerformed

    private void firstBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstBTNActionPerformed
        // TODO add your handling code here:
        
        try{
        rs.first();
        Display();
            }catch (SQLException ex){
           System.out.println(ex.getMessage());
       }
    }//GEN-LAST:event_firstBTNActionPerformed

    private void previousBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_previousBTNActionPerformed
        // TODO add your handling code here:
        try{
        rs.previous();
        if(rs.isBeforeFirst())
                rs.first();
        Display();
                }catch (SQLException ex){
          System.out.println(ex.getMessage());
       }
    }//GEN-LAST:event_previousBTNActionPerformed

    private void lastBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lastBTNActionPerformed
        // TODO add your handling code here:
        
       try{
        rs.last();
        Display();
       }catch (SQLException ex){
           System.out.println(ex.getMessage());
       }
    }//GEN-LAST:event_lastBTNActionPerformed

    private void nextRBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextRBTActionPerformed
        // TODO add your handling code here:
        try{
        rs.next();
        if(rs.isAfterLast())
            rs.next();
        Display();
            }catch (SQLException ex){
           System.out.println(ex.getMessage());
       }
        
    }//GEN-LAST:event_nextRBTActionPerformed

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
            java.util.logging.Logger.getLogger(reception.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(reception.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(reception.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(reception.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new reception().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable adminTB;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton deleteRBT;
    private javax.swing.JTextField emailTF;
    private javax.swing.JButton firstBTN;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton lastBTN;
    private javax.swing.JTextField nameTF;
    private javax.swing.JButton nextRBT;
    private javax.swing.JRadioButton noRBT;
    private javax.swing.JTextField passwordTF;
    private javax.swing.JButton previousBTN;
    private javax.swing.JTextField uidTF;
    private javax.swing.JButton updateRBT;
    private javax.swing.JTextField usernameTF;
    private javax.swing.JRadioButton yesRBT;
    // End of variables declaration//GEN-END:variables
}

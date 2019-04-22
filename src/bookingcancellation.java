import java.sql.*;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;


public class bookingcancellation extends javax.swing.JFrame {
    
        Connection cn;
        Statement stmt2;
        Statement stmt1;
        Statement stmt;
        Statement stmt3;
        Statement stmt4;
        ResultSet rs1; 
        ResultSet rs2;
        ResultSet rscombo;
        int id;
        DefaultComboBoxModel roomid=new DefaultComboBoxModel();
    public bookingcancellation() {
        initComponents();
        roomidCB.setModel(roomid);
        try {
            cn=DriverManager.getConnection("jdbc:mysql://localhost/DMD","root","");
            stmt=cn.createStatement();
            stmt1=cn.createStatement();
            stmt2=cn.createStatement();
            stmt3= cn.createStatement();
            stmt4=cn.createStatement();
            id();
            }
         catch (Exception ex) {
              ex.printStackTrace();
        }
    }
    void id(){
        try {
            
            rscombo=stmt.executeQuery("SELECT*FROM rooms"); 
            while(rscombo.next()){
            //id=rscombo.getInt("ROOMID"); 
            roomid.addElement(rscombo.getInt("ROOMID"));
}       } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel24 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        roomidCB = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        availableTF = new javax.swing.JTextField();
        canbookingBTN = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        amountTF = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel24.setFont(new java.awt.Font("Georgia", 1, 36)); // NOI18N
        jLabel24.setText("SAMUNDRA RESORTS");
        getContentPane().add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(141, 11, -1, -1));

        jLabel1.setText("ROOM ID");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(101, 108, -1, -1));

        roomidCB.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        roomidCB.setOpaque(false);
        roomidCB.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                roomidCBItemStateChanged(evt);
            }
        });
        getContentPane().add(roomidCB, new org.netbeans.lib.awtextra.AbsoluteConstraints(208, 105, 96, -1));

        jLabel2.setText("AVAILABLE");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(93, 176, -1, -1));

        availableTF.setEditable(false);
        availableTF.setOpaque(false);
        getContentPane().add(availableTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(208, 173, 96, -1));

        canbookingBTN.setBackground(new java.awt.Color(204, 204, 204));
        canbookingBTN.setText("CANCEL BOOKING");
        canbookingBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                canbookingBTNActionPerformed(evt);
            }
        });
        getContentPane().add(canbookingBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(191, 317, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Amount to be returned");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, -1, -1));

        amountTF.setBackground(new java.awt.Color(240, 240, 240));
        amountTF.setEditable(false);
        amountTF.setOpaque(false);
        getContentPane().add(amountTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 250, 113, -1));

        jButton3.setBackground(new java.awt.Color(102, 51, 0));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("BACK");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 360, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rooms.jpg"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 640, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void roomidCBItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_roomidCBItemStateChanged
        try {
            if(roomidCB.getSelectedIndex()>=0){
            int rid=(int) roomidCB.getSelectedItem();
            rs1=stmt1.executeQuery("SELECT*FROM ROOMS WHERE ROOMID=" + rid + "");
            rs1.first();
            int cid=rs1.getInt("customerid");
            String available=rs1.getString("available");
            availableTF.setText(""+available);
            rs2=stmt2.executeQuery("SELECT*FROM GUEST WHERE CUSTOMERID=" + cid +" ");
            rs2.first();
            double amount=rs2.getDouble("amount");
            amountTF.setText(""+amount);
            }
            
            
            
        } catch (Exception ex) {
             ex.printStackTrace();}



    }//GEN-LAST:event_roomidCBItemStateChanged

    private void canbookingBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_canbookingBTNActionPerformed
        try {
            int rid=Integer.parseInt(roomidCB.getSelectedItem().toString());
            rs1=stmt1.executeQuery("SELECT*FROM ROOMS WHERE ROOMID=" + rid );
            rs1.first();
            int cid=rs1.getInt("customerid");
            stmt3.executeUpdate("delete from rooms where roomid = " + rid + "");
            stmt4.executeUpdate("delete from guest where customerid= " + cid + " ");
            JOptionPane.showMessageDialog(null,"BOOKING CANCELLED");
            roomid.removeAllElements();
            id();
        } catch (Exception ex) {
             ex.printStackTrace();
        }
        
        
        
        
    }//GEN-LAST:event_canbookingBTNActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        int ch2 = JOptionPane.showConfirmDialog(null, "LEAVE THIS FORM?");
        if (ch2 == 0) {
           
            this.dispose();
        }
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(bookingcancellation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(bookingcancellation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(bookingcancellation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(bookingcancellation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new bookingcancellation().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField amountTF;
    private javax.swing.JTextField availableTF;
    private javax.swing.JButton canbookingBTN;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JComboBox roomidCB;
    // End of variables declaration//GEN-END:variables
}

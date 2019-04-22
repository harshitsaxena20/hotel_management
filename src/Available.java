
import java.sql.*;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

public class Available extends javax.swing.JFrame {
    
        Connection cn;
        Statement stmt;
        Statement stmt1;
        Statement stmt2;
        ResultSet rs1; 
        ResultSet rs2;
        ResultSet rscombo;
        int id;
        DefaultComboBoxModel roomid1=new DefaultComboBoxModel();
        DefaultComboBoxModel roomid2=new DefaultComboBoxModel();
    public Available() {
        initComponents();
         
        roomidCB1.setModel(roomid1);
        roomidCB2.setModel(roomid2);
        try {
            cn=DriverManager.getConnection("jdbc:mysql://localhost/DMD","root","");
            stmt=(Statement) cn.createStatement();
            stmt1=(Statement) cn.createStatement();
            stmt2=(Statement) cn.createStatement();
            rscombo=stmt.executeQuery("SELECT*FROM rooms"); 
            while(rscombo.next()){
            id=rscombo.getInt("ROOMID"); 
            roomid1.addElement(id);
            roomid2.addElement(id);
            }
        } catch (SQLException ex) {
             System.out.println(ex.getMessage());
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jInternalFrame1 = new javax.swing.JInternalFrame();
        buttonGroup1 = new javax.swing.ButtonGroup();
        roomidCB1 = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        availableTF1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        roomidCB2 = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        availableTF2 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        bookRBN = new javax.swing.JRadioButton();
        unbookRBN = new javax.swing.JRadioButton();
        nochangeRBN = new javax.swing.JRadioButton();
        sumbitBTN = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        usernameLBL = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        jInternalFrame1.setVisible(true);

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        roomidCB1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        roomidCB1.setOpaque(false);
        roomidCB1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                roomidCB1ItemStateChanged(evt);
            }
        });
        getContentPane().add(roomidCB1, new org.netbeans.lib.awtextra.AbsoluteConstraints(156, 97, 96, -1));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ROOM ID");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 100, -1, -1));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("AVAILABLE");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 163, -1, -1));

        availableTF1.setOpaque(false);
        getContentPane().add(availableTF1, new org.netbeans.lib.awtextra.AbsoluteConstraints(156, 160, 96, -1));

        jButton1.setText("NEW");
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(114, 238, -1, -1));

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setOpaque(false);

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("CHANGE AVAILABLITY>>>");

        roomidCB2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        roomidCB2.setOpaque(false);
        roomidCB2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                roomidCB2ItemStateChanged(evt);
            }
        });

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("ROOM ID");

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("AVAILABLE");

        availableTF2.setOpaque(false);

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("CHANGE AVAILABILITY");

        buttonGroup1.add(bookRBN);
        bookRBN.setForeground(new java.awt.Color(240, 240, 240));
        bookRBN.setText("BOOK");
        bookRBN.setOpaque(false);

        buttonGroup1.add(unbookRBN);
        unbookRBN.setText("UNBOOK");
        unbookRBN.setOpaque(false);

        buttonGroup1.add(nochangeRBN);
        nochangeRBN.setText("NO CHANGE");
        nochangeRBN.setOpaque(false);

        sumbitBTN.setText("SUMBIT");
        sumbitBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sumbitBTNActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(65, 65, 65)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(availableTF2)
                                    .addComponent(roomidCB2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(0, 151, Short.MAX_VALUE)))
                        .addContainerGap(31, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(unbookRBN)
                                    .addComponent(bookRBN)
                                    .addComponent(nochangeRBN))))
                        .addContainerGap(33, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(sumbitBTN)
                        .addGap(80, 80, 80))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(roomidCB2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(availableTF2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bookRBN)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addComponent(unbookRBN)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nochangeRBN)
                .addGap(25, 25, 25)
                .addComponent(sumbitBTN)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(332, 58, -1, -1));

        jLabel4.setFont(new java.awt.Font("Vani", 1, 24)); // NOI18N
        jLabel4.setText("AVAILABILITY");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(201, 11, -1, -1));

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

        usernameLBL.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(usernameLBL, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 80, 20));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rooms.jpg"))); // NOI18N
        jLabel8.setText("jLabel8");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 620, 400));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void roomidCB1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_roomidCB1ItemStateChanged
        try {
            int id2 = (int) roomidCB1.getSelectedItem();
            rs1 = stmt1.executeQuery("SELECT*FROM rooms WHERE roomID=" + id2 + "");
            rs1.first();
            
            availableTF1.setText(rs1.getString("available"));
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        
        
        
        
    }//GEN-LAST:event_roomidCB1ItemStateChanged

    private void roomidCB2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_roomidCB2ItemStateChanged
        int id3 = (int) roomidCB2.getSelectedItem();
        try {
           
            rs2 = stmt1.executeQuery("SELECT*FROM rooms WHERE roomID=" + id3 + "");
            rs2.first();
            availableTF2.setText(rs2.getString("available"));
            
            
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        
        
        
        
    }//GEN-LAST:event_roomidCB2ItemStateChanged

    private void sumbitBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sumbitBTNActionPerformed
        int id3=(int) roomidCB2.getSelectedItem();
        String change=null;
        if(bookRBN.isSelected()==true){
            change="No";
        }
        else if(unbookRBN.isSelected()==true){
            change="Yes";
        }
        else if(nochangeRBN.isSelected()==true){
            change="null";
        }
            try {
                stmt2.executeUpdate("UPDATE ROOMS SET AVAILABLE='" + change + "'WHERE ROOMID=" + id3 +"");
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
    }//GEN-LAST:event_sumbitBTNActionPerformed

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
            java.util.logging.Logger.getLogger(Available.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Available.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Available.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Available.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new Available().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField availableTF1;
    private javax.swing.JTextField availableTF2;
    private javax.swing.JRadioButton bookRBN;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton nochangeRBN;
    private javax.swing.JComboBox roomidCB1;
    private javax.swing.JComboBox roomidCB2;
    private javax.swing.JButton sumbitBTN;
    private javax.swing.JRadioButton unbookRBN;
    private javax.swing.JLabel usernameLBL;
    // End of variables declaration//GEN-END:variables
}

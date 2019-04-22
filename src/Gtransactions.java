
import java.sql.*;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

public class Gtransactions extends javax.swing.JFrame {
    Connection cn;
         Statement stmt;
         Statement stmt1;
         ResultSet rs;
         
         ResultSet rscombo;
         int id;
         String name=null;
         String type=null;
         String address=null;
         String city=null;
         String membership=null;
                 DefaultComboBoxModel dcm=new DefaultComboBoxModel();
    
    public Gtransactions() {
        initComponents();
        idCB1.setModel(dcm);    
 
        
        try {          
            cn=(Connection) DriverManager.getConnection("jdbc:mysql://localhost/DMD","root","");
            stmt=(Statement) cn.createStatement();
            stmt1=(Statement) cn.createStatement();
            rscombo=stmt.executeQuery("SELECT*FROM DISCOUNT"); 
            while(rscombo.next()){
            id=rscombo.getInt("CUSTOMERID"); 
            dcm.addElement(id);
            
            }
        } catch (SQLException ex) {
             System.out.println(ex.getMessage());
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        idCB = new javax.swing.JComboBox();
        jLabel8 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        amountTF = new javax.swing.JTextField();
        discountTF = new javax.swing.JTextField();
        backBTN = new javax.swing.JButton();
        idCB1 = new javax.swing.JComboBox();
        newBTN = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("CUSTOMERID");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 87, -1, -1));

        idCB.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(idCB, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 133, 0, -1));

        jLabel8.setFont(new java.awt.Font("Vani", 1, 24)); // NOI18N
        jLabel8.setText("GUESTS INFORMATION");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.setOpaque(false);

        jLabel13.setText("DISCOUNT");

        jLabel7.setText("AMOUNT");

        amountTF.setEditable(false);
        amountTF.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        amountTF.setOpaque(false);

        discountTF.setEditable(false);
        discountTF.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        discountTF.setOpaque(false);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addGap(34, 34, 34)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(amountTF, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(discountTF, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(amountTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(discountTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(85, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(376, 84, -1, -1));

        backBTN.setBackground(new java.awt.Color(153, 0, 51));
        backBTN.setFont(new java.awt.Font("Shonar Bangla", 1, 18)); // NOI18N
        backBTN.setForeground(new java.awt.Color(255, 153, 153));
        backBTN.setText("BACK");
        backBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBTNActionPerformed(evt);
            }
        });
        getContentPane().add(backBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(607, 347, 91, 39));

        idCB1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        idCB1.setOpaque(false);
        idCB1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                idCB1ItemStateChanged(evt);
            }
        });
        getContentPane().add(idCB1, new org.netbeans.lib.awtextra.AbsoluteConstraints(179, 84, 149, -1));

        newBTN.setText("NEW");
        newBTN.setOpaque(false);
        newBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newBTNActionPerformed(evt);
            }
        });
        getContentPane().add(newBTN, new org.netbeans.lib.awtextra.AbsoluteConstraints(436, 251, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/guest.jpg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 730, 410));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBTNActionPerformed
        // TODO add your handling code here:
        int ch2 = JOptionPane.showConfirmDialog(null, "LEAVE THIS FORM?");
        if (ch2 == 0) {
           
            this.dispose();
        }
    }//GEN-LAST:event_backBTNActionPerformed

    private void idCB1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_idCB1ItemStateChanged
        // TODO add your handling code here:
        try {
            int id2=(int) idCB1.getSelectedItem();
            rs=stmt1.executeQuery("SELECT*FROM DISCOUNT WHERE CUSTOMERID="+id2+"");
            rs.first();
            discountTF.setText(rs.getString("DISCOUNT_GIVEN"));
            amountTF.setText(rs.getString("AMOUNT"));
            

            }
        catch (SQLException ex) 
        {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_idCB1ItemStateChanged

    private void newBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newBTNActionPerformed
        // TODO add your handling code here:



        idCB.setSelectedIndex(0);
        amountTF.setText("");
        discountTF.setText("");
        






    }//GEN-LAST:event_newBTNActionPerformed

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
            java.util.logging.Logger.getLogger(Gtransactions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Gtransactions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Gtransactions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Gtransactions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new Gtransactions().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField amountTF;
    private javax.swing.JButton backBTN;
    private javax.swing.JTextField discountTF;
    private javax.swing.JComboBox idCB;
    private javax.swing.JComboBox idCB1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JButton newBTN;
    // End of variables declaration//GEN-END:variables
}
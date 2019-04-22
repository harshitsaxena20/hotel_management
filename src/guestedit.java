
import java.awt.Font;
import java.sql.SQLException;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;



public class guestedit extends javax.swing.JFrame {
    DefaultTableModel gdtm=new DefaultTableModel();
    DefaultComboBoxModel cdcm=new DefaultComboBoxModel();
    dbConnection db=new dbConnection();
    
    
    public guestedit() {
        initComponents();
        cityCB.setModel(cdcm);
        guestTBL.getTableHeader().setFont(new Font("Arial",Font.BOLD,12));
        guestTBL.getTableHeader().getColumnModel().getColumn(0).setHeaderValue("CUSTOMERID");
        guestTBL.getTableHeader().getColumnModel().getColumn(1).setHeaderValue("NAME");
        guestTBL.getTableHeader().getColumnModel().getColumn(2).setHeaderValue("ADDRESS");
        guestTBL.getTableHeader().getColumnModel().getColumn(3).setHeaderValue("CITY");
        guestTBL.getTableHeader().getColumnModel().getColumn(4).setHeaderValue("MEMBERSHIP");
        guestTBL.getTableHeader().getColumnModel().getColumn(5).setHeaderValue("PHONENO");
        guestTBL.getTableHeader().getColumnModel().getColumn(6).setHeaderValue("roomtype");
        guestTBL.getTableHeader().getColumnModel().getColumn(7).setHeaderValue("amount");
        
        guestTBL.repaint();
        gdtm=(DefaultTableModel)guestTBL.getModel();
        
        try {
            db.rs1=db.stmt1.executeQuery("SELECT*FROM CITY");
            while(db.rs1.next()){
             String city=db.rs1.getString("CITY");
             cdcm.addElement(city);
             }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        String query="select*from worker";
        try {
            db.rs3=db.stmt1.executeQuery("select*from guest");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
            gdtm.setRowCount(0);
            fillJTable();
        
    }
    
    
    void fillJTable(){
      try{
     gdtm.setRowCount(0);
      while(db.rs3.next()){
                int gid=db.rs3.getInt("customerid");
                String name=db.rs3.getString("name");
                String address=db.rs3.getString("address");
                String city=db.rs3.getString("city");
                String phoneno=db.rs3.getString("phoneno");
                String membership=db.rs3.getString("membership");
                String roomtype=db.rs3.getString("roomtype");
                String amount=db.rs3.getString("amount");
                gdtm.addRow(new Object[]{gid,name,address,city,membership,phoneno,roomtype,amount});
                
      }
      db.rs3.beforeFirst();
      }catch(SQLException ex){
          System.out.println(ex.getMessage());
      }
  }
    
    void Display(){
      try{
          int gid=(db.rs3.getInt("customerid"));
         guestidTF.setText(""+gid);
         nameTF.setText(db.rs3.getString("name"));
         addressTF.setText(db.rs3.getString("address"));
         String membership=db.rs3.getString("membership");
         if(membership.equals("primary")){
             primaryRBT.setSelected(true);
                      }
         else if(membership.equals("platinum")){
             platinumRBT.setSelected(true);
         }
         cityCB.setSelectedItem(db.rs3.getString("city"));
         phonenoTF.setText(db.rs3.getString("phoneno"));
         String roomtype=db.rs3.getString("roomtype");
         if(roomtype.equals("primary")){
             primaryRBT2.setSelected(true);
         }
         else if(roomtype.equals("luxury")){
             luxuryRBT.setSelected(true);
         }
         amountTF.setText(db.rs3.getString("amount"));
      }catch(SQLException ex){
          System.out.println(ex.getMessage());
      }
  }
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        guestTBL = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        guestidTF = new javax.swing.JTextField();
        nameTF = new javax.swing.JTextField();
        addressTF = new javax.swing.JTextField();
        phonenoTF = new javax.swing.JTextField();
        primaryRBT = new javax.swing.JRadioButton();
        platinumRBT = new javax.swing.JRadioButton();
        cityCB = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        amountTF = new javax.swing.JTextField();
        primaryRBT2 = new javax.swing.JRadioButton();
        luxuryRBT = new javax.swing.JRadioButton();
        firstBTN = new javax.swing.JButton();
        previousBTN = new javax.swing.JButton();
        nextBTN = new javax.swing.JButton();
        lastBTN = new javax.swing.JButton();
        updateBTN = new javax.swing.JButton();
        deleteBTN = new javax.swing.JButton();
        backBTN = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        guestTBL.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6", "Title 7", "Title 8"
            }
        ));
        guestTBL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                guestTBLMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(guestTBL);

        jLabel4.setFont(new java.awt.Font("Georgia", 1, 36)); // NOI18N
        jLabel4.setText("SAMUNDRA RESORTS");

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setText("GUEST ID:");

        jLabel2.setText("NAME");

        jLabel3.setText("ADDRESS");

        jLabel5.setText("CITY");

        jLabel6.setText("MEMBERSHIP");

        jLabel7.setText("PHONE NO:");

        buttonGroup1.add(primaryRBT);
        primaryRBT.setText("PRIMARY");

        buttonGroup1.add(platinumRBT);
        platinumRBT.setText("PLATINUM");

        cityCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel8.setText("ROOMTYPE");

        jLabel9.setText("AMOUNT");

        primaryRBT2.setText("Primary");

        luxuryRBT.setText("Luxury");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(addressTF, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(guestidTF, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nameTF, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(phonenoTF, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(primaryRBT)
                                .addGap(10, 10, 10)
                                .addComponent(platinumRBT))
                            .addComponent(cityCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(amountTF, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(primaryRBT2)
                        .addGap(18, 18, 18)
                        .addComponent(luxuryRBT)))
                .addContainerGap(45, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(guestidTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(nameTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3))
                    .addComponent(addressTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cityCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(primaryRBT)
                    .addComponent(platinumRBT))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(phonenoTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(primaryRBT2)
                    .addComponent(luxuryRBT))
                .addGap(7, 7, 7)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(amountTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

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

        nextBTN.setText(">");
        nextBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextBTNActionPerformed(evt);
            }
        });

        lastBTN.setText(">>");
        lastBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lastBTNActionPerformed(evt);
            }
        });

        updateBTN.setText("UPDATE");
        updateBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBTNActionPerformed(evt);
            }
        });

        deleteBTN.setText("DELETE");
        deleteBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBTNActionPerformed(evt);
            }
        });

        backBTN.setText("BACK");
        backBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBTNActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 827, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(198, 198, 198)
                        .addComponent(jLabel4)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(firstBTN)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(previousBTN)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(nextBTN))
                            .addComponent(updateBTN)
                            .addComponent(deleteBTN))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lastBTN)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(backBTN)
                        .addGap(18, 18, 18))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(firstBTN)
                            .addComponent(previousBTN)
                            .addComponent(nextBTN)
                            .addComponent(lastBTN))
                        .addGap(39, 39, 39)
                        .addComponent(updateBTN)
                        .addGap(18, 18, 18)
                        .addComponent(deleteBTN)
                        .addGap(14, 14, 14)
                        .addComponent(backBTN)
                        .addGap(28, 28, 28))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBTNActionPerformed
      int ch=JOptionPane.showConfirmDialog(null,"Leave This Form");
      if(ch==0){
          this.dispose();
      }
    }//GEN-LAST:event_backBTNActionPerformed

    private void firstBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstBTNActionPerformed
        try {
            db.rs3.first();
            Display();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }//GEN-LAST:event_firstBTNActionPerformed

    private void previousBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_previousBTNActionPerformed
try {
            db.rs3.previous();
            if (db.rs3.isBeforeFirst()) {
                db.rs3.first();
            }
            Display();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }  
    }//GEN-LAST:event_previousBTNActionPerformed

    private void nextBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextBTNActionPerformed
        try {
            db.rs3.next();
            if (db.rs3.isAfterLast()) {
                db.rs3.next();
            }
            Display();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

                                           
    }//GEN-LAST:event_nextBTNActionPerformed

    private void lastBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lastBTNActionPerformed
 try {
            db.rs3.last();
            Display();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }//GEN-LAST:event_lastBTNActionPerformed

    private void guestTBLMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_guestTBLMouseClicked
        guestidTF.setText(""+guestTBL.getModel().getValueAt(guestTBL.getSelectedRow(),0));
        nameTF.setText(""+guestTBL.getModel().getValueAt(guestTBL.getSelectedRow(),1));
        addressTF.setText(""+guestTBL.getModel().getValueAt(guestTBL.getSelectedRow(),2));
        cityCB.setSelectedItem(""+guestTBL.getModel().getValueAt(guestTBL.getSelectedRow(),3));
        String membership=(""+guestTBL.getModel().getValueAt(guestTBL.getSelectedRow(),4));
        if(membership.equals("primary")){
            primaryRBT.setSelected(true);
        }
        else if(membership.equals("platinum")){
            platinumRBT.setSelected(true);
        }
        phonenoTF.setText(""+guestTBL.getModel().getValueAt(guestTBL.getSelectedRow(),5));
        String roomtype=(""+guestTBL.getModel().getValueAt(guestTBL.getSelectedRow(),6));
        if(roomtype.equals("primary")){
            primaryRBT2.setSelected(true);
        }
        else if(roomtype.equals("luxury")){
            luxuryRBT.setSelected(true);
        }
        amountTF.setText(""+guestTBL.getModel().getValueAt(guestTBL.getSelectedRow(),7));
        
        
        
    }//GEN-LAST:event_guestTBLMouseClicked

    private void updateBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBTNActionPerformed
            
        int gid=Integer.parseInt(guestidTF.getText());
        String name=nameTF.getText().toString();
        String address=addressTF.getText().toString();
        String city=cityCB.getSelectedItem().toString();
        double phoneno=Double.parseDouble(phonenoTF.getText());
        String roomtype=null;
        if(primaryRBT2.isSelected()==true){
            roomtype="primary";
        }
        else if(luxuryRBT.isSelected()==true){
            roomtype="luxury";
        }
        double amount=Double.parseDouble(amountTF.getText());
        String membership=null;
        if(primaryRBT.isSelected()==true){
            membership="primary";}
        else if(platinumRBT.isSelected()==true){
            membership="platinum";
        }
        try{
        db.stmt2.executeUpdate("UPDATE GUEST SET NAME='"+name+"',ADDRESS='"+address+"',CITY='"+city+"',PHONENO='"+phoneno+"',ROOMTYPE='"+roomtype+"',AMOUNT='"+amount+"',MEMBERSHIP='"+membership+"' WHERE CUSTOMERID="+gid+"");
        gdtm.fireTableDataChanged();
            String query = "select*from guest";
            db.rs3 = db.stmt1.executeQuery(query);
        }catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        fillJTable();  

        
        
        
    }//GEN-LAST:event_updateBTNActionPerformed

    private void deleteBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBTNActionPerformed
        int guestid=Integer.parseInt(guestidTF.getText());
        try {
            db.stmt2.executeUpdate("DELETE FROM GUEST WHERE CUSTOMERID="+guestid+"");
            db.stmt2.executeUpdate("DELETE FROM MEMBERSHIP WHERE GUESTID="+guestid+"");
            db.stmt2.executeUpdate("DELETE FROM BOOKING WHERE CUSTOMERID="+guestid+"");
            db.stmt2.executeUpdate("DELETE FROM DISCOUNT WHERE CUSTOMERID="+guestid+"");
            gdtm.fireTableDataChanged();
            db.rs3=db.stmt1.executeQuery("select*from guest");
            JOptionPane.showMessageDialog(null,"Record Deleted");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        fillJTable();
    }//GEN-LAST:event_deleteBTNActionPerformed
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new guestedit().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField addressTF;
    private javax.swing.JTextField amountTF;
    private javax.swing.JButton backBTN;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cityCB;
    private javax.swing.JButton deleteBTN;
    private javax.swing.JButton firstBTN;
    private javax.swing.JTable guestTBL;
    private javax.swing.JTextField guestidTF;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton lastBTN;
    private javax.swing.JRadioButton luxuryRBT;
    private javax.swing.JTextField nameTF;
    private javax.swing.JButton nextBTN;
    private javax.swing.JTextField phonenoTF;
    private javax.swing.JRadioButton platinumRBT;
    private javax.swing.JButton previousBTN;
    private javax.swing.JRadioButton primaryRBT;
    private javax.swing.JRadioButton primaryRBT2;
    private javax.swing.JButton updateBTN;
    // End of variables declaration//GEN-END:variables
}

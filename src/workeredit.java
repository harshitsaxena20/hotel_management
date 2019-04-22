
import java.awt.Font;
import javax.swing.JOptionPane;
import java.sql.*;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;
public class workeredit extends javax.swing.JFrame {
    
         Connection cn;
         Statement stmt;
         Statement stmt1;
         Statement stmt2;
         Statement stmt3;
         Statement stmt4;
         ResultSet rs;
         ResultSet update;
         ResultSet rs1;
         ResultSet rsdepart;
         ResultSet rscity;
  DefaultTableModel workerm=new DefaultTableModel();
  DefaultComboBoxModel ddcm=new DefaultComboBoxModel();
  DefaultComboBoxModel rdcm=new DefaultComboBoxModel();
  
    public workeredit() {
        initComponents();
        workerTBL.getTableHeader().setFont(new Font("Arial",Font.BOLD,12));
        workerTBL.getTableHeader().getColumnModel().getColumn(0).setHeaderValue("WORKERID");
        workerTBL.getTableHeader().getColumnModel().getColumn(1).setHeaderValue("NAME");
        workerTBL.getTableHeader().getColumnModel().getColumn(2).setHeaderValue("SALARY");
        workerTBL.getTableHeader().getColumnModel().getColumn(3).setHeaderValue("DEPARTMENT");
        workerTBL.getTableHeader().getColumnModel().getColumn(4).setHeaderValue("RESIDENCE");
        workerTBL.getTableHeader().getColumnModel().getColumn(5).setHeaderValue("CONTACT");
        workerTBL.repaint();
        workerm=(DefaultTableModel)workerTBL.getModel();
        departmentCB.setModel(ddcm);
        residenceCB.setModel(rdcm);
        try {
            cn=DriverManager.getConnection("jdbc:mysql://localhost/DMD","root","");
            stmt= cn.createStatement();
            stmt1=cn.createStatement();
            stmt2=cn.createStatement();
            stmt3=cn.createStatement();
            stmt4=cn.createStatement();
            
            rscity=stmt3.executeQuery("SELECT*FROM CITY");
           while(rscity.next()){
            rdcm.addElement(rscity.getString("City")); 
           }
            rsdepart=stmt3.executeQuery("SELECT*FROM wdepartment");
           while(rsdepart.next()){
            ddcm.addElement(rsdepart.getString("department")); 
           }
            String query="select*from worker";
            rs=stmt.executeQuery(query);
            workerm.setRowCount(0);
            fillJTable();
            
        } catch (SQLException ex) {
             System.out.println(ex.getMessage());
        }
}
void fillJTable(){
      try{
     workerm.setRowCount(0);
      while(rs.next()){
                int wid=rs.getInt("workerid");
                String name=rs.getString("name");
                double salary=rs.getDouble("salary");
                String department=rs.getString("department");
                String residence=rs.getString("residence");
                Double contact=rs.getDouble("contact");               
                workerm.addRow(new Object[]{wid,name,salary,department,residence,contact});
                
      }
      rs.beforeFirst();
      }catch(SQLException ex){
          System.out.println(ex.getMessage());
      }
  }
    

void Display(){
      try{
          int wid=(rs.getInt("workerid"));
         workeridTF.setText(""+wid);
         nameTF.setText(rs.getString("name"));
         salaryTF.setText(rs.getString("salary"));
         departmentCB.setSelectedItem(rs.getString("department"));
         residenceCB.setSelectedItem(rs.getString("residence"));
         
      }catch(SQLException ex){
          System.out.println(ex.getMessage());
      }
  }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        contactTF = new javax.swing.JTextField();
        salaryTF = new javax.swing.JTextField();
        nameTF = new javax.swing.JTextField();
        firstBTN = new javax.swing.JButton();
        previousBTN = new javax.swing.JButton();
        nextRBT = new javax.swing.JButton();
        lastBTN = new javax.swing.JButton();
        deleteRBT = new javax.swing.JButton();
        updateRBT = new javax.swing.JButton();
        workeridTF = new javax.swing.JTextField();
        insertBTN = new javax.swing.JButton();
        departmentCB = new javax.swing.JComboBox();
        residenceCB = new javax.swing.JComboBox();
        jScrollPane2 = new javax.swing.JScrollPane();
        workerTBL = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel4.setFont(new java.awt.Font("Georgia", 1, 36)); // NOI18N
        jLabel4.setText("SAMUNDRA RESORTS");

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setText("BACK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel2.setText("WORKER ID");

        jLabel3.setText("Name");

        jLabel5.setText("Salary");

        jLabel6.setText("Department");

        jLabel7.setText("Residence");

        jLabel8.setText("Contact");

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

        deleteRBT.setText("DELETE");
        deleteRBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteRBTActionPerformed(evt);
            }
        });

        updateRBT.setText("UPDATE");
        updateRBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateRBTActionPerformed(evt);
            }
        });

        workeridTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                workeridTFActionPerformed(evt);
            }
        });

        insertBTN.setText("INSERT");
        insertBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertBTNActionPerformed(evt);
            }
        });

        departmentCB.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        departmentCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                departmentCBActionPerformed(evt);
            }
        });

        residenceCB.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8))))
                .addGap(53, 53, 53)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(nameTF)
                    .addComponent(contactTF)
                    .addComponent(salaryTF, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                    .addComponent(workeridTF)
                    .addComponent(departmentCB, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(residenceCB, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(firstBTN)
                        .addGap(32, 32, 32)
                        .addComponent(previousBTN)
                        .addGap(18, 18, 18)
                        .addComponent(nextRBT)
                        .addGap(28, 28, 28)
                        .addComponent(lastBTN))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(updateRBT)
                        .addGap(18, 18, 18)
                        .addComponent(insertBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(deleteRBT)))
                .addGap(60, 60, 60))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(workeridTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(nameTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(salaryTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(departmentCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(firstBTN)
                            .addComponent(previousBTN)
                            .addComponent(nextRBT)
                            .addComponent(lastBTN))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(deleteRBT)
                            .addComponent(updateRBT)
                            .addComponent(insertBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(residenceCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(contactTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(36, 36, 36))
        );

        workerTBL.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6"
            }
        ));
        workerTBL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                workerTBLMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(workerTBL);
        if (workerTBL.getColumnModel().getColumnCount() > 0) {
            workerTBL.getColumnModel().getColumn(0).setMinWidth(30);
            workerTBL.getColumnModel().getColumn(0).setMaxWidth(85);
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(67, 67, 67)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 778, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(248, 248, 248)
                        .addComponent(jLabel4)))
                .addContainerGap(103, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addGap(33, 33, 33)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(202, 202, 202)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        int ch2 = JOptionPane.showConfirmDialog(null, "LEAVE THIS FORM?");
        if (ch2 == 0) {
           
            this.dispose();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void firstBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstBTNActionPerformed
        // TODO add your handling code here:

        try {
            rs.first();
            Display();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }//GEN-LAST:event_firstBTNActionPerformed

    private void previousBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_previousBTNActionPerformed
        // TODO add your handling code here:
        try {
            rs.previous();
            if (rs.isBeforeFirst()) {
                rs.first();
            }
            Display();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }//GEN-LAST:event_previousBTNActionPerformed

    private void nextRBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextRBTActionPerformed
        // TODO add your handling code here:
        try {
            rs.next();
            if (rs.isAfterLast()) {
                rs.next();
            }
            Display();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

    }//GEN-LAST:event_nextRBTActionPerformed

    private void lastBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lastBTNActionPerformed
        // TODO add your handling code here:

        try {
            rs.last();
            Display();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }//GEN-LAST:event_lastBTNActionPerformed

    private void deleteRBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteRBTActionPerformed
        // TODO add your handling code here:
        int wid =Integer.parseInt(workeridTF.getText());
        try {
            stmt2.executeUpdate("DELETE FROM worker WHERE workerid=" + wid + "");
            workerm.fireTableDataChanged();
            String query = "select*from worker"; 
            rs = stmt.executeQuery(query);
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        fillJTable();
    }//GEN-LAST:event_deleteRBTActionPerformed

    private void updateRBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateRBTActionPerformed
        // TODO add your handling code here:
        int wid =Integer.parseInt(workeridTF.getText());
        String name = nameTF.getText().toString();
        String department = departmentCB.getSelectedItem().toString();
        double salary = Double.parseDouble (salaryTF.getText());
        String residence = residenceCB.getSelectedItem().toString();
        String contact = contactTF.getText().toString();
        
        try {
            stmt1.executeUpdate("UPDATE worker SET NAME='" + name + "',salary=" + salary + ",department='" + department + "',residence='" + residence + "',contact='" + contact +"' where workerid=" + wid + "");
            workerm.fireTableDataChanged();
            String query = "select*from worker";
            rs = stmt.executeQuery(query);
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        fillJTable();  


    }//GEN-LAST:event_updateRBTActionPerformed

    private void workerTBLMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_workerTBLMouseClicked
        // TODO add your handling code here:
        workeridTF.setText(""+workerTBL.getModel().getValueAt(workerTBL.getSelectedRow(),0));
        nameTF.setText(""+workerTBL.getModel().getValueAt(workerTBL.getSelectedRow(),1));
        salaryTF.setText(""+workerTBL.getModel().getValueAt(workerTBL.getSelectedRow(),2));
        departmentCB.setSelectedItem(workerTBL.getModel().getValueAt(workerTBL.getSelectedRow(), 3));
        residenceCB.setSelectedItem(workerTBL.getModel().getValueAt(workerTBL.getSelectedRow(), 4));
        contactTF.setText(""+workerTBL.getModel().getValueAt(workerTBL.getSelectedRow(), 5));
        
        
    }//GEN-LAST:event_workerTBLMouseClicked

    private void workeridTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_workeridTFActionPerformed
        // TODO add your handing code here:
    }//GEN-LAST:event_workeridTFActionPerformed

    private void insertBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertBTNActionPerformed
        int wid =Integer.parseInt(workeridTF.getText());
        String name = nameTF.getText().toString();
        String department = departmentCB.getSelectedItem().toString();
        double salary = Double.parseDouble (salaryTF.getText());
        String residence = residenceCB.getSelectedItem().toString();
        Double contact = Double.parseDouble(contactTF.getText());
        try {
            stmt3.executeUpdate("INSERT INTO WORKER(NAME,SALARY,DEPARTMENT,RESIDENCE,CONTACT,WORKERID) VALUES("
                    + "'" + name + "'"
                    + "," + salary
                    + ",'" + department + "'"
                    + ",'" + residence + "'"
                    + "," + contact
                    + "," + wid + ")");
            workerm.fireTableDataChanged();
            String query = "select*from worker";
            rs = stmt.executeQuery(query);
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
            fillJTable();    
        
        
        
    }//GEN-LAST:event_insertBTNActionPerformed

    private void departmentCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_departmentCBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_departmentCBActionPerformed

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
            java.util.logging.Logger.getLogger(workeredit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(workeredit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(workeredit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(workeredit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new workeredit().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField contactTF;
    private javax.swing.JButton deleteRBT;
    private javax.swing.JComboBox departmentCB;
    private javax.swing.JButton firstBTN;
    private javax.swing.JButton insertBTN;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton lastBTN;
    private javax.swing.JTextField nameTF;
    private javax.swing.JButton nextRBT;
    private javax.swing.JButton previousBTN;
    private javax.swing.JComboBox residenceCB;
    private javax.swing.JTextField salaryTF;
    private javax.swing.JButton updateRBT;
    private javax.swing.JTable workerTBL;
    private javax.swing.JTextField workeridTF;
    // End of variables declaration//GEN-END:variables
}

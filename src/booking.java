
import java.sql.*;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

public class booking extends javax.swing.JFrame {
         Connection cn;
         Statement stmt;
         Statement stmt1;
         Statement stmt2;
         Statement stmt3;
         ResultSet rs;
         ResultSet rscity;
    String years,months;
    String years2,months2;
        DefaultComboBoxModel day=new DefaultComboBoxModel();
        DefaultComboBoxModel month=new DefaultComboBoxModel();
        DefaultComboBoxModel year=new DefaultComboBoxModel();
        DefaultComboBoxModel day2=new DefaultComboBoxModel();
        DefaultComboBoxModel month2=new DefaultComboBoxModel();
        DefaultComboBoxModel year2=new DefaultComboBoxModel();
        DefaultComboBoxModel citym=new DefaultComboBoxModel();
        
        
    public booking() {
        initComponents();
        cityCB.setModel(citym);
        try {
            cn=DriverManager.getConnection("jdbc:mysql://localhost/DMD","root","");
            stmt= cn.createStatement();
            stmt1= cn.createStatement();
            stmt2= cn.createStatement();
            stmt3= cn.createStatement();
            
           rscity=stmt3.executeQuery("SELECT*FROM CITY");
           while(rscity.next()){
            citym.addElement(rscity.getString("City")); 
           }
        } catch (SQLException ex) {
             System.out.println(ex.getMessage());
        }
        
        dayCB.setModel(day);
        monthCB.setModel(month);
        yearCB.setModel(year);
        dayCB2.setModel(day2);
        monthCB2.setModel(month2);
        yearCB2.setModel(year2);
        int y1;
        for(y1=2010;y1<=2020;y1++){
            year.addElement(y1);
        }
        
        int m1;
        for(m1=1;m1<=12;m1++){
            if(m1<10){
                month.addElement("0"+m1);
            }
            else{
            month.addElement(m1);
            }
        }
        int y2;
        for(y2=2010;y2<=2020;y2++){
            year2.addElement(y2);
        }
        
        int m2;
        for(m2=1;m2<=12;m2++){
            if(m2<10)
            month2.addElement("0"+m2);
            else
                month2.addElement(m2);
                    }
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        customerID = new javax.swing.JTextField();
        nameTF = new javax.swing.JTextField();
        addressTF = new javax.swing.JTextField();
        primaryRBN = new javax.swing.JRadioButton();
        luxuryRBN = new javax.swing.JRadioButton();
        mplatinumRBN = new javax.swing.JRadioButton();
        mprimaryRBN = new javax.swing.JRadioButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        discountTF = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        netamountTF = new javax.swing.JTextField();
        sumbitBTN = new javax.swing.JButton();
        newBTN = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        amountTF = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        dayCB = new javax.swing.JComboBox();
        monthCB = new javax.swing.JComboBox();
        yearCB = new javax.swing.JComboBox();
        yearCB2 = new javax.swing.JComboBox();
        monthCB2 = new javax.swing.JComboBox();
        dayCB2 = new javax.swing.JComboBox();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        MONTH = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        phonenoTF = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        roomidTF = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        roomRBN = new javax.swing.JRadioButton();
        noroomRBN = new javax.swing.JRadioButton();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        adultsTF = new javax.swing.JTextField();
        childrenTF = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        cityCB = new javax.swing.JComboBox();
        jLabel25 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setBackground(new java.awt.Color(102, 51, 0));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("BACK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 460, -1, -1));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("CUSTOMERID");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 121, -1, -1));

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("NAME");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 159, -1, -1));

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("ROOM TYPE");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 198, -1, -1));

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("ADDRESS");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 238, -1, -1));

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("CITY");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 269, -1, -1));

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("MEMBERSHIP");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, -1, -1));

        customerID.setOpaque(false);
        getContentPane().add(customerID, new org.netbeans.lib.awtextra.AbsoluteConstraints(154, 118, 122, -1));

        nameTF.setOpaque(false);
        getContentPane().add(nameTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(154, 156, 122, -1));

        addressTF.setOpaque(false);
        getContentPane().add(addressTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(154, 235, 159, -1));

        buttonGroup2.add(primaryRBN);
        primaryRBN.setForeground(new java.awt.Color(255, 255, 255));
        primaryRBN.setText("PRIMARY");
        primaryRBN.setOpaque(false);
        getContentPane().add(primaryRBN, new org.netbeans.lib.awtextra.AbsoluteConstraints(86, 194, -1, -1));

        buttonGroup2.add(luxuryRBN);
        luxuryRBN.setForeground(new java.awt.Color(255, 255, 255));
        luxuryRBN.setText("LUXURY");
        luxuryRBN.setOpaque(false);
        getContentPane().add(luxuryRBN, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 194, -1, -1));

        buttonGroup1.add(mplatinumRBN);
        mplatinumRBN.setForeground(new java.awt.Color(240, 240, 240));
        mplatinumRBN.setText("Platinum");
        mplatinumRBN.setOpaque(false);
        getContentPane().add(mplatinumRBN, new org.netbeans.lib.awtextra.AbsoluteConstraints(165, 330, -1, -1));

        buttonGroup1.add(mprimaryRBN);
        mprimaryRBN.setForeground(new java.awt.Color(255, 255, 255));
        mprimaryRBN.setText("Primary");
        mprimaryRBN.setOpaque(false);
        getContentPane().add(mprimaryRBN, new org.netbeans.lib.awtextra.AbsoluteConstraints(165, 304, -1, -1));

        jPanel1.setBorder(new javax.swing.border.MatteBorder(null));
        jPanel1.setOpaque(false);

        jLabel9.setForeground(new java.awt.Color(240, 240, 240));
        jLabel9.setText("Discount");

        discountTF.setEditable(false);
        discountTF.setOpaque(false);
        discountTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                discountTFActionPerformed(evt);
            }
        });

        jLabel10.setForeground(new java.awt.Color(240, 240, 240));
        jLabel10.setText("Net Amount");

        netamountTF.setEditable(false);
        netamountTF.setOpaque(false);
        netamountTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                netamountTFActionPerformed(evt);
            }
        });

        sumbitBTN.setText("Sumbit");
        sumbitBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sumbitBTNActionPerformed(evt);
            }
        });

        newBTN.setText("New");
        newBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newBTNActionPerformed(evt);
            }
        });

        jLabel1.setForeground(new java.awt.Color(240, 240, 240));
        jLabel1.setText("Amount");

        amountTF.setOpaque(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel10))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel9))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 81, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(netamountTF, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(amountTF, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(discountTF, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)))
                .addGap(19, 19, 19))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addComponent(sumbitBTN)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(newBTN)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(amountTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(discountTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(netamountTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sumbitBTN)
                    .addComponent(newBTN))
                .addContainerGap(65, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 202, -1, -1));

        jPanel2.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        jPanel2.setOpaque(false);

        jLabel11.setForeground(new java.awt.Color(240, 240, 240));
        jLabel11.setText("FROM");

        jLabel12.setForeground(new java.awt.Color(240, 240, 240));
        jLabel12.setText("TO");

        dayCB.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        dayCB.setOpaque(false);

        monthCB.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        monthCB.setOpaque(false);
        monthCB.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                monthCBItemStateChanged(evt);
            }
        });

        yearCB.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        yearCB.setOpaque(false);

        yearCB2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        yearCB2.setOpaque(false);

        monthCB2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        monthCB2.setOpaque(false);
        monthCB2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                monthCB2ItemStateChanged(evt);
            }
        });

        dayCB2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        dayCB2.setOpaque(false);

        jLabel13.setForeground(new java.awt.Color(240, 240, 240));
        jLabel13.setText("YEAR");

        jLabel14.setForeground(new java.awt.Color(240, 240, 240));
        jLabel14.setText("MONTH");

        jLabel15.setForeground(new java.awt.Color(240, 240, 240));
        jLabel15.setText("DAY");

        jLabel16.setForeground(new java.awt.Color(240, 240, 240));
        jLabel16.setText("YEAR");

        MONTH.setForeground(new java.awt.Color(240, 240, 240));
        MONTH.setText("MONTH");

        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("DAY");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(dayCB2, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(yearCB2, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(MONTH)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(monthCB2, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel12)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel11)
                                        .addComponent(jLabel13)
                                        .addComponent(jLabel15)
                                        .addComponent(jLabel14))
                                    .addGap(24, 24, 24)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(monthCB, 0, 66, Short.MAX_VALUE)
                                        .addComponent(yearCB, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(dayCB, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel11)
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(yearCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(monthCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dayCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(yearCB2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(monthCB2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MONTH))
                .addGap(11, 11, 11)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dayCB2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18))
                .addGap(53, 53, 53))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(328, 103, -1, -1));

        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Phone NO.");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 387, -1, -1));

        phonenoTF.setOpaque(false);
        getContentPane().add(phonenoTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(134, 384, 100, -1));

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.setOpaque(false);

        jLabel20.setForeground(new java.awt.Color(240, 240, 240));
        jLabel20.setText("Room ID");

        roomidTF.setOpaque(false);

        buttonGroup3.add(roomRBN);
        roomRBN.setForeground(new java.awt.Color(240, 240, 240));
        roomRBN.setText("Room Service");
        roomRBN.setOpaque(false);

        buttonGroup3.add(noroomRBN);
        noroomRBN.setText("NO Room Service");
        noroomRBN.setOpaque(false);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel19)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel20)
                        .addGap(54, 54, 54)
                        .addComponent(roomidTF, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(roomRBN)
                .addGap(12, 12, 12)
                .addComponent(noroomRBN)
                .addGap(0, 16, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(roomidTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel19)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(roomRBN)
                    .addComponent(noroomRBN))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 102, -1, -1));

        jLabel21.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        jLabel21.setText("BOOK YOUR ROOM HERE");
        getContentPane().add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 60, -1, -1));

        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("No. of ADULTS>>");
        getContentPane().add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 432, -1, 23));

        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("No. of CHILDREN>>");
        getContentPane().add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 470, -1, -1));

        adultsTF.setOpaque(false);
        getContentPane().add(adultsTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 433, 50, -1));

        childrenTF.setOpaque(false);
        getContentPane().add(childrenTF, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 470, 50, -1));

        jLabel24.setFont(new java.awt.Font("Georgia", 1, 36)); // NOI18N
        jLabel24.setText("SAMUNDRA RESORTS");
        getContentPane().add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 10, -1, -1));

        cityCB.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(cityCB, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 270, 150, -1));

        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rooms.jpg"))); // NOI18N
        getContentPane().add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 780, 510));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        int ch2= JOptionPane.showConfirmDialog(null,"Do you want to go back?");
        if(ch2==0){
        
        this.dispose();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void discountTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_discountTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_discountTFActionPerformed

    private void netamountTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_netamountTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_netamountTFActionPerformed

    private void sumbitBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sumbitBTNActionPerformed
        // TODO add your handling code here:
        int adultno=Integer.parseInt(adultsTF.getText());
        int childrenno=Integer.parseInt(childrenTF.getText());
        int cid=Integer.parseInt(customerID.getText());
        
        if(adultno<=2 && childrenno<=2){
            String name=nameTF.getText();
        
        String address=addressTF.getText();
        String city=(String) cityCB.getSelectedItem();
        double phoneno=Double.parseDouble(phonenoTF.getText());
        
        
        String roomservice=null;
        
        
        
        String year1=yearCB.getSelectedItem().toString();
        String month1=monthCB.getSelectedItem().toString();
        String day1=dayCB.getSelectedItem().toString();
        String year2=yearCB2.getSelectedItem().toString();
        String month2=monthCB2.getSelectedItem().toString();
        String day2=dayCB2.getSelectedItem().toString();
        String from=(year1+month1+day1);
        String to=(year2+month2+day2);
        int roomid=Integer.parseInt(roomidTF.getText());
        String available="NO";
        int adults=Integer.parseInt(adultsTF.getText());
        int children=Integer.parseInt(childrenTF.getText());
        int total=adults+children;
        try {
            rs=stmt2.executeQuery("select datediff("+to+","+from+") as datediff");
            rs.first();
            double discount=0.0;
        double amount = 0;
        String roomtype=null;
        if(primaryRBN.isSelected()==true){
            roomtype="primary";
            amount=3500;
        }
        else if(luxuryRBN.isSelected()==true){
            roomtype="luxury";
            amount=4000;
        }
        String membership=null;
        if(mprimaryRBN.isSelected()==true){
            membership="primary";
            discount=(amount*(10.0/100.0));
        }
        else if(mplatinumRBN.isSelected()==true){
            membership="platinum";
            discount=(amount*(15.0/100.0));
        }
            Double netamount=(amount-discount)*(rs.getInt("datediff"));
            
            if(roomRBN.isSelected()==true){
            netamount=netamount+100;
            roomservice="yes";
            netamountTF.setText(""+netamount);
        }
        else if(noroomRBN.isSelected()==true){
        netamount=netamount;
        roomservice="no";
        netamountTF.setText(""+netamount);
        
    }
            double ramount=amount*rs.getInt("datediff");
            amountTF.setText(""+ramount);
            double dis=ramount-netamount;
            discountTF.setText(""+dis);
            JOptionPane.showMessageDialog(null,rs.getInt("datediff"));
            stmt1.executeUpdate("Insert Into guest(customerid,name,roomtype,city,phoneno,address,membership,amount) VALUES("
                    + cid
                    + ",'" + nameTF.getText() + "'"
                    + ",'" + roomtype + "'"
                    + ",'" + city + "'"
                    + "," + phoneno 
                    + ",'" + address + "'"
                    + ",'" + membership + "'"
                    + "," + netamount+")");
            
            JOptionPane.showMessageDialog(null, "Data Inserted");
            stmt.executeUpdate("insert Into discount(amount,discount_given,customerid) values("+netamount+","+discount+","+cid+")");
            stmt.executeUpdate("insert Into rooms(customerid,roomid,roomtype,roomservice,datefrom,AVAILABLE,dateto) values("
                    + cid
                    + "," + roomid
                    + ",'" + roomtype + "'"
                    + ",'" + roomservice + "'"
                    + ",'" + from + "'"
                    + ",'" + available + "'"
                    + ",'" + to + "')");
           stmt.executeUpdate("insert Into guestsinhotel(no_of_guests,adults,children,ROOMID) values("+total+","+adults+","+children+","+roomid+")");        
            
        } catch (SQLException ex) {
           System.out.println(ex.getMessage());
        }
        
        }
        else{
            JOptionPane.showMessageDialog(null,"Number of Adults and Children must be less than 2");
            adultsTF.setText("");
            childrenTF.setText("");
        }
        
    }//GEN-LAST:event_sumbitBTNActionPerformed

    private void monthCBItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_monthCBItemStateChanged
        // TODO add your handling code here:
                 months=monthCB.getSelectedItem().toString();
                 years= yearCB.getSelectedItem().toString();
                 dayCB.removeAllItems();
                 int m=Integer.parseInt(months);
                 int y=Integer.parseInt(years);
            if(m==1||m==3||m==5||m==7||m==8||m==10||m==12){
                for(int d=1;d<=31;d++){
                    if(d<10){
                        day.addElement("0"+d);
                    }else{
                    day.addElement(d);
                }         }   
            }else if(m==4||m==6||m==9||m==11){
                for(int d=1;d<=30;d++){
                    if(d<10){
                        day.addElement("0"+d);
                    }else{
                    day.addElement(d);
                }
                }
            }else if(m==2){
                if(y%4==0){
                        for(int d=1;d<=29;d++){
                            if(d<10){
                                day.addElement("0"+d);
                            }
                            else{
                            day.addElement(d);
                        }
                        }
                }
                else{
                        for(int d=1;d<=28;d++){
                            if(d<10){
                                day.addElement("0"+d);
                                    }
                            else{
                            day.addElement(d);
                                }
                                              }
                    }
                            }
    }//GEN-LAST:event_monthCBItemStateChanged

    private void monthCB2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_monthCB2ItemStateChanged
                 months=monthCB2.getSelectedItem().toString();
                 years= yearCB2.getSelectedItem().toString();
                 dayCB2.removeAllItems();
                 int m2=Integer.parseInt(months);
                 int y2=Integer.parseInt(years);
            if(m2==1||m2==3||m2==5||m2==7||m2==8||m2==10||m2==12){
                for(int d=1;d<=31;d++){
                    if(d<10){
                        day2.addElement("0"+d);
                    }else{
                    day2.addElement(d);
                }
                }            
            }else if(m2==4||m2==6||m2==9||m2==11){
                for(int d=1;d<=30;d++){
                    if(d<10){
                        day2.addElement("0"+d);
                    }else{
                    day2.addElement(d);
                }
                }
            }else if(m2==2){
                if(y2%4==0){
                        for(int d=1;d<=29;d++){
                            if(d<10){
                                day2.addElement("0"+d);
                            }
                            else{
                            day2.addElement(d);
                        }
                        }
                }else{
                        for(int d=1;d<=28;d++){
                          if(d<10){
                                day2.addElement("0"+d);
                            }
                            else{
                            day2.addElement(d);
                        }
                        }
                    }
        }
        
        
               
    }//GEN-LAST:event_monthCB2ItemStateChanged
    
        private void newBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newBTNActionPerformed
        // TODO add your handling code here:
            customerID.setText("");
            nameTF.setText("");
            cityCB.setSelectedIndex(0);
            addressTF.setText("");
            amountTF.setText("");
            discountTF.setText("");
            netamountTF.setText("");
            primaryRBN.setSelected(false);
            luxuryRBN.setSelected(true);
            mprimaryRBN.setSelected(false);
            mplatinumRBN.setSelected(true);
            yearCB.setSelectedIndex(0);
            monthCB.setSelectedIndex(0);
            dayCB.setSelectedIndex(0);
            yearCB2.setSelectedIndex(0);
            monthCB2.setSelectedIndex(0);
            dayCB2.setSelectedIndex(0);
            roomidTF.setText("");
            roomRBN.setSelected(false);
            noroomRBN.setSelected(true);
            adultsTF.setText("");
            childrenTF.setText("");
            
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
            java.util.logging.Logger.getLogger(booking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(booking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(booking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(booking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new booking().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel MONTH;
    private javax.swing.JTextField addressTF;
    private javax.swing.JTextField adultsTF;
    private javax.swing.JTextField amountTF;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JTextField childrenTF;
    private javax.swing.JComboBox cityCB;
    private javax.swing.JTextField customerID;
    private javax.swing.JComboBox dayCB;
    private javax.swing.JComboBox dayCB2;
    private javax.swing.JTextField discountTF;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JRadioButton luxuryRBN;
    private javax.swing.JComboBox monthCB;
    private javax.swing.JComboBox monthCB2;
    private javax.swing.JRadioButton mplatinumRBN;
    private javax.swing.JRadioButton mprimaryRBN;
    private javax.swing.JTextField nameTF;
    private javax.swing.JTextField netamountTF;
    private javax.swing.JButton newBTN;
    private javax.swing.JRadioButton noroomRBN;
    private javax.swing.JTextField phonenoTF;
    private javax.swing.JRadioButton primaryRBN;
    private javax.swing.JRadioButton roomRBN;
    private javax.swing.JTextField roomidTF;
    private javax.swing.JButton sumbitBTN;
    private javax.swing.JComboBox yearCB;
    private javax.swing.JComboBox yearCB2;
    // End of variables declaration//GEN-END:variables
}

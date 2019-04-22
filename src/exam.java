
import java.awt.Font;
import java.sql.SQLException;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class exam extends javax.swing.JFrame {
    DefaultTableModel dtm=new DefaultTableModel();
    DefaultComboBoxModel dcm=new DefaultComboBoxModel();
    dbConnection db=new dbConnection();
    public exam() {
        initComponents();
        dtm=(DefaultTableModel)infoTBL.getModel();
        infoTBL.getTableHeader().setFont(new Font("Arial",Font.BOLD,12));
        infoTBL.getTableHeader().getColumnModel().getColumn(0).setHeaderValue("Name");
        infoTBL.getTableHeader().getColumnModel().getColumn(1).setHeaderValue("City");
        infoTBL.getTableHeader().getColumnModel().getColumn(2).setHeaderValue("Phone No");
        infoTBL.getTableHeader().getColumnModel().getColumn(3).setHeaderValue("Address");
        infoTBL.repaint();
        String query="Select*from guest";
        try{
        db.rs1=db.stmt1.executeQuery("Select*from guest");
        }
        catch(SQLException ex ){
        System.out.println(ex.getMessage());
        }
        dtm.setRowCount(0);
        fillJTable();
        }
        void fillJTable(){
            try{
                dtm.setRowCount(0);
                while(db.rs1.next()){
        String name=db.rs1.getString("name");
        String city=db.rs1.getString("city");
        String phoneno=db.rs1.getString("phoneno");
        String address=db.rs1.getString("address");
        dtm.addRow(new Object[]{name,city,phoneno,address});
        JOptionPane.showMessageDialog(null,name);
                }
                db.rs1.beforeFirst();
                }
            catch(SQLException ex){
                System.out.println(ex.getMessage());
            }
    
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        infoTBL = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        infoTBL.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(infoTBL);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 345, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(216, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new exam().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable infoTBL;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}

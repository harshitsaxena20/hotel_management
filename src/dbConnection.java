import java.sql.*;

public class dbConnection {
        Connection cn;
        Statement stmt2;
        Statement stmt1;
        ResultSet rs1;
        ResultSet rs2;
        ResultSet rs3;
        ResultSet rs4;
        
       public dbConnection(){
            try {
                cn=DriverManager.getConnection("jdbc:mysql://localhost/DMD","root","");
                stmt2=cn.createStatement();
                stmt1=cn.createStatement();
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        }
        
        
}

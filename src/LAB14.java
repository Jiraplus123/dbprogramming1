import java.sql.*;
import java.util.logging.Logger;

public class LAB14 {
    public static void main(String[] args) {
        String URL = "jdbc:mysql://localhost:3306/mydb1";
        String username = "root";
        String password = "26390447";

        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection   = DriverManager.getConnection(URL, username, password);
            Statement statement = connection.createStatement();
            DatabaseMetaData dbMetaData = connection.getMetaData();
            System.out.println("database URL : " + dbMetaData.getURL());
            System.out.println("database product name : " + dbMetaData.getDatabaseProductName());
            System.out.println("database product version : " + dbMetaData.getDatabaseProductVersion());
            System.out.println("JDBC driver name : " + dbMetaData.getDriverName());
            System.out.println("JDBC driver version : " + dbMetaData.getDriverVersion());
            System.out.println("JDBC driver major version : " + dbMetaData.getDriverMajorVersion());
            System.out.println("JDBC driver minor version : " + dbMetaData.getDriverMinorVersion());
            System.out.println("Max number of connections : " + dbMetaData.getMaxConnections());
        } catch (ClassNotFoundException ex){
            Logger.getLogger(LAB14.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (SQLException ex){
            Logger.getLogger(LAB14.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }

}

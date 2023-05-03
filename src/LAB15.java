import java.sql.*;
import java.util.logging.Logger;

public class LAB15 {
    public static void main(String[] args) {
        String URL = "jdbc:mysql://localhost:3306/mydb1";
        String username = "root";
        String password = "26390447";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(URL, username, password);
            Statement statement = connection.createStatement();
            String sql = "SELECT * FROM student";
            ResultSet results = statement.executeQuery(sql);
            ResultSetMetaData rsMetaData = results.getMetaData();
            System.out.println(rsMetaData.getColumnCount());

            for (int i = 1; i < rsMetaData.getColumnCount(); i++) {
                System.out.println(rsMetaData.getColumnName(i));
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(LAB15.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(LAB15.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }
}

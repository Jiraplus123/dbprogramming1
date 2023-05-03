import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LAB9 {
    public static void main(String[] args) {
        String URL = "jdbc:mysql://127.0.0.1:3306/mydb1";
        String username = "root";
        String password = "26390447";

        try{
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection   = DriverManager.getConnection(URL, username, password);
        Statement statement = connection.createStatement();
        String sql = "Insert into student (studentID,firstName,lastName,email,deptID)" +
                " VALUES('65001', 'KK1', 'Boy1', 'KKboy@gmail.com', '4')";
        statement.executeUpdate(sql);
        }
        catch(ClassNotFoundException ex) {
            Logger.getLogger(LAB9.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch(SQLException ex){
            Logger.getLogger(LAB9.class.getName()).log(Level.SEVERE, null, ex);

        }
    }
}

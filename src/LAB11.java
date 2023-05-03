import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LAB11 {
    public static void main(String[] args) {
        String URL = "jdbc:mysql://localhost:3306/mydb1";
        String username = "root";
        String password = "26390447";

        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection   = DriverManager.getConnection(URL, username, password);
            Statement statement = connection.createStatement();
            String sql = "delete from student where studentID = 65000";
            statement.executeUpdate(sql);
        }
        catch(ClassNotFoundException ex) {
            Logger.getLogger(LAB11.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch(SQLException ex){
            Logger.getLogger(LAB11.class.getName()).log(Level.SEVERE, null, ex);

        }
    }
}

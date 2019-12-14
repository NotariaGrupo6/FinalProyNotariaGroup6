package miConexion;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class mysqlDbConection {
    
    public static Connection getonexion() throws SQLException {
        Connection conn;        
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(mysqlDbConection.class.getName()).log(Level.SEVERE, null, ex);
        }
        conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/notaria_lima", "root", "");
        return conn;
    }
    
}

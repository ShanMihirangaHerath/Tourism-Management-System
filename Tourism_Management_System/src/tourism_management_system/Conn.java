package tourism_management_system;

import java.sql.*;

public class Conn {
    
    Connection c;
    Statement s;
    
    Conn() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            c = DriverManager.getConnection("jdbc:mysql://localhost:3306/tourism_management_system", "root", "Shan_200630103728");
            s = c.createStatement();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

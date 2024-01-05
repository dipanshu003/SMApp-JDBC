package helper_class;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionProvider {

    public static Connection con = null;

    public static Connection makeCon() {
        if (con == null) {
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                String url = "jdbc:mysql://localhost:3306/JDBC";
                String user = "root";
                String pass = "dip piyu";
                con=DriverManager.getConnection(url,user,pass);
            } catch (Exception e) {
                e.printStackTrace();
            }

        }
        return con;
    }
}

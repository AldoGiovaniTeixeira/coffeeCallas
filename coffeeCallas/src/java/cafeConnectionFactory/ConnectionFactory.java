package cafeConnectionFactory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

    public static Connection getConnection() throws ClassNotFoundException {
        String url = "jdbc:mysql://localhost/CoffeeCallas";
        String uid = "root";
        String pass = "0890";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            return DriverManager.getConnection(url, uid, pass);
        } catch (SQLException e) {
            throw new RuntimeException(e);

        }
    }
}

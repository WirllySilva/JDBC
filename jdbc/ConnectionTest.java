package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionTest {
    public static void main(String[] args) throws SQLException {
        final String url = "jdbc:mysql://localhost:3306";
        final String user = "root";
        final String password = "@Wl8917@";

        Connection conection = DriverManager
                .getConnection(url, user, password);
        
        System.out.println("Connection successfully established.");
        
    }

}
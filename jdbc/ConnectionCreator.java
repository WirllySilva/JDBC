package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionCreator {

    public static Connection getConnection() {
        try {
            final String url = "jdbc:mysql://localhost/java_course?verifyServerCertificate=false&useSSL=true";
            final String user = "root";
            final String passWord = "@Wl8917@";

            return DriverManager.getConnection(url, user, passWord);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

}

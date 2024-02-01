package jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class createDataBase {
    public static void main(String[] args) throws SQLException {
        final String url = "jdbc:mysql://localhost:3306/?verifyServerCertificate=false&useSSL=true";
        final String user = "root";
        final String password = "@Wl8917@";

        Connection connection = DriverManager
                .getConnection(url, user, password);

        Statement stmt = connection.createStatement();
        stmt.execute("CREATE DATABASE java_course");

        System.out.println("DataBase was created sussesfuly");
        connection.close();
    }
}

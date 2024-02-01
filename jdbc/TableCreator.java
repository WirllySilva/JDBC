package jdbc;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.SQLException;


public class TableCreator {

    public static void main(String[] args) throws SQLException {
        Connection connection = ConnectionCreator.getConnection();

    String sql = "CREATE TABLE people ("
            + "codigo INT AUTO_INCREMENT PRIMARY KEY,"
            + "name VARCHAR(80) NOT NULL"
            + ")";

        Statement stmt = connection.createStatement();
        stmt.execute(sql);

        System.out.println("Table was created sussesfuly");
        connection.close();


    }    

}

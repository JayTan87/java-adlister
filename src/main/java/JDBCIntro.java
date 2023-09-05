import java.sql.*;

import com.mysql.cj.jdbc.Driver;

public class JDBCIntro {
    public static void main(String[] args) throws SQLException {

DriverManager.registerDriver(new Driver());
    Connection connection = DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/codeup_test_db?allowPublicKeyRetrieval=true&useSSL=false",
            "root",
            "codeup"
    );

        Statement stmt  = connection.createStatement();

        String query = "SELECT * FROM albums;";
        ResultSet rs = stmt.executeQuery(query);
        System.out.println(rs);

        while(rs.next()){
            System.out.println(rs.getString(2));
        }


}
    }

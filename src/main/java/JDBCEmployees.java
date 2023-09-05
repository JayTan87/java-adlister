import com.mysql.cj.jdbc.Driver;

import java.sql.*;
import java.util.ArrayList;

public class JDBCEmployees {
    public static void main(String[] args) throws SQLException {

        DriverManager.registerDriver(new Driver());
        Connection connection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/employees?allowPublicKeyRetrieval=true&useSSL=false",
                "root",
                "codeup"
        );

        Statement stmt = connection.createStatement();

        String query = "SELECT * FROM employees LIMIT 10;";
        ResultSet rs = stmt.executeQuery(query);
        ArrayList<String> employeesList = new ArrayList<>();
        while (rs.next()) {
            employeesList.add(rs.getString("first_name") + " " + rs.getString("last_name") + " " + rs.getString("emp_no"));
        }
            for (String employee : employeesList) {
                System.out.println(employee);
            }
    }
}

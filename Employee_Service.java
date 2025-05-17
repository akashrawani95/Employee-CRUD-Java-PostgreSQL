package Employee_CRUD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Employee_Service {
    static final String URL = "jdbc:postgresql://localhost:5432/DemoDB";
    static final String USER = "postgres";
    static final String PASS = "123";

    public void insertEmployee(Employee emp) {
        try {
            Connection con = DriverManager.getConnection(URL, USER, PASS);
            String sql = "INSERT INTO employee(id, name, age, salary) VALUES (?, ?, ?, ?)";
            PreparedStatement pstmt = con.prepareStatement(sql);
            pstmt.setInt(1, emp.getId());
            pstmt.setString(2, emp.getName());
            pstmt.setInt(3, emp.getAge());
            pstmt.setDouble(4, emp.getSalary());  // Use setDouble for salary

            int rowsInserted = pstmt.executeUpdate();
            if (rowsInserted > 0) {
                System.out.println("Employee added successfully!");
            }
            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

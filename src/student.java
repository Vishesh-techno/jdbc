import java.sql.*;

public class student {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/test";
            String id = "root";
            String pass = "Vivoy83@";
            Connection con = DriverManager.getConnection(url, id, pass);
            Statement stm = con.createStatement();
            String Query = "INSERT INTO employees (first_name, last_name, hire_date, email, phone_num, salary, employeement_status) " +
                    "VALUES ('Vishesh', 'Soni', '2004-03-18', 'Sarafjatin099@gmail.com', '9993656582', 80000.00, 'active')";
            stm.executeUpdate(Query);
            con.close();
            System.out.println("inserted");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


    }
}

import java.sql.*;
public class Employees {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/bookstore";
            String user = "root";
            String pass = "Vivoy83@";
            Connection con = DriverManager.getConnection(url, user, pass);
            Statement stm = con.createStatement();
            String Query = "INSERT INTO BOOKS VALUES (6,'Electronics Engineering' , 'Made Easy' , '500' , '2022-01-01' , 'Engineering', 1)";
            stm.executeUpdate(Query);
            con.close();
            System.out.println("Inserted");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

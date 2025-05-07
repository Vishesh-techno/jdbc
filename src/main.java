import java.sql.*;
public class main {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://127.0.0.1:3306/college";
            String username = "root";
            String password = "Vivoy83@";
            Connection con = DriverManager.getConnection(url,username,password);
            Statement stm = con.createStatement();
//            String Query = "INSERT INTO STUDENT VALUES(5, 'ABC', 'ME')";
//            String Query = "DELETE FROM STUDENT WHERE id = 107";
            String Query = "UPDATE student SET id=6, name='DEF', Branch='CE' WHERE id = 3" ;
            stm.executeUpdate(Query);
            con.close();
            System.out.println("inserted");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

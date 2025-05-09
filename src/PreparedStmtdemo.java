import java.sql.*;
import java.sql.PreparedStatement;

public class PreparedStmtdemo {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/StoreDB";
            String user = "root";
            String pass = "Vivoy83@";
            Connection con = DriverManager.getConnection(url,user,pass);
//            String Query = "INSERT INTO products values (product_name, category, price, stock)";
            PreparedStatement pstmt = con.prepareStatement("INSERT INTO PRODUCTS (product_name, category, price, stock) VALUES (?, ?, ?, ?)");
            pstmt.setString(1, "Frooti");
            pstmt.setString(2, "Beverage");
            pstmt.setDouble(3, 25.50);
            pstmt.setInt(4, 100);
            pstmt.executeUpdate();
            con.close();
            System.out.println("Product inserted successfully.");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

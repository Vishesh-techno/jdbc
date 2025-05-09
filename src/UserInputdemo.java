import java.sql.*;
import java.util.Scanner;

public class UserInputdemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/StoreDB";
            String user = "root";
            String pass = "Vivoy83@";
            Connection con = DriverManager.getConnection(url, user, pass);
//            String Query = "INSERT INTO products values (product_name, category, price, stock)";
            PreparedStatement pstmt = con.prepareStatement("INSERT INTO PRODUCTS (product_name, category, price, stock) VALUES (?, ?, ?, ?)");
            System.out.print("how many product do you want to add: ");
            int num = sc.nextInt();
            for (int i = 1; i <= num; i++) {
                System.out.println("Enter the data of " + i + " product.");
                System.out.print("Enter product: ");
                String product = sc.next();
                System.out.print("Enter Category: ");
                String category = sc.next();
                System.out.print("Enter price: ");
                int price = sc.nextInt();
                System.out.print("Enter stock: ");
                int stock = sc.nextInt();
                pstmt.setString(1, product);
                pstmt.setString(2, category);
                pstmt.setDouble(3, price);
                pstmt.setInt(4, stock);
                pstmt.executeUpdate();
            }
            con.close();
            System.out.println("Product inserted successfully.");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class KoneksiJDBC {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/test_jdbc";
        String user = "root";
        String password = ""; // kosong kalau default XAMPP

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(url, user, password);
            System.out.println("Koneksi ke database berhasil!");
            conn.close();
        } catch (ClassNotFoundException e) {
            System.out.println("Driver JDBC tidak ditemukan!");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("Koneksi gagal!");
            e.printStackTrace();
        }
    }
}

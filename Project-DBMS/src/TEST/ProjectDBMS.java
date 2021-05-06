package TEST;

//
//package projectdbms;
//
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.SQLException;
//import java.sql.ResultSet;
//import java.sql.Statement;
//
//public class ProjectDBMS {
//
//    public static void main(String args[]) {
//
//		Connection conn = null;
//		Statement stmt = null;
//		ResultSet rs = null;
//		try {
//			Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
//			conn = DriverManager.getConnection("jdbc:mysql://localhost/QuanLyQuanCafeThucAn?user=root");
//			System.out.println("Kết nối thành công!");
//			try {
//				stmt = conn.createStatement();
//				rs = stmt.executeQuery("SELECT * from menu");
//				System.out.println("Truy vấn thành công!");
//				System.out.println("Danh sách các loại đồ uống: ");
//				int i = 1;
//				while (rs.next()) {
//					System.out.println("  -Đồ uống thứ " + i + ": " + rs.getString("TenMon"));
//					i++;
//				}
//			} catch (SQLException ex) {
//				System.out.println("Truy vấn không thành công! " + ex.getMessage());
//			}
//
//		} catch (Exception ex) {
//			System.out.println("Kết nối thất bại!");
//		}
//
//	}
//    
//}

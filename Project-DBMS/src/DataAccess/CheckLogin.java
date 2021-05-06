
package DataAccess;

import Database.Connect;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

//Class kiểm tra thông tin đăng nhập và chuyển sang giao diện sử dụng ứng dụng.
public class CheckLogin {
    public static Connection conn = Connect.getConnect();
    public static ResultSet rs = null;
    public static PreparedStatement pst = null;
    
    // Hàm trả String thông tin trạng thái kết nối đến cơ sở dữ liệu.
    // Không dùng nữa.
//    public static String testConnectString() {
//        try {
//            conn = Connect.getConnect();
//            if(conn != null) {
//                return "Đã kết nối đến cơ sở dữ liệu.";
//            }
//            else return "Lỗi kết nối cơ sở dữ liệu!";
//        } catch (Exception e) {
//            return "Lỗi kết nối cơ sở dữ liệu!";
//        }
//    }
    
    //Hàm kiểm tra Tài khoản mật khẩu có đúng không
    public static ResultSet checkLoginResultSet(String UserName, String PassWd) {
        try {
            //conn = Connect.getConnect();
            pst = conn.prepareStatement("SELECT * FROM quanlyquancafethucan.taikhoandangnhap WHERE UserName = ? AND PassWd = ?");
            pst.setString(1, UserName);
            pst.setString(2, PassWd);
            rs  = pst.executeQuery();
            return rs;
        } catch (Exception e) {
            return rs = null;
        }
    }
}

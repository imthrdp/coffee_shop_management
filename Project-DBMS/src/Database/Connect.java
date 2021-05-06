
package Database;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class Connect {
    public static Connection conn;
    public static Connection getConnect(){
        try {
            if(conn == null){
                Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
                conn = DriverManager.getConnection("jdbc:mysql://localhost:/quanlyquancafethucan?user=root&characterEncoding=UTF-8");
            }
            return conn;
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Lỗi kết nối cơ sở dữ liệu", "Thông báo", 1);
            return null;
        }
    }
}
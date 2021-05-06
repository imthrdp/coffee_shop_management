

package DataAccess;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import Database.Connect;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import net.proteanit.sql.DbUtils;

public class Table {
    public static ResultSet rs = null;
    public static PreparedStatement pst = null;
    public static Connection conn = Connect.getConnect();
    
    // Hàm nạp dữ liệu cho bảng:
    public static void LoadDataTable(String sql, JTable table){
        try {
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            // Nạp dữ liệu lên bảng mà ta sẽ truyền vào trong hàm này khi gọi đến:
            table.setModel((DbUtils.resultSetToTableModel(rs)));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e, "Lỗi.", 1);
        }
    }
    
    // Hàm đổ một dòng dữ liệu lên từ bảng lên textfield:
    public static ResultSet FillTextField(String sql) {
        try {
            pst = conn.prepareStatement(sql);
            return rs = pst.executeQuery();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e, "LoadDataTable", 1);
            return null;
        }
    }
}

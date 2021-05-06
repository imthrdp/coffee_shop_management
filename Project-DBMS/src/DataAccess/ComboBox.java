

package DataAccess;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import Database.Connect;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

public class ComboBox {
    public static Connection conn = Connect.getConnect();
    public static ResultSet rs = null;
    public static PreparedStatement pst = null;
    
    public static void LoadDataComboBox(String sql, JComboBox comboBox,String field) {
        try {
            PreparedStatement pst = conn.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            while(rs.next()) {
                comboBox.addItem(rs.getString(field));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Không truy xuất được dữ liệu " + field + ".", "Thông báo", 2);
        }
    }
    
}

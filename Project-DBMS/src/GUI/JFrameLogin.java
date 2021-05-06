
package GUI;

import Database.Connect;
import DataAccess.CheckLogin;
import java.awt.Color;
import java.awt.Font;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.LayoutStyle;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;

public class JFrameLogin extends javax.swing.JFrame {

    public static ResultSet rs = null;
    public static PreparedStatement pst = null;
    public static Connection conn = Connect.getConnect();
    public static int IDAccount;
    public static JFrameMain MainGUI;
    public static String userName;
    public static String password;
    public static String fullName;
    
    public JFrameLogin() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new JPanel();
        jPanel2 = new JPanel();
        jLabelUserName = new JLabel();
        jTextFieldUserName = new JTextField();
        jPanel3 = new JPanel();
        jLabelPassword = new JLabel();
        jPasswordFieldPassWord = new JPasswordField();
        jButtonLogin = new JButton();
        jButtonExit = new JButton();
        jCheckBoxShowPassword = new JCheckBox();
        jLabelConnectStatus = new JLabel();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("Đăng nhập");
        setLocation(new Point(0, 0));
        setUndecorated(true);

        jLabelUserName.setFont(new Font("Tahoma", 1, 14)); // NOI18N
        jLabelUserName.setText("Tên đăng nhập:");

        jTextFieldUserName.setFont(new Font("Tahoma", 1, 14)); // NOI18N
        jTextFieldUserName.setText("admin");
        jTextFieldUserName.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent evt) {
                jTextFieldUserNameKeyPressed(evt);
            }
        });

        jLabelPassword.setFont(new Font("Tahoma", 1, 14)); // NOI18N
        jLabelPassword.setText("Mật khẩu:");

        jPasswordFieldPassWord.setFont(new Font("Tahoma", 1, 14)); // NOI18N
        jPasswordFieldPassWord.setText("admin");
        jPasswordFieldPassWord.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent evt) {
                jPasswordFieldPassWordKeyPressed(evt);
            }
        });

        jButtonLogin.setBackground(new Color(0, 153, 102));
        jButtonLogin.setFont(new Font("Tahoma", 1, 14)); // NOI18N
        jButtonLogin.setText("Đăng nhập");
        jButtonLogin.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButtonLoginActionPerformed(evt);
            }
        });
        jButtonLogin.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent evt) {
                jButtonLoginKeyPressed(evt);
            }
        });

        jButtonExit.setBackground(new Color(255, 51, 51));
        jButtonExit.setFont(new Font("Tahoma", 1, 14)); // NOI18N
        jButtonExit.setText("Thoát");
        jButtonExit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButtonExitActionPerformed(evt);
            }
        });
        jButtonExit.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent evt) {
                jButtonExitKeyPressed(evt);
            }
        });

        jCheckBoxShowPassword.setFont(new Font("Tahoma", 0, 14)); // NOI18N
        jCheckBoxShowPassword.setText("Hiện mật khẩu");
        jCheckBoxShowPassword.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jCheckBoxShowPasswordActionPerformed(evt);
            }
        });
        jCheckBoxShowPassword.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent evt) {
                jCheckBoxShowPasswordKeyPressed(evt);
            }
        });

        GroupLayout jPanel3Layout = new GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonLogin)
                .addGap(18, 18, 18)
                .addComponent(jButtonExit, GroupLayout.PREFERRED_SIZE, 109, GroupLayout.PREFERRED_SIZE)
                .addGap(71, 71, 71))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelPassword, GroupLayout.PREFERRED_SIZE, 109, GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBoxShowPassword)
                    .addComponent(jPasswordFieldPassWord, GroupLayout.PREFERRED_SIZE, 220, GroupLayout.PREFERRED_SIZE))
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelPassword, GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                    .addComponent(jPasswordFieldPassWord, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addComponent(jCheckBoxShowPassword)
                .addGap(19, 19, 19)
                .addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonLogin, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonExit, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)))
        );

        jLabelConnectStatus.setFont(new Font("Tahoma", 1, 18)); // NOI18N
        jLabelConnectStatus.setForeground(new Color(0, 102, 255));
        jLabelConnectStatus.setHorizontalAlignment(SwingConstants.CENTER);
        jLabelConnectStatus.setText("PHẦN MỀM QUẢN LÝ QUÁN CAFE");

        GroupLayout jPanel2Layout = new GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelConnectStatus, GroupLayout.PREFERRED_SIZE, 367, GroupLayout.PREFERRED_SIZE)
                    .addGroup(GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabelUserName)
                        .addGap(18, 18, 18)
                        .addComponent(jTextFieldUserName, GroupLayout.PREFERRED_SIZE, 220, GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(jLabelConnectStatus)
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelUserName, GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                    .addComponent(jTextFieldUserName, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        );

        GroupLayout jPanel1Layout = new GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        );

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    private void jButtonLoginActionPerformed(ActionEvent evt) {//GEN-FIRST:event_jButtonLoginActionPerformed
        //BUTTIONG ĐĂNG NHẬP.
        try {
            //Kết nối cơ sở dữ liệu.
            rs = CheckLogin.checkLoginResultSet(jTextFieldUserName.getText(), String.valueOf(jPasswordFieldPassWord.getPassword()));
            if(rs.next()) {
                // Đăng nhập thành công.
                // Lấy ID của tài khoản đang đăng nhập để sử dụng lại:
                IDAccount = rs.getInt("ID");
                dispose();
                MainGUI = new JFrameMain();
                MainGUI.setVisible(true);
            }
            else {
                // Sai thông tin đăng nhập.
                JOptionPane.showMessageDialog(null, "Bạn đã nhập sai tên đăng nhập hoặc mật khẩu!", "Thông báo", 2);
            }
        } catch (Exception e) {
            //Nếu kết nối cơ sở dữ liệu thất bại.
            JOptionPane.showMessageDialog(null, "Không thể kết nối đến cơ sở dữ liệu!", "Thông báo", 1);
        }
    }//GEN-LAST:event_jButtonLoginActionPerformed
    
    public static String getUserName() {
       try {
            pst = conn.prepareStatement("SELECT * FROM quanlyquancafethucan.taikhoandangnhap WHERE ID = ?");
            pst.setInt(1, JFrameLogin.IDAccount);
            rs = pst.executeQuery();
            if (rs.next()) {
                return userName = rs.getString("UserName");
            }
            else return null;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e, "JFrameLogin", 1);
            return null;
        }
    }
    
    public static String getPassword(){
        try {
            pst = conn.prepareStatement("SELECT * FROM quanlyquancafethucan.taikhoandangnhap WHERE ID = ?");
            pst.setInt(1, JFrameLogin.IDAccount);
            rs = pst.executeQuery();
            if (rs.next()) {
                return password = rs.getString("PassWD");
            }
            else return null;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e, "ErorrAtJFrameLogin", 1);
            return null;
        }
    }
    
    public static String getFullName(){
        try {
            pst = conn.prepareStatement("SELECT * FROM quanlyquancafethucan.taikhoandangnhap WHERE ID = ?");
            pst.setInt(1, JFrameLogin.IDAccount);
            rs = pst.executeQuery();
            if (rs.next()) {
                return fullName = rs.getString("FullName");
            }
            else return null;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e, "JFrameLogin", 1);
            return null;
        }
    }
        
    private void jButtonExitActionPerformed(ActionEvent evt) {//GEN-FIRST:event_jButtonExitActionPerformed
        //BUTTION THOÁT.
//        if(JOptionPane.showConfirmDialog(null, "Bạn có chắc muốn thoát?", "Xác nhận thoát khỏi chương trình", 0) == 0) {
//            this.dispose();
//        }
        dispose();
    }//GEN-LAST:event_jButtonExitActionPerformed

    private void jCheckBoxShowPasswordActionPerformed(ActionEvent evt) {//GEN-FIRST:event_jCheckBoxShowPasswordActionPerformed
        //Chọn để hiển thị mật khẩu, bỏ chọn để giấu mật khẩu
        if(jCheckBoxShowPassword.isSelected()) {
            jPasswordFieldPassWord.setEchoChar((char)0);
        }
        else {
            jPasswordFieldPassWord.setEchoChar('*');
        }
    }//GEN-LAST:event_jCheckBoxShowPasswordActionPerformed

    private void jCheckBoxShowPasswordKeyPressed(KeyEvent evt) {//GEN-FIRST:event_jCheckBoxShowPasswordKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyChar() == KeyEvent.VK_ENTER) {
            jCheckBoxShowPassword.doClick();
        }
    }//GEN-LAST:event_jCheckBoxShowPasswordKeyPressed

    private void jButtonLoginKeyPressed(KeyEvent evt) {//GEN-FIRST:event_jButtonLoginKeyPressed
        // ENTER tại Nút ĐĂNG NHẬP == Nhấn
        if(evt.getKeyChar() == KeyEvent.VK_ENTER) {
            jButtonLogin.doClick();
        }
    }//GEN-LAST:event_jButtonLoginKeyPressed

    private void jButtonExitKeyPressed(KeyEvent evt) {//GEN-FIRST:event_jButtonExitKeyPressed
        // ENTER tại Nút THOÁT == Nhấn
        if(evt.getKeyChar() == KeyEvent.VK_ENTER) {
            jButtonExit.doClick();
        }
    }//GEN-LAST:event_jButtonExitKeyPressed

    private void jPasswordFieldPassWordKeyPressed(KeyEvent evt) {//GEN-FIRST:event_jPasswordFieldPassWordKeyPressed
        // ENTER tại field password cũng = nhấn vào nút đăng nhập
        if(evt.getKeyChar() == KeyEvent.VK_ENTER) {
            jButtonLogin.doClick();
        }
    }//GEN-LAST:event_jPasswordFieldPassWordKeyPressed

    private void jTextFieldUserNameKeyPressed(KeyEvent evt) {//GEN-FIRST:event_jTextFieldUserNameKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyChar() == KeyEvent.VK_ENTER) {
            jButtonLogin.doClick();
        }
    }//GEN-LAST:event_jTextFieldUserNameKeyPressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JFrameLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private JButton jButtonExit;
    private JButton jButtonLogin;
    private JCheckBox jCheckBoxShowPassword;
    private JLabel jLabelConnectStatus;
    private JLabel jLabelPassword;
    private JLabel jLabelUserName;
    private JPanel jPanel1;
    private JPanel jPanel2;
    private JPanel jPanel3;
    private JPasswordField jPasswordFieldPassWord;
    private JTextField jTextFieldUserName;
    // End of variables declaration//GEN-END:variables
}
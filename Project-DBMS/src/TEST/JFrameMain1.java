
package TEST;
import GUI.*;
import java.awt.event.ItemEvent;
import javax.swing.JOptionPane;
import static DataAccess.ComboBox.LoadDataComboBox;
import javax.swing.JButton;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import Database.Connect;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JFrameMain1 extends javax.swing.JFrame {

    public static Connection conn = Connect.getConnect();
    public static ResultSet rs = null;
    public static PreparedStatement pst = null; 
    public static JFrameAdmin Admin;
    public static int countTable = 0; // Biến tạm để đếm số bàn
    
    public JFrameMain1() {
        initComponents();
        
        //jLabelCurrentUserName.setText(JFrameLogin.getUserName() + " - " + JFrameLogin.getFullName());
        jLabelCurrentUserName.setText("<html>" + "Người dùng: " + JFrameLogin.getFullName() + "<br>Tên đăng nhập: " + JFrameLogin.getUserName() + "</html>");
        
        String CBFoodCategory = "SELECT * FROM quanlyquancafethucan.PhanLoaiMenu";
        String CBFoodName = "SELECT * FROM quanlyquancafethucan.menu";
        
        // Upload data to ComboBox Phân Loại:
        LoadDataComboBox(CBFoodCategory, jComboBoxFoodCategory, "Ten");
        
        // Upload data to ComboBox Tên Món:
        LoadDataComboBox(CBFoodName, jComboBoxFood,"TenMon");
        
//        JButton ready = new JButton("Trống");
//        ready.setVisible(true);
//        ready.setPreferredSize(new java.awt.Dimension(119, 50));
//        ready.setBackground(new java.awt.Color(0, 204, 204));
//        jPanelShowTableFood.add(ready);
//        JButton serving = new JButton("Có người");
//        serving.setVisible(true);
//        serving.setPreferredSize(new java.awt.Dimension(119, 50));
//        serving.setBackground(new java.awt.Color(255, 51, 102));
//        jPanelShowTableFood.add(serving);
        
        addTableButton();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane5 = new javax.swing.JTabbedPane();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jButtonAccount = new javax.swing.JButton();
        jButtonAddAccount = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jButtonAdministrator = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jComboBoxFoodCategory = new javax.swing.JComboBox();
        jComboBoxFood = new javax.swing.JComboBox();
        jButtonAddFood = new javax.swing.JButton();
        jSpinnerCountFoodAdded = new javax.swing.JSpinner();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jButtonPayment1 = new javax.swing.JButton();
        jComboBoxChangeTable = new javax.swing.JComboBox();
        jButtonPayment2 = new javax.swing.JButton();
        jPanelShowTableFood = new javax.swing.JPanel();
        jButtonLogOut = new javax.swing.JButton();
        jButtonExit = new javax.swing.JButton();
        jLabelCurrentUserName = new javax.swing.JLabel();
        jPanelProgramName = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Quản lý Quán Cafe - Quán Ăn");
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTabbedPane5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 505, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 56, Short.MAX_VALUE)
        );

        jTabbedPane5.addTab("DANH MỤC", jPanel6);

        jButtonAccount.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonAccount.setText("Chỉnh sửa thông tin");
        jButtonAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAccountActionPerformed(evt);
            }
        });

        jButtonAddAccount.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonAddAccount.setText("Thêm tài khoản");
        jButtonAddAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddAccountActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap(118, Short.MAX_VALUE)
                .addComponent(jButtonAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonAddAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(67, 67, 67))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonAccount)
                    .addComponent(jButtonAddAccount, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(31, 31, 31))
        );

        jTabbedPane5.addTab("TÀI KHOẢN", jPanel7);

        jButtonAdministrator.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonAdministrator.setText("Quản Trị Viên");
        jButtonAdministrator.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAdministratorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(131, 131, 131)
                .addComponent(jButtonAdministrator)
                .addContainerGap(261, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jButtonAdministrator)
                .addGap(0, 31, Short.MAX_VALUE))
        );

        jTabbedPane5.addTab("QUẢN TRỊ", jPanel1);

        getContentPane().add(jTabbedPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 114, 510, -1));

        jComboBoxFoodCategory.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jComboBoxFoodCategory.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Tất cả" }));
        jComboBoxFoodCategory.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBoxFoodCategoryItemStateChanged(evt);
            }
        });
        jComboBoxFoodCategory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxFoodCategoryActionPerformed(evt);
            }
        });

        jComboBoxFood.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jComboBoxFood.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxFoodActionPerformed(evt);
            }
        });

        jButtonAddFood.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonAddFood.setText("Thêm món");
        jButtonAddFood.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddFoodActionPerformed(evt);
            }
        });

        jSpinnerCountFoodAdded.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jSpinnerCountFoodAdded.setModel(new javax.swing.SpinnerNumberModel(0, -100, 100, 1));
        jSpinnerCountFoodAdded.setEditor(new javax.swing.JSpinner.NumberEditor(jSpinnerCountFoodAdded, ""));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Phân Loại");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Tên Món");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboBoxFoodCategory, 0, 214, Short.MAX_VALUE)
                    .addComponent(jComboBoxFood, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButtonAddFood, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSpinnerCountFoodAdded, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxFoodCategory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonAddFood)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jComboBoxFood, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jSpinnerCountFoodAdded, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 110, 440, -1));

        jButtonPayment1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonPayment1.setText("Chuyển Bàn");
        jButtonPayment1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPayment1ActionPerformed(evt);
            }
        });

        jComboBoxChangeTable.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jComboBoxChangeTable.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBoxChangeTable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxChangeTableActionPerformed(evt);
            }
        });

        jButtonPayment2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonPayment2.setText("Thanh Toán");
        jButtonPayment2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPayment2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(191, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButtonPayment2)
                    .addComponent(jButtonPayment1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBoxChangeTable, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(243, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxChangeTable, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonPayment1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonPayment2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 220, 430, 350));

        jPanelShowTableFood.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanelShowTableFood.setAutoscrolls(true);
        getContentPane().add(jPanelShowTableFood, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, 520, 340));

        jButtonLogOut.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonLogOut.setText("Đăng xuất");
        jButtonLogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLogOutActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonLogOut, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 60, -1, 33));

        jButtonExit.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonExit.setText("Thoát");
        jButtonExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExitActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 60, 97, 33));

        jLabelCurrentUserName.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelCurrentUserName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelCurrentUserName.setText("User: ");
        jLabelCurrentUserName.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(jLabelCurrentUserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 50, 510, 58));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("PHẦN MỀM QUẢN LÝ QUÁN CAFE VÀ QUÁN ĂN");

        javax.swing.GroupLayout jPanelProgramNameLayout = new javax.swing.GroupLayout(jPanelProgramName);
        jPanelProgramName.setLayout(jPanelProgramNameLayout);
        jPanelProgramNameLayout.setHorizontalGroup(
            jPanelProgramNameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelProgramNameLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 935, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelProgramNameLayout.setVerticalGroup(
            jPanelProgramNameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelProgramNameLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanelProgramName, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 955, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public final void addTableButton(){
        @SuppressWarnings("Convert2Lambda")
        ActionListener listener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() instanceof JButton) {
                    String text = ((JButton) e.getSource()).getText();
                    JOptionPane.showMessageDialog(null, text);
                }
            }
        };
        
        // Thêm vào giao diện các bàn, số tự tăng nếu thêm nhiều lần (biến đếm được lưu lại)
        JButton aButton[] = new JButton[30];
        int countTableTemp = 0;
        try {
            pst = conn.prepareStatement("SELECT * FROM quanlyquancafethucan.banphucvu");
            rs = pst.executeQuery();
            while (rs.next()) {
                int i = rs.getInt("ID") - 1;
                aButton[i] = new JButton("<html>" + rs.getString("TenBan") + "<br>" + rs.getString("TrangThai") + "</html>");
                aButton[i].setVisible(true);
                aButton[i].setPreferredSize(new java.awt.Dimension(119, 50));
                
                
                aButton[i].addActionListener(listener);
                
                if(rs.getString("TrangThai").equals("Trống")) {
                    aButton[i].setBackground(new java.awt.Color(0, 204, 204));
                }
                else aButton[i].setBackground(new java.awt.Color(255, 51, 102));
                jPanelShowTableFood.add(aButton[i]);
                countTable = rs.getRow();
            }
        } catch (Exception e) {
        }
        
        
//        for (int i = 0; i < n; i++) {
//            aButton[i] = new JButton("Bàn " + (i + 1+ countTable));
//            aButton[i].setVisible(true);
//            aButton[i].setPreferredSize(new java.awt.Dimension(119, 50));
//            jPanelShowTableFood.add(aButton[i]);
//            countTableTemp = i + 1;
//        }
//        countTable = countTable + countTableTemp;
        
        
    }
    
    public void resetTable() {
//        for(int i = 0; i < countTable; i++) {
//            jPanelShowTableFood.remove(0);
//        }
        jPanelShowTableFood.removeAll();
        countTable = 0;
    }
    
    private void jButtonLogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLogOutActionPerformed
        // BUTTION ĐĂNG XUẤT
//        if(JOptionPane.showConfirmDialog(null, "Bạn có chắc muốn đăng xuất?", "Xác nhận đăng xuất tài khoản", 2) == 0) {
//            this.dispose();
//            JFrameLogin LoginGUI= new JFrameLogin();
//            LoginGUI.setVisible(true);
//        }
        dispose();
        JFrameLogin LoginGUI= new JFrameLogin();
        LoginGUI.setVisible(true);
    }//GEN-LAST:event_jButtonLogOutActionPerformed

    private void jComboBoxFoodCategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxFoodCategoryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxFoodCategoryActionPerformed

    private void jButtonAdministratorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAdministratorActionPerformed
        //BUTTON QUẢN TRỊ - TRONG TAB QUẢN TRỊ
        Admin = new JFrameAdmin();
        Admin.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButtonAdministratorActionPerformed

    private void jButtonAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAccountActionPerformed
        JFrameAccountInformation AccountInformation = new JFrameAccountInformation();
        AccountInformation.setVisible(true);
    }//GEN-LAST:event_jButtonAccountActionPerformed

    private void jComboBoxChangeTableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxChangeTableActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxChangeTableActionPerformed

    private void jComboBoxFoodCategoryItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBoxFoodCategoryItemStateChanged
        // Chọn Phân Loại của ComboBoxFoodCategory sẽ chỉnh sửa nội dung ComboBoxFood
        if(evt.getStateChange() == ItemEvent.SELECTED){
            if(jComboBoxFoodCategory.getSelectedItem().toString().equals("Tất cả")){
                String sqlComboBoxFood = "SELECT * FROM quanlyquancafethucan.menu";
                jComboBoxFood.removeAllItems();
                LoadDataComboBox(sqlComboBoxFood, jComboBoxFood, "TenMon");
            }
            else if(jComboBoxFoodCategory.getSelectedItem().toString().equals("Nước uống")) {
                String sqlComboBoxFood = "SELECT * FROM quanlyquancafethucan.menu WHERE PhanLoai = 'Nước uống'";
                jComboBoxFood.removeAllItems();
                LoadDataComboBox(sqlComboBoxFood, jComboBoxFood, "TenMon");
            }
            else if(jComboBoxFoodCategory.getSelectedItem().toString().equals("Thức ăn")) {
                String sqlComboBoxFood = "SELECT * FROM quanlyquancafethucan.menu WHERE PhanLoai = 'Thức ăn'";
                jComboBoxFood.removeAllItems();
                LoadDataComboBox(sqlComboBoxFood, jComboBoxFood, "TenMon");
            }
            else if(jComboBoxFoodCategory.getSelectedItem().toString().equals("Khác")) {
                String sqlComboBoxFood = "SELECT * FROM quanlyquancafethucan.menu WHERE PhanLoai = 'Khác'";
                jComboBoxFood.removeAllItems();
                LoadDataComboBox(sqlComboBoxFood, jComboBoxFood, "TenMon");
            }
        }
        
    }//GEN-LAST:event_jComboBoxFoodCategoryItemStateChanged

    private void jButtonAddFoodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddFoodActionPerformed
        // TODO add your handling code here:
        if((int)jSpinnerCountFoodAdded.getValue() > 0){
            JOptionPane.showMessageDialog(null, "Đã thêm " + jComboBoxFood.getSelectedItem().toString() + ". Số lượng: " + jSpinnerCountFoodAdded.getValue(), "Thêm món", 1);
        }
        else if((int)jSpinnerCountFoodAdded.getValue() < 0) {
            int n = - (int)(jSpinnerCountFoodAdded.getValue());
            JOptionPane.showMessageDialog(null, "Đã xóa " + n + " " + jComboBoxFood.getSelectedItem().toString(), "Xóa món", 1);
        }
    }//GEN-LAST:event_jButtonAddFoodActionPerformed

    private void jButtonAddAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddAccountActionPerformed
        // Đăng ký tài khoản đăng nhập khác
        JFrameAddAccount addAccount = new JFrameAddAccount();
        addAccount.setVisible(true);
    }//GEN-LAST:event_jButtonAddAccountActionPerformed

    private void jButtonExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExitActionPerformed
        // Thoát chương trình:
//        if(JOptionPane.showConfirmDialog(null, "Bạn muốn thoát chương trình?", "Xác nhận thoát chương trình.", 0) == 0) {
//            System.exit(0);
//        }
        System.exit(0);
    }//GEN-LAST:event_jButtonExitActionPerformed

    private void jButtonPayment2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPayment2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonPayment2ActionPerformed

    private void jButtonPayment1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPayment1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonPayment1ActionPerformed

    private void jComboBoxFoodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxFoodActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxFoodActionPerformed

   
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
            java.util.logging.Logger.getLogger(JFrameMain1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameMain1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameMain1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameMain1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameMain1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAccount;
    private javax.swing.JButton jButtonAddAccount;
    private javax.swing.JButton jButtonAddFood;
    private javax.swing.JButton jButtonAdministrator;
    private javax.swing.JButton jButtonExit;
    private javax.swing.JButton jButtonLogOut;
    private javax.swing.JButton jButtonPayment1;
    private javax.swing.JButton jButtonPayment2;
    private javax.swing.JComboBox jComboBoxChangeTable;
    private javax.swing.JComboBox jComboBoxFood;
    private javax.swing.JComboBox jComboBoxFoodCategory;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelCurrentUserName;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanelProgramName;
    private javax.swing.JPanel jPanelShowTableFood;
    private javax.swing.JSpinner jSpinnerCountFoodAdded;
    private javax.swing.JTabbedPane jTabbedPane5;
    // End of variables declaration//GEN-END:variables

    void dipose() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

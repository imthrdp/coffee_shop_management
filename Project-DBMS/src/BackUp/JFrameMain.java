/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BackUp;
import GUI.*;
import java.awt.event.ItemEvent;
import javax.swing.JOptionPane;
import static DataAccess.ComboBox.LoadDataComboBox;

public class JFrameMain extends javax.swing.JFrame {

    //public static Connection conn = Connect.getConnect();
    public static JFrameAdmin Admin;
    
    public JFrameMain() {
        initComponents();
        jLabelCurrentUserName.setText(JFrameLogin.getUserName() + " - " + JFrameLogin.getFullName());
        String sqlComboBoxFoodCategory = "SELECT * FROM quanlyquancafethucan.PhanLoaiMenu";
        String sqlComboBoxFood = "SELECT * FROM quanlyquancafethucan.menu";
        //Upload dữ liệu ComboBox Phân Loại:
        LoadDataComboBox(sqlComboBoxFoodCategory, jComboBoxFoodCategory, "Ten");
        //Upload dữ liệu ComboBox Tên Món:
        LoadDataComboBox(sqlComboBoxFood, jComboBoxFood,"TenMon");
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
        jPanel9 = new javax.swing.JPanel();
        jButtonLogOut = new javax.swing.JButton();
        jButtonExit = new javax.swing.JButton();
        jLabelCurrentUserName = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Quản lý Quán Cafe - Quán Ăn");
        setUndecorated(true);

        jTabbedPane5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 445, Short.MAX_VALUE)
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
                .addContainerGap(58, Short.MAX_VALUE)
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
                .addContainerGap(201, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jButtonAdministrator)
                .addGap(0, 31, Short.MAX_VALUE))
        );

        jTabbedPane5.addTab("QUẢN TRỊ", jPanel1);

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
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jComboBoxFoodCategory, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jComboBoxFood, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButtonAddFood, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSpinnerCountFoodAdded, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jComboBoxFoodCategory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonAddFood)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxFood, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSpinnerCountFoodAdded, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

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
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(138, 138, 138)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButtonPayment2)
                    .addComponent(jButtonPayment1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBoxChangeTable, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(180, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxChangeTable, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonPayment1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonPayment2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 287, Short.MAX_VALUE)
        );

        jButtonLogOut.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonLogOut.setText("Đăng xuất");
        jButtonLogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLogOutActionPerformed(evt);
            }
        });

        jButtonExit.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonExit.setText("Thoát");
        jButtonExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExitActionPerformed(evt);
            }
        });

        jLabelCurrentUserName.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelCurrentUserName.setText("User: ");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("PHẦN MỀM QUẢN LÝ QUÁN CAFE VÀ QUÁN ĂN");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTabbedPane5))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(92, 92, 92))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelCurrentUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonLogOut)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonExit, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelCurrentUserName, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButtonLogOut, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonExit, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTabbedPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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
        if(evt.getStateChange()== ItemEvent.SELECTED){
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
            java.util.logging.Logger.getLogger(JFrameMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameMain().setVisible(true);
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
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JSpinner jSpinnerCountFoodAdded;
    private javax.swing.JTabbedPane jTabbedPane5;
    // End of variables declaration//GEN-END:variables

    void dipose() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

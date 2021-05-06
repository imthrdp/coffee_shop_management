
package GUI;
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
import DataAccess.Table;
import java.sql.CallableStatement;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

public class JFrameMain extends javax.swing.JFrame {

    public static Connection conn = Connect.getConnect();
    public static ResultSet rs = null;
    public static PreparedStatement pst = null; 
    public static PreparedStatement pst1 = null; 
    public static JFrameAdmin Admin = new JFrameAdmin();
    public static CallableStatement cst = null;
    public static CallableStatement cst1 = null;
    public static CallableStatement cst2 = null;
    public static int countTable = 0; // Biến tạm để đếm số bàn
    public static int IDTable;
    public JButton aButton[] = new JButton[30];
    
    public JFrameMain() {
        initComponents();
        
        //jLabelCurrentUserName.setText(JFrameLogin.getUserName() + " - " + JFrameLogin.getFullName());
        jLabelCurrentUserName.setText("<html>" + "Người dùng: " + JFrameLogin.getFullName() + "<br>Tên đăng nhập: " + JFrameLogin.getUserName() + "</html>");
        
        String CBFoodCategory = "SELECT * FROM quanlyquancafethucan.PhanLoaiMenu";
        String CBFoodName = "SELECT * FROM quanlyquancafethucan.menu";
        
        // Upload data to ComboBox Phân Loại:
        LoadDataComboBox(CBFoodCategory, jComboBoxFoodCategory, "Ten");
        
        // Upload data to ComboBox Tên Món:
        LoadDataComboBox(CBFoodName, jComboBoxFood,"TenMon");
        
        // Upload data to ComboBox Bàn chuyển:
        LoadDataComboBox("SELECT * FROM banphucvu", jComboBoxChangeTable,"TenBan");
        
        // Cập nhật trạng thái bàn là có người nếu như có hóa đơn (mới) được thêm vào bàn đang trống.
        UpdateTableStatus();
        addTableButton();
        
        Table.LoadDataTable("SELECT menu.TenMon AS 'Tên món',  hoadonchitiet.SoLuong AS 'Số lượng', menu.Gia AS 'Đơn giá', hoadonchitiet.SoLuong*menu.Gia AS 'Thành tiền'" +
                    " FROM menu, hoadonchitiet, hoadon" +
                    " WHERE hoadonchitiet.IDHoaDon = hoadon.ID AND hoadonchitiet.IDmenu = menu.ID AND hoadon.TinhTrangThanhToan = 0 AND hoadon.IDBan = 1", jTableTableInfo);
    
        jSpinnerTotalPrice.setValue(totalPrice("1"));
    
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane5 = new javax.swing.JTabbedPane();
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
        jLabelTableName = new javax.swing.JLabel();
        jLabelTableID = new javax.swing.JLabel();
        jTextFieldTableID = new javax.swing.JTextField();
        jTextFieldTableName1 = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jButtonSwitchTable = new javax.swing.JButton();
        jComboBoxChangeTable = new javax.swing.JComboBox();
        jButtonPayment2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableTableInfo = new javax.swing.JTable();
        jTextFieldTableName = new javax.swing.JTextField();
        jSpinnerTotalPrice = new javax.swing.JSpinner();
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
                .addGap(90, 90, 90)
                .addComponent(jButtonAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonAddAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(95, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButtonAddAccount, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                    .addComponent(jButtonAccount, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
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
                .addGap(192, 192, 192)
                .addComponent(jButtonAdministrator)
                .addContainerGap(200, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonAdministrator, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                .addContainerGap())
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

        jButtonAddFood.setBackground(new java.awt.Color(0, 255, 0));
        jButtonAddFood.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonAddFood.setForeground(new java.awt.Color(0, 0, 255));
        jButtonAddFood.setText("Thêm món");
        jButtonAddFood.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddFoodActionPerformed(evt);
            }
        });

        jSpinnerCountFoodAdded.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jSpinnerCountFoodAdded.setModel(new javax.swing.SpinnerNumberModel(1, -100, 100, 1));
        jSpinnerCountFoodAdded.setEditor(new javax.swing.JSpinner.NumberEditor(jSpinnerCountFoodAdded, ""));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Phân Loại:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Tên Món:");

        jLabelTableName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelTableName.setText("Tên bàn:");

        jLabelTableID.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelTableID.setText("Mã bàn:");

        jTextFieldTableID.setEditable(false);
        jTextFieldTableID.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextFieldTableID.setText("1");

        jTextFieldTableName1.setEditable(false);
        jTextFieldTableName1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextFieldTableName1.setText("Bàn 1");

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
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jComboBoxFoodCategory, 0, 200, Short.MAX_VALUE)
                    .addComponent(jComboBoxFood, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButtonAddFood, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSpinnerCountFoodAdded))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelTableID, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelTableName, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldTableID, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
                    .addComponent(jTextFieldTableName1))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBoxFoodCategory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonAddFood)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jSpinnerCountFoodAdded)
                                    .addComponent(jComboBoxFood))
                                .addGap(0, 2, Short.MAX_VALUE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelTableName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jTextFieldTableName1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldTableID)
                            .addComponent(jLabelTableID, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 110, 610, -1));

        jButtonSwitchTable.setBackground(new java.awt.Color(0, 255, 0));
        jButtonSwitchTable.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonSwitchTable.setForeground(new java.awt.Color(0, 0, 255));
        jButtonSwitchTable.setText("Chuyển Bàn");
        jButtonSwitchTable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSwitchTableActionPerformed(evt);
            }
        });

        jComboBoxChangeTable.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jComboBoxChangeTable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxChangeTableActionPerformed(evt);
            }
        });

        jButtonPayment2.setBackground(new java.awt.Color(0, 255, 0));
        jButtonPayment2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonPayment2.setForeground(new java.awt.Color(0, 0, 255));
        jButtonPayment2.setText("Thanh Toán");
        jButtonPayment2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPayment2ActionPerformed(evt);
            }
        });

        jTableTableInfo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTableTableInfo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTableTableInfo);

        jTextFieldTableName.setEditable(false);
        jTextFieldTableName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextFieldTableName.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldTableName.setText("Bàn 1");

        jSpinnerTotalPrice.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jSpinnerTotalPrice.setModel(new javax.swing.SpinnerNumberModel(Float.valueOf(0.0f), null, null, Float.valueOf(1000.0f)));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 610, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextFieldTableName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonSwitchTable, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBoxChangeTable, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSpinnerTotalPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonPayment2)
                .addGap(43, 43, 43))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButtonPayment2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSpinnerTotalPrice, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                    .addComponent(jComboBoxChangeTable)
                    .addComponent(jTextFieldTableName, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButtonSwitchTable, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 220, 620, 350));

        jPanelShowTableFood.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanelShowTableFood.setAutoscrolls(true);
        getContentPane().add(jPanelShowTableFood, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, 520, 340));

        jButtonLogOut.setBackground(new java.awt.Color(255, 102, 0));
        jButtonLogOut.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonLogOut.setForeground(new java.awt.Color(51, 0, 204));
        jButtonLogOut.setText("Đăng xuất");
        jButtonLogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLogOutActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonLogOut, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 60, -1, 33));

        jButtonExit.setBackground(new java.awt.Color(255, 102, 0));
        jButtonExit.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonExit.setForeground(new java.awt.Color(51, 0, 204));
        jButtonExit.setText("Thoát");
        jButtonExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExitActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 60, 97, 33));

        jLabelCurrentUserName.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelCurrentUserName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelCurrentUserName.setText("User: ");
        jLabelCurrentUserName.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(jLabelCurrentUserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 50, 510, 58));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 51, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("PHẦN MỀM QUẢN LÝ QUÁN CAFE VÀ QUÁN ĂN");

        javax.swing.GroupLayout jPanelProgramNameLayout = new javax.swing.GroupLayout(jPanelProgramName);
        jPanelProgramName.setLayout(jPanelProgramNameLayout);
        jPanelProgramNameLayout.setHorizontalGroup(
            jPanelProgramNameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelProgramNameLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 1168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    public static void UpdateTableStatus() {
        try {
            cst = conn.prepareCall("{CALL CapNhatTrangThaiBan()}");
            cst.executeQuery();
            } 
        catch (SQLException ex) {
            Logger.getLogger(JFrameMain.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static float totalPrice(String tablePriceID) {
        float totalPrice = 0;
        try {
            pst = conn.prepareStatement("SELECT SUM(T) AS 'Tổng' FROM" +
            " (SELECT ct.SoLuong*m.Gia AS T" +
            " FROM menu m, hoadonchitiet ct, hoadon h" +
            " WHERE ct.IDHoaDon = h.IDBan AND ct.IDmenu = m.ID AND h.TinhTrangThanhToan = 0 AND h.IDBan = ?) AS T1");
            pst.setString(1, tablePriceID);
            rs = pst.executeQuery();
            while(rs.next()) {
                totalPrice = rs.getFloat("Tổng");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e, "Lỗi", 1);
        }
        return totalPrice;
    }
    
    public final void addTableButton(){
        
        @SuppressWarnings("Convert2Lambda")
        ActionListener listener = new ActionListener() {
            @Override
            //DO NOT EDIT
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() instanceof JButton) {
                    String textTable = ((JButton) e.getSource()).getText();
                    String splitID[] = textTable.split(" ");
                    //Test Splited String:
                    //for(int i = 0; i < splitID.length; i++) System.out.println(splitID[i]);
                    //  <html>    0
                    //  Bàn       1
                    //  1         2
                    //  <br>      3
                    //  Trống     4
                    //  </html>   5
                    String tableName = splitID[1];
                    String ID = splitID[2];
                    String status = splitID[4];
//                    Table.LoadDataTable("SELECT menu.TenMon AS 'Tên món',  hoadonchitiet.SoLuong AS 'Số lượng', menu.Gia AS 'Đơn giá', hoadonchitiet.SoLuong*menu.Gia AS 'Thành tiền'" +
//                    " FROM menu, hoadonchitiet, hoadon" +
//                    " WHERE hoadonchitiet.IDHoaDon = hoadon.IDBan AND hoadonchitiet.IDmenu = menu.ID AND hoadon.TinhTrangThanhToan = 0 AND hoadon.IDBan = " + ID, jTableTableInfo);
                    Table.LoadDataTable("SELECT menu.TenMon AS 'Tên món',  hoadonchitiet.SoLuong AS 'Số lượng', menu.Gia AS 'Đơn giá', hoadonchitiet.SoLuong*menu.Gia AS 'Thành tiền'" +
                    " FROM menu, hoadonchitiet, hoadon" +
                    " WHERE hoadonchitiet.IDHoaDon = hoadon.ID AND hoadonchitiet.IDmenu = menu.ID AND hoadon.TinhTrangThanhToan = 0 AND hoadon.IDBan = " + ID, jTableTableInfo);
                    jTextFieldTableName.setText(tableName + " " + ID);
                    jTextFieldTableName1.setText(tableName + " " + ID);
                    jTextFieldTableID.setText(ID);
                    jSpinnerTotalPrice.setValue(totalPrice(ID));
                    jComboBoxChangeTable.setSelectedIndex(0);
                }
            }
        };
        
        // Thêm vào giao diện các bàn, số tự tăng nếu thêm nhiều lần (biến đếm được lưu lại)
        //JButton aButton[] = new JButton[30];
        int countTableTemp = 0;
        try {
            pst = conn.prepareStatement("SELECT * FROM quanlyquancafethucan.banphucvu");
            //pst = conn.prepareStatement("SELECT * FROM quanlyquancafethucan.banphucvu");
            rs = pst.executeQuery();
            while (rs.next()) {
                int i = rs.getInt("ID") - 1;
                IDTable = i + 1;
                aButton[i] = new JButton("<html> " + rs.getString("TenBan") + " <br> " + rs.getString("TrangThai") + " </html>");
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
        //Admin = new JFrameAdmin();
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
        // "THÊM MÓN"
        if((int) jSpinnerCountFoodAdded.getValue() != 0) {
            // Tìm mã món cần thêm vào bàn:
            int IDmenu = findIDMenu(jComboBoxFood.getSelectedItem().toString());
            // Kiểm tra bàn cần thêm có bill chưa:
            boolean isExistBill = isExistBill(Integer.parseInt(jTextFieldTableID.getText()));
            // Nếu chưa có bill:
            if (isExistBill == false) {
                // Thêm bill
                addBill(Integer.parseInt(jTextFieldTableID.getText()));
                // Thêm từng món vào:
                addFood(Integer.parseInt(jTextFieldTableID.getText()), IDmenu, (int) jSpinnerCountFoodAdded.getValue());
                //"INSERT INTO hoadonchitiet(IDHoaDon, IDMenu, SoLuong) VALUES (?, ?, ?)";
            }
            // Nếu có bill rồi
            else if (isExistBill == true) {
                try {
                    // Update trạng thái bill = 0
                    cst = conn.prepareCall("UPDATE hoadon SET TinhTrangThanhToan=0 WHERE IDBan=" + Integer.parseInt(jTextFieldTableID.getText()));
                    cst.executeUpdate();
                    
                    // Xem món có chưa, để thêm nếu chưa hoặc cập nhật số lượng nếu có rồi
                    rs = null;
                    rs = isExistFood(Integer.parseInt(jTextFieldTableID.getText()), IDmenu);
                    if(rs.next()) {
                        // Nếu món đã có thì cập nhật lại số lượng trong hóa đơn, không thêm dòng mới
                        int oldCount = rs.getInt("SoLuong");
                        cst = conn.prepareCall("UPDATE hoadonchitiet SET SoLuong=? WHERE IDMenu=? AND IDHoaDon = ?");
                        cst.setInt(1, (int) jSpinnerCountFoodAdded.getValue() + oldCount);
                        cst.setInt(2, IDmenu);
                        cst.setInt(3, Integer.parseInt(jTextFieldTableID.getText()));
                        cst.executeUpdate();
                        //System.out.println(1);
                    }
                    else {
                        // Nếu chưa có món thì thêm dòng mới vào trong hóa đơn
                        addFood(Integer.parseInt(jTextFieldTableID.getText()), IDmenu, (int) jSpinnerCountFoodAdded.getValue());
                        
                    }
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, e, null, 1);
                }
            }
            // Chuyển trạng thái bàn sang có người
            try {
                cst = conn.prepareCall("UPDATE banphucvu SET TrangThai='Có người' WHERE ID=?");
                cst.setInt(1, Integer.parseInt(jTextFieldTableID.getText()));
                cst.executeUpdate();
            } catch (Exception e) {
            }
            aButton[Integer.parseInt(jTextFieldTableID.getText()) - 1].setBackground(new java.awt.Color(255, 51, 102));
            aButton[Integer.parseInt(jTextFieldTableID.getText()) - 1].setText("<html> " + jTextFieldTableName1.getText() + " <br> " + "Có người" + " </html>");
            aButton[Integer.parseInt(jTextFieldTableID.getText()) - 1].doClick();
            if((int) jSpinnerCountFoodAdded.getValue() > 0) {
                JOptionPane.showMessageDialog(null, "Đã thêm " + ((int) jSpinnerCountFoodAdded.getValue()) + " " + jComboBoxFood.getSelectedItem().toString() + " vào " + jTextFieldTableName1.getText() + "!", "Thêm thành công.", 1);
            }
            else JOptionPane.showMessageDialog(null, "Đã xóa " + (- (int) jSpinnerCountFoodAdded.getValue()) + " " + jComboBoxFood.getSelectedItem().toString() + " ra khỏi " + jTextFieldTableName1.getText() + "!", "Xóa thành công.", 1);
        }
        String sqlTableFood = "SELECT ID AS 'Mã bàn', TenBan AS 'Tên Bàn', TrangThai AS 'Trạng Thái' FROM quanlyquancafethucan.BanPhucVu ORDER BY ID ASC";
        Table.LoadDataTable(sqlTableFood, JFrameMain.Admin.jTableTableFood);
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
        if(JOptionPane.showConfirmDialog(null, "Bạn có thật sự muốn thanh toán hóa đơn cho bàn " + jTextFieldTableName1.getText() + "? Tổng thanh toán: " + jSpinnerTotalPrice.getValue() + " VNĐ", "Xác nhận thanh toán hóa đơn.", 0) == 0) {
            try {
                // Thêm từng dòng trong bảng hóa đơn vào doanh thu:
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                String dateCheckOut = sdf.format(new Date());
                for(int i = 0; i < jTableTableInfo.getRowCount(); i++) {
                    cst1 = conn.prepareCall("INSERT INTO doanhthu(TenMon, SoLuong, DonGia, ThanhTien, Ngay) VALUES(?, ?, ?, ?, ?)");
                    cst1.setString(1, jTableTableInfo.getValueAt(i, 0).toString());
                    cst1.setInt(2, (int) jTableTableInfo.getValueAt(i, 1));
                    cst1.setDouble(3, (Double) jTableTableInfo.getValueAt(i, 2));
                    cst1.setDouble(4, (Double) jTableTableInfo.getValueAt(i, 3));
                    cst1.setString(5, dateCheckOut);
                    cst1.executeUpdate();
                }                
                
                // Thanh toán:
                cst = conn.prepareCall("UPDATE hoadon SET TinhTrangThanhToan = 1 WHERE IDBan=?");
                cst.setInt(1, Integer.parseInt(jTextFieldTableID.getText()));
                cst.executeUpdate();
                
                JOptionPane.showMessageDialog(null, "Thanh toán hoàn tất. Tổng thu: " + jSpinnerTotalPrice.getValue() + " VNĐ", "Thanh toán " + jTextFieldTableName1.getText(), 1);
                aButton[Integer.parseInt(jTextFieldTableID.getText()) - 1].setBackground(new java.awt.Color(0, 204, 204));
                aButton[Integer.parseInt(jTextFieldTableID.getText()) - 1].setText("<html> " + jTextFieldTableName1.getText() + " <br> " + "Trống" + " </html>");
                aButton[Integer.parseInt(jTextFieldTableID.getText()) - 1].doClick();
                
                // Làm mới lại hóa đơn
                cst2 = conn.prepareCall("DELETE FROM hoadonchitiet WHERE IDHoaDon = ?");
                cst2.setInt(1, Integer.parseInt(jTextFieldTableID.getText()));
                cst2.executeUpdate();
                
                // Làm mới trạng thái
                cst = conn.prepareCall("UPDATE banphucvu SET TrangThai='Trống' WHERE ID=?");
                cst.setInt(1, Integer.parseInt(jTextFieldTableID.getText()));
                cst.executeUpdate();
                cst = conn.prepareCall("UPDATE hoadon SET TinhTrangThanhToan=1 WHERE ID=?");
                cst.setInt(1, Integer.parseInt(jTextFieldTableID.getText()));
                cst.executeUpdate();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e, "Lỗi", 1);
            }
            String sqlTableFood = "SELECT ID AS 'Mã bàn', TenBan AS 'Tên Bàn', TrangThai AS 'Trạng Thái' FROM quanlyquancafethucan.BanPhucVu ORDER BY ID ASC";
            Table.LoadDataTable(sqlTableFood, JFrameMain.Admin.jTableTableFood);
            JFrameMain.Admin.jButtonShowRevenue.doClick();
        }
    }//GEN-LAST:event_jButtonPayment2ActionPerformed

    private void jButtonSwitchTableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSwitchTableActionPerformed
        // CHUYỂN BÀN: CHUYỂN HÓA ĐƠN TỪ BÀN NÀY SANG BÀN KIA
        // Tên bàn hiện tại
        String currentTableName = jTextFieldTableName1.getText();
        // ID bàn hiện tại:
        int currentTableID = Integer.parseInt(jTextFieldTableID.getText());
        
        String splitedCurrentTableName[] = aButton[currentTableID - 1].getText().split(" ");
        String currentTableStatus = splitedCurrentTableName[4];
        
        // Lấy ID, tên bàn sẽ chuyển đến
        String DestinationTableName = jComboBoxChangeTable.getSelectedItem().toString();
        String split[] = jComboBoxChangeTable.getSelectedItem().toString().split(" ");
        int IDDestinationTable = Integer.parseInt(split[1]);
        
        if((IDDestinationTable != Integer.parseInt(jTextFieldTableID.getText())) && !currentTableStatus.equals("Trống")) {
            if(JOptionPane.showConfirmDialog(null, "Bạn có muốn chuyển " + currentTableName + " sang " + DestinationTableName + " không?", "Thông báo", 0) == 0) {
                // Kiểm tra bàn sẽ chuyển đến có bill chưa:
                boolean isExistBill = isExistBill(IDDestinationTable);
                if(isExistBill == false) {
                    addBill(IDDestinationTable);
                }

                try {
                    // Trạng thái bill bàn mới (sẽ chuyển đến) = 0
                    cst = conn.prepareCall("UPDATE hoadon SET TinhTrangThanhToan=0 WHERE IDBan=" + IDDestinationTable);
                    cst.executeUpdate();
                } catch (SQLException ex) {
                    Logger.getLogger(JFrameMain.class.getName()).log(Level.SEVERE, null, ex);
                }

                int idFood;
                int count;
                for(int i = 0; i < jTableTableInfo.getRowCount(); i ++){
                    idFood = findIDMenu(jTableTableInfo.getValueAt(i, 0).toString());
                    count = (int) jTableTableInfo.getValueAt(i, 1);
                    //System.out.println(jTableTableInfo.getValueAt(i, 0).toString() + " " + idFood + " " + count);
                    try {
                        // Xem món có chưa, để thêm hoặc cập nhật
                        rs = isExistFood(IDDestinationTable, idFood);
                        if(rs.next()) {
                            // Nếu món đã có thì cập nhật lại số lượng trong hóa đơn, không thêm dòng mới
                            int oldCount = rs.getInt("SoLuong");
                            cst = conn.prepareCall("UPDATE hoadonchitiet SET SoLuong=? WHERE IDMenu=? AND IDHoaDon = ?");
                            cst.setInt(1, count + oldCount);
                            cst.setInt(2, idFood);
                            cst.setInt(3, IDDestinationTable);
                            cst.executeUpdate();
                            //System.out.println(1);
                        }
                        else {
                            // Nếu chưa có món thì thêm dòng mới vào trong hóa đơn
                            addFood(IDDestinationTable, idFood, count);
                        }
                    } catch (SQLException ex) {
                        Logger.getLogger(JFrameMain.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                try {
                    cst = conn.prepareCall("UPDATE banphucvu SET TrangThai='Có người' WHERE ID=?");
                    cst.setInt(1, IDDestinationTable);
                    cst.executeUpdate();

                    aButton[Integer.parseInt(jTextFieldTableID.getText()) - 1].setBackground(new java.awt.Color(0, 204, 204));
                    aButton[Integer.parseInt(jTextFieldTableID.getText()) - 1].setText("<html> " + jTextFieldTableName1.getText() + " <br> " + "Trống" + " </html>");
                    aButton[Integer.parseInt(jTextFieldTableID.getText()) - 1].doClick();

                    cst = conn.prepareCall("UPDATE hoadon SET TinhTrangThanhToan=1 WHERE IDBan=" + Integer.parseInt(jTextFieldTableID.getText()));
                    cst.executeUpdate();

                    cst = conn.prepareCall("UPDATE banphucvu SET TrangThai='Trống' WHERE ID=?");
                    cst.setInt(1, Integer.parseInt(jTextFieldTableID.getText()));
                    cst.executeUpdate();

                    // Làm mới lại hóa đơn
                    cst2 = conn.prepareCall("DELETE FROM hoadonchitiet WHERE IDHoaDon = ?");
                    cst2.setInt(1, Integer.parseInt(jTextFieldTableID.getText()));
                    cst2.executeUpdate();
                    jTextFieldTableID.removeAll();

                    aButton[IDDestinationTable - 1].setBackground(new java.awt.Color(255, 51, 102));
                    aButton[IDDestinationTable - 1].setText("<html> " + DestinationTableName + " <br> " + "Có người" + " </html>");
                    aButton[IDDestinationTable - 1].doClick();

                    JOptionPane.showMessageDialog(null, "Đã chuyển " + currentTableName + " sang " + DestinationTableName + ".", "Chuyển bàn thành công.", 1);
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, e, "Thông báo", 1);
                }
                String sqlTableFood = "SELECT ID AS 'Mã bàn', TenBan AS 'Tên Bàn', TrangThai AS 'Trạng Thái' FROM quanlyquancafethucan.BanPhucVu ORDER BY ID ASC";
                Table.LoadDataTable(sqlTableFood, JFrameMain.Admin.jTableTableFood);
            }
        }   
    }//GEN-LAST:event_jButtonSwitchTableActionPerformed

    private void jComboBoxFoodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxFoodActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxFoodActionPerformed

   
    
    public int findIDMenu(String MenuName) {
        int id = -1;
        try {
                pst = conn.prepareStatement("SELECT ID FROM menu WHERE TenMon =?");
                pst.setString(1, MenuName);
                rs = pst.executeQuery();
                if(rs.next()) {
                    id = rs.getInt("ID");
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e, null, 1);
            }
        return id;
    }
    
    public boolean isExistBill(int idTable) {
        boolean isExist = false;
        try {
            pst = conn.prepareStatement("SELECT * FROM hoadon WHERE ID = ?");
            pst.setInt(1, idTable);
            rs = pst.executeQuery();
            if(rs.next()) {
                isExist = true;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e, null, 1);
            isExist = false;
        }
        return isExist;
    }
    
    public void addBill(int idtable){
        try {
            cst = conn.prepareCall("INSERT INTO hoadon VALUES (?, now(), null, ?, 0);");
            cst.setInt(1, idtable);
            cst.setInt(2, idtable);
            cst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(JFrameMain.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void addFood(int idtable, int idmenu, int count) {
        try {
            cst = conn.prepareCall("INSERT INTO hoadonchitiet(IDHoaDon, IDMenu, SoLuong) VALUES (?, ?, ?)");
            cst.setInt(1, idtable);
            cst.setInt(2, idmenu);
            cst.setInt(3, count);
            cst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(JFrameMain.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static ResultSet isExistFood(int idtable, int idmenu) {
        // Kiểm tra xem trong bàn itable đang thực hiện hàm này có tồn tại món idmenu chưa
        try {
            conn = Connect.getConnect();
            // pst1 = conn.prepareStatement("SELECT ct.IDHoaDon, ct.IDMenu, ct.SoLuong FROM hoadonchitiet ct, hoadon h WHERE ct.IDHoaDon = ? AND ct.IDMenu = ?");
            pst1 = conn.prepareStatement("SELECT ct.IDHoaDon, ct.IDMenu, ct.SoLuong FROM hoadonchitiet ct, hoadon h WHERE ct.IDHoaDon = ? AND h.ID = ? AND ct.IDMenu = ?");
            pst1.setInt(1, idtable);
            pst1.setInt(2, idtable);
            pst1.setInt(3, idmenu);
            rs = pst1.executeQuery();
        } catch (SQLException ex) {
            Logger.getLogger(JFrameMain.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;
    }
    
    
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
    private javax.swing.JButton jButtonPayment2;
    private javax.swing.JButton jButtonSwitchTable;
    public javax.swing.JComboBox jComboBoxChangeTable;
    private javax.swing.JComboBox jComboBoxFood;
    public javax.swing.JComboBox jComboBoxFoodCategory;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    public javax.swing.JLabel jLabelCurrentUserName;
    private javax.swing.JLabel jLabelTableID;
    private javax.swing.JLabel jLabelTableName;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanelProgramName;
    private javax.swing.JPanel jPanelShowTableFood;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner jSpinnerCountFoodAdded;
    private javax.swing.JSpinner jSpinnerTotalPrice;
    private javax.swing.JTabbedPane jTabbedPane5;
    private javax.swing.JTable jTableTableInfo;
    private javax.swing.JTextField jTextFieldTableID;
    private javax.swing.JTextField jTextFieldTableName;
    private javax.swing.JTextField jTextFieldTableName1;
    // End of variables declaration//GEN-END:variables

    void dipose() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

package qlsv;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Home extends javax.swing.JFrame {
    
    private final Connection cn = ConnectDB.SQLConnect();
    private PreparedStatement ps = null;
    private ResultSet rs = null;
    boolean stateInsert, stateEdit;
        
    public Home() {
        initComponents();
        initTextField(false,false,true);
        showStaffList();
    }
    
    private void initTextField(boolean state, boolean enableTxtManv, boolean clearTxt){
        txtStaffCode.setEnabled(enableTxtManv);
        txtName.setEnabled(state);
        txtEmail.setEnabled(state);
        txtSalary.setEnabled(state);
        txtUsn.setEnabled(state);                
        txtPass.setEnabled(state);
        if(clearTxt == true){
            txtStaffCode.setText(null);
            txtName.setText(null);
            txtEmail.setText(null);
            txtSalary.setText(null);
            txtUsn.setText(null);          
            txtPass.setText(null);
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpnHeader = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jpnInfo = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtStaffCode = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtUsn = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtSalary = new javax.swing.JTextField();
        txtPass = new javax.swing.JPasswordField();
        jpnTable = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtbStaff = new javax.swing.JTable();
        jpnProcesses = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        btnExit = new javax.swing.JButton();
        btnDel = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        btnStop = new javax.swing.JButton();
        btnInsert = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Danh sach nhan vien");
        setPreferredSize(new java.awt.Dimension(1080, 720));

        jpnHeader.setBackground(new java.awt.Color(252, 251, 251));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("DANH MỤC NHÂN VIÊN");

        javax.swing.GroupLayout jpnHeaderLayout = new javax.swing.GroupLayout(jpnHeader);
        jpnHeader.setLayout(jpnHeaderLayout);
        jpnHeaderLayout.setHorizontalGroup(
            jpnHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jpnHeaderLayout.setVerticalGroup(
            jpnHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE)
        );

        jpnInfo.setBackground(new java.awt.Color(250, 250, 250));
        jpnInfo.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Thông tin nhân viên", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 13), new java.awt.Color(0, 102, 255))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Mã nhân viên");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Email");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Tên đăng nhập");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Họ tên");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Lương");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Mật khẩu");

        txtSalary.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                inputLuong(evt);
            }
        });

        javax.swing.GroupLayout jpnInfoLayout = new javax.swing.GroupLayout(jpnInfo);
        jpnInfo.setLayout(jpnInfoLayout);
        jpnInfoLayout.setHorizontalGroup(
            jpnInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnInfoLayout.createSequentialGroup()
                .addGap(94, 94, 94)
                .addGroup(jpnInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(59, 59, 59)
                .addGroup(jpnInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtStaffCode, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtUsn, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(156, 156, 156)
                .addGroup(jpnInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpnInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel5)
                        .addComponent(jLabel6))
                    .addGroup(jpnInfoLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jLabel7)))
                .addGap(60, 60, 60)
                .addGroup(jpnInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtSalary, javax.swing.GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE)
                    .addComponent(txtName, javax.swing.GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE)
                    .addComponent(txtPass, javax.swing.GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpnInfoLayout.setVerticalGroup(
            jpnInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnInfoLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jpnInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtStaffCode, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jpnInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSalary, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(jpnInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUsn, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPass, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31))
        );

        jpnTable.setBackground(new java.awt.Color(250, 250, 250));

        jScrollPane1.setBackground(new java.awt.Color(250, 250, 250));

        jtbStaff.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "MÃ NHÂN VIÊN", "HỌ TÊN", "EMAIL", "LƯƠNG"
            }
        ));
        jtbStaff.setGridColor(new java.awt.Color(240, 240, 240));
        jtbStaff.setRowHeight(25);
        jScrollPane1.setViewportView(jtbStaff);

        javax.swing.GroupLayout jpnTableLayout = new javax.swing.GroupLayout(jpnTable);
        jpnTable.setLayout(jpnTableLayout);
        jpnTableLayout.setHorizontalGroup(
            jpnTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jpnTableLayout.setVerticalGroup(
            jpnTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 378, Short.MAX_VALUE)
        );

        jPanel4.setBackground(new java.awt.Color(250, 250, 250));

        btnExit.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnExit.setText("Thoát");
        btnExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ExitMouseClick(evt);
            }
        });

        btnDel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnDel.setText("Xóa");
        btnDel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DeleteStaffMouseClick(evt);
            }
        });

        btnEdit.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnEdit.setText("Sửa");
        btnEdit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EditStaffMouseClick(evt);
            }
        });

        btnSave.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnSave.setText("Ghi/Lưu");
        btnSave.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SaveStaffMouseClick(evt);
            }
        });

        btnStop.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnStop.setText("Không");
        btnStop.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                StopMouseClick(evt);
            }
        });

        btnInsert.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnInsert.setText("Thêm");
        btnInsert.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                InsertStaffMouseClick(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(117, 117, 117)
                .addComponent(btnInsert, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62)
                .addComponent(btnDel, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58)
                .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addComponent(btnStop, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58)
                .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(122, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(41, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnExit)
                    .addComponent(btnEdit)
                    .addComponent(btnSave)
                    .addComponent(btnStop)
                    .addComponent(btnDel)
                    .addComponent(btnInsert))
                .addGap(33, 33, 33))
        );

        javax.swing.GroupLayout jpnProcessesLayout = new javax.swing.GroupLayout(jpnProcesses);
        jpnProcesses.setLayout(jpnProcessesLayout);
        jpnProcessesLayout.setHorizontalGroup(
            jpnProcessesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jpnProcessesLayout.setVerticalGroup(
            jpnProcessesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnProcessesLayout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpnHeader, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jpnInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jpnTable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jpnProcesses, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jpnHeader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jpnInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jpnTable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(jpnProcesses, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void InsertStaffMouseClick(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_InsertStaffMouseClick
        stateInsert = true; stateEdit = false;
        initTextField(true,true,true);           
    }//GEN-LAST:event_InsertStaffMouseClick

    private void StopMouseClick(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_StopMouseClick
        dispose();
        Home another = new Home();
        another.setVisible(true);
    }//GEN-LAST:event_StopMouseClick

    private void ExitMouseClick(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitMouseClick
        System.exit(0);
    }//GEN-LAST:event_ExitMouseClick

    private void SaveStaffMouseClick(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SaveStaffMouseClick
        if(checkEmpty() == false){
            JOptionPane.showMessageDialog(rootPane, "Vui lòng chọn 'Thêm' hoặc 'Xóa' và nhập đầy đủ thông tin\nở phần 'Thông tin nhân viên'!");
        }else{
            if(stateEdit == true){
                String query = "EXEC SP_EDIT_ENCRYPT_NHANVIEN '" +
                    txtStaffCode.getText() + "','" + txtName.getText() + "','" + txtEmail.getText() + "','" +
                    AES.AES_Encrypt(txtSalary.getText()) + "','" + txtUsn.getText() + "','" + txtPass.getText() + "'";
                try{
                    ps = cn.prepareStatement(query);
                    rs = ps.executeQuery();            
                }catch(SQLException e){
                    System.out.println(e.getMessage());
                }
                initTextField(false, false, true);
            }
            if(stateInsert == true){
                if(checkStaffCodeIfExisted(txtStaffCode.getText()) == true){
                    JOptionPane.showMessageDialog(rootPane, "Mã Nhân viên này đã tồn tại! Vui lòng nhập một Mã Nhân viên mới!");
                    initTextField(true, true, false);
                }else{
                    String query = "EXEC SP_INS_ENCRYPT_NHANVIEN '" +
                                    txtStaffCode.getText() + "','" + txtName.getText() + "','" + txtEmail.getText() + "','" +
                                    AES.AES_Encrypt(txtSalary.getText()) + "','" + txtUsn.getText() + "','" + txtPass.getText() + "'";
                    try{
                        ps = cn.prepareStatement(query);
                        rs = ps.executeQuery();            
                    }catch(SQLException e){
                        System.out.println(e.getMessage());
                    }
                    initTextField(false, false, true);
                }                
            }
            showStaffList();            
        }
    }//GEN-LAST:event_SaveStaffMouseClick

    private void inputLuong(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_inputLuong
        char c = evt.getKeyChar();
        if (((c >= '0') && (c <= '9')) || c == '\b') {
            txtSalary.setEditable(true);
        }else txtSalary.setEditable(false);
    }//GEN-LAST:event_inputLuong

    private void DeleteStaffMouseClick(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeleteStaffMouseClick
        initTextField(false,false,true);        
        if(jtbStaff.getSelectedRow() < 0){
            JOptionPane.showMessageDialog(rootPane, "Vui lòng chọn nhân viên cần xóa!");
        }else{            
            if(confirmDialog("Xác nhận xóa nhân viên này?", "Confirm Delete") == 0){
                DefaultTableModel model = (DefaultTableModel)jtbStaff.getModel();
                String s = (String) model.getValueAt(jtbStaff.getSelectedRow(), 0);
                String query = "DELETE FROM NHANVIEN WHERE MANV = '" + s + "'";
                try{
                    ps = cn.prepareStatement(query);
                    rs = ps.executeQuery();
                    JOptionPane.showMessageDialog(rootPane, "Đã XÓA Nhân Viên THÀNH CÔNG.");
                }catch(SQLException e){
                    System.out.println(e.getMessage());
                }
                showStaffList();
            }                        
        }
    }//GEN-LAST:event_DeleteStaffMouseClick

    private void EditStaffMouseClick(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EditStaffMouseClick
        stateEdit = true; stateInsert = false;
        if(jtbStaff.getSelectedRow() < 0){
            JOptionPane.showMessageDialog(rootPane, "Vui lòng chọn nhân viên cần Chỉnh sửa!");
        }else{
            initTextField(true,false,true);
            DefaultTableModel model = (DefaultTableModel)jtbStaff.getModel();
            String s = (String) model.getValueAt(jtbStaff.getSelectedRow(), 0);
            
            String query = "SELECT * FROM NHANVIEN WHERE MANV = '" + s + "'";
            try{
                ps = cn.prepareStatement(query);
                rs = ps.executeQuery();
                if(rs.next()){
                    txtStaffCode.setText(rs.getString("MANV"));
                    txtName.setText(rs.getString("HOTEN"));
                    txtEmail.setText(rs.getString("EMAIL"));
                    txtUsn.setText(rs.getString("TENDN"));
                    txtPass.setText(rs.getString("MATKHAU"));
                }
                txtSalary.setText((String) model.getValueAt(jtbStaff.getSelectedRow(), 3));
            }catch(SQLException e){
                System.out.println(e.getMessage());
            }
        }                
    }//GEN-LAST:event_EditStaffMouseClick
        
    
    public ArrayList<Staff> getStaffList(){
        ArrayList<Staff> staffList = new ArrayList<>();
        String query = "EXEC SP_SEL_ENCRYPT_NHANVIEN";
        try{
            ps = cn.prepareStatement(query);
            rs = ps.executeQuery();
            Staff staff;
            while(rs.next()){
                staff = new Staff(rs.getString("MANV"), rs.getString("HOTEN"), rs.getString("EMAIL"), AES.AES_Decrypt(rs.getString("LUONG")));
                staffList.add(staff);
            }
        }catch(SQLException e){
            System.out.println("Loi table LOP");
            System.out.println(e.getMessage());
        }
        return staffList;
    }
    private void showStaffList(){
        ArrayList<Staff> staffList = getStaffList();
        jtbStaff.setModel(new DefaultTableModel(null, new String[]{"MÃ NHÂN VIÊN","HỌ TÊN","EMAIL","LƯƠNG"}));
        DefaultTableModel model = (DefaultTableModel)jtbStaff.getModel();
        Object[] row = new Object[4];
        for(int i=0;i<staffList.size();i++){
            row[0] = staffList.get(i).getStaffCode();
            row[1] = staffList.get(i).getFullName();
            row[2] = staffList.get(i).getEmail();
            row[3] = staffList.get(i).getSalary();
            model.addRow(row);
        }
    }
    
    private boolean checkEmpty(){
        return !(txtStaffCode.getText().equals("") || txtName.getText().equals("") || txtEmail.getText().equals("") || txtSalary.getText().equals("") || txtUsn.getText().equals("") || txtPass.getText().equals(""));
    }
    
    public int confirmDialog(String str, String title){
        String[] options = {"Yes", "No"};
        int x = JOptionPane.showOptionDialog(rootPane, str, title,
                                                JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
        return x;
    }
    
    public boolean checkStaffCodeIfExisted(String staffCode){
        String query = "SELECT MANV FROM NHANVIEN WHERE MANV = '" + staffCode + "'";
        try{
            ps = cn.prepareStatement(query);
            rs = ps.executeQuery();
            if(rs.next()) return true;
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
        return false;
    }
    
  
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDel;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnInsert;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnStop;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel jpnHeader;
    private javax.swing.JPanel jpnInfo;
    private javax.swing.JPanel jpnProcesses;
    private javax.swing.JPanel jpnTable;
    private javax.swing.JTable jtbStaff;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtName;
    private javax.swing.JPasswordField txtPass;
    private javax.swing.JTextField txtSalary;
    private javax.swing.JTextField txtStaffCode;
    private javax.swing.JTextField txtUsn;
    // End of variables declaration//GEN-END:variables
}

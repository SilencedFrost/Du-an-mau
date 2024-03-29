/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UI;

import Utils.Tools;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.JDialog;
import javax.swing.Timer;

/**
 *
 * @author thnrg
 */
public class MainMenu extends javax.swing.JFrame {
    protected String sessionID;
    /**
     * Creates new form MainMenu
     */
    public MainMenu() {
        initComponents();
        OnRun();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        imgGoldenBee = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lblStatus = new javax.swing.JLabel();
        lblClock = new javax.swing.JLabel();
        jToolBar1 = new javax.swing.JToolBar();
        btnDangXuat = new javax.swing.JButton();
        btnKetThuc = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JToolBar.Separator();
        btnChuyenDe = new javax.swing.JButton();
        btnNguoiHoc = new javax.swing.JButton();
        btnKhoaHoc = new javax.swing.JButton();
        btnHocVien = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JToolBar.Separator();
        btnHuongDan = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        btnMenuDangNhap = new javax.swing.JMenuItem();
        btnMenuDangXuat = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        btnMenuDoiMatKhau = new javax.swing.JMenuItem();
        jSeparator4 = new javax.swing.JPopupMenu.Separator();
        btnMenuKetThuc = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        menuQLChuyenDe = new javax.swing.JMenuItem();
        menuQLKhoaHoc = new javax.swing.JMenuItem();
        menuQLNguoiHoc = new javax.swing.JMenuItem();
        menuQLHocVien = new javax.swing.JMenuItem();
        jSeparator5 = new javax.swing.JPopupMenu.Separator();
        menuQLNhanVien = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        btnMenuTKBangDiem = new javax.swing.JMenuItem();
        btnTKLuongNguoiHoc = new javax.swing.JMenuItem();
        btnTKDiemChuyenDe = new javax.swing.JMenuItem();
        btnTKDoanhThu = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("EduSys");
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        lblStatus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Info.png"))); // NOI18N
        lblStatus.setText("Hệ quản lý đào tạo");

        lblClock.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Clock.png"))); // NOI18N
        lblClock.setText("00:00;00");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblClock)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(lblStatus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblClock))
        );

        jToolBar1.setBackground(new java.awt.Color(204, 204, 204));
        jToolBar1.setRollover(true);

        btnDangXuat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Log out.png"))); // NOI18N
        btnDangXuat.setText("Đăng xuất");
        btnDangXuat.setFocusable(false);
        btnDangXuat.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnDangXuat.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnDangXuat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDangXuatActionPerformed(evt);
            }
        });
        jToolBar1.add(btnDangXuat);

        btnKetThuc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Stop.png"))); // NOI18N
        btnKetThuc.setText("Kết thúc");
        btnKetThuc.setFocusable(false);
        btnKetThuc.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnKetThuc.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnKetThuc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKetThucActionPerformed(evt);
            }
        });
        jToolBar1.add(btnKetThuc);
        jToolBar1.add(jSeparator1);

        btnChuyenDe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Lists.png"))); // NOI18N
        btnChuyenDe.setText("Chuyên đề");
        btnChuyenDe.setFocusable(false);
        btnChuyenDe.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnChuyenDe.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnChuyenDe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChuyenDeActionPerformed(evt);
            }
        });
        jToolBar1.add(btnChuyenDe);

        btnNguoiHoc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Conference.png"))); // NOI18N
        btnNguoiHoc.setText("Người học");
        btnNguoiHoc.setFocusable(false);
        btnNguoiHoc.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnNguoiHoc.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnNguoiHoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNguoiHocActionPerformed(evt);
            }
        });
        jToolBar1.add(btnNguoiHoc);

        btnKhoaHoc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Certificate.png"))); // NOI18N
        btnKhoaHoc.setText("Khóa học");
        btnKhoaHoc.setFocusable(false);
        btnKhoaHoc.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnKhoaHoc.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnKhoaHoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKhoaHocActionPerformed(evt);
            }
        });
        jToolBar1.add(btnKhoaHoc);

        btnHocVien.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/User.png"))); // NOI18N
        btnHocVien.setText("Học viên");
        btnHocVien.setFocusable(false);
        btnHocVien.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnHocVien.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnHocVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHocVienActionPerformed(evt);
            }
        });
        jToolBar1.add(btnHocVien);
        jToolBar1.add(jSeparator2);

        btnHuongDan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Globe.png"))); // NOI18N
        btnHuongDan.setText("Hướng dẫn");
        btnHuongDan.setFocusable(false);
        btnHuongDan.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnHuongDan.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(btnHuongDan);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, 634, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(221, 221, 221)
                .addComponent(imgGoldenBee, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(imgGoldenBee, javax.swing.GroupLayout.DEFAULT_SIZE, 297, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jMenu1.setText("Hệ thống");

        btnMenuDangNhap.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        btnMenuDangNhap.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Key.png"))); // NOI18N
        btnMenuDangNhap.setText("Đăng nhập");
        btnMenuDangNhap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuDangNhapActionPerformed(evt);
            }
        });
        jMenu1.add(btnMenuDangNhap);

        btnMenuDangXuat.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        btnMenuDangXuat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Exit.png"))); // NOI18N
        btnMenuDangXuat.setText("Đăng xuất");
        btnMenuDangXuat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuDangXuatActionPerformed(evt);
            }
        });
        jMenu1.add(btnMenuDangXuat);
        jMenu1.add(jSeparator3);

        btnMenuDoiMatKhau.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Refresh.png"))); // NOI18N
        btnMenuDoiMatKhau.setText("Đổi mật khẩu");
        btnMenuDoiMatKhau.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuDoiMatKhauActionPerformed(evt);
            }
        });
        jMenu1.add(btnMenuDoiMatKhau);
        jMenu1.add(jSeparator4);

        btnMenuKetThuc.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F10, 0));
        btnMenuKetThuc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Stop.png"))); // NOI18N
        btnMenuKetThuc.setText("Kết thúc");
        btnMenuKetThuc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuKetThucActionPerformed(evt);
            }
        });
        jMenu1.add(btnMenuKetThuc);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Quản lý");

        menuQLChuyenDe.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        menuQLChuyenDe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Lists.png"))); // NOI18N
        menuQLChuyenDe.setText("Chuyên đề");
        menuQLChuyenDe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuQLChuyenDeActionPerformed(evt);
            }
        });
        jMenu2.add(menuQLChuyenDe);

        menuQLKhoaHoc.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F2, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        menuQLKhoaHoc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Certificate.png"))); // NOI18N
        menuQLKhoaHoc.setText("Khóa học");
        menuQLKhoaHoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuQLKhoaHocActionPerformed(evt);
            }
        });
        jMenu2.add(menuQLKhoaHoc);

        menuQLNguoiHoc.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F3, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        menuQLNguoiHoc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Conference.png"))); // NOI18N
        menuQLNguoiHoc.setText("Người học");
        menuQLNguoiHoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuQLNguoiHocActionPerformed(evt);
            }
        });
        jMenu2.add(menuQLNguoiHoc);

        menuQLHocVien.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        menuQLHocVien.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/User.png"))); // NOI18N
        menuQLHocVien.setText("Học viên");
        menuQLHocVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuQLHocVienActionPerformed(evt);
            }
        });
        jMenu2.add(menuQLHocVien);
        jMenu2.add(jSeparator5);

        menuQLNhanVien.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F5, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        menuQLNhanVien.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Users.png"))); // NOI18N
        menuQLNhanVien.setText("Nhân viên");
        menuQLNhanVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuQLNhanVienActionPerformed(evt);
            }
        });
        jMenu2.add(menuQLNhanVien);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Thống kê");

        btnMenuTKBangDiem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, java.awt.event.InputEvent.SHIFT_DOWN_MASK));
        btnMenuTKBangDiem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Card file.png"))); // NOI18N
        btnMenuTKBangDiem.setText("Bảng điểm");
        btnMenuTKBangDiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuTKBangDiemActionPerformed(evt);
            }
        });
        jMenu3.add(btnMenuTKBangDiem);

        btnTKLuongNguoiHoc.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F2, java.awt.event.InputEvent.SHIFT_DOWN_MASK));
        btnTKLuongNguoiHoc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Clien list.png"))); // NOI18N
        btnTKLuongNguoiHoc.setText("Lượng người học");
        btnTKLuongNguoiHoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTKLuongNguoiHocActionPerformed(evt);
            }
        });
        jMenu3.add(btnTKLuongNguoiHoc);

        btnTKDiemChuyenDe.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F3, java.awt.event.InputEvent.SHIFT_DOWN_MASK));
        btnTKDiemChuyenDe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Bar chart.png"))); // NOI18N
        btnTKDiemChuyenDe.setText("Điểm chuyên đề");
        btnTKDiemChuyenDe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTKDiemChuyenDeActionPerformed(evt);
            }
        });
        jMenu3.add(btnTKDiemChuyenDe);

        btnTKDoanhThu.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.SHIFT_DOWN_MASK));
        btnTKDoanhThu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Dollar.png"))); // NOI18N
        btnTKDoanhThu.setText("Doanh thu");
        btnTKDoanhThu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTKDoanhThuActionPerformed(evt);
            }
        });
        jMenu3.add(btnTKDoanhThu);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("Trợ giúp");

        jMenuItem4.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, 0));
        jMenuItem4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Globe.png"))); // NOI18N
        jMenuItem4.setText("Hướng dẫn sử dụng");
        jMenu4.add(jMenuItem4);

        jMenuItem6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Brick house.png"))); // NOI18N
        jMenuItem6.setText("Giới thiệu sản phẩm");
        jMenu4.add(jMenuItem6);

        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDangXuatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDangXuatActionPerformed
        new Login().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnDangXuatActionPerformed

    private void btnHocVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHocVienActionPerformed
        new ManageStudents(this, true).setVisible(true);
    }//GEN-LAST:event_btnHocVienActionPerformed

    private void btnKhoaHocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKhoaHocActionPerformed
        new ManageCourse(this, true).setVisible(true);
    }//GEN-LAST:event_btnKhoaHocActionPerformed

    private void btnNguoiHocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNguoiHocActionPerformed
        new ManageLearners(this, true).setVisible(true);
    }//GEN-LAST:event_btnNguoiHocActionPerformed

    private void btnChuyenDeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChuyenDeActionPerformed
        new ManageSubjects(this, true).setVisible(true);
    }//GEN-LAST:event_btnChuyenDeActionPerformed

    private void btnKetThucActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKetThucActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnKetThucActionPerformed

    private void btnTKDiemChuyenDeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTKDiemChuyenDeActionPerformed
        var stats = new Statistics(this, true);
        stats.OpenDiemChuyenDeTab();
        stats.setVisible(true);
    }//GEN-LAST:event_btnTKDiemChuyenDeActionPerformed

    private void btnMenuTKBangDiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuTKBangDiemActionPerformed
        var stats = new Statistics(this, true);
        stats.OpenBangDiemTab();
        stats.setVisible(true);
    }//GEN-LAST:event_btnMenuTKBangDiemActionPerformed

    private void btnTKLuongNguoiHocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTKLuongNguoiHocActionPerformed
        var stats = new Statistics(this, true);
        stats.OpenNguoiHocTab();
        stats.setVisible(true);
    }//GEN-LAST:event_btnTKLuongNguoiHocActionPerformed

    private void btnTKDoanhThuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTKDoanhThuActionPerformed
        var stats = new Statistics(this, true);
        stats.OpenDoanhThuTab();
        stats.setVisible(true);
    }//GEN-LAST:event_btnTKDoanhThuActionPerformed

    private void btnMenuDoiMatKhauActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuDoiMatKhauActionPerformed
        var changepass =  new ChangePass(this, true);
        changepass.setSession(sessionID);
        changepass.setVisible(true);
    }//GEN-LAST:event_btnMenuDoiMatKhauActionPerformed

    private void btnMenuKetThucActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuKetThucActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnMenuKetThucActionPerformed

    private void btnMenuDangXuatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuDangXuatActionPerformed
        new Login().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnMenuDangXuatActionPerformed

    private void btnMenuDangNhapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuDangNhapActionPerformed
        new LoginDialog(this, true).setVisible(true);
    }//GEN-LAST:event_btnMenuDangNhapActionPerformed

    private void menuQLNguoiHocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuQLNguoiHocActionPerformed
        new ManageLearners(this, true).setVisible(true);
    }//GEN-LAST:event_menuQLNguoiHocActionPerformed

    private void menuQLNhanVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuQLNhanVienActionPerformed
        new ManageEmployee(this, true).setVisible(true);
    }//GEN-LAST:event_menuQLNhanVienActionPerformed

    private void menuQLHocVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuQLHocVienActionPerformed
        new ManageStudents(this, true).setVisible(true);
    }//GEN-LAST:event_menuQLHocVienActionPerformed

    private void menuQLChuyenDeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuQLChuyenDeActionPerformed
        new ManageSubjects(this, true).setVisible(true);
    }//GEN-LAST:event_menuQLChuyenDeActionPerformed

    private void menuQLKhoaHocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuQLKhoaHocActionPerformed
        new ManageCourse(this, true).setVisible(true);
    }//GEN-LAST:event_menuQLKhoaHocActionPerformed

    public void LoginAs(String loginID)
    {
        sessionID = loginID;
        System.out.println("Logged in as " + sessionID);
    }
    
    private void OnRun()
    {
        Tools.SetFrameToCenter(this);
        Tools.SetIcon(imgGoldenBee, "src/Images/ongvang.png");
        
        // Đồng hồ
        ActionListener updateClockAction = (ActionEvent e) -> {
            lblClock.setText(ZonedDateTime.now(ZoneId.of("Asia/Saigon")).format(DateTimeFormatter.ofPattern("HH:mm:ss")));
        };
        
        //Action event
        Timer t = new Timer(1000, updateClockAction);
        t.start();
    }
    
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
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnChuyenDe;
    private javax.swing.JButton btnDangXuat;
    private javax.swing.JButton btnHocVien;
    private javax.swing.JButton btnHuongDan;
    private javax.swing.JButton btnKetThuc;
    private javax.swing.JButton btnKhoaHoc;
    private javax.swing.JMenuItem btnMenuDangNhap;
    private javax.swing.JMenuItem btnMenuDangXuat;
    private javax.swing.JMenuItem btnMenuDoiMatKhau;
    private javax.swing.JMenuItem btnMenuKetThuc;
    private javax.swing.JMenuItem btnMenuTKBangDiem;
    private javax.swing.JButton btnNguoiHoc;
    private javax.swing.JMenuItem btnTKDiemChuyenDe;
    private javax.swing.JMenuItem btnTKDoanhThu;
    private javax.swing.JMenuItem btnTKLuongNguoiHoc;
    private javax.swing.JLabel imgGoldenBee;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JToolBar.Separator jSeparator1;
    private javax.swing.JToolBar.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JPopupMenu.Separator jSeparator4;
    private javax.swing.JPopupMenu.Separator jSeparator5;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JLabel lblClock;
    private javax.swing.JLabel lblStatus;
    private javax.swing.JMenuItem menuQLChuyenDe;
    private javax.swing.JMenuItem menuQLHocVien;
    private javax.swing.JMenuItem menuQLKhoaHoc;
    private javax.swing.JMenuItem menuQLNguoiHoc;
    private javax.swing.JMenuItem menuQLNhanVien;
    // End of variables declaration//GEN-END:variables
}

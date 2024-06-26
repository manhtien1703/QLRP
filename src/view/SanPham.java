/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.*;
import javax.swing.ImageIcon;
import javax.swing.JLabel;


/**
 *
 * @author Windows 10
 */
public class SanPham extends javax.swing.JFrame {

    /**
     * Creates new form SanPham
     */
    public SanPham() {
        initComponents();
        this.setLocationRelativeTo(null);//hiển thị giữa màn hình
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);//thoát chương trình khi bấm exit
        this.setVisible(true);
        String anh1 = "src\\Anh_SanPham\\BapBo.jpg";
        String anh2 = "src\\Anh_SanPham\\BapRangBo_1.jpg";
        String anh3 = "src\\Anh_SanPham\\bapphomai.jpg"; 
        String anh4 = "src\\Anh_SanPham\\Coca.jpg"; //ảnh coca
        String anh5 = "src\\Anh_SanPham\\Coca.jpg"; //ảnh coca
        String anh7 = "src\\Anh_SanPham\\pepsilon.jpg"; //ảnh pepsi
        String anh6 = "src\\Anh_SanPham\\pepsilon.jpg"; //ảnh pepsi
        scaleIMG(anh1,picture1);
        scaleIMG(anh2,picture2);
        scaleIMG(anh3,picture3);
        scaleIMG(anh4,picture4);
        scaleIMG(anh5,picture5);
        scaleIMG(anh6,picture6);
        scaleIMG(anh7,picture7);
        
    }
    
    public void scaleIMG(String linkanhString, JLabel lbLabel){
        ImageIcon icon = new ImageIcon(linkanhString);
        
        Image img = icon.getImage();
        Image imgScale = img.getScaledInstance(lbLabel.getWidth(), lbLabel.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaleIcon = new ImageIcon(imgScale);
        lbLabel.setIcon(scaleIcon);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        jPanel12 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        panel_exit = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        panel_dong = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        sll_baprang = new javax.swing.JSpinner();
        picture1 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        sl_baprangbo = new javax.swing.JSpinner();
        picture2 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        sl_bapphomai = new javax.swing.JSpinner();
        picture3 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        sl_cocal = new javax.swing.JSpinner();
        picture5 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        picture4 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        sl_cocas = new javax.swing.JSpinner();
        jPanel11 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        sl_pepsis = new javax.swing.JSpinner();
        picture6 = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        sl_pepsil = new javax.swing.JSpinner();
        picture7 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        SP_ThanhToan = new javax.swing.JButton();
        SP_sum = new javax.swing.JLabel();
        SP_Back = new javax.swing.JButton();

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        jPanel12.setBackground(new java.awt.Color(51, 51, 51));

        jLabel23.setBackground(new java.awt.Color(0, 0, 0));
        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setText("SẢN PHẨM (ĂN & UỐNG)");
        jLabel23.setToolTipText("");

        panel_exit.setBackground(new java.awt.Color(51, 51, 51));
        panel_exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panel_exitMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panel_exitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                panel_exitMouseExited(evt);
            }
        });
        panel_exit.setLayout(null);

        jLabel24.setFont(new java.awt.Font("Dubai Medium", 1, 24)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel24.setText("X");
        panel_exit.add(jLabel24);
        jLabel24.setBounds(0, 10, 30, 20);

        panel_dong.setBackground(new java.awt.Color(51, 51, 51));
        panel_dong.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panel_dongMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panel_dongMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                panel_dongMouseExited(evt);
            }
        });

        jLabel25.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel25.setText("_");
        jLabel25.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        javax.swing.GroupLayout panel_dongLayout = new javax.swing.GroupLayout(panel_dong);
        panel_dong.setLayout(panel_dongLayout);
        panel_dongLayout.setHorizontalGroup(
            panel_dongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_dongLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(42, 42, 42))
        );
        panel_dongLayout.setVerticalGroup(
            panel_dongLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_dongLayout.createSequentialGroup()
                .addComponent(jLabel25)
                .addGap(0, 6, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap(279, Short.MAX_VALUE)
                .addComponent(jLabel23)
                .addGap(189, 189, 189)
                .addComponent(panel_dong, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(panel_exit, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(panel_dong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(panel_exit, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(153, 153, 153));
        jPanel5.setForeground(new java.awt.Color(153, 153, 153));

        jPanel6.setBackground(new java.awt.Color(51, 51, 51));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Bắp rang (45.000đ)");
        jLabel1.setToolTipText("");
        jPanel6.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, -1, 26));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Số lượng");
        jPanel6.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 230, 100, -1));

        sll_baprang.setModel(new javax.swing.SpinnerNumberModel(0, 0, 60, 1));
        sll_baprang.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        sll_baprang.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sll_baprangStateChanged(evt);
            }
        });
        jPanel6.add(sll_baprang, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 230, 50, -1));
        jPanel6.add(picture1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 48, 288, 172));

        jPanel7.setBackground(new java.awt.Color(51, 51, 51));
        jPanel7.setPreferredSize(new java.awt.Dimension(293, 261));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Bắp rang bơ (55.000đ)");
        jLabel5.setToolTipText("");
        jPanel7.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(49, 11, -1, 26));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Số lượng");
        jPanel7.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 230, 90, -1));

        sl_baprangbo.setModel(new javax.swing.SpinnerNumberModel(0, 0, 60, 1));
        sl_baprangbo.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sl_baprangboStateChanged(evt);
            }
        });
        jPanel7.add(sl_baprangbo, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 230, 50, -1));
        jPanel7.add(picture2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 55, 280, 172));

        jPanel8.setBackground(new java.awt.Color(51, 51, 51));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Bắp phô mai (55.000đ)");
        jLabel8.setToolTipText("");
        jPanel8.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(54, 11, -1, 26));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Số lượng");
        jPanel8.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 230, 80, -1));

        sl_bapphomai.setModel(new javax.swing.SpinnerNumberModel(0, 0, 60, 1));
        sl_bapphomai.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sl_bapphomaiStateChanged(evt);
            }
        });
        jPanel8.add(sl_bapphomai, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 230, 50, -1));
        jPanel8.add(picture3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 288, 172));

        jPanel9.setBackground(new java.awt.Color(51, 51, 51));
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Coca L(40.000đ)");
        jLabel11.setToolTipText("");
        jPanel9.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, -1, 26));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Số lượng");
        jPanel9.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 230, 90, -1));

        sl_cocal.setModel(new javax.swing.SpinnerNumberModel(0, 0, 60, 1));
        sl_cocal.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sl_cocalStateChanged(evt);
            }
        });
        jPanel9.add(sl_cocal, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 230, 50, -1));
        jPanel9.add(picture5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 41, 260, 172));

        jPanel10.setBackground(new java.awt.Color(51, 51, 51));
        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel14.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("Coca S (25.000đ)");
        jLabel14.setToolTipText("");
        jPanel10.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, -1, 26));

        picture4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel10.add(picture4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 270, 172));

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("Số lượng");
        jPanel10.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 230, 90, -1));

        sl_cocas.setModel(new javax.swing.SpinnerNumberModel(0, 0, 60, 1));
        sl_cocas.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sl_cocasStateChanged(evt);
            }
        });
        jPanel10.add(sl_cocas, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 230, 50, -1));

        jPanel11.setBackground(new java.awt.Color(51, 51, 51));
        jPanel11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel17.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("Pepsi S(25.000đ)");
        jLabel17.setToolTipText("");
        jPanel11.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(76, 6, 167, 26));

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("Số lượng");
        jPanel11.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 230, 90, -1));

        sl_pepsis.setModel(new javax.swing.SpinnerNumberModel(0, 0, 60, 1));
        sl_pepsis.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sl_pepsisStateChanged(evt);
            }
        });
        jPanel11.add(sl_pepsis, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 230, 50, -1));
        jPanel11.add(picture6, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 43, 270, 172));

        jPanel13.setBackground(new java.awt.Color(51, 51, 51));

        jLabel20.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("Pepsi L(40.000đ)");
        jLabel20.setToolTipText("");

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setText("Số lượng");

        sl_pepsil.setModel(new javax.swing.SpinnerNumberModel(0, 0, 60, 1));
        sl_pepsil.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sl_pepsilStateChanged(evt);
            }
        });

        picture7.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(jLabel20)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(picture7, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel13Layout.createSequentialGroup()
                        .addGap(156, 156, 156)
                        .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(sl_pepsil, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(picture7, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(sl_pepsil))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, 298, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, 258, Short.MAX_VALUE)
                    .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(jPanel5);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Tổng cộng");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 97, -1));

        SP_ThanhToan.setBackground(new java.awt.Color(153, 153, 153));
        SP_ThanhToan.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        SP_ThanhToan.setForeground(new java.awt.Color(255, 255, 255));
        SP_ThanhToan.setText("Thanh toán");
        SP_ThanhToan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SP_ThanhToanActionPerformed(evt);
            }
        });
        jPanel1.add(SP_ThanhToan, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 0, 120, 40));

        SP_sum.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        SP_sum.setForeground(new java.awt.Color(255, 255, 255));
        SP_sum.setText("0");
        jPanel1.add(SP_sum, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, 97, 20));

        SP_Back.setBackground(new java.awt.Color(153, 153, 153));
        SP_Back.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        SP_Back.setForeground(new java.awt.Color(255, 255, 255));
        SP_Back.setText("Làm mới");
        SP_Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SP_BackActionPerformed(evt);
            }
        });
        jPanel1.add(SP_Back, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 0, 120, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 990, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 990, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 615, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void sll_baprangStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sll_baprangStateChanged
        // TODO add your handling code here:
        sp1 = 45000*((int)sll_baprang.getValue());
        HienThiTongTien();
    }//GEN-LAST:event_sll_baprangStateChanged

    private void SP_ThanhToanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SP_ThanhToanActionPerformed
        // TODO add your handling code here:
        tongtien = Integer.parseInt(SP_sum.getText());        
        ThanhToan_SP thanhtoan = new ThanhToan_SP();
    }//GEN-LAST:event_SP_ThanhToanActionPerformed

    private void sl_baprangboStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sl_baprangboStateChanged
        // TODO add your handling code here:
        sp2 = 55000*((int)sl_baprangbo.getValue());
        HienThiTongTien();
    }//GEN-LAST:event_sl_baprangboStateChanged

    private void sl_bapphomaiStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sl_bapphomaiStateChanged
        // TODO add your handling code here:
        sp3 = 55000*((int)sl_bapphomai.getValue());
        HienThiTongTien();
    }//GEN-LAST:event_sl_bapphomaiStateChanged

    private void sl_cocalStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sl_cocalStateChanged
        // TODO add your handling code here:
        sp5 = 40000*((int)sl_cocal.getValue());
        HienThiTongTien();
    }//GEN-LAST:event_sl_cocalStateChanged

    private void sl_cocasStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sl_cocasStateChanged
        // TODO add your handling code here:
        sp4 = 25000*((int)sl_cocas.getValue());
        HienThiTongTien();
    }//GEN-LAST:event_sl_cocasStateChanged

    private void sl_pepsisStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sl_pepsisStateChanged
        // TODO add your handling code here:
        sp6 = 25000*((int)sl_pepsis.getValue());
        HienThiTongTien();
    }//GEN-LAST:event_sl_pepsisStateChanged

    private void sl_pepsilStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sl_pepsilStateChanged
        // TODO add your handling code here:
        sp7 = 40000*((int)sl_pepsil.getValue());
        HienThiTongTien();
        
    }//GEN-LAST:event_sl_pepsilStateChanged

    private void SP_BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SP_BackActionPerformed
        // TODO add your handling code here:
        //this.dispose();
        /*
        new home.setVisible(true);
        */
        SP_sum.setText("0");
        sll_baprang.setValue(0);
        sl_baprangbo.setValue(0);
        sl_bapphomai.setValue(0);
        sl_cocal.setValue(0);
        sl_cocas.setValue(0);
        sl_pepsil.setValue(0);
        sl_pepsis.setValue(0);
    }//GEN-LAST:event_SP_BackActionPerformed

    private void panel_exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_exitMouseClicked
        this.dispose(); //tắt tab

    }//GEN-LAST:event_panel_exitMouseClicked

    private void panel_exitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_exitMouseEntered
        panel_exit.setBackground(new Color(162, 222, 208));
    }//GEN-LAST:event_panel_exitMouseEntered

    private void panel_exitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_exitMouseExited
        panel_exit.setBackground(new Color(244,249,248));
    }//GEN-LAST:event_panel_exitMouseExited

    private void panel_dongMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_dongMouseClicked
        this.setState(QLThanhVien.ICONIFIED);//đóng
    }//GEN-LAST:event_panel_dongMouseClicked

    private void panel_dongMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_dongMouseEntered
        panel_dong.setBackground(new Color(162, 222, 208));
    }//GEN-LAST:event_panel_dongMouseEntered

    private void panel_dongMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_dongMouseExited
        panel_dong.setBackground(new Color(244,249,248));
    }//GEN-LAST:event_panel_dongMouseExited

    private void HienThiTongTien(){
        int tongtien = sp1 + sp2 + sp3 + sp4 + sp5 + sp6 +sp7;
        SP_sum.setText(String.valueOf(tongtien));
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
            java.util.logging.Logger.getLogger(SanPham.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SanPham.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SanPham.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SanPham.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new SanPham().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton SP_Back;
    private javax.swing.JButton SP_ThanhToan;
    private javax.swing.JLabel SP_sum;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panel_dong;
    private javax.swing.JPanel panel_exit;
    private javax.swing.JLabel picture1;
    private javax.swing.JLabel picture2;
    private javax.swing.JLabel picture3;
    private javax.swing.JLabel picture4;
    private javax.swing.JLabel picture5;
    private javax.swing.JLabel picture6;
    private javax.swing.JLabel picture7;
    private javax.swing.JSpinner sl_bapphomai;
    private javax.swing.JSpinner sl_baprangbo;
    private javax.swing.JSpinner sl_cocal;
    private javax.swing.JSpinner sl_cocas;
    private javax.swing.JSpinner sl_pepsil;
    private javax.swing.JSpinner sl_pepsis;
    private javax.swing.JSpinner sll_baprang;
    // End of variables declaration//GEN-END:variables

        //SANPHAM
    public static int sp1=0;
    public static int sp2=0;
    public static int sp3=0;
    public static int sp4=0;
    public static int sp5=0;
    public static int sp6=0;
    public static int sp7=0;
    public static int tongtien=0;
    //
}

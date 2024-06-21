/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

//import Controller.LPhim_ctrl;

import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.MaKhuyenMai;
import controller.KhuyenMai_ctrl;

/**
 *
 * @author ASUS
 */
public class KhuyenMai extends javax.swing.JFrame {
    //LPhim_service lphim_service; // tạo 1 biến class Lphim_service
    KhuyenMai_ctrl gG_ctrl;
    DefaultTableModel defaultTableModel;
    /**
     * Creates new form LoaiPhim
     */
    public KhuyenMai() {
        initComponents();
        
        //lphim_service = new LPhim_service();
        gG_ctrl = new KhuyenMai_ctrl();
        //tạo 1 đối tương table
        defaultTableModel  = new DefaultTableModel(){
            @Override //ko cho phép chỉnh sửa trên bảng
            public boolean isCellEditable(int row, int column) {
               return false;
            }
        };
        //add các cột vào
        defaultTableModel.addColumn("MaKM");
        defaultTableModel.addColumn("TenKM");
        defaultTableModel.addColumn("TyLeKM");
        
        KM_table.setModel(defaultTableModel);
        
        
        ListAllKM(KhuyenMai_ctrl.getAllMaKhuyenMai());
       
    }
    
    private void ListAllKM(List<MaKhuyenMai> khuyenMais){
        for(MaKhuyenMai khuyenMai : khuyenMais){
            defaultTableModel.addRow(new Object[]{khuyenMai.getMaKM(), khuyenMai.getTenKM(), khuyenMai.getTyLeKM()});
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        tf_timkiem = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        KM_table = new javax.swing.JTable();
        bt_sualp = new javax.swing.JButton();
        bt_xoalp = new javax.swing.JButton();
        bt_themlp = new javax.swing.JButton();
        bt_tailai = new javax.swing.JButton();
        sidepane = new javax.swing.JPanel();
        btn_taikhoan = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btn_hoadon = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        btn_nhanvien = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        btn_dangxuaty = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        btn_khuyenmai = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        btn_baocao = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        bg1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tf_timkiem.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        tf_timkiem.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        tf_timkiem.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tf_timkiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_timkiemActionPerformed(evt);
            }
        });
        jPanel4.add(tf_timkiem, new org.netbeans.lib.awtextra.AbsoluteConstraints(238, 40, 342, 38));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Nhập thông tin tra cứu khuyến mãi:");
        jPanel4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 36, 224, 38));

        KM_table.setAutoCreateRowSorter(true);
        KM_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã Khuyến Mãi", "Tên Khuyến Mãi", "Tỷ lệ Khuyến Mãi"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        KM_table.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        KM_table.setSelectionBackground(new java.awt.Color(122, 72, 221));
        KM_table.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        KM_table.setShowGrid(true);
        KM_table.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(KM_table);

        jPanel4.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 84, 697, 284));

        bt_sualp.setBackground(new java.awt.Color(122, 72, 221));
        bt_sualp.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        bt_sualp.setForeground(new java.awt.Color(255, 255, 255));
        bt_sualp.setText("Sửa Khuyến Mãi");
        bt_sualp.setAlignmentX(0.5F);
        bt_sualp.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bt_sualp.setMaximumSize(new java.awt.Dimension(130, 30));
        bt_sualp.setMinimumSize(new java.awt.Dimension(130, 30));
        bt_sualp.setPreferredSize(new java.awt.Dimension(130, 30));
        bt_sualp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_sualpActionPerformed(evt);
            }
        });
        jPanel4.add(bt_sualp, new org.netbeans.lib.awtextra.AbsoluteConstraints(312, 379, 129, 52));

        bt_xoalp.setBackground(new java.awt.Color(122, 72, 221));
        bt_xoalp.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        bt_xoalp.setForeground(new java.awt.Color(255, 255, 255));
        bt_xoalp.setText("Xoá Khuyến Mãi");
        bt_xoalp.setAlignmentX(0.5F);
        bt_xoalp.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bt_xoalp.setPreferredSize(new java.awt.Dimension(130, 30));
        bt_xoalp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_xoalpActionPerformed(evt);
            }
        });
        jPanel4.add(bt_xoalp, new org.netbeans.lib.awtextra.AbsoluteConstraints(491, 380, -1, 50));

        bt_themlp.setBackground(new java.awt.Color(122, 72, 221));
        bt_themlp.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        bt_themlp.setForeground(new java.awt.Color(255, 255, 255));
        bt_themlp.setText("Thêm Khuyến Mãi");
        bt_themlp.setAlignmentX(0.5F);
        bt_themlp.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bt_themlp.setMaximumSize(new java.awt.Dimension(130, 30));
        bt_themlp.setMinimumSize(new java.awt.Dimension(130, 30));
        bt_themlp.setPreferredSize(new java.awt.Dimension(130, 30));
        bt_themlp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_themlpActionPerformed(evt);
            }
        });
        jPanel4.add(bt_themlp, new org.netbeans.lib.awtextra.AbsoluteConstraints(112, 380, 150, 50));

        bt_tailai.setBackground(new java.awt.Color(122, 72, 221));
        bt_tailai.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        bt_tailai.setForeground(new java.awt.Color(255, 255, 255));
        bt_tailai.setText("Tải Lại");
        bt_tailai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_tailaiActionPerformed(evt);
            }
        });
        jPanel4.add(bt_tailai, new org.netbeans.lib.awtextra.AbsoluteConstraints(634, 36, 73, 42));

        bg1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 106, 720, 450));

        sidepane.setBackground(new java.awt.Color(54, 33, 89));
        sidepane.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_taikhoan.setBackground(new java.awt.Color(85, 65, 118));
        btn_taikhoan.setForeground(new java.awt.Color(0, 153, 0));
        btn_taikhoan.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        btn_taikhoan.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 40, 30));

        jLabel4.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setText("Tài Khoản");
        btn_taikhoan.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, 160, 20));

        sidepane.add(btn_taikhoan, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 155, 220, 60));

        btn_hoadon.setBackground(new java.awt.Color(64, 43, 100));
        btn_hoadon.setForeground(new java.awt.Color(0, 153, 0));
        btn_hoadon.setPreferredSize(new java.awt.Dimension(210, 60));
        btn_hoadon.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        btn_hoadon.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 40, 30));

        jLabel16.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(204, 204, 204));
        jLabel16.setText("Hoá Đơn");
        btn_hoadon.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, 160, 20));

        sidepane.add(btn_hoadon, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 270, 220, 60));

        btn_nhanvien.setBackground(new java.awt.Color(64, 43, 100));
        btn_nhanvien.setForeground(new java.awt.Color(0, 153, 0));
        btn_nhanvien.setPreferredSize(new java.awt.Dimension(210, 60));
        btn_nhanvien.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        btn_nhanvien.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 40, 30));

        jLabel17.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(204, 204, 204));
        jLabel17.setText("Nhân Viên");
        btn_nhanvien.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, 160, 20));

        sidepane.add(btn_nhanvien, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 220, 60));

        btn_dangxuaty.setBackground(new java.awt.Color(64, 43, 100));
        btn_dangxuaty.setForeground(new java.awt.Color(0, 153, 0));
        btn_dangxuaty.setPreferredSize(new java.awt.Dimension(210, 60));
        btn_dangxuaty.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        btn_dangxuaty.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 40, 30));

        jLabel18.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(204, 204, 204));
        jLabel18.setText("Đăng Xuất");
        btn_dangxuaty.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, 160, 20));

        sidepane.add(btn_dangxuaty, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 440, 220, 60));

        btn_khuyenmai.setBackground(new java.awt.Color(64, 43, 100));
        btn_khuyenmai.setForeground(new java.awt.Color(0, 153, 0));
        btn_khuyenmai.setPreferredSize(new java.awt.Dimension(210, 60));
        btn_khuyenmai.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        btn_khuyenmai.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 40, 30));

        jLabel19.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(204, 204, 204));
        jLabel19.setText("Khuyến Mãi");
        btn_khuyenmai.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, 160, 20));

        sidepane.add(btn_khuyenmai, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 330, 220, 60));

        btn_baocao.setBackground(new java.awt.Color(64, 43, 100));
        btn_baocao.setForeground(new java.awt.Color(0, 153, 0));
        btn_baocao.setPreferredSize(new java.awt.Dimension(210, 60));
        btn_baocao.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        btn_baocao.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 40, 30));

        jLabel20.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(204, 204, 204));
        jLabel20.setText("Báo Cáo");
        btn_baocao.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, 160, 20));

        sidepane.add(btn_baocao, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 390, 220, 60));
        sidepane.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 40, 90, 80));

        bg1.add(sidepane, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 220, 542));

        jPanel1.setBackground(new java.awt.Color(122, 72, 221));

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(204, 204, 204));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("Quản Lý Khuyến Mãi");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 722, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE))
        );

        bg1.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 0, 717, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg1, javax.swing.GroupLayout.PREFERRED_SIZE, 541, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tf_timkiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_timkiemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_timkiemActionPerformed

    private void bt_tailaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_tailaiActionPerformed
        // TODO add your handling code here:
        defaultTableModel.setRowCount(0);
        MaKhuyenMai khuyenMai;
        //ListAllLP(lphim_service.getAllMaKhuyenMai());
        
        if(tf_timkiem.getText().equals("")){
            ListAllKM(KhuyenMai_ctrl.getAllMaKhuyenMai());
        }
        else {
            khuyenMai = gG_ctrl.getKM(tf_timkiem.getText());
            if(khuyenMai != null){
                defaultTableModel.addRow(new Object[]{khuyenMai.getMaKM(),khuyenMai.getTenKM(),khuyenMai.getTyLeKM()});
            }
            else JOptionPane.showMessageDialog(this,"Khong tim thay!");
        }
    }//GEN-LAST:event_bt_tailaiActionPerformed

    private void bt_themlpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_themlpActionPerformed
        // TODO add your handling code here:
        new ThemmoiKM().setVisible(true); //chuyển sang frame thêm mới loại phim
        this.dispose(); //ẩn frame loại phim đi
    }//GEN-LAST:event_bt_themlpActionPerformed

    private void bt_xoalpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_xoalpActionPerformed
        // TODO add your handling code here:
        KhuyenMai_ctrl maGG_ctrl = new KhuyenMai_ctrl();
        int row = KM_table.getSelectedRow();
        if(row == -1){
            JOptionPane.showMessageDialog(null, "Vui long chon loai phim can xoa", "Loi",JOptionPane.ERROR_MESSAGE);
        }
        else{
            int confirm = JOptionPane.showConfirmDialog(null, "Ban chac chan muon xoa khong?","Xac Nhan",JOptionPane.YES_NO_OPTION);
            if(confirm == JOptionPane.YES_OPTION){
                String malp = String.valueOf(KM_table.getValueAt(row, 0)); //row: hàng đã chọn, 0 là cột đầu tiền trong hàng(mã lp)
                //lphim_service.XoaLP(malp);
                maGG_ctrl.XoaKM(malp);
                defaultTableModel.setRowCount(0);
                ListAllKM(KhuyenMai_ctrl.getAllMaKhuyenMai());
            }
        }
    }//GEN-LAST:event_bt_xoalpActionPerformed

    private void bt_sualpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_sualpActionPerformed
        // TODO add your handling code here:
         int row = KM_table.getSelectedRow();
        if(row == -1){
            JOptionPane.showMessageDialog(null, "Chon loai phim can sua truoc", "Loi", JOptionPane.ERROR_MESSAGE);
        }
        else{
            String malp = String.valueOf(KM_table.getValueAt(row, 0));  
            
            new SuaKM(malp).setVisible(true); // chuyen sang frame chinh sua loai phim
            this.dispose(); //an frame cu~ di
        }
        
    }//GEN-LAST:event_bt_sualpActionPerformed

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
            java.util.logging.Logger.getLogger(LoaiPhim.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoaiPhim.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoaiPhim.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoaiPhim.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new KhuyenMai().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable KM_table;
    private javax.swing.JPanel bg1;
    private javax.swing.JButton bt_sualp;
    private javax.swing.JButton bt_tailai;
    private javax.swing.JButton bt_themlp;
    private javax.swing.JButton bt_xoalp;
    private javax.swing.JPanel btn_baocao;
    private javax.swing.JPanel btn_dangxuaty;
    private javax.swing.JPanel btn_hoadon;
    private javax.swing.JPanel btn_khuyenmai;
    private javax.swing.JPanel btn_nhanvien;
    private javax.swing.JPanel btn_taikhoan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel sidepane;
    private javax.swing.JTextField tf_timkiem;
    // End of variables declaration//GEN-END:variables
}

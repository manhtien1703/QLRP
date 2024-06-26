/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import model.LPhim;
import model.Phim;

/**
 *
 * @author Phi Long
 */
public class ChiTietPhim extends javax.swing.JFrame {

    /**
     * Creates new form ChiTietPhim
     */
    public ChiTietPhim(String maphim) {
        initComponents();
        this.setVisible(true);
        this.setLocationRelativeTo(null);//hiển thị giữa màn hình
        model.Phim p = new Phim();
        LPhim lp = new LPhim();
        controller.Phim_ctrl.HienThiPhim(maphim,lp,p);
        
        lb_tenphim.setText(p.getTenPhim());
        lb_maphim.setText(p.getMaPhim());
        lb_thoiluong.setText(String.valueOf(p.getThoiLuong()));
        lb_loaiphim.setText(lp.getTenLP());
        lb_phude.setText(lp.getHinhThuc());
        lb_quocgia.setText(p.getQuocGia());
        
        String anh1 = "src\\Anh_Phim\\Doraemon.jpg";
        String anh2 = "src\\Anh_Phim\\Cruella.jpg";
        String anh3 = "src\\Anh_Phim\\DemTroiBuoc.jpg";
        String anh4 = "src\\Anh_Phim\\DuaBe.jpg";
        String anh5 = "src\\Anh_Phim\\Spirit.jpg";
        String anh6 = "src\\Anh_Phim\\ff9-fast-furious-9.jpg";
        switch (maphim){
                        case "1p":
                            scaleIMG(anh1,label_anhphim);
                            break;
                        case "2p":
                            scaleIMG(anh2,label_anhphim);;
                            break;
                        case "3p":
                            scaleIMG(anh3,label_anhphim);;
                            break;
                        case "4p":
                            scaleIMG(anh4,label_anhphim);;
                            break;
                        case "5p":
                            scaleIMG(anh5,label_anhphim);;
                            break;
                        case "6p":
                            scaleIMG(anh6,label_anhphim);;
                            break;
    }
}
    private ChiTietPhim() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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

        jPanel1 = new javax.swing.JPanel();
        lb_tenphim = new javax.swing.JLabel();
        pn_info = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lb_maphim = new javax.swing.JLabel();
        lb_thoiluong = new javax.swing.JLabel();
        lb_quocgia = new javax.swing.JLabel();
        lb_loaiphim = new javax.swing.JLabel();
        lb_phude = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        label_anhphim = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));

        lb_tenphim.setFont(new java.awt.Font("DialogInput", 1, 24)); // NOI18N
        lb_tenphim.setForeground(new java.awt.Color(255, 255, 255));
        lb_tenphim.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lb_tenphim.setText("tenphim");

        pn_info.setBackground(new java.awt.Color(51, 51, 51));
        pn_info.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Phụ đề:");
        pn_info.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, 30));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Loại phim: ");
        pn_info.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, 30));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Quốc gia:");
        pn_info.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Thời lượng: ");
        pn_info.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, -1, 30));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Mã Phim: ");
        pn_info.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 9, -1, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Phút");
        pn_info.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 30, 40, 30));

        lb_maphim.setBackground(new java.awt.Color(153, 153, 153));
        lb_maphim.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lb_maphim.setForeground(new java.awt.Color(255, 255, 255));
        lb_maphim.setText("maphim");
        pn_info.add(lb_maphim, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, -1, -1));

        lb_thoiluong.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lb_thoiluong.setForeground(new java.awt.Color(255, 255, 255));
        lb_thoiluong.setText("TL");
        pn_info.add(lb_thoiluong, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 30, 40, 30));

        lb_quocgia.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lb_quocgia.setForeground(new java.awt.Color(255, 255, 255));
        lb_quocgia.setText("QG");
        pn_info.add(lb_quocgia, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 60, 251, 30));

        lb_loaiphim.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lb_loaiphim.setForeground(new java.awt.Color(255, 255, 255));
        lb_loaiphim.setText("LP");
        pn_info.add(lb_loaiphim, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 90, 251, 30));

        lb_phude.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lb_phude.setForeground(new java.awt.Color(255, 255, 255));
        lb_phude.setText("SUB");
        pn_info.add(lb_phude, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 120, 251, 30));

        jPanel2.setBackground(new java.awt.Color(153, 153, 153));
        jPanel2.setPreferredSize(new java.awt.Dimension(420, 1));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 420, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        pn_info.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 420, 1));

        jPanel3.setBackground(new java.awt.Color(153, 153, 153));
        jPanel3.setPreferredSize(new java.awt.Dimension(420, 1));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 420, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1, Short.MAX_VALUE)
        );

        pn_info.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, -1, -1));

        jPanel4.setBackground(new java.awt.Color(153, 153, 153));
        jPanel4.setPreferredSize(new java.awt.Dimension(420, 1));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 420, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1, Short.MAX_VALUE)
        );

        pn_info.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, -1, -1));

        jPanel5.setBackground(new java.awt.Color(153, 153, 153));
        jPanel5.setPreferredSize(new java.awt.Dimension(420, 1));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 420, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1, Short.MAX_VALUE)
        );

        pn_info.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, -1, -1));

        label_anhphim.setText("label_anhphim");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label_anhphim, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pn_info, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb_tenphim, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lb_tenphim, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                        .addGap(7, 7, 7)
                        .addComponent(pn_info, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(label_anhphim, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JLabel label_anhphim;
    private javax.swing.JLabel lb_loaiphim;
    private javax.swing.JLabel lb_maphim;
    private javax.swing.JLabel lb_phude;
    private javax.swing.JLabel lb_quocgia;
    private javax.swing.JLabel lb_tenphim;
    private javax.swing.JLabel lb_thoiluong;
    private javax.swing.JPanel pn_info;
    // End of variables declaration//GEN-END:variables
}

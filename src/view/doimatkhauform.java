/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;


import controller.TaiKhoan_ctrl;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.*;

/**
 *
 * @author Admin
 */
public class doimatkhauform extends javax.swing.JFrame {

    /**
     * Creates new form doimatkhauform
     */
    public doimatkhauform() {
        initComponents();
        iconhide.setVisible(false);
        this.setLocationRelativeTo(null);
        this.setTitle("Đăng nhập");
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
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
        jLabel3 = new javax.swing.JLabel();
        txtconfirm = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        txtnewpassword = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        txtoldpassword = new javax.swing.JPasswordField();
        btxacnhan = new javax.swing.JButton();
        iconhide = new javax.swing.JLabel();
        iconshow = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Xác nhận lại mật khẩu");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, -1, -1));
        jPanel1.add(txtconfirm, new org.netbeans.lib.awtextra.AbsoluteConstraints(293, 190, 190, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Mật khẩu mới");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, -1, -1));
        jPanel1.add(txtnewpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(293, 130, 190, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Mật khẩu cũ");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, -1, -1));
        jPanel1.add(txtoldpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(293, 80, 190, -1));

        btxacnhan.setBackground(new java.awt.Color(153, 153, 153));
        btxacnhan.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btxacnhan.setForeground(new java.awt.Color(255, 255, 255));
        btxacnhan.setText("Xác nhận");
        btxacnhan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btxacnhanActionPerformed(evt);
            }
        });
        jPanel1.add(btxacnhan, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 240, -1, -1));

        iconhide.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconImage/invisible.png"))); // NOI18N
        iconhide.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                iconhideMousePressed(evt);
            }
        });
        jPanel1.add(iconhide, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 190, -1, -1));

        iconshow.setForeground(new java.awt.Color(255, 255, 255));
        iconshow.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconImage/eye-with-thick-outline-variant (1).png"))); // NOI18N
        iconshow.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                iconshowMousePressed(evt);
            }
        });
        jPanel1.add(iconshow, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 190, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Đổi Mật Khẩu");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btxacnhanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btxacnhanActionPerformed
        String oldpass = String.valueOf(txtoldpassword.getPassword());
        String newpass = String.valueOf(txtnewpassword.getPassword());
        String confirm = String.valueOf(txtconfirm.getPassword());
        StringBuilder sb = new StringBuilder();
        if(oldpass.equals(TaiKhoan_ctrl.MatKhauCu(DangNhap.MaNV))==false)
        {
            sb.append("mật khẩu cũ nhập không đúng\n");
        }
        if(confirm.equals(newpass)==false)
        {
            sb.append("mật khẩu xác nhận nhập sai \n");
        }
        if(sb.length()>0)
        {
            JOptionPane.showMessageDialog(this,sb.toString(),"Invalidation",JOptionPane.ERROR_MESSAGE);
        }
        else
        {
            try {
                TaiKhoan_ctrl.DoiMatKhau(newpass,DangNhap.MaNV);
            } catch (SQLException ex) {
                Logger.getLogger(doimatkhauform.class.getName()).log(Level.SEVERE, null, ex);
            }
            JOptionPane.showMessageDialog(null, "Đổi mật khẩu thành công");
        }
    }//GEN-LAST:event_btxacnhanActionPerformed

    private void iconhideMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iconhideMousePressed
        iconhide.setVisible(false);
        iconshow.setVisible(true);
        txtoldpassword.setEchoChar('*');
        txtnewpassword.setEchoChar('*');
        txtconfirm.setEchoChar('*');
    }//GEN-LAST:event_iconhideMousePressed

    private void iconshowMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iconshowMousePressed
        iconhide.setVisible(true);
        iconshow.setVisible(false);
        txtoldpassword.setEchoChar((char)0);
        txtnewpassword.setEchoChar((char)0);
        txtconfirm.setEchoChar((char)0);
    }//GEN-LAST:event_iconshowMousePressed

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
            java.util.logging.Logger.getLogger(doimatkhauform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(doimatkhauform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(doimatkhauform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(doimatkhauform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new doimatkhauform().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btxacnhan;
    private javax.swing.JLabel iconhide;
    private javax.swing.JLabel iconshow;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField txtconfirm;
    private javax.swing.JPasswordField txtnewpassword;
    private javax.swing.JPasswordField txtoldpassword;
    // End of variables declaration//GEN-END:variables
}

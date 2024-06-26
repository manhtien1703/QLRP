/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import javax.swing.JOptionPane;

/**
 *
 * @author Phon
 */
public class HinhThucThanhToan extends javax.swing.JFrame {

    /**
     * Creates new form HinhThucThanhToan
     */
    public HinhThucThanhToan() {
        initComponents();
        this.setLocationRelativeTo(null);//hiển thị giữa màn hình
 
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);//thoát chương trình khi bấm exit
        this.setVisible(true);
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
        jLabel1 = new javax.swing.JLabel();
        jButton_NganHang = new javax.swing.JButton();
        jButton_TienMat = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        jLabel1.setFont(new java.awt.Font("DialogInput", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Chọn Hình Thức Thanh Toán");

        jButton_NganHang.setBackground(new java.awt.Color(51, 51, 51));
        jButton_NganHang.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jButton_NganHang.setForeground(new java.awt.Color(51, 51, 51));
        jButton_NganHang.setText("Thẻ Ngân Hàng");

        jButton_TienMat.setBackground(new java.awt.Color(51, 51, 51));
        jButton_TienMat.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jButton_TienMat.setForeground(new java.awt.Color(51, 51, 51));
        jButton_TienMat.setText("Tiền mặt");
        jButton_TienMat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_TienMatActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addContainerGap(31, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton_NganHang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton_TienMat, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(130, 130, 130))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(jButton_TienMat, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(jButton_NganHang, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(73, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_TienMatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_TienMatActionPerformed
        int xacnhan = JOptionPane.showConfirmDialog(this,"Số tiền phải thanh toán là "+Thanh_Toan.tien+" đồng", "Xác nhận tiền mặt",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
        if(xacnhan == JOptionPane.YES_OPTION){
            JOptionPane.showMessageDialog(null, "Xác nhận thanh toán");
            this.dispose();
        }
    }//GEN-LAST:event_jButton_TienMatActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        HinhThucThanhToan hinhThucThanhToan = new HinhThucThanhToan();
           
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_NganHang;
    private javax.swing.JButton jButton_TienMat;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}

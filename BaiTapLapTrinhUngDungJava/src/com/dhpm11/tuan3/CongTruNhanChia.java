/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dhpm11.tuan3;

import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class CongTruNhanChia extends javax.swing.JFrame {

    /**
     * Creates new form CongTruNhanChia
     */
    public CongTruNhanChia() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btngrPhepToan = new javax.swing.ButtonGroup();
        pnTong = new javax.swing.JPanel();
        pnTren = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        pnGiua = new javax.swing.JPanel();
        button1 = new java.awt.Button();
        button2 = new java.awt.Button();
        button3 = new java.awt.Button();
        pnTrai = new javax.swing.JPanel();
        binGiai = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnThoat = new javax.swing.JButton();
        btnGrPhepToan = new javax.swing.JPanel();
        lblNhapA = new javax.swing.JLabel();
        lblNhapB = new javax.swing.JLabel();
        txtA = new javax.swing.JTextField();
        txtKetQua = new javax.swing.JTextField();
        lblNhapB1 = new javax.swing.JLabel();
        txtB = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        rdoCong = new javax.swing.JRadioButton();
        rdoTru = new javax.swing.JRadioButton();
        rdoNhan = new javax.swing.JRadioButton();
        rdoChia = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnTong.setLayout(new java.awt.BorderLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 255));
        jLabel1.setText("Cộng Trừ Nhân Chia");
        pnTren.add(jLabel1);

        pnTong.add(pnTren, java.awt.BorderLayout.PAGE_START);

        pnGiua.setBackground(new java.awt.Color(255, 204, 204));
        pnGiua.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));

        button1.setBackground(new java.awt.Color(0, 51, 153));
        button1.setForeground(new java.awt.Color(0, 0, 153));

        button2.setBackground(new java.awt.Color(255, 0, 51));
        button2.setForeground(new java.awt.Color(255, 0, 0));

        button3.setBackground(new java.awt.Color(255, 255, 0));
        button3.setForeground(new java.awt.Color(255, 255, 0));

        javax.swing.GroupLayout pnGiuaLayout = new javax.swing.GroupLayout(pnGiua);
        pnGiua.setLayout(pnGiuaLayout);
        pnGiuaLayout.setHorizontalGroup(
            pnGiuaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnGiuaLayout.createSequentialGroup()
                .addGap(173, 173, 173)
                .addComponent(button1, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addGap(22, 22, 22)
                .addComponent(button2, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                .addGap(22, 22, 22)
                .addComponent(button3, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                .addGap(173, 173, 173))
        );
        pnGiuaLayout.setVerticalGroup(
            pnGiuaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnGiuaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnGiuaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(button3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        pnTong.add(pnGiua, java.awt.BorderLayout.PAGE_END);

        pnTrai.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 0, 0)), "Chọn tác vụ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 14))); // NOI18N

        binGiai.setText("Giải");
        binGiai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                binGiaiActionPerformed(evt);
            }
        });

        btnXoa.setText("Xóa");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        btnThoat.setText("Thoát");
        btnThoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThoatActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnTraiLayout = new javax.swing.GroupLayout(pnTrai);
        pnTrai.setLayout(pnTraiLayout);
        pnTraiLayout.setHorizontalGroup(
            pnTraiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnTraiLayout.createSequentialGroup()
                .addGroup(pnTraiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnThoat, javax.swing.GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE)
                    .addComponent(binGiai, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnXoa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 10, Short.MAX_VALUE))
        );
        pnTraiLayout.setVerticalGroup(
            pnTraiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnTraiLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(binGiai, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnXoa)
                .addGap(18, 18, 18)
                .addComponent(btnThoat)
                .addContainerGap(115, Short.MAX_VALUE))
        );

        pnTong.add(pnTrai, java.awt.BorderLayout.LINE_START);

        btnGrPhepToan.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)), "Nhâp 2 số a và b:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 14))); // NOI18N

        lblNhapA.setText("Nhập a:");

        lblNhapB.setText("Nhập b:");

        txtA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAActionPerformed(evt);
            }
        });

        lblNhapB1.setText("Kết quả:");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Chọn phép toán:"));

        btngrPhepToan.add(rdoCong);
        rdoCong.setText("Cộng");
        rdoCong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdoCongActionPerformed(evt);
            }
        });

        btngrPhepToan.add(rdoTru);
        rdoTru.setText("Trừ");

        btngrPhepToan.add(rdoNhan);
        rdoNhan.setText("Nhân");

        btngrPhepToan.add(rdoChia);
        rdoChia.setText("Chia");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(rdoNhan, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addComponent(rdoChia, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(rdoCong, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(rdoTru, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(37, 37, 37))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdoCong)
                    .addComponent(rdoTru))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdoChia)
                    .addComponent(rdoNhan))
                .addGap(16, 16, 16))
        );

        javax.swing.GroupLayout btnGrPhepToanLayout = new javax.swing.GroupLayout(btnGrPhepToan);
        btnGrPhepToan.setLayout(btnGrPhepToanLayout);
        btnGrPhepToanLayout.setHorizontalGroup(
            btnGrPhepToanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnGrPhepToanLayout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(btnGrPhepToanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(btnGrPhepToanLayout.createSequentialGroup()
                        .addComponent(lblNhapA, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtA))
                    .addGroup(btnGrPhepToanLayout.createSequentialGroup()
                        .addGroup(btnGrPhepToanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNhapB1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblNhapB, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(btnGrPhepToanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtB)
                            .addComponent(txtKetQua)
                            .addGroup(btnGrPhepToanLayout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(28, 28, 28)))))
                .addContainerGap())
        );
        btnGrPhepToanLayout.setVerticalGroup(
            btnGrPhepToanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnGrPhepToanLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(btnGrPhepToanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNhapA)
                    .addComponent(txtA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(btnGrPhepToanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNhapB))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(btnGrPhepToanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtKetQua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNhapB1))
                .addGap(25, 25, 25))
        );

        pnTong.add(btnGrPhepToan, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnTong, javax.swing.GroupLayout.DEFAULT_SIZE, 508, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnTong, javax.swing.GroupLayout.DEFAULT_SIZE, 349, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAActionPerformed

    private void rdoCongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdoCongActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdoCongActionPerformed

    private void btnThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThoatActionPerformed
        int ret = JOptionPane.showConfirmDialog(null, "Muốn thoát hả", "Thoát", JOptionPane.YES_NO_OPTION);
        if (ret == JOptionPane.YES_OPTION)
            JOptionPane.showConfirmDialog(null, "Đừng hòng","Mày không thoát được đâu con trai", JOptionPane.OK_OPTION);
            //System.exit(0);
    }//GEN-LAST:event_btnThoatActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        txtA.setText("");
        txtB.setText("");
        txtKetQua.setText("");
        txtA.requestFocus();
    }//GEN-LAST:event_btnXoaActionPerformed

    private void binGiaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_binGiaiActionPerformed
       String  sa= txtA.getText();
       int a= 0, b= 0;
       try{
           a= Integer.parseInt(sa);
       }
       catch(Exception ex)
       {
       JOptionPane.showConfirmDialog(null, "Nhập sai định dạnh!");
       txtA.selectAll();
       txtA.requestFocus();
       return;
    }
       String sb = txtB.getText();
       try{
           b= Integer.parseInt(sb);
       }
       catch(Exception ex)
       {
       JOptionPane.showConfirmDialog(null, "Nhập sai định dạnh!");
       txtB.selectAll();
       txtB.requestFocus();
       return;
    }
       double kq = 0;
       if(rdoCong.isSelected()){
           kq = a+b;
       }
       if(rdoTru.isSelected()){
           kq = a-b;
       }
        if(rdoNhan.isSelected()){
           kq = a*b;
       }
         if(rdoChia.isSelected()){
           kq = a/b;
       }
       txtKetQua.setText(kq+"");
    }//GEN-LAST:event_binGiaiActionPerformed

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
            java.util.logging.Logger.getLogger(CongTruNhanChia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CongTruNhanChia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CongTruNhanChia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CongTruNhanChia.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CongTruNhanChia().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton binGiai;
    private javax.swing.JPanel btnGrPhepToan;
    private javax.swing.JButton btnThoat;
    private javax.swing.JButton btnXoa;
    private javax.swing.ButtonGroup btngrPhepToan;
    private java.awt.Button button1;
    private java.awt.Button button2;
    private java.awt.Button button3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblNhapA;
    private javax.swing.JLabel lblNhapB;
    private javax.swing.JLabel lblNhapB1;
    private javax.swing.JPanel pnGiua;
    private javax.swing.JPanel pnTong;
    private javax.swing.JPanel pnTrai;
    private javax.swing.JPanel pnTren;
    private javax.swing.JRadioButton rdoChia;
    private javax.swing.JRadioButton rdoCong;
    private javax.swing.JRadioButton rdoNhan;
    private javax.swing.JRadioButton rdoTru;
    private javax.swing.JTextField txtA;
    private javax.swing.JTextField txtB;
    private javax.swing.JTextField txtKetQua;
    // End of variables declaration//GEN-END:variables
}

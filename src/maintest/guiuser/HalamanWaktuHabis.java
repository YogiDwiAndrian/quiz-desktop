/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maintest.guiuser;

import maintest.Objek.Activity;
import maintest.mysql.Query;

/**
 *
 * @author arief
 */
public class HalamanWaktuHabis extends javax.swing.JFrame {

    /**
     * Creates new form HalamanWaktuHabis
     */
    public HalamanWaktuHabis() {
        initComponents();
        
        Activity user = new Activity();
        skorText.setText(Integer.toString(user.getSkor()));
        
        Query.updateSkor(user.getIdRank(), user.getSkor());
        
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
        skorLabel = new javax.swing.JLabel();
        skorText = new javax.swing.JLabel();
        sisaLabel = new javax.swing.JLabel();
        keHomebtn = new javax.swing.JButton();
        kePilihanBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(55, 62, 69));
        jPanel1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        skorLabel.setFont(new java.awt.Font("Capriola", 0, 36)); // NOI18N
        skorLabel.setForeground(new java.awt.Color(216, 216, 216));
        skorLabel.setText("Skor anda");
        jPanel1.add(skorLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 240, -1, -1));

        skorText.setFont(new java.awt.Font("Asap", 0, 96)); // NOI18N
        skorText.setForeground(new java.awt.Color(117, 227, 128));
        skorText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        skorText.setText("2155");
        jPanel1.add(skorText, new org.netbeans.lib.awtextra.AbsoluteConstraints(74, 310, 480, -1));

        sisaLabel.setFont(new java.awt.Font("Capriola", 0, 76)); // NOI18N
        sisaLabel.setForeground(new java.awt.Color(216, 216, 216));
        sisaLabel.setText("Waktu habis !");
        jPanel1.add(sisaLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 100, -1, -1));

        keHomebtn.setBackground(new java.awt.Color(232, 234, 150));
        keHomebtn.setFont(new java.awt.Font("Capriola", 0, 24)); // NOI18N
        keHomebtn.setForeground(new java.awt.Color(55, 62, 69));
        keHomebtn.setText("<- home");
        keHomebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keHomebtnActionPerformed(evt);
            }
        });
        jPanel1.add(keHomebtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 550, 320, 60));

        kePilihanBtn.setBackground(new java.awt.Color(117, 227, 128));
        kePilihanBtn.setFont(new java.awt.Font("Capriola", 0, 24)); // NOI18N
        kePilihanBtn.setForeground(new java.awt.Color(55, 62, 69));
        kePilihanBtn.setText("<- pilihan");
        kePilihanBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kePilihanBtnActionPerformed(evt);
            }
        });
        jPanel1.add(kePilihanBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 470, 320, 60));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 644, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 700, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 700, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void keHomebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_keHomebtnActionPerformed
        this.setVisible(false);
        
        LoginUser loginUser = new LoginUser();
        loginUser.setResizable(false);
        loginUser.setVisible(true);
        loginUser.setLocationRelativeTo(null);
    }//GEN-LAST:event_keHomebtnActionPerformed

    private void kePilihanBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kePilihanBtnActionPerformed
        this.setVisible(false);
        
        HalamanPilihan halamanPilihan = new HalamanPilihan();
        halamanPilihan.setResizable(false);
        halamanPilihan.setVisible(true);
        halamanPilihan.setLocationRelativeTo(null);
    }//GEN-LAST:event_kePilihanBtnActionPerformed

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
            java.util.logging.Logger.getLogger(HalamanWaktuHabis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HalamanWaktuHabis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HalamanWaktuHabis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HalamanWaktuHabis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HalamanWaktuHabis().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton keHomebtn;
    private javax.swing.JButton kePilihanBtn;
    private javax.swing.JLabel sisaLabel;
    private javax.swing.JLabel skorLabel;
    private javax.swing.JLabel skorText;
    // End of variables declaration//GEN-END:variables
}

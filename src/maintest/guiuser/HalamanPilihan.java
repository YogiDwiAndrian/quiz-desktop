/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maintest.guiuser;
import java.awt.Color;
import java.util.concurrent.TimeUnit;
import javax.swing.JOptionPane;
import maintest.mysql.Query;


import maintest.Objek.Activity;

/**
 *
 * @author arief
 */
public class HalamanPilihan extends javax.swing.JFrame {

    

    
    public HalamanPilihan() {
        initComponents();

        Activity user = new Activity();

        if(!user.isIQEnable())
            testIQButton.setEnabled(false);


        if(!user.isLogikaEnable())
            testLogikaButton.setEnabled(false);


        if(!user.isPsikotesEnable())
            psikotesButton.setEnabled(false);


        if(!user.isUmumEnable())
            testUmumButton.setEnabled(false);
        
        
        String skorIQ = Query.getSkorIQ(user.getIdUser());
        
        if(skorIQ != null){
            skorTestIQLabel.setText(skorIQ);
        }
        
        String skorUmum = Query.getSkorUmum(user.getIdUser());
        
        if(skorUmum != null){
            skorTestUmumLabel.setText(skorUmum);
        }
        
        String skorLogika = Query.getSkorLogika(user.getIdUser());
        
        if(skorLogika != null){
            skorTestLogikaLabel.setText(skorLogika);
        }
        
        String skorPsikotes = Query.getSkorPsikotes(user.getIdUser());
        
        if(skorPsikotes != null){
            skorPsikotesLabel.setText(skorPsikotes);
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

        bgPanel = new javax.swing.JPanel();
        psikotesButton = new javax.swing.JButton();
        testLogikaButton = new javax.swing.JButton();
        testIQButton = new javax.swing.JButton();
        testUmumButton = new javax.swing.JButton();
        kataLabel = new javax.swing.JLabel();
        skorLabel = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        skorTestIQLabel = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        skorTestUmumLabel = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        skorTestLogikaLabel = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        jPanel15 = new javax.swing.JPanel();
        jPanel16 = new javax.swing.JPanel();
        skorPsikotesLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        bgPanel.setBackground(new java.awt.Color(55, 62, 69));
        bgPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        psikotesButton.setBackground(new java.awt.Color(117, 227, 201));
        psikotesButton.setFont(new java.awt.Font("Capriola", 0, 18)); // NOI18N
        psikotesButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/maintest/asset/healthcare-and-medical 1.png"))); // NOI18N
        psikotesButton.setText("Psikotest");
        psikotesButton.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        psikotesButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        psikotesButton.setPreferredSize(new java.awt.Dimension(200, 200));
        psikotesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                psikotesButtonActionPerformed(evt);
            }
        });
        bgPanel.add(psikotesButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 350, 350, 140));

        testLogikaButton.setBackground(new java.awt.Color(227, 176, 117));
        testLogikaButton.setFont(new java.awt.Font("Capriola", 0, 18)); // NOI18N
        testLogikaButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/maintest/asset/fit 1.png"))); // NOI18N
        testLogikaButton.setText("<html>Test<br>Logika</html>");
        testLogikaButton.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        testLogikaButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        testLogikaButton.setPreferredSize(new java.awt.Dimension(200, 200));
        testLogikaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                testLogikaButtonActionPerformed(evt);
            }
        });
        bgPanel.add(testLogikaButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 190, 350, 140));

        testIQButton.setBackground(new java.awt.Color(205, 227, 117));
        testIQButton.setFont(new java.awt.Font("Capriola", 0, 18)); // NOI18N
        testIQButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/maintest/asset/body-part 1.png"))); // NOI18N
        testIQButton.setText("<html>Test <br>IQ</html>");
        testIQButton.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        testIQButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        testIQButton.setPreferredSize(new java.awt.Dimension(200, 200));
        testIQButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                testIQButtonActionPerformed(evt);
            }
        });
        bgPanel.add(testIQButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 190, 350, 140));

        testUmumButton.setBackground(new java.awt.Color(117, 227, 128));
        testUmumButton.setFont(new java.awt.Font("Capriola", 0, 18)); // NOI18N
        testUmumButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/maintest/asset/education 1.png"))); // NOI18N
        testUmumButton.setText("<html> Test <br>Pengetahuan<br> Umum </html>");
        testUmumButton.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        testUmumButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        testUmumButton.setPreferredSize(new java.awt.Dimension(200, 200));
        testUmumButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                testUmumButtonActionPerformed(evt);
            }
        });
        bgPanel.add(testUmumButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 350, 350, 140));

        kataLabel.setFont(new java.awt.Font("Capriola", 0, 48)); // NOI18N
        kataLabel.setForeground(java.awt.Color.white);
        kataLabel.setText("Ayo, asah kemampuanmu !");
        bgPanel.add(kataLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 70, -1, -1));

        skorLabel.setFont(new java.awt.Font("Capriola", 0, 22)); // NOI18N
        skorLabel.setForeground(java.awt.Color.white);
        skorLabel.setText("Skor anda");
        bgPanel.add(skorLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 520, -1, -1));

        jPanel1.setBackground(new java.awt.Color(205, 227, 117));
        jPanel1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 38, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 38, Short.MAX_VALUE)
        );

        bgPanel.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 580, 40, 40));

        jPanel2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        skorTestIQLabel.setFont(new java.awt.Font("Asap", 1, 22)); // NOI18N
        skorTestIQLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        skorTestIQLabel.setText("0");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(skorTestIQLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(skorTestIQLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
        );

        bgPanel.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 580, 130, 40));

        jPanel11.setBackground(new java.awt.Color(117, 227, 128));
        jPanel11.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 38, Short.MAX_VALUE)
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 38, Short.MAX_VALUE)
        );

        bgPanel.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 580, -1, -1));

        jPanel12.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        skorTestUmumLabel.setFont(new java.awt.Font("Asap", 1, 22)); // NOI18N
        skorTestUmumLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        skorTestUmumLabel.setText("0");

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(skorTestUmumLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(skorTestUmumLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
        );

        bgPanel.add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 580, -1, -1));

        jPanel14.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        skorTestLogikaLabel.setFont(new java.awt.Font("Asap", 1, 22)); // NOI18N
        skorTestLogikaLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        skorTestLogikaLabel.setText("0");

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(skorTestLogikaLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(skorTestLogikaLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
        );

        bgPanel.add(jPanel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 580, -1, -1));

        jPanel13.setBackground(new java.awt.Color(227, 176, 117));
        jPanel13.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 38, Short.MAX_VALUE)
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 38, Short.MAX_VALUE)
        );

        bgPanel.add(jPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 580, -1, -1));

        jPanel15.setBackground(new java.awt.Color(117, 227, 201));
        jPanel15.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 38, Short.MAX_VALUE)
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 38, Short.MAX_VALUE)
        );

        bgPanel.add(jPanel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 580, -1, -1));

        jPanel16.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        skorPsikotesLabel.setFont(new java.awt.Font("Asap", 1, 22)); // NOI18N
        skorPsikotesLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        skorPsikotesLabel.setText("0");

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(skorPsikotesLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(skorPsikotesLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
        );

        bgPanel.add(jPanel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 580, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bgPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1000, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bgPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 700, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void psikotesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_psikotesButtonActionPerformed
        
        Activity user = new Activity();
        
        user.setPsikotesEnable(false);
        
        user.setSkor(0);
        user.setIndexSoal(0);
        
        String[] data = Query.getSoal(2, user.getIndexSoal());
        
        Query.mulaiRank(user.getIdUser(), user.getIdKategori());
        Query.setDurasi(2);
        
        this.setVisible(false);
        
        HalamanTest halamanTest = new HalamanTest();
        halamanTest.setSoalLabel("Psikotes");
        halamanTest.setNumColor(new Color(117,227,201));
        halamanTest.setThemeColor(new Color(117,227,201), user.getDurasi());
        halamanTest.setSoalJawaban(data[0], data[1], data[2], data[3], data[4], data[5], 1, halamanTest.getNumColor());
        
        halamanTest.setResizable(false);
        halamanTest.setVisible(true);
        halamanTest.setLocationRelativeTo(null);
        
        
    }//GEN-LAST:event_psikotesButtonActionPerformed

    private void testLogikaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_testLogikaButtonActionPerformed
        Activity user = new Activity();
        
        user.setLogikaEnable(false);
        
        user.setSkor(0);
        user.setIndexSoal(0);
        
        String[] data = Query.getSoal(3, user.getIndexSoal());
        
        Query.mulaiRank(user.getIdUser(), user.getIdKategori());
        Query.setDurasi(3);
        
        this.setVisible(false);
        
        HalamanTest halamanTest = new HalamanTest();
        halamanTest.setSoalLabel("Tes Logika");
        
        halamanTest.setNumColor(new Color(227,176,117));
        
        halamanTest.setThemeColor(new Color(227,176,117), user.getDurasi());
        halamanTest.setSoalJawaban(data[0], data[1], data[2], data[3], data[4], data[5], 1, halamanTest.getNumColor());
        
        halamanTest.setResizable(false);
        halamanTest.setVisible(true);
        halamanTest.setLocationRelativeTo(null);
    }//GEN-LAST:event_testLogikaButtonActionPerformed

    private void testIQButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_testIQButtonActionPerformed
        
        Activity user = new Activity();
        
        user.setIQEnable(false);
        
        user.setSkor(0);
        user.setIndexSoal(0);
        
        String[] data = Query.getSoal(1, user.getIndexSoal());
        
        Query.mulaiRank(user.getIdUser(), user.getIdKategori());
        Query.setDurasi(1);
        
        this.setVisible(false);
        HalamanTest halamanTest = new HalamanTest();
        halamanTest.setSoalLabel("Test IQ");
        
        halamanTest.setNumColor(new Color(205,227,117));
        
        halamanTest.setThemeColor(new Color(205,227,117), user.getDurasi());
        halamanTest.setSoalJawaban(data[0], data[1], data[2], data[3], data[4], data[5], 1, halamanTest.getNumColor());
        
        halamanTest.setResizable(false);
        halamanTest.setVisible(true);
        halamanTest.setLocationRelativeTo(null);
        
    }//GEN-LAST:event_testIQButtonActionPerformed

    private void testUmumButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_testUmumButtonActionPerformed
       Activity user = new Activity();
        
        user.setUmumEnable(false);
        
        user.setSkor(0);
        user.setIndexSoal(0);
        
        String[] data = Query.getSoal(4, user.getIndexSoal());
        
        Query.mulaiRank(user.getIdUser(), user.getIdKategori());
        Query.setDurasi(4);
        
        this.setVisible(false);
        HalamanTest halamanTest = new HalamanTest();
        halamanTest.setSoalLabel("Test Pengetahuan Umum");
        
        
        halamanTest.setNumColor(new Color(117,227,128));
        
        halamanTest.setThemeColor(new Color(117,227,128), user.getDurasi());
        halamanTest.setSoalJawaban(data[0], data[1], data[2], data[3], data[4], data[5], 1, halamanTest.getNumColor());
        
        halamanTest.setResizable(false);
        halamanTest.setVisible(true);
        halamanTest.setLocationRelativeTo(null);
    }//GEN-LAST:event_testUmumButtonActionPerformed

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
            java.util.logging.Logger.getLogger(HalamanPilihan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HalamanPilihan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HalamanPilihan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HalamanPilihan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HalamanPilihan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bgPanel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel kataLabel;
    private javax.swing.JButton psikotesButton;
    private javax.swing.JLabel skorLabel;
    private javax.swing.JLabel skorPsikotesLabel;
    private javax.swing.JLabel skorTestIQLabel;
    private javax.swing.JLabel skorTestLogikaLabel;
    private javax.swing.JLabel skorTestUmumLabel;
    private javax.swing.JButton testIQButton;
    private javax.swing.JButton testLogikaButton;
    private javax.swing.JButton testUmumButton;
    // End of variables declaration//GEN-END:variables
}
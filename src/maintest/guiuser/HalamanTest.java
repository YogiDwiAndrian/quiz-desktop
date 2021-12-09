/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maintest.guiuser;

import maintest.Objek.Activity;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import javax.swing.event.AncestorListener;
import maintest.mysql.Query;

/**
 *
 * @author arief
 */
public class HalamanTest extends javax.swing.JFrame {

    /**
     * Creates new form HalamanTest
     */
    Timer timer;
    private int counter;
    private Activity user = new Activity();
    private int countSoal = 0;
    
    private Color numColor;
    
    public HalamanTest() {
        initComponents();
//        setTheme("",new Color(205, 227, 117), 1);
        
        
        counter = user.getDurasi();
        
        timerProgress.setMaximum(counter);
        timerProgress.setValue(counter);
        
        ActionListener listener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                counter--;
                timerProgress.setValue(counter);
                
                if(countSoal > 9){
                    timer.stop();
                    user.setSisaDurasi(counter);
                    hidePage();
                    HalamanBerhasil halamanBerhasil = new HalamanBerhasil();
                    halamanBerhasil.setResizable(false);
                    halamanBerhasil.setVisible(true);
                    halamanBerhasil.setLocationRelativeTo(null);
                    
                }
                
                if(counter < 1){
                    timer.stop();
                    hidePage();
                    HalamanWaktuHabis halamanWaktuHabis = new HalamanWaktuHabis();
                    halamanWaktuHabis.setResizable(false);
                    halamanWaktuHabis.setVisible(true);
                    halamanWaktuHabis.setLocationRelativeTo(null);
                }
            }
        };
        
        
        timer = new Timer(1000, listener);
        timer.start();
        
    }
    
    public void setNumColor(Color color){
        this.numColor = color;
    }
    
    public Color getNumColor(){
        return this.numColor;
    }
    
    private void hidePage(){
        this.setVisible(false);
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
        timerProgress = new javax.swing.JProgressBar();
        soalLabel = new javax.swing.JLabel();
        soalPanel = new javax.swing.JPanel();
        soalText = new javax.swing.JLabel();
        jawabanC = new javax.swing.JButton();
        jawabanA = new javax.swing.JButton();
        jawabanD = new javax.swing.JButton();
        jawabanB = new javax.swing.JButton();
        indexSoal1 = new javax.swing.JPanel();
        indexSoal2 = new javax.swing.JPanel();
        indexSoal3 = new javax.swing.JPanel();
        indexSoal4 = new javax.swing.JPanel();
        indexSoal5 = new javax.swing.JPanel();
        indexSoal6 = new javax.swing.JPanel();
        indexSoal7 = new javax.swing.JPanel();
        indexSoal8 = new javax.swing.JPanel();
        indexSoal9 = new javax.swing.JPanel();
        indexSoal10 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(55, 62, 69));

        timerProgress.setBackground(new java.awt.Color(86, 95, 103));
        timerProgress.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        timerProgress.setBorderPainted(false);
        timerProgress.setPreferredSize(new java.awt.Dimension(387, 20));

        soalLabel.setFont(new java.awt.Font("Asap", 1, 36)); // NOI18N
        soalLabel.setForeground(new java.awt.Color(205, 227, 117));
        soalLabel.setText("Psikotes");

        soalPanel.setBackground(new java.awt.Color(55, 62, 69));
        soalPanel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(205, 227, 117), 2, true));
        soalPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        soalText.setFont(new java.awt.Font("Asap", 0, 22)); // NOI18N
        soalText.setForeground(java.awt.Color.white);
        soalText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        soalText.setText("<html>\n<div style='text-align: center'>Soal</div>\n</html>");
        soalPanel.add(soalText, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 0, 700, 240));

        jawabanC.setBackground(new java.awt.Color(205, 227, 117));
        jawabanC.setFont(new java.awt.Font("Asap", 0, 18)); // NOI18N
        jawabanC.setForeground(new java.awt.Color(55, 62, 69));
        jawabanC.setText("A. ");
        jawabanC.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jawabanC.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jawabanC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jawabanCActionPerformed(evt);
            }
        });

        jawabanA.setBackground(new java.awt.Color(205, 227, 117));
        jawabanA.setFont(new java.awt.Font("Asap", 0, 18)); // NOI18N
        jawabanA.setForeground(new java.awt.Color(55, 62, 69));
        jawabanA.setText("A. ");
        jawabanA.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jawabanA.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jawabanA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jawabanAActionPerformed(evt);
            }
        });

        jawabanD.setBackground(new java.awt.Color(205, 227, 117));
        jawabanD.setFont(new java.awt.Font("Asap", 0, 18)); // NOI18N
        jawabanD.setForeground(new java.awt.Color(55, 62, 69));
        jawabanD.setText("A. ");
        jawabanD.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jawabanD.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jawabanD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jawabanDActionPerformed(evt);
            }
        });

        jawabanB.setBackground(new java.awt.Color(205, 227, 117));
        jawabanB.setFont(new java.awt.Font("Asap", 0, 18)); // NOI18N
        jawabanB.setForeground(new java.awt.Color(55, 62, 69));
        jawabanB.setText("A. ");
        jawabanB.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jawabanB.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jawabanB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jawabanBActionPerformed(evt);
            }
        });

        indexSoal1.setBackground(new java.awt.Color(86, 95, 103));
        indexSoal1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        javax.swing.GroupLayout indexSoal1Layout = new javax.swing.GroupLayout(indexSoal1);
        indexSoal1.setLayout(indexSoal1Layout);
        indexSoal1Layout.setHorizontalGroup(
            indexSoal1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        indexSoal1Layout.setVerticalGroup(
            indexSoal1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        indexSoal2.setBackground(new java.awt.Color(86, 95, 103));
        indexSoal2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        javax.swing.GroupLayout indexSoal2Layout = new javax.swing.GroupLayout(indexSoal2);
        indexSoal2.setLayout(indexSoal2Layout);
        indexSoal2Layout.setHorizontalGroup(
            indexSoal2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        indexSoal2Layout.setVerticalGroup(
            indexSoal2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        indexSoal3.setBackground(new java.awt.Color(86, 95, 103));
        indexSoal3.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        javax.swing.GroupLayout indexSoal3Layout = new javax.swing.GroupLayout(indexSoal3);
        indexSoal3.setLayout(indexSoal3Layout);
        indexSoal3Layout.setHorizontalGroup(
            indexSoal3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        indexSoal3Layout.setVerticalGroup(
            indexSoal3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        indexSoal4.setBackground(new java.awt.Color(86, 95, 103));
        indexSoal4.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        javax.swing.GroupLayout indexSoal4Layout = new javax.swing.GroupLayout(indexSoal4);
        indexSoal4.setLayout(indexSoal4Layout);
        indexSoal4Layout.setHorizontalGroup(
            indexSoal4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        indexSoal4Layout.setVerticalGroup(
            indexSoal4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        indexSoal5.setBackground(new java.awt.Color(86, 95, 103));
        indexSoal5.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        javax.swing.GroupLayout indexSoal5Layout = new javax.swing.GroupLayout(indexSoal5);
        indexSoal5.setLayout(indexSoal5Layout);
        indexSoal5Layout.setHorizontalGroup(
            indexSoal5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        indexSoal5Layout.setVerticalGroup(
            indexSoal5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        indexSoal6.setBackground(new java.awt.Color(86, 95, 103));
        indexSoal6.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        javax.swing.GroupLayout indexSoal6Layout = new javax.swing.GroupLayout(indexSoal6);
        indexSoal6.setLayout(indexSoal6Layout);
        indexSoal6Layout.setHorizontalGroup(
            indexSoal6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        indexSoal6Layout.setVerticalGroup(
            indexSoal6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        indexSoal7.setBackground(new java.awt.Color(86, 95, 103));
        indexSoal7.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        javax.swing.GroupLayout indexSoal7Layout = new javax.swing.GroupLayout(indexSoal7);
        indexSoal7.setLayout(indexSoal7Layout);
        indexSoal7Layout.setHorizontalGroup(
            indexSoal7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        indexSoal7Layout.setVerticalGroup(
            indexSoal7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        indexSoal8.setBackground(new java.awt.Color(86, 95, 103));
        indexSoal8.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        javax.swing.GroupLayout indexSoal8Layout = new javax.swing.GroupLayout(indexSoal8);
        indexSoal8.setLayout(indexSoal8Layout);
        indexSoal8Layout.setHorizontalGroup(
            indexSoal8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        indexSoal8Layout.setVerticalGroup(
            indexSoal8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        indexSoal9.setBackground(new java.awt.Color(86, 95, 103));
        indexSoal9.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        javax.swing.GroupLayout indexSoal9Layout = new javax.swing.GroupLayout(indexSoal9);
        indexSoal9.setLayout(indexSoal9Layout);
        indexSoal9Layout.setHorizontalGroup(
            indexSoal9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        indexSoal9Layout.setVerticalGroup(
            indexSoal9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        indexSoal10.setBackground(new java.awt.Color(86, 95, 103));
        indexSoal10.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        javax.swing.GroupLayout indexSoal10Layout = new javax.swing.GroupLayout(indexSoal10);
        indexSoal10.setLayout(indexSoal10Layout);
        indexSoal10Layout.setHorizontalGroup(
            indexSoal10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        indexSoal10Layout.setVerticalGroup(
            indexSoal10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jawabanA, javax.swing.GroupLayout.PREFERRED_SIZE, 395, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jawabanB, javax.swing.GroupLayout.PREFERRED_SIZE, 395, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(254, 254, 254)
                        .addComponent(indexSoal1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(indexSoal2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(indexSoal3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(indexSoal4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(indexSoal5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(indexSoal6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(indexSoal7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(indexSoal8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(indexSoal9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(indexSoal10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jawabanC, javax.swing.GroupLayout.PREFERRED_SIZE, 395, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jawabanD, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 395, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(soalLabel)
                            .addComponent(timerProgress, javax.swing.GroupLayout.DEFAULT_SIZE, 837, Short.MAX_VALUE)
                            .addComponent(soalPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(81, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(soalLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(timerProgress, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(soalPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jawabanA, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jawabanC, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jawabanB, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jawabanD, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(indexSoal1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(indexSoal2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(indexSoal3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(indexSoal4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(indexSoal5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(indexSoal6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(indexSoal7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(indexSoal8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(indexSoal9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(indexSoal10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55))
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

    private void jawabanAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jawabanAActionPerformed
        countSoal++;
        if(user.getKunciJawaban().equals("A")){
            user.setSkor(user.getSkor() + 100);
        }
        
        if(countSoal < 10){
//            user.setIndexSoal(user.getIndexSoal() + 1);
            
            String[] data = Query.getSoal(user.getIdKategori(), countSoal);

            this.setSoalJawaban(data[0], data[1], data[2], data[3], data[4], data[5], countSoal + 1, this.getNumColor());
//            System.out.println(user.getIndexSoal());
        }
        System.out.println(countSoal);
        
        
       
        
    }//GEN-LAST:event_jawabanAActionPerformed

    private void jawabanBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jawabanBActionPerformed
        
        countSoal++;
        if(user.getKunciJawaban().equals("B")){
            user.setSkor(user.getSkor() + 100);
        }
        
        if(countSoal < 10){
//            user.setIndexSoal(user.getIndexSoal() + 1);
            
            String[] data = Query.getSoal(user.getIdKategori(), countSoal);

            this.setSoalJawaban(data[0], data[1], data[2], data[3], data[4], data[5], countSoal + 1,this.getNumColor());
//            System.out.println(user.getIndexSoal());
        }
        
        System.out.println(countSoal);
    }//GEN-LAST:event_jawabanBActionPerformed

    private void jawabanCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jawabanCActionPerformed
        
        countSoal++;
        if(user.getKunciJawaban().equals("C")){
            user.setSkor(user.getSkor() + 100);
        }
        
        if(countSoal < 10){
//            user.setIndexSoal(user.getIndexSoal() + 1);
            
            String[] data = Query.getSoal(user.getIdKategori(), countSoal);

            this.setSoalJawaban(data[0], data[1], data[2], data[3], data[4], data[5], countSoal + 1, this.getNumColor());
//            System.out.println(user.getIndexSoal());
        }
        
        System.out.println(countSoal);
    }//GEN-LAST:event_jawabanCActionPerformed

    private void jawabanDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jawabanDActionPerformed
        
        countSoal++;
        if(user.getKunciJawaban().equals("D")){
            user.setSkor(user.getSkor() + 100);
        }
        
        if(countSoal < 10){
//            user.setIndexSoal(user.getIndexSoal() + 1);
            
            String[] data = Query.getSoal(user.getIdKategori(), countSoal);

            this.setSoalJawaban(data[0], data[1], data[2], data[3], data[4], data[5], countSoal + 1, this.getNumColor());
//            System.out.println(user.getIndexSoal());
        }
        System.out.println(countSoal);
        
    }//GEN-LAST:event_jawabanDActionPerformed

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
            java.util.logging.Logger.getLogger(HalamanTest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HalamanTest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HalamanTest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HalamanTest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HalamanTest().setVisible(true);
            }
        });
    }
    
    public void setThemeColor(Color color, int durasi){
        timerProgress.setForeground(color);
        soalLabel.setForeground(color);
        jawabanA.setBackground(color);
        jawabanB.setBackground(color);
        jawabanC.setBackground(color);
        jawabanD.setBackground(color);
        

        Border border = new LineBorder(color, 2, true);
        soalPanel.setBorder(border);
        
        timerProgress.setMaximum(durasi);
    }
    
    public void setSoalJawaban(String soal, String A, String B, String C, String D, String key, int index, Color color){
        
        soalText.setText(soal);
        jawabanA.setText("A. " + A);
        jawabanB.setText("B. " + B);
        jawabanC.setText("C. " + C);
        jawabanD.setText("D. " + D);
        
        switch (index) {
            case 1:
                indexSoal1.setBackground(color);
                break;
            case 2:
                indexSoal2.setBackground(color);
                break;
            case 3:
                indexSoal3.setBackground(color);
                break;
            case 4:
                indexSoal4.setBackground(color);
                break;
            case 5:
                indexSoal5.setBackground(color);
                break;
            case 6:
                indexSoal6.setBackground(color);
                break;
            case 7:
                indexSoal7.setBackground(color);
                break;
            case 8:
                indexSoal8.setBackground(color);
                break;
            case 9:
                indexSoal9.setBackground(color);
                break;
            case 10:
                indexSoal10.setBackground(color);
                break;
            default:
                break;
        }
    }
    
    public void setSoalLabel(String text){
        soalLabel.setText(text);
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel indexSoal1;
    private javax.swing.JPanel indexSoal10;
    private javax.swing.JPanel indexSoal2;
    private javax.swing.JPanel indexSoal3;
    private javax.swing.JPanel indexSoal4;
    private javax.swing.JPanel indexSoal5;
    private javax.swing.JPanel indexSoal6;
    private javax.swing.JPanel indexSoal7;
    private javax.swing.JPanel indexSoal8;
    private javax.swing.JPanel indexSoal9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jawabanA;
    private javax.swing.JButton jawabanB;
    private javax.swing.JButton jawabanC;
    private javax.swing.JButton jawabanD;
    private javax.swing.JLabel soalLabel;
    private javax.swing.JPanel soalPanel;
    private javax.swing.JLabel soalText;
    private javax.swing.JProgressBar timerProgress;
    // End of variables declaration//GEN-END:variables
}
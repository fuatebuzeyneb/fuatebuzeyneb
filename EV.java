
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author fuat
 */
public class EV extends javax.swing.JFrame {

    /**
     * Creates new form EV
     */
    public EV() {
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

        jPanel1 = new javax.swing.JPanel();
        btnobg = new javax.swing.JButton();
        btnyok = new javax.swing.JButton();
        btncikis = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        btnohb = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 255), 5));

        btnobg.setFont(new java.awt.Font("Tahoma", 3, 16)); // NOI18N
        btnobg.setIcon(new javax.swing.ImageIcon("C:\\Users\\fuat\\Desktop\\ملفات java\\صور مشروع 77\\update.png")); // NOI18N
        btnobg.setText("Öğrenci Bilgisi Güncelle");
        btnobg.setPreferredSize(new java.awt.Dimension(300, 60));
        btnobg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnobgActionPerformed(evt);
            }
        });

        btnyok.setFont(new java.awt.Font("Tahoma", 3, 16)); // NOI18N
        btnyok.setIcon(new javax.swing.ImageIcon("C:\\Users\\fuat\\Desktop\\ملفات java\\صور مشروع 77\\add.png")); // NOI18N
        btnyok.setText("Yeni Öğrenci Kaydı");
        btnyok.setPreferredSize(new java.awt.Dimension(300, 60));
        btnyok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnyokActionPerformed(evt);
            }
        });

        btncikis.setFont(new java.awt.Font("Tahoma", 3, 16)); // NOI18N
        btncikis.setIcon(new javax.swing.ImageIcon("C:\\Users\\fuat\\Desktop\\ملفات java\\صور مشروع 77\\logout.png")); // NOI18N
        btncikis.setText("Çıkış Yap");
        btncikis.setPreferredSize(new java.awt.Dimension(240, 60));
        btncikis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncikisActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Tahoma", 3, 16)); // NOI18N
        jButton4.setIcon(new javax.swing.ImageIcon("C:\\Users\\fuat\\Desktop\\ملفات java\\صور مشروع 77\\exclamation-mark.png")); // NOI18N
        jButton4.setText("Yurt Hakkında Bilgiler");
        jButton4.setPreferredSize(new java.awt.Dimension(300, 60));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        btnohb.setFont(new java.awt.Font("Tahoma", 3, 16)); // NOI18N
        btnohb.setIcon(new javax.swing.ImageIcon("C:\\Users\\fuat\\Desktop\\ملفات java\\صور مشروع 77\\information.png")); // NOI18N
        btnohb.setText("Öğrenciler Hakkında Bilgiler");
        btnohb.setPreferredSize(new java.awt.Dimension(300, 60));
        btnohb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnohbActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnyok, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(139, 139, 139)
                        .addComponent(btnohb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnobg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(139, 139, 139)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(250, 250, 250)
                        .addComponent(btncikis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnyok, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnohb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(155, 155, 155)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnobg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(71, 71, 71)
                .addComponent(btncikis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(62, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnobgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnobgActionPerformed
        new OBG().setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_btnobgActionPerformed

    private void btnyokActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnyokActionPerformed
        new YOK().setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_btnyokActionPerformed

    private void btncikisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncikisActionPerformed
        int a=JOptionPane.showConfirmDialog(null,"Çıkış yapmak istiyor Musunuz?","Seç",JOptionPane.YES_NO_OPTION);
        if(a==0)
        {
            setVisible(false);
            new GIRIS().setVisible(true);
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_btncikisActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
       new YHB().setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void btnohbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnohbActionPerformed
        // new rrrrr().setVisible(true);
        new OHB().setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_btnohbActionPerformed

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
            java.util.logging.Logger.getLogger(EV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EV().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btncikis;
    private javax.swing.JButton btnobg;
    private javax.swing.JButton btnohb;
    private javax.swing.JButton btnyok;
    private javax.swing.JButton jButton4;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}

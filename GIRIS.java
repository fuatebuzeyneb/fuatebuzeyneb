
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author fuat
 */
public class GIRIS extends javax.swing.JFrame {

    /**
     * Creates new form GIRIS
     */
    public GIRIS() {
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

        jLabel1 = new javax.swing.JLabel();
        btngiris = new javax.swing.JButton();
        txtad = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtsifre = new javax.swing.JPasswordField();
        btncikis = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\fuat\\Desktop\\ملفات java\\صور مشروع 77\\user.png")); // NOI18N
        jLabel1.setText("Kullanıcı Adı:");

        btngiris.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        btngiris.setIcon(new javax.swing.ImageIcon("C:\\Users\\fuat\\Desktop\\ملفات java\\صور مشروع 77\\login.png")); // NOI18N
        btngiris.setText("Giriş");
        btngiris.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btngirisActionPerformed(evt);
            }
        });

        txtad.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 2, 18)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\fuat\\Desktop\\ملفات java\\صور مشروع 77\\lock.png")); // NOI18N
        jLabel2.setText("Şifre:");

        txtsifre.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        btncikis.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        btncikis.setIcon(new javax.swing.ImageIcon("C:\\Users\\fuat\\Desktop\\ملفات java\\صور مشروع 77\\logout.png")); // NOI18N
        btncikis.setText("Çıkış");
        btncikis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncikisActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(100, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE))
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtad, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtsifre, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btncikis, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btngiris, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(101, 101, 101))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(60, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(txtad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(68, 68, 68)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(txtsifre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(btncikis))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(btngiris)))
                .addGap(60, 60, 60))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btngirisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btngirisActionPerformed
        if(txtad.getText().equals("yurtoys")&& txtsifre.getText().equals("12345"))
        {
            setVisible(false);
            new EV().setVisible(true);
        }
        else {
            JOptionPane.showMessageDialog(null, "Şifre veya öğrenci adı yanlış");
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_btngirisActionPerformed

    private void btncikisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncikisActionPerformed
        int a=JOptionPane.showConfirmDialog(null,"Çıkmak istiyor Musunuz?","Seç",JOptionPane.YES_NO_OPTION);
        if(a==0)
        System.exit(0);

        // TODO add your handling code here:
    }//GEN-LAST:event_btncikisActionPerformed

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
            java.util.logging.Logger.getLogger(GIRIS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GIRIS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GIRIS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GIRIS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GIRIS().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btncikis;
    private javax.swing.JButton btngiris;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField txtad;
    private javax.swing.JPasswordField txtsifre;
    // End of variables declaration//GEN-END:variables
}
/*
      SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            String data =sdf.format(txtdogum.getDate());
        String tc =txttc.getText();
        String ad =txtad.getText();
        String soyad =txtsoyad.getText();
        String dogum =data;
        String bolum =txtbolum.getText();
        String sinif =boxsinif.getItemAt(boxsinif.getSelectedIndex());
        String email =txtemail.getText();
        String tel =txttel.getText();
        String babaad =txtbabaad.getText();
        String annead =txtannead.getText();
        String velitel =txtvelitel.getText();
        String odanumara =txtodanumara.getText();
        String sicil =boxsicil.getItemAt(boxsinif.getSelectedIndex());
        String adres =txtadres.getText();

        try{
            Connection con = ConnectionProvider.getCon();
            Statement st = con.createStatement();
            st.executeUpdate("insert into ogrenciler values('"+tc+"','"+ad+"','"+soyad+"','"+dogum+"','"+bolum+"','"+sinif+"','"+email+"','"+tel+"','"+babaad+"','"+annead+"','"+velitel+"','"+odanumara+"','"+sicil+"','"+adres+"')");
            JOptionPane.showMessageDialog(null, "KAYT BASARILA TAMAMLANDI");
            setVisible(false);
            new YOK().setVisible(true);
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "BU TC KİMLİK NO KULANILMIŞTIR!!!!");
        }
*/
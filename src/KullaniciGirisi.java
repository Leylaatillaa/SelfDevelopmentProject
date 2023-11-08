

import ayarlar.actionayar;
import ayarlar.duzen;
import ayarlar.textayar;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JTextField;


public class KullaniciGirisi extends javax.swing.JFrame { implements duzen

    private final String KIMLIK_TEXT_ORIGINAL = "T.C. NO / MÜŞTERİ NO";
    private final String SIFRE_TEXT_ORIGINAL  ="************";
    private JButton girisbutton;
    private JButton basvurbutton;
    private JTextField kimliktext;
    private Object şifretext;
   
    
    public KullaniciGirisi() {
        initComponents();
        getEdits();
    }

    /**
     BUTON RENKLENDİRME
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        kullanicipanel = new javax.swing.JPanel();
        hgtext = new javax.swing.JLabel();
        resim = new javax.swing.JLabel();
        kimliktext = new javax.swing.JTextField();
        şifretext = new javax.swing.JPasswordField();
        girisbutton = new javax.swing.JButton();
        katiltext = new javax.swing.JLabel();
        basvurbutton = new javax.swing.JButton();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ALA Banka Hoşgeldiniz");

        kullanicipanel.setBackground(new java.awt.Color(204, 204, 255));

        hgtext.setFont(new java.awt.Font("Times New Roman", 1, 15)); // NOI18N
        hgtext.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        hgtext.setText("DEĞERLİ ÜYEMİZ ALA BANKA HOŞGELDİNİZ ");

        resim.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bank (Özel).jpg"))); // NOI18N

        kimliktext.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        kimliktext.setForeground(new java.awt.Color(153, 153, 153));
        kimliktext.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                kimliktextFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                kimliktextFocusLost(evt);
            }
        });
        kimliktext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kimliktextActionPerformed(evt);
            }
        });

        şifretext.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        şifretext.setForeground(new java.awt.Color(153, 153, 153));
        şifretext.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                şifretextFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                şifretextFocusLost(evt);
            }
        });

        girisbutton.setBackground(new java.awt.Color(204, 204, 204));
        girisbutton.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        girisbutton.setForeground(new java.awt.Color(0, 0, 153));
        girisbutton.setText("GİRİŞ");
        girisbutton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        girisbutton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                girisbuttonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                girisbuttonMouseExited(evt);
            }
        });
        girisbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                girisbuttonActionPerformed(evt);
            }
        });

        katiltext.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        katiltext.setForeground(new java.awt.Color(0, 51, 51));
        katiltext.setText("Bize Katılmak İçin:");

        basvurbutton.setBackground(new java.awt.Color(204, 204, 204));
        basvurbutton.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        basvurbutton.setForeground(new java.awt.Color(0, 0, 153));
        basvurbutton.setText("BAŞVUR");
        basvurbutton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        basvurbutton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                basvurbuttonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                basvurbuttonMouseExited(evt);
            }
        });
        basvurbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                basvurbuttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout kullanicipanelLayout = new javax.swing.GroupLayout(kullanicipanel);
        kullanicipanel.setLayout(kullanicipanelLayout);
        kullanicipanelLayout.setHorizontalGroup(
            kullanicipanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kullanicipanelLayout.createSequentialGroup()
                .addGroup(kullanicipanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(kullanicipanelLayout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(resim)
                        .addGroup(kullanicipanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(kullanicipanelLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(hgtext, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(kullanicipanelLayout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addGroup(kullanicipanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(şifretext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(kimliktext, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, kullanicipanelLayout.createSequentialGroup()
                                        .addComponent(katiltext, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(basvurbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(9, 9, 9))))))
                    .addGroup(kullanicipanelLayout.createSequentialGroup()
                        .addGap(235, 235, 235)
                        .addComponent(girisbutton)))
                .addContainerGap(68, Short.MAX_VALUE))
        );

        kullanicipanelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {kimliktext, şifretext});

        kullanicipanelLayout.setVerticalGroup(
            kullanicipanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kullanicipanelLayout.createSequentialGroup()
                .addGroup(kullanicipanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(resim, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(kullanicipanelLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(hgtext, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(29, 29, 29)
                .addComponent(kimliktext, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(şifretext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(girisbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(kullanicipanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(katiltext, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(basvurbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        kullanicipanelLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {kimliktext, şifretext});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kullanicipanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kullanicipanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
 
    @Override 
    public void getEdits(){
      this.setLocationRelativeTo(null);
        kullanicipanel.setFocusable(true);
        kimliktext.setText(KIMLIK_TEXT_ORIGINAL);
        şifretext.setText(SIFRE_TEXT_ORIGINAL);
        textayar.setOnlyNumber(kimliktext);      
    }  
    
    private void kimliktextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kimliktextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kimliktextActionPerformed

    private void basvurbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_basvurbuttonActionPerformed
       actionayar.setVisible(this, basvuru());
    }//GEN-LAST:event_basvurbuttonActionPerformed

    private void girisbuttonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_girisbuttonMouseEntered
       MainClass.setBg(girisbutton, Color.GRAY);
    }//GEN-LAST:event_girisbuttonMouseEntered

    private void girisbuttonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_girisbuttonMouseExited
       MainClass.setOriginalBg(girisbutton);
    }//GEN-LAST:event_girisbuttonMouseExited

    private void basvurbuttonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_basvurbuttonMouseEntered
        MainClass.setBg(basvurbutton, Color.GRAY);
    }//GEN-LAST:event_basvurbuttonMouseEntered

    private void basvurbuttonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_basvurbuttonMouseExited
        MainClass.setOriginalBg(basvurbutton);
    }//GEN-LAST:event_basvurbuttonMouseExited
/*
   TEXT ODAKLANMA 
   */
    private void kimliktextFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_kimliktextFocusGained
       textayar.checkTheTextFocusGained(kimliktext, KIMLIK_TEXT_ORIGINAL);
    }//GEN-LAST:event_kimliktextFocusGained

    private void kimliktextFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_kimliktextFocusLost
       textayar.checkTheTextFocusGained(kimliktext);
    }   

    public static void main(String args[]){ // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    }//GEN-LAST:event_kimliktextFocusLost

    private void şifretextFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_şifretextFocusGained
       textayar.checkTheTextFocusGained(şifretext, SIFRE_TEXT_ORIGINAL);
    }//GEN-LAST:event_şifretextFocusGained

    private void şifretextFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_şifretextFocusLost
        textayar.checkTheTextFocusGained(şifretext);

    }//GEN-LAST:event_şifretextFocusLost

/*
BUTTON ACTİONS
*/

    private void girisbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_girisbuttonActionPerformed
        actionayar.setVisible(this, new Hesapekranı());
    }//GEN-LAST:event_girisbuttonActionPerformed

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
            java.util.logging.Logger.getLogger(KullaniciGirisi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(KullaniciGirisi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(KullaniciGirisi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(KullaniciGirisi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new KullaniciGirisi().setVisible(true);
            }
        });
} 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton basvurbutton;
    private javax.swing.JButton girisbutton;
    private javax.swing.JLabel hgtext;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel katiltext;
    private javax.swing.JTextField kimliktext;
    private javax.swing.JPanel kullanicipanel;
    private javax.swing.JLabel resim;
    private javax.swing.JPasswordField şifretext;
    // End of variables declaration//GEN-END:variables
}



import ayarlar.duzen;
import ayarlar.textayar;
import java.awt.Color;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author slael
 */
public class basvuru extends javax.swing.JFrame  implements duzen { 
    /**
     * Creates new form basvuru
     */
    public basvuru() {
        initComponents();
        getEdits();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        basvurupanel1 = new javax.swing.JPanel();
        kisiseltext2 = new javax.swing.JLabel();
        adlabel1 = new javax.swing.JLabel();
        adtext1 = new javax.swing.JTextField();
        tclabel1 = new javax.swing.JLabel();
        tctext1 = new javax.swing.JTextField();
        tellabel1 = new javax.swing.JLabel();
        teltext1 = new javax.swing.JTextField();
        kisiseltext3 = new javax.swing.JLabel();
        basvurupanel = new javax.swing.JPanel();
        kisiseltext = new javax.swing.JLabel();
        adlabel = new javax.swing.JLabel();
        adtext = new javax.swing.JTextField();
        tclabel = new javax.swing.JLabel();
        tctext = new javax.swing.JTextField();
        tellabel = new javax.swing.JLabel();
        teltext = new javax.swing.JTextField();
        güvbillabel = new javax.swing.JLabel();
        güvenliklabel = new javax.swing.JLabel();
        güvenlikbox = new javax.swing.JComboBox<>();
        cevlabel = new javax.swing.JLabel();
        cevtext = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        basvurupanel1.setBackground(new java.awt.Color(255, 204, 204));

        kisiseltext2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        kisiseltext2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        kisiseltext2.setText("Kişisel Bilgiler");

        adlabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        adlabel1.setForeground(new java.awt.Color(51, 0, 51));
        adlabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        adlabel1.setText("AD SOYAD:");

        adtext1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        tclabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        tclabel1.setForeground(new java.awt.Color(51, 0, 51));
        tclabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        tclabel1.setText("T.C. NO:");

        tellabel1.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        tellabel1.setForeground(new java.awt.Color(51, 0, 51));
        tellabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        tellabel1.setText("TELEFON NUMARASI:");

        kisiseltext3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        kisiseltext3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        kisiseltext3.setText("Güvenlik Bilgileri");

        javax.swing.GroupLayout basvurupanel1Layout = new javax.swing.GroupLayout(basvurupanel1);
        basvurupanel1.setLayout(basvurupanel1Layout);
        basvurupanel1Layout.setHorizontalGroup(
            basvurupanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(basvurupanel1Layout.createSequentialGroup()
                .addGroup(basvurupanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(basvurupanel1Layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addGroup(basvurupanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(tellabel1)
                            .addComponent(tclabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(adlabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33)
                        .addGroup(basvurupanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tctext1, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(adtext1, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(teltext1, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(basvurupanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(basvurupanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(kisiseltext3, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(kisiseltext2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(65, Short.MAX_VALUE))
        );
        basvurupanel1Layout.setVerticalGroup(
            basvurupanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(basvurupanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(kisiseltext2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(81, 81, 81)
                .addGroup(basvurupanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(adlabel1)
                    .addComponent(adtext1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(basvurupanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tclabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tctext1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(basvurupanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tellabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(teltext1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(kisiseltext3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(130, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        basvurupanel.setBackground(new java.awt.Color(255, 204, 204));

        kisiseltext.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        kisiseltext.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        kisiseltext.setText("Kişisel Bilgiler");

        adlabel.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        adlabel.setForeground(new java.awt.Color(51, 0, 51));
        adlabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        adlabel.setText("AD SOYAD:");

        adtext.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        tclabel.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        tclabel.setForeground(new java.awt.Color(51, 0, 51));
        tclabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        tclabel.setText("T.C. NO:");

        tellabel.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        tellabel.setForeground(new java.awt.Color(51, 0, 51));
        tellabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        tellabel.setText("TELEFON NUMARASI:");

        güvbillabel.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        güvbillabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        güvbillabel.setText("Güvenlik Bilgileri");

        güvenliklabel.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        güvenliklabel.setForeground(new java.awt.Color(51, 0, 0));
        güvenliklabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        güvenliklabel.setText("Güvenlik Sorusu:");

        güvenlikbox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "İlkokul Öğretmeninizin adı nedir?", "Evcil hayvanınızın adı nedir?", "En sevdiğiniz renk nedir?", "İlk telefonunuzun markası nedir?" }));

        cevlabel.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        cevlabel.setForeground(new java.awt.Color(51, 0, 0));
        cevlabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        cevlabel.setText("Cevap:");

        cevtext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cevtextActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(0, 153, 153));
        jButton1.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(51, 0, 0));
        jButton1.setText("BAŞVUR");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton1MouseExited(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout basvurupanelLayout = new javax.swing.GroupLayout(basvurupanel);
        basvurupanel.setLayout(basvurupanelLayout);
        basvurupanelLayout.setHorizontalGroup(
            basvurupanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(basvurupanelLayout.createSequentialGroup()
                .addGroup(basvurupanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(basvurupanelLayout.createSequentialGroup()
                        .addGroup(basvurupanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(basvurupanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(basvurupanelLayout.createSequentialGroup()
                                    .addGap(52, 52, 52)
                                    .addGroup(basvurupanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(tclabel, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(adlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(33, 33, 33))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, basvurupanelLayout.createSequentialGroup()
                                    .addContainerGap()
                                    .addComponent(tellabel)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                            .addGroup(basvurupanelLayout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addGroup(basvurupanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(güvbillabel, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(kisiseltext, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(44, 44, 44))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, basvurupanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(basvurupanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(cevlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(güvenliklabel))
                                .addGap(30, 30, 30)))
                        .addGroup(basvurupanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tctext)
                            .addComponent(adtext)
                            .addComponent(teltext)
                            .addComponent(güvenlikbox, 0, 272, Short.MAX_VALUE)
                            .addComponent(cevtext)))
                    .addGroup(basvurupanelLayout.createSequentialGroup()
                        .addGap(297, 297, 297)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(194, Short.MAX_VALUE))
        );
        basvurupanelLayout.setVerticalGroup(
            basvurupanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(basvurupanelLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(kisiseltext, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(81, 81, 81)
                .addGroup(basvurupanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(adlabel)
                    .addComponent(adtext, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(basvurupanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tclabel, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tctext, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(basvurupanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(teltext, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tellabel, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addComponent(güvbillabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(basvurupanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(güvenliklabel, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(güvenlikbox, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(basvurupanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cevlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cevtext, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 6, Short.MAX_VALUE)
                .addComponent(basvurupanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(basvurupanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    @Override
    public void getEdits() {
        this.setLocationRelativeTo(null)İ;
        basvurupanel.setFocusable(true);
        textayar.setOnlyAlphabetic(adtext);
        textayar.setOnlyNumber(tctext);
        textayar.setOnlyNumber(teltext);
        textayar.SetMaxLimit(tctext, 11);
        textayar.setMaxLimit(teltext,11);
        
    }
    
    
    
    private void cevtextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cevtextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cevtextActionPerformed

    private void jButton1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseEntered
       MainClass.setBg(basvurbutton, Color.gray);
    }//GEN-LAST:event_jButton1MouseEntered

    private void jButton1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseExited
         MainClass.setOriginalBg(basvurbutton);
    }//GEN-LAST:event_jButton1MouseExited

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        JOptionPane.showMessageDialog(this, "Başvurunuz kabule edilmiştir.");
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(basvuru.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(basvuru.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(basvuru.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(basvuru.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new basvuru().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel adlabel;
    private javax.swing.JLabel adlabel1;
    private javax.swing.JTextField adtext;
    private javax.swing.JTextField adtext1;
    private javax.swing.JPanel basvurupanel;
    private javax.swing.JPanel basvurupanel1;
    private javax.swing.JLabel cevlabel;
    private javax.swing.JTextField cevtext;
    private javax.swing.JLabel güvbillabel;
    private javax.swing.JComboBox<String> güvenlikbox;
    private javax.swing.JLabel güvenliklabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel kisiseltext;
    private javax.swing.JLabel kisiseltext2;
    private javax.swing.JLabel kisiseltext3;
    private javax.swing.JLabel tclabel;
    private javax.swing.JLabel tclabel1;
    private javax.swing.JTextField tctext;
    private javax.swing.JTextField tctext1;
    private javax.swing.JLabel tellabel;
    private javax.swing.JLabel tellabel1;
    private javax.swing.JTextField teltext;
    private javax.swing.JTextField teltext1;
    // End of variables declaration//GEN-END:variables

    private void setLocation(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}

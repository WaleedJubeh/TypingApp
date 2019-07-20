/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package typingapp;

/**
 *
 * @author aaxxo
 */
public class MainMenu extends javax.swing.JFrame {

    /**
     * Creates new form MainMenu
     */
    public MainMenu() {
        initComponents();
        
        this.setResizable(false);
        
        if(Settings.getLanguageName().equals(""))
        MainMenu_practiceButton.setEnabled(false);
        else
        MainMenu_practiceButton.setEnabled(true);   
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        MainMenu_panel = new javax.swing.JPanel();
        MainMenu_welcomeLabel = new javax.swing.JLabel();
        MainMenu_uploadSourceCodeButton = new javax.swing.JButton();
        MainMenu_practiceButton = new javax.swing.JButton();
        MainMenu_exitButton = new javax.swing.JButton();
        Mainform_javaImg = new javax.swing.JLabel();
        Mainform_cImage1 = new javax.swing.JLabel();
        Mainform_matlabImg = new javax.swing.JLabel();

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        MainMenu_welcomeLabel.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        MainMenu_welcomeLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        MainMenu_welcomeLabel.setText("Welcome To Code Typing Practice");

        MainMenu_uploadSourceCodeButton.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        MainMenu_uploadSourceCodeButton.setText("Upload Source Code");
        MainMenu_uploadSourceCodeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MainMenu_uploadSourceCodeButtonActionPerformed(evt);
            }
        });

        MainMenu_practiceButton.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        MainMenu_practiceButton.setText("Practice !");
        MainMenu_practiceButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MainMenu_practiceButtonActionPerformed(evt);
            }
        });

        MainMenu_exitButton.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        MainMenu_exitButton.setText("Exit");
        MainMenu_exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MainMenu_exitButtonActionPerformed(evt);
            }
        });

        Mainform_javaImg.setIcon(new javax.swing.ImageIcon("C:\\TypingApp\\TypingApp\\img\\java.png")); // NOI18N

        Mainform_cImage1.setIcon(new javax.swing.ImageIcon("C:\\TypingApp\\TypingApp\\img\\c++.png")); // NOI18N

        Mainform_matlabImg.setIcon(new javax.swing.ImageIcon("C:\\TypingApp\\TypingApp\\img\\matlab.png")); // NOI18N

        javax.swing.GroupLayout MainMenu_panelLayout = new javax.swing.GroupLayout(MainMenu_panel);
        MainMenu_panel.setLayout(MainMenu_panelLayout);
        MainMenu_panelLayout.setHorizontalGroup(
            MainMenu_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainMenu_panelLayout.createSequentialGroup()
                .addGroup(MainMenu_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MainMenu_panelLayout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(MainMenu_welcomeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(MainMenu_panelLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(Mainform_javaImg, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addGroup(MainMenu_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(MainMenu_uploadSourceCodeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(MainMenu_exitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(MainMenu_practiceButton, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(121, Short.MAX_VALUE))
            .addGroup(MainMenu_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MainMenu_panelLayout.createSequentialGroup()
                    .addContainerGap(348, Short.MAX_VALUE)
                    .addComponent(Mainform_cImage1)
                    .addGap(38, 38, 38)))
            .addGroup(MainMenu_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MainMenu_panelLayout.createSequentialGroup()
                    .addContainerGap(317, Short.MAX_VALUE)
                    .addComponent(Mainform_matlabImg)
                    .addGap(20, 20, 20)))
        );
        MainMenu_panelLayout.setVerticalGroup(
            MainMenu_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainMenu_panelLayout.createSequentialGroup()
                .addGroup(MainMenu_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MainMenu_panelLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(MainMenu_welcomeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(MainMenu_uploadSourceCodeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(MainMenu_practiceButton, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(MainMenu_panelLayout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addComponent(Mainform_javaImg)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(MainMenu_exitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57))
            .addGroup(MainMenu_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(MainMenu_panelLayout.createSequentialGroup()
                    .addGap(87, 87, 87)
                    .addComponent(Mainform_cImage1)
                    .addContainerGap(217, Short.MAX_VALUE)))
            .addGroup(MainMenu_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MainMenu_panelLayout.createSequentialGroup()
                    .addContainerGap(203, Short.MAX_VALUE)
                    .addComponent(Mainform_matlabImg)
                    .addGap(94, 94, 94)))
        );

        MainMenu_practiceButton.getAccessibleContext().setAccessibleParent(this);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MainMenu_panel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MainMenu_panel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MainMenu_exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MainMenu_exitButtonActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_MainMenu_exitButtonActionPerformed

    private void MainMenu_practiceButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MainMenu_practiceButtonActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new Practice().setVisible(true);
    }//GEN-LAST:event_MainMenu_practiceButtonActionPerformed

    private void MainMenu_uploadSourceCodeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MainMenu_uploadSourceCodeButtonActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new UploadSourceCode().setVisible(true);
    }//GEN-LAST:event_MainMenu_uploadSourceCodeButtonActionPerformed

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
                    javax.swing.UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton MainMenu_exitButton;
    private javax.swing.JPanel MainMenu_panel;
    private javax.swing.JButton MainMenu_practiceButton;
    private javax.swing.JButton MainMenu_uploadSourceCodeButton;
    private javax.swing.JLabel MainMenu_welcomeLabel;
    private javax.swing.JLabel Mainform_cImage1;
    private javax.swing.JLabel Mainform_javaImg;
    private javax.swing.JLabel Mainform_matlabImg;
    private javax.swing.JFrame jFrame1;
    // End of variables declaration//GEN-END:variables
}

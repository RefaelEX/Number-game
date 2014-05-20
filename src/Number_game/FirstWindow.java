package Number_game;
public class FirstWindow extends javax.swing.JFrame {

   
    public FirstWindow() {
        super("Number Game");
        setLocationRelativeTo(null);
        initComponents();
        goToNextWindowsButton.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        ComVsPlayerButtun = new javax.swing.JRadioButton();
        PlayerVsPlayerButtun = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        goToNextWindowsButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 153, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        buttonGroup1.add(ComVsPlayerButtun);
        ComVsPlayerButtun.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        ComVsPlayerButtun.setText("Computer vs Player");
        ComVsPlayerButtun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PlayerVscomputer(evt);
            }
        });

        buttonGroup1.add(PlayerVsPlayerButtun);
        PlayerVsPlayerButtun.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        PlayerVsPlayerButtun.setText("Player vs Player");
        PlayerVsPlayerButtun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                playerVsPlayer(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Khmer UI", 1, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 255));
        jLabel1.setText("Choose game type :");

        goToNextWindowsButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        goToNextWindowsButton.setText("Start");
        goToNextWindowsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goToNextWindowsButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(PlayerVsPlayerButtun)
                            .addComponent(ComVsPlayerButtun))))
                .addContainerGap(44, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(goToNextWindowsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(146, 146, 146))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ComVsPlayerButtun)
                .addGap(18, 18, 18)
                .addComponent(PlayerVsPlayerButtun)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addComponent(goToNextWindowsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void PlayerVscomputer(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PlayerVscomputer
        goToNextWindowsButton.setEnabled(true);
    }//GEN-LAST:event_PlayerVscomputer
    
    
    private void goToNextWindowsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goToNextWindowsButtonActionPerformed
        this.dispose();
        if(PlayerVsPlayerButtun.isSelected())
        {
            new ChooseNameVsPlayer().setVisible(true);
        }
        else if(ComVsPlayerButtun.isSelected())
        {
        new ChooseNameVsComputer().setVisible(true);
        }
    }//GEN-LAST:event_goToNextWindowsButtonActionPerformed

    private void playerVsPlayer(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_playerVsPlayer
        goToNextWindowsButton.setEnabled(true);
    }//GEN-LAST:event_playerVsPlayer

   
    public static void main(String args[]) {
        
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
            java.util.logging.Logger.getLogger(FirstWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FirstWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FirstWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FirstWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FirstWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton ComVsPlayerButtun;
    private javax.swing.JRadioButton PlayerVsPlayerButtun;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton goToNextWindowsButton;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}

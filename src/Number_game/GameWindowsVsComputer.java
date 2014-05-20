package Number_game;

import java.util.Arrays;

public class GameWindowsVsComputer extends javax.swing.JFrame {

    int arr[];
    int Playersum;
    int ComputerSum;
    static int Compchoice = 0;

    public GameWindowsVsComputer() {
        super("Number Game");
        setLocationRelativeTo(null);
        initComponents();
        PlayerNameField.setText(ChooseNameVsComputer.name);
    }

    public void Playagain() {
        arr = new int[10];
        Playersum = 0;
        ComputerSum = 0;
        arrFill(arr);
    }

    @SuppressWarnings("unchecked")

    public String PlayerChooseleft() {
        String sum = "";
        Playersum = Playersum + this.arr[0];
        arr = removeFirstIndex(arr);
        sum = sum + Playersum;
        return sum;
    }

    public String PlayerChooseRight() {
        String sum = "";
        Playersum = Playersum + this.arr[arr.length - 1];
        arr = removeLastIndex(arr);
        sum = sum + Playersum;
        return sum;
    }

    public String ComputerChoose() {
        String sum = "";
        int left = arr[0];
        int right = arr[arr.length - 1];
        int even = 0;
        int odd = 0;
        for (int i = 0; i < arr.length - 1; i += 2) {
            even = even + arr[i + 1];
            odd = odd + arr[i];
        }
        if (odd == even) {
            if (arr[left] > arr[right]) {
                ComputerSum = ComputerSum + arr[0];
                Compchoice = this.arr[0];
                arr = removeFirstIndex(arr);
                sum = sum + ComputerSum;
                return sum;
            } else {
                ComputerSum = ComputerSum + arr[arr.length - 1];
                Compchoice = this.arr[arr.length - 1];
                arr = removeLastIndex(arr);
                sum = sum + ComputerSum;
                return sum;
            }
        }
        if (odd > even) {
            ComputerSum = ComputerSum + arr[0];
            Compchoice = this.arr[0];
            arr = removeFirstIndex(arr);
            sum = sum + ComputerSum;
            return sum;
        } else {
            ComputerSum = ComputerSum + arr[arr.length - 1];
            Compchoice = this.arr[arr.length - 1];
            arr = removeLastIndex(arr);
            sum = sum + ComputerSum;
            return sum;
        }
    }

    public String toString() {
        return Arrays.toString(this.arr);
    }

    public boolean isEmpty() {
        return (this.arr.length == 0);
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        correntArrField = new javax.swing.JTextField();
        PlayerNameField = new javax.swing.JLabel();
        CsumField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        chooseLeft = new javax.swing.JButton();
        ChooseRight = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        PSumField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        PrevarrField = new javax.swing.JTextField();
        StartButtun = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        ComputerChoiseField = new javax.swing.JLabel();
        message = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("Corrent : ");

        correntArrField.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        PlayerNameField.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N

        CsumField.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setText("sum :");

        chooseLeft.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        chooseLeft.setText("left");
        chooseLeft.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chooseLeftActionPerformed(evt);
            }
        });

        ChooseRight.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        ChooseRight.setText("right");
        ChooseRight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChooseRightActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setText("Computer");

        PSumField.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        PSumField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PSumFieldActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel5.setText("sum :");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setText("Previous :");

        PrevarrField.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        StartButtun.setText("Start");
        StartButtun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StartButtunActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel6.setText("choose :");

        ComputerChoiseField.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        message.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        message.setForeground(new java.awt.Color(51, 255, 51));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jLabel4)
                        .addGap(213, 213, 213)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(chooseLeft, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(ChooseRight))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addComponent(PlayerNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel6)
                                    .addGap(254, 254, 254))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGap(20, 20, 20)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel5)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(46, 46, 46)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(ComputerChoiseField, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(CsumField, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                            .addComponent(jLabel3)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(PSumField, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(correntArrField, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(StartButtun, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(message, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(PrevarrField, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(StartButtun, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                    .addComponent(message, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(PrevarrField, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(correntArrField, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PlayerNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(ChooseRight)
                        .addComponent(chooseLeft))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                            .addComponent(ComputerChoiseField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(PSumField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CsumField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(42, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ChooseRightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChooseRightActionPerformed
            if (!isEmpty()) {
            PrevarrField.setText(toString());
            PSumField.setText(PlayerChooseRight());
            correntArrField.setText(toString());
        }
        if (!isEmpty()) {
            PrevarrField.setText(toString());
            CsumField.setText(ComputerChoose());
            ComputerChoiseField.setText(Integer.toString(Compchoice));
            correntArrField.setText(toString());
        } else {
            if (Playersum < ComputerSum) {
                message.setText("Computer wins with : " + ComputerSum);
            } else {
                message.setText("Player wins with : " + Playersum);
            }
        }
        StartButtun.setEnabled(true);

    }//GEN-LAST:event_ChooseRightActionPerformed

    private void chooseLeftActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chooseLeftActionPerformed
        if (!isEmpty()) {
            PrevarrField.setText(toString());
            PSumField.setText(PlayerChooseleft());
            correntArrField.setText(toString());
        }
        if (!isEmpty()) {
            PrevarrField.setText(toString());
            CsumField.setText(ComputerChoose());
            ComputerChoiseField.setText(Integer.toString(Compchoice));
            correntArrField.setText(toString());
        } else {
            if (Playersum < ComputerSum) {
                message.setText("Computer wins with : " + ComputerSum);
            } else {
                message.setText("Player wins with : " + Playersum);
            }
        }
        StartButtun.setEnabled(true);

    }//GEN-LAST:event_chooseLeftActionPerformed

    private void StartButtunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StartButtunActionPerformed
        Playagain();
        PrevarrField.setText(toString());
        StartButtun.setEnabled(false);
        message.setText("");
        PrevarrField.setText(toString());
       ComputerChoiseField.setText(ComputerChoose());
        PSumField.setText("0");
        correntArrField.setText(toString());
        CsumField.setText(Integer.toString(ComputerSum));
    }//GEN-LAST:event_StartButtunActionPerformed

    private void PSumFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PSumFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PSumFieldActionPerformed

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
            java.util.logging.Logger.getLogger(GameWindowsVsComputer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GameWindowsVsComputer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GameWindowsVsComputer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GameWindowsVsComputer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GameWindowsVsComputer().setVisible(true);
            }
        });
    }

    private void arrFill(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * (99));
        }
    }

    private int[] removeLastIndex(int arr[]) {
        int j = 0;
        int[] tmp = new int[arr.length - 1];
        for (int i = 0; i < arr.length - 1; i++) {
            tmp[j++] = arr[i];
        }
        return tmp;
    }

    private int[] removeFirstIndex(int arr[]) {
        int j = 0;
        int[] tmp = new int[arr.length - 1];
        for (int i = 1; i < arr.length; i++) {
            tmp[j++] = arr[i];
        }
        return tmp;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ChooseRight;
    private javax.swing.JLabel ComputerChoiseField;
    private javax.swing.JTextField CsumField;
    private javax.swing.JTextField PSumField;
    private javax.swing.JLabel PlayerNameField;
    private javax.swing.JTextField PrevarrField;
    private javax.swing.JButton StartButtun;
    private javax.swing.JButton chooseLeft;
    private javax.swing.JTextField correntArrField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel message;
    // End of variables declaration//GEN-END:variables
}

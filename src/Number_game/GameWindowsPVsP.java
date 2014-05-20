package Number_game;

import java.util.Arrays;

public class GameWindowsPVsP extends javax.swing.JFrame {

    int P1sum;
    int P2sum;
    int arr[] = new int[10];
    static int player1choose = 0;
    static int player2choose = 0;

    public GameWindowsPVsP() {
        super("Number Game");
        setLocationRelativeTo(null);
        initComponents();
        P1NameField.setText(ChooseNameVsPlayer.P1Name);
        P2NameField.setText(ChooseNameVsPlayer.P2Name);
    }

    public void playAgain() {
        arr = new int[10];
        P1sum = 0;
        P2sum = 0;
        arrFill(arr);
    }

    public String player1chooseleft() {

        String s = "";
        P1sum = P1sum + arr[0];
        player1choose = arr[0];
        arr = removeFirstIndex(arr);
        s = s + P1sum;
        return s;
    }

    public String player1chooseright() {

        String s = "";
        player1choose = arr[arr.length - 1];
        P1sum = P1sum + arr[arr.length - 1];
        arr = removeLastIndex(arr);
        s = s + P1sum;
        return s;
    }

    public String player2chooseright() {

        String s = "";
        player2choose = arr[arr.length - 1];
        P2sum = P2sum + arr[arr.length - 1];
        arr = removeLastIndex(arr);
        s = s + P2sum;
        return s;
    }

    public String player2chooseleft() {

        String s = "";
        player2choose = arr[0];
        P2sum = P2sum + arr[0];
        arr = removeFirstIndex(arr);
        s = s + P2sum;
        return s;
    }

    public boolean isEmpty() {
        return (this.arr.length == 0);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Player_2_right = new javax.swing.JButton();
        Player_2_left = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Player_2_sumField = new javax.swing.JTextField();
        Player_1_sumField = new javax.swing.JTextField();
        P1NameField = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Player_1_left = new javax.swing.JButton();
        Player_1_right = new javax.swing.JButton();
        P2NameField = new javax.swing.JLabel();
        StartButtun = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        correntArrField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        PrevarrField = new javax.swing.JTextField();
        message = new javax.swing.JLabel();
        Player1ChooseField = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Player2ChooseField = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        turnfield = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 153, 255));

        Player_2_right.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        Player_2_right.setText("right");
        Player_2_right.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Player_2_rightActionPerformed(evt);
            }
        });

        Player_2_left.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        Player_2_left.setText("left");
        Player_2_left.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Player_2_leftActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setText("sum :");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N

        Player_2_sumField.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        Player_1_sumField.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        P1NameField.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        P1NameField.setForeground(new java.awt.Color(0, 0, 153));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel5.setText("sum :");

        Player_1_left.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        Player_1_left.setText("left");
        Player_1_left.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Player_1_leftActionPerformed(evt);
            }
        });

        Player_1_right.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        Player_1_right.setText("right");
        Player_1_right.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Player_1_rightActionPerformed(evt);
            }
        });

        P2NameField.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        P2NameField.setForeground(new java.awt.Color(0, 0, 153));

        StartButtun.setText("Start");
        StartButtun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StartButtunActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("Corrent : ");

        correntArrField.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        correntArrField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                correntArrFieldActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setText("Previous :");

        PrevarrField.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        PrevarrField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PrevarrFieldActionPerformed(evt);
            }
        });

        message.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        message.setForeground(new java.awt.Color(102, 204, 0));

        Player1ChooseField.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel6.setText("choose :");

        Player2ChooseField.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel7.setText("choose :");

        turnfield.setFont(new java.awt.Font("Eras Demi ITC", 1, 24)); // NOI18N
        turnfield.setForeground(new java.awt.Color(255, 0, 51));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Player_1_left, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Player_1_right))
                            .addComponent(jLabel6)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(66, 66, 66)
                                .addComponent(Player1ChooseField, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addComponent(P1NameField, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(turnfield, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(P2NameField, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel2))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel7)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(66, 66, 66)
                                    .addComponent(Player2ChooseField, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(Player_2_left, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(Player_2_right))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(Player_2_sumField, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(correntArrField, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(StartButtun, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(message, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(PrevarrField, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Player_1_sumField, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(72, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(StartButtun, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(message, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(PrevarrField, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(correntArrField, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(P2NameField, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(turnfield, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(14, 14, 14)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Player2ChooseField, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Player_2_right)
                            .addComponent(Player_2_left)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(P1NameField, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Player1ChooseField, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Player_1_right)
                            .addComponent(Player_1_left))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Player_1_sumField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Player_2_sumField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Player_2_rightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Player_2_rightActionPerformed
        if (!isEmpty()) {
            Player_1_left.setEnabled(true);
            Player_1_right.setEnabled(true);
            Player_2_left.setEnabled(false);
            Player_2_right.setEnabled(false);
            PrevarrField.setText(this.toString());
            Player_2_sumField.setText(player2chooseright());
            Player2ChooseField.setText(Integer.toString(player2choose));
            correntArrField.setText(this.toString());
            turnfield.setText(ChooseNameVsPlayer.P1Name + " turn");
        }
        if (isEmpty()) {
            howWins();
        }
    }//GEN-LAST:event_Player_2_rightActionPerformed

    private void Player_1_rightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Player_1_rightActionPerformed
        if (!isEmpty()) {
            Player_1_left.setEnabled(false);
            Player_1_right.setEnabled(false);
            Player_2_left.setEnabled(true);
            Player_2_right.setEnabled(true);
            PrevarrField.setText(this.toString());
            Player_1_sumField.setText(player1chooseright());
            Player1ChooseField.setText(Integer.toString(player1choose));
            correntArrField.setText(this.toString());
            turnfield.setText(ChooseNameVsPlayer.P2Name + " turn");
        }
        if (isEmpty()) {
            howWins();
        }
    }//GEN-LAST:event_Player_1_rightActionPerformed

    private void StartButtunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StartButtunActionPerformed
        playAgain();
        StartButtun.setEnabled(false);
        PrevarrField.setText(toString());
        correntArrField.setText(toString());
        message.setText("");
        Player_1_sumField.setText("0");
        Player_2_sumField.setText("0");
        Player_1_left.setEnabled(true);
            Player_1_right.setEnabled(true);
            Player_2_left.setEnabled(true);
            Player_2_right.setEnabled(true);
    }//GEN-LAST:event_StartButtunActionPerformed

    private void PrevarrFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PrevarrFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PrevarrFieldActionPerformed

    private void Player_1_leftActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Player_1_leftActionPerformed
        if (!isEmpty()) {
            Player_1_left.setEnabled(false);
            Player_1_right.setEnabled(false);
            Player_2_left.setEnabled(true);
            Player_2_right.setEnabled(true);
            PrevarrField.setText(this.toString());
            Player_1_sumField.setText(player1chooseleft());
            Player1ChooseField.setText(Integer.toString(player1choose));
            correntArrField.setText(this.toString());
            turnfield.setText(ChooseNameVsPlayer.P2Name + " turn");
        }
        if (isEmpty()) {
            howWins();
        }
    }//GEN-LAST:event_Player_1_leftActionPerformed

    private void Player_2_leftActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Player_2_leftActionPerformed
        if (!isEmpty()) {
            Player_1_left.setEnabled(true);
            Player_1_right.setEnabled(true);
            Player_2_left.setEnabled(false);
            Player_2_right.setEnabled(false);
            PrevarrField.setText(this.toString());
            Player_2_sumField.setText(player2chooseleft());
            Player2ChooseField.setText(Integer.toString(player2choose));
            correntArrField.setText(this.toString());
            turnfield.setText(ChooseNameVsPlayer.P1Name + " turn");
        }
        if (isEmpty()) {
            howWins();
        }

    }//GEN-LAST:event_Player_2_leftActionPerformed

    private void correntArrFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_correntArrFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_correntArrFieldActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GameWindowsPVsP().setVisible(true);
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

    public void howWins() {
        if (P1sum > P2sum) {
            message.setText(ChooseNameVsPlayer.P1Name + " wins !!");
            StartButtun.setEnabled(true);
            turnfield.setText("game over");
            Player_1_left.setEnabled(false);
            Player_1_right.setEnabled(false);
            Player_2_left.setEnabled(false);
            Player_2_right.setEnabled(false);
        } else if (P1sum < P2sum) {
            message.setText(ChooseNameVsPlayer.P2Name + " wins !!");
            StartButtun.setEnabled(true);
            turnfield.setText("game over");
            Player_1_left.setEnabled(false);
            Player_1_right.setEnabled(false);
            Player_2_left.setEnabled(false);
            Player_2_right.setEnabled(false);
        } else {
            message.setText("It's a draw !!");
            StartButtun.setEnabled(true);
            turnfield.setText("game over");
            Player_1_left.setEnabled(false);
            Player_1_right.setEnabled(false);
            Player_2_left.setEnabled(false);
            Player_2_right.setEnabled(false);
        }
    }

    public String toString() {
        return Arrays.toString(this.arr);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel P1NameField;
    private javax.swing.JLabel P2NameField;
    private javax.swing.JLabel Player1ChooseField;
    private javax.swing.JLabel Player2ChooseField;
    private javax.swing.JButton Player_1_left;
    private javax.swing.JButton Player_1_right;
    private javax.swing.JTextField Player_1_sumField;
    private javax.swing.JButton Player_2_left;
    private javax.swing.JButton Player_2_right;
    private javax.swing.JTextField Player_2_sumField;
    private javax.swing.JTextField PrevarrField;
    private javax.swing.JButton StartButtun;
    private javax.swing.JTextField correntArrField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel message;
    private javax.swing.JLabel turnfield;
    // End of variables declaration//GEN-END:variables
}

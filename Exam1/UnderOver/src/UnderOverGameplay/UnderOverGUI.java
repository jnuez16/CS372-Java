/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UnderOverGameplay;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jnuez16
 */
public class UnderOverGUI extends javax.swing.JFrame {

    User user = null;
    UnderOver un = new UnderOver();
    boolean found = false;
    int choice;
    int userint;
    int index;

    /**
     * Creates new form UnderOverGUI
     */
    public UnderOverGUI() throws IOException {
        user = new User();
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
        userName = new javax.swing.JTextField();
        LogIn = new javax.swing.JButton();
        User = new javax.swing.JLabel();
        Money = new javax.swing.JLabel();
        Under7 = new javax.swing.JButton();
        Over7 = new javax.swing.JButton();
        Seven = new javax.swing.JButton();
        betMoney = new javax.swing.JTextField();
        Bet = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Die1 = new javax.swing.JLabel();
        Die2 = new javax.swing.JLabel();
        Roll = new javax.swing.JButton();
        Bet2 = new javax.swing.JLabel();
        Choice = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Username:");

        LogIn.setText("Log in");
        LogIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogInActionPerformed(evt);
            }
        });

        User.setText("User:");

        Money.setText("Money:");

        Under7.setText("Under 7");
        Under7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Under7ActionPerformed(evt);
            }
        });

        Over7.setText("Over 7");
        Over7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Over7ActionPerformed(evt);
            }
        });

        Seven.setText("7");
        Seven.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SevenActionPerformed(evt);
            }
        });

        Bet.setText("Bet");
        Bet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BetActionPerformed(evt);
            }
        });

        jLabel4.setText("Die 1");

        jLabel5.setText("Die 2");

        Die1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Die1.setText("0");

        Die2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Die2.setText("0");

        Roll.setText("Roll");
        Roll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RollActionPerformed(evt);
            }
        });

        Bet2.setText("Bet:");

        Choice.setText("Choice:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(userName, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(LogIn)
                        .addGap(82, 82, 82))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(User)
                                    .addComponent(Money)
                                    .addComponent(Bet2))
                                .addGap(148, 148, 148)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(Under7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Over7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(Bet)
                                        .addGap(84, 84, 84)
                                        .addComponent(Choice)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(betMoney, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(Seven, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(60, 60, 60)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Die1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Die2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap(79, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Roll)
                                .addGap(70, 70, 70))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(userName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LogIn))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(User)
                    .addComponent(Under7)
                    .addComponent(jLabel4))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(Over7))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Die1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel5)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(betMoney, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Bet))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(Die2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Seven))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(Roll)
                                    .addComponent(Choice)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(Money)
                        .addGap(18, 18, 18)
                        .addComponent(Bet2)))
                .addContainerGap(63, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LogInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogInActionPerformed
        // TODO add your handling code here:
        //
        //checks if the file is empty by checking the array of usernames
        if (!user.getUsername().isEmpty()) {
            for (int i = 0; i < user.getUsername().size(); i++) {
                if (user.getUsername().get(i).equals(userName.getText())) {
                    User.setText(String.format("User: %s", user.getUsername().get(i)));
                    Money.setText(String.format("Money: %d", user.getMoney().get(i)));
                    index = i;
                    found = true;
                }
            }
            if (!found) { //if not found, create a new user
                try {
                    user.update(userName.getText());
                    User.setText(String.format("User: %s", user.getUsername().get(user.getUsername().size() - 1)));
                    Money.setText(String.format("Money: %d", user.getMoney().get(user.getMoney().size() - 1)));

                } catch (IOException ex) {
                    Logger.getLogger(UnderOverGUI.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        } else { //if file is empty create a new user
            try {
                user.update(userName.getText());
                User.setText(String.format("User: %s", user.getUsername().get(user.getUsername().size() - 1)));
                Money.setText(String.format("Money: %d", user.getMoney().get(user.getMoney().size() - 1)));

            } catch (IOException ex) {
                Logger.getLogger(UnderOverGUI.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }//GEN-LAST:event_LogInActionPerformed

    private void BetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BetActionPerformed
        // TODO add your handling code here:

        //Places the bets
        try {
            un.setBet(Integer.parseInt(betMoney.getText()));
            Bet2.setText(String.format("Bet: %s", betMoney.getText()));
        } catch (Exception e) {
            System.out.println("Error: Input an Integer!");
        }


    }//GEN-LAST:event_BetActionPerformed

    private void Under7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Under7ActionPerformed
        // TODO add your handling code here:
        choice = 0;
        userint = 5;
        Choice.setText(Under7.getText()); //changes the GUI
    }//GEN-LAST:event_Under7ActionPerformed

    private void Over7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Over7ActionPerformed
        // TODO add your handling code here:
        choice = 0;
        userint = 10;
        Choice.setText(Over7.getText()); //changes the UI
    }//GEN-LAST:event_Over7ActionPerformed

    private void SevenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SevenActionPerformed
        // TODO add your handling code here:
        choice = 1;
        userint = 7;
        Choice.setText(Seven.getText()); //changes the UI
    }//GEN-LAST:event_SevenActionPerformed

    private void RollActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RollActionPerformed
        // TODO add your handling code here:
        int[] rolling = un.roll();
        Die1.setText(String.format("%d", rolling[0]));
        Die2.setText(String.format("%d", rolling[1]));
        int total = rolling[0] + rolling[1];

        //checks the rolls agains the user's choice
        if ((total < 7 && userint < 7) || (total > 7 && userint > 7)) {
            user.changeMoney(index, un.Win(un.getBet(), choice, user.getMoney().get(index)));
        } else if ((total == 7 && userint == 7)) {
            user.changeMoney(index, un.Win(un.getBet(), choice, user.getMoney().get(index)));
        } else if ((total < 7 && userint >= 7) || (total > 7 && userint <= 7)) {
            user.changeMoney(index, un.Lose(un.getBet(), choice, user.getMoney().get(index)));
        } else if ((total == 7 && (userint < 7 || userint > 7))) {
            user.changeMoney(index, un.Lose(un.getBet(), choice, user.getMoney().get(index)));
        }

        Money.setText(String.format("Money: %d", user.getMoney().get(index)));
        try {
            user.fileUpdate(); //updates the file
        } catch (IOException ex) {
            Logger.getLogger(UnderOverGUI.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_RollActionPerformed

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
            java.util.logging.Logger.getLogger(UnderOverGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UnderOverGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UnderOverGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UnderOverGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new UnderOverGUI().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(UnderOverGUI.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IllegalArgumentException ex) {
                    System.out.printf("Error: %s\n", ex.getMessage());
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Bet;
    private javax.swing.JLabel Bet2;
    private javax.swing.JLabel Choice;
    private javax.swing.JLabel Die1;
    private javax.swing.JLabel Die2;
    private javax.swing.JButton LogIn;
    private javax.swing.JLabel Money;
    private javax.swing.JButton Over7;
    private javax.swing.JButton Roll;
    private javax.swing.JButton Seven;
    private javax.swing.JButton Under7;
    private javax.swing.JLabel User;
    private javax.swing.JTextField betMoney;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField userName;
    // End of variables declaration//GEN-END:variables
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package CookieSales;

/**
 *
 * @author jnuez16
 */
public class CookiesTrackerUI extends javax.swing.JFrame {
    Cookies mint = new Cookies("Thin Mints", 3.0);
    Cookies samoas = new Cookies("Samoas", 4.0);
    Cookies cc = new Cookies("Chocoloate Chip", 5.0);
    int x,y,z;
    /**
     * Creates new form CookiesTrackerUI
     */
    public CookiesTrackerUI() {
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        CCText = new javax.swing.JTextField();
        SamoasText = new javax.swing.JTextField();
        Add = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        MintNum = new javax.swing.JLabel();
        SamoasNum = new javax.swing.JLabel();
        CCNum = new javax.swing.JLabel();
        MintCost = new javax.swing.JLabel();
        SamoasCost = new javax.swing.JLabel();
        CCCost = new javax.swing.JLabel();
        TotalCost = new javax.swing.JLabel();
        TotalNum = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        MintText = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Cookie Sales Tracker");

        jLabel2.setText("Thin Mints:");

        jLabel3.setText("Samoas:");

        jLabel4.setText("Chocolate Chip:");

        Add.setText("Add");
        Add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddActionPerformed(evt);
            }
        });

        jLabel5.setText("Numb of Cookies:");

        jLabel6.setText("Cost:");

        MintNum.setText("0");

        SamoasNum.setText("0");

        CCNum.setText("0");

        MintCost.setText("$ 0");

        SamoasCost.setText("$ 0");

        CCCost.setText("$ 0");

        TotalCost.setText("$ 0");

        TotalNum.setText("0");

        jLabel15.setText("Total:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5)
                        .addGap(69, 69, 69))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel2))
                                        .addGap(29, 29, 29)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(SamoasText, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)
                                            .addComponent(CCText)
                                            .addComponent(MintText))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 143, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel15)
                                .addGap(66, 66, 66)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(MintNum)
                            .addComponent(SamoasNum)
                            .addComponent(CCNum)
                            .addComponent(TotalNum))
                        .addGap(86, 86, 86)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(MintCost)
                    .addComponent(jLabel6)
                    .addComponent(SamoasCost)
                    .addComponent(CCCost)
                    .addComponent(TotalCost))
                .addGap(40, 40, 40))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(184, 184, 184))
            .addGroup(layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(Add)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(MintNum)
                    .addComponent(MintCost)
                    .addComponent(MintText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SamoasText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(SamoasNum)
                    .addComponent(SamoasCost))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CCText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(CCNum)
                    .addComponent(CCCost))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(TotalNum)
                    .addComponent(TotalCost))
                .addGap(5, 5, 5)
                .addComponent(Add)
                .addGap(37, 37, 37))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddActionPerformed
        // TODO add your handling code here:
        if(MintText.getText().equals(""))
            x = 0;
        else
            x = Integer.parseInt(MintText.getText());
        mint.addItem(x);
        
        if(SamoasText.getText().equals(""))
            y = 0;
        else
            y = Integer.parseInt(SamoasText.getText());
        
        samoas.addItem(y);
        
        if(CCText.getText().equals(""))
            z = 0;
        else
            z = Integer.parseInt(CCText.getText());
        cc.addItem(z);
        
        MintNum.setText(String.format("%d", mint.numItems()));
        SamoasNum.setText(String.format("%d", samoas.numItems()));
        CCNum.setText(String.format("%d", cc.numItems()));
        TotalNum.setText(String.format("%d", cc.numItems()+mint.numItems()+samoas.numItems()));
        
        MintCost.setText(String.format("$ %.2f", mint.totalCost()));
        SamoasCost.setText(String.format("$ %.2f", samoas.totalCost()));
        CCCost.setText(String.format("$ %.2f", cc.totalCost()));
        TotalCost.setText(String.format("$ %.2f", cc.totalCost()+samoas.totalCost()+mint.totalCost()));
        
        MintText.setText("");
        SamoasText.setText("");
        CCText.setText("");
        
    }//GEN-LAST:event_AddActionPerformed

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
            java.util.logging.Logger.getLogger(CookiesTrackerUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CookiesTrackerUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CookiesTrackerUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CookiesTrackerUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CookiesTrackerUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Add;
    private javax.swing.JLabel CCCost;
    private javax.swing.JLabel CCNum;
    private javax.swing.JTextField CCText;
    private javax.swing.JLabel MintCost;
    private javax.swing.JLabel MintNum;
    private javax.swing.JTextField MintText;
    private javax.swing.JLabel SamoasCost;
    private javax.swing.JLabel SamoasNum;
    private javax.swing.JTextField SamoasText;
    private javax.swing.JLabel TotalCost;
    private javax.swing.JLabel TotalNum;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    // End of variables declaration//GEN-END:variables
}
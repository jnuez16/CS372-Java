/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EventCalendar;

import java.io.IOException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;

/**
 *
 * @author jnuez_000
 */
public class EventCalendarGUI extends javax.swing.JFrame {

    CalendarInformation cl = null;
    String date2;

    /**
     * Creates new form EventCalendarGUI
     *
     * @throws java.io.IOException
     */
    public EventCalendarGUI() throws IOException {
        cl = new CalendarInformation();
        DefaultListModel listModel = new DefaultListModel();
        initComponents();
        if (!cl.getEvent().isEmpty()) {
            for (int i = 0; i < cl.getEvent().size(); i++) {
                TitleList.setModel(cl.getTitleList());
                LocationList.setModel(cl.getLocList());
                DateList.setModel(cl.getDateList());
            }
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        LocationList = new javax.swing.JList();
        jScrollPane2 = new javax.swing.JScrollPane();
        TitleList = new javax.swing.JList();
        jScrollPane3 = new javax.swing.JScrollPane();
        DateList = new javax.swing.JList();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        LocField = new javax.swing.JTextField();
        AddEvent = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        TitleField = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        Month = new javax.swing.JComboBox();
        Day = new javax.swing.JComboBox();
        Year = new javax.swing.JComboBox();
        SortTitle = new javax.swing.JButton();
        SortLoc = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jScrollPane1.setViewportView(LocationList);

        jScrollPane2.setViewportView(TitleList);

        jScrollPane3.setViewportView(DateList);

        jLabel1.setText("Title:");

        jLabel2.setText("Location:");

        jLabel3.setText("Date:");

        jLabel4.setText("Title:");

        jLabel5.setText("Location:");

        jLabel6.setText("Date:");

        AddEvent.setText("Add Event");
        AddEvent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddEventActionPerformed(evt);
            }
        });

        jLabel7.setText("Event Manager");

        jLabel8.setText("Month");

        jLabel9.setText("Day");

        jLabel10.setText("Year");

        Month.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));
        Month.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MonthActionPerformed(evt);
            }
        });

        Day.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        Day.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DayActionPerformed(evt);
            }
        });

        Year.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019", "2020", "2021", "2022", "2023", "2024", "2025", "2026", "2027", "2028", "2029", "2030" }));
        Year.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                YearActionPerformed(evt);
            }
        });

        SortTitle.setText("Sort By Title");
        SortTitle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SortTitleActionPerformed(evt);
            }
        });

        SortLoc.setText("Sort By Location");
        SortLoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SortLocActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel5))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(LocField)
                                            .addComponent(TitleField)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(40, 40, 40)
                                        .addComponent(jLabel8)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel9)
                                        .addGap(44, 44, 44)
                                        .addComponent(jLabel10)
                                        .addGap(25, 25, 25))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Month, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(Day, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(Year, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(51, 51, 51)
                                .addComponent(AddEvent, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(41, 41, 41))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(SortTitle)
                        .addGap(11, 11, 11)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addGap(36, 36, 36))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(SortLoc)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel3))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(TitleField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(LocField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10)
                            .addComponent(jLabel8))
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(Month, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Day, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Year, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(AddEvent)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SortLoc)
                    .addComponent(SortTitle))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AddEventActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddEventActionPerformed
        try {
            date2 = Month.getSelectedItem().toString() + "/" + Day.getSelectedItem().toString() + "/"
                    + Year.getSelectedItem().toString();
            // TODO add your handling code here:
            cl.addInfo(TitleField.getText(), LocField.getText(), date2);
            if (!cl.getEvent().isEmpty()) {
                for (int i = 0; i < cl.getEvent().size(); i++) {
                    TitleList.setModel(cl.getTitleList());
                    LocationList.setModel(cl.getLocList());
                    DateList.setModel(cl.getDateList());
                }
            }
            cl.update();
        } catch (IOException ex) {
            Logger.getLogger(EventCalendarGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_AddEventActionPerformed

    private void DayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DayActionPerformed
        // TODO add your handling code here:
        //day = Integer.parseInt(Day.getSelectedItem().toString());
    }//GEN-LAST:event_DayActionPerformed

    private void MonthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MonthActionPerformed
        // TODO add your handling code here:
        if (Integer.parseInt(Month.getSelectedItem().toString()) == 2) {
            Day.removeAllItems();
            for (int i = 1; i <= 28; i++) {
                Day.addItem(i);
            }
            if ((Integer.parseInt(Year.getSelectedItem().toString()) % 4) == 0) {
                Day.removeAllItems();
                for (int i = 1; i <= 29; i++) {
                    Day.addItem(i);
                }
            }
        } else if ((Integer.parseInt(Month.getSelectedItem().toString()) % 2) == 0) {
            Day.removeAllItems();
            for (int i = 1; i <= 30; i++) {
                Day.addItem(i);
            }
        } else {
            Day.removeAllItems();
            for (int i = 1; i <= 31; i++) {
                Day.addItem(i);
            }
        }

    }//GEN-LAST:event_MonthActionPerformed

    private void YearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_YearActionPerformed
        // TODO add your handling code here:
        if (Integer.parseInt(Month.getSelectedItem().toString()) == 2) {
            Day.removeAllItems();
            for (int i = 1; i <= 28; i++) {
                Day.addItem(i);
            }
            if ((Integer.parseInt(Year.getSelectedItem().toString()) % 4) == 0) {
                Day.removeAllItems();
                for (int i = 1; i <= 29; i++) {
                    Day.addItem(i);
                }
            }
        } else if ((Integer.parseInt(Month.getSelectedItem().toString()) % 2) == 0) {
            Day.removeAllItems();
            for (int i = 1; i <= 30; i++) {
                Day.addItem(i);
            }
        } else {
            Day.removeAllItems();
            for (int i = 1; i <= 31; i++) {
                Day.addItem(i);
            }
        }

    }//GEN-LAST:event_YearActionPerformed

    private void SortTitleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SortTitleActionPerformed
//        try {
//            // TODO add your handling code here:
//            cl.sortTitle();
//            cl.update();
//            if (!cl.getTitle().isEmpty()) {
//                for (int i = 0; i < cl.getTitle().size(); i++) {
//                    TitleList.setListData((Vector) cl.getTitle());
//                    LocationList.setListData((Vector) cl.getLoc());
//                    DateList.setListData((Vector) cl.getDate());
//                }
//            }
//        } catch (IOException ex) {
//            Logger.getLogger(EventCalendarGUI.class.getName()).log(Level.SEVERE, null, ex);
//        }
    }//GEN-LAST:event_SortTitleActionPerformed

    private void SortLocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SortLocActionPerformed
        // TODO add your handling code here:
//                try {
//            // TODO add your handling code here:
//            cl.sortLoc();
//            cl.update();
//            if (!cl.getTitle().isEmpty()) {
//                for (int i = 0; i < cl.getTitle().size(); i++) {
//                    TitleList.setListData((Vector) cl.getTitle());
//                    LocationList.setListData((Vector) cl.getLoc());
//                    DateList.setListData((Vector) cl.getDate());
//                }
//            }
//        } catch (IOException ex) {
//            Logger.getLogger(EventCalendarGUI.class.getName()).log(Level.SEVERE, null, ex);
//        }
    }//GEN-LAST:event_SortLocActionPerformed

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
            java.util.logging.Logger.getLogger(EventCalendarGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EventCalendarGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EventCalendarGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EventCalendarGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new EventCalendarGUI().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(EventCalendarGUI.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddEvent;
    private javax.swing.JList DateList;
    private javax.swing.JComboBox Day;
    private javax.swing.JTextField LocField;
    private javax.swing.JList LocationList;
    private javax.swing.JComboBox Month;
    private javax.swing.JButton SortLoc;
    private javax.swing.JButton SortTitle;
    private javax.swing.JTextField TitleField;
    private javax.swing.JList TitleList;
    private javax.swing.JComboBox Year;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    // End of variables declaration//GEN-END:variables
}

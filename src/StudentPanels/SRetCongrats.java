package StudentPanels;

import static StudentPanels.Database.connectDB;
import java.awt.CardLayout;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.util.Calendar;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Emily Anas
 */
public class SRetCongrats extends javax.swing.JPanel {

    JPanel home;

    /**
     * Creates new form SSignOut
     */
    public SRetCongrats() {
        initComponents();
    }

    public SRetCongrats(JPanel p) {
        initComponents();
        home = p;
    }

    public void RetCongratsInit() {
        Connection c = connectDB();
        if (c == null) {
            System.exit(-1);
        }
        Statement stmt;
        ResultSet rs;
        //int text text boolean
        lblItem.setText("");
        lblStudent.setText("..... except you didn't");
        lblRetDate.setText("");
        try {
            stmt = c.createStatement();
            rs = stmt.executeQuery("SELECT * FROM history");
            // Now do something with the ResultSet .... 
            while (rs.next() == true) {
                if (SLogin.getid().equals(rs.getString("s_id")) && SReturn.getBarcode().equals(rs.getString("i_bc"))) {
                    lblItem.setText("Item Barcode: " + SReturn.getBarcode());
                    lblStudent.setText("Student ID: " + SLogin.getid());
                    lblRetDate.setText("Returned: " + SReturn.getRetDate());
                    return;
                }
                //System.out.println(rs.getObject(1));
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Something went wrong", "Inane error", JOptionPane.ERROR_MESSAGE);
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

        btnMenu = new javax.swing.JButton();
        lblHeader = new javax.swing.JLabel();
        lblItem = new javax.swing.JLabel();
        lblStudent = new javax.swing.JLabel();
        btnLogout = new javax.swing.JButton();
        lblRetDate = new javax.swing.JLabel();

        btnMenu.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnMenu.setText("Return to menu");
        btnMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuActionPerformed(evt);
            }
        });

        lblHeader.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lblHeader.setText("Congratulations! You returned an item");

        lblItem.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblItem.setText("Item Barcode:");

        lblStudent.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblStudent.setText("Student ID:");

        btnLogout.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnLogout.setText("Log out");
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });

        lblRetDate.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblRetDate.setText("Return Date:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnMenu)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnLogout))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(108, 108, 108)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblStudent)
                            .addComponent(lblItem)
                            .addComponent(lblRetDate))
                        .addGap(0, 730, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(193, 193, 193)
                .addComponent(lblHeader)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(lblHeader)
                .addGap(153, 153, 153)
                .addComponent(lblItem)
                .addGap(77, 77, 77)
                .addComponent(lblStudent)
                .addGap(90, 90, 90)
                .addComponent(lblRetDate)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 251, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnMenu)
                    .addComponent(btnLogout))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuActionPerformed
        CardLayout cl = (CardLayout) home.getLayout();
        cl.show(home, "menu");
        // TODO add your handling code here:
    }//GEN-LAST:event_btnMenuActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        CardLayout cl = (CardLayout) home.getLayout();
        cl.show(home, "login");// TODO add your handling code here:
    }//GEN-LAST:event_btnLogoutActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnMenu;
    private javax.swing.JLabel lblHeader;
    private javax.swing.JLabel lblItem;
    private javax.swing.JLabel lblRetDate;
    private javax.swing.JLabel lblStudent;
    // End of variables declaration//GEN-END:variables
}

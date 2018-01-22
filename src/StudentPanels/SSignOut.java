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
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
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
public class SSignOut extends javax.swing.JPanel {

    JPanel home;

    /**
     * Creates new form SSignOut
     */
    public SSignOut() {
        initComponents();
    }

    public SSignOut(JPanel p) {
        initComponents();
        home = p;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnBack = new javax.swing.JButton();
        lblHeader = new javax.swing.JLabel();
        tfBarcode = new javax.swing.JTextField();
        tfSignout = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(1000, 750));

        btnBack.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        lblHeader.setFont(new java.awt.Font("Tahoma", 0, 35)); // NOI18N
        lblHeader.setText("Please scan the barcode of the item you would like to sign out");

        tfBarcode.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        tfSignout.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        tfSignout.setText("Sign out");
        tfSignout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfSignoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(tfBarcode, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(298, 298, 298))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(tfSignout)
                        .addGap(436, 436, 436))))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnBack)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addComponent(lblHeader)
                .addGap(18, 18, 18))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblHeader)
                .addGap(243, 243, 243)
                .addComponent(tfBarcode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(tfSignout)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 298, Short.MAX_VALUE)
                .addComponent(btnBack)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        CardLayout cl = (CardLayout) home.getLayout();
        cl.show(home, "menu");
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBackActionPerformed

    private void tfSignoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfSignoutActionPerformed
        String barcode = tfBarcode.getText();
        String id = SLogin.getid();
        //DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Calendar cal = Calendar.getInstance();
        Date now = new Date(cal.getTimeInMillis());
        //String sodate = df.format(cal.getTime());
        Timestamp sts = new Timestamp(now.getTime());
        Timestamp rts = new Timestamp(0,0,0,0,0,0,0);
        
        Connection c = Database.connectDB(); 
        if (c == null) 
            System.exit(-1); 
        Statement stmt; 
        //data types are: int text text boolean
        try { 
            stmt = c.createStatement();
            String q = "insert into history(sodate,s_id,i_bc,return_date) values(?,?,?,?)";
            PreparedStatement pstmt = c.prepareStatement(q); {
            pstmt.setTimestamp(1, sts);
            pstmt.setString(2,id);
            pstmt.setString(3, barcode);
            pstmt.setTimestamp(4,rts);
            pstmt.executeUpdate();
            
            System.out.println("Boop");
        }} catch (SQLException e) {
            System.out.println(e.getMessage()+"\n rip");
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_tfSignoutActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JLabel lblHeader;
    private javax.swing.JTextField tfBarcode;
    private javax.swing.JButton tfSignout;
    // End of variables declaration//GEN-END:variables
}

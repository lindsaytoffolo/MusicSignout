package TeacherPanels;

import java.awt.CardLayout;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import javax.swing.JLabel;
import javax.swing.JPanel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author 072584980
 */
public class TStudentHistory extends javax.swing.JPanel {

    JPanel home;
    String sNum, bc;
    Timestamp so,si;
    int ln;

    /**
     * Creates new form TMenu
     */
    public TStudentHistory() {
        initComponents();
    }

    public TStudentHistory(JPanel p) {
        initComponents();
        home = p;
        checkStudent();
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

        setPreferredSize(new java.awt.Dimension(1000, 750));

        btnBack.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnBack)
                .addContainerGap(921, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(708, Short.MAX_VALUE)
                .addComponent(btnBack)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        CardLayout cl = (CardLayout) home.getLayout();
        cl.show(home, "menu");        
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBackActionPerformed

    public void checkStudent(){
        //sNum = TPickStudent.getStuNum();
        //for testing purposes 
        sNum = "073853186";
        Connection c = StudentPanels.Database.connectDB();
        if (c == null) 
            System.exit(-1); 
        Statement stmt; 
        ResultSet rs; 
        ln = 0;
        //these try catch statements allow the types and objects to appear
        try { 
            stmt = c.createStatement();
            rs = stmt.executeQuery("SELECT * FROM history"); 
            String fdo = new SimpleDateFormat("yyyyMMdd").format(rs.getTimestamp("sodate"));
            String fdi = new SimpleDateFormat("yyyyMMdd").format(rs.getTimestamp("return_date"));
            do { 
                if(sNum.equals(rs.getString("student"))){
                    JLabel stuNumber = new JLabel(rs.getString("student"));
                    JLabel signOut = new JLabel(fdo);
                    JLabel signIn = new JLabel(fdi);
                    JLabel barcode = new JLabel(rs.getString("i_barcode"));
                    JLabel [] labels = {stuNumber,barcode,signOut,signIn};
                    for(int i = 0; i<4; i++){
                        add(labels[i]);
                        labels[i].setLocation(20+(20*i), ln);
                    }
                    ln = ln+20;
                }
                //System.out.println(rs.getObject(1));
            } while (rs.next());
        } catch (SQLException e) {
            System.out.println(e.getMessage()+"\nrip");
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    // End of variables declaration//GEN-END:variables
}

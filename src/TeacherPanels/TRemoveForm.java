package TeacherPanels;

import StudentPanels.Database;
import static StudentPanels.Database.connectDB;
import java.awt.CardLayout;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
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
public class TRemoveForm extends javax.swing.JPanel {

    /**
     * @return the home
     */
    public JPanel getHome() {
        return home;
    }

    /**
     * @param home the home to set
     */
    public void setHome(JPanel home) {
        this.home = home;
    }

    /**
     * @return the item
     */
    public String getItem() {
        return item;
    }

    /**
     * @param item the item to set
     */
    public void setItem(String item) {
        this.item = item;
    }

    /**
     * @return the btnBack
     */
    public javax.swing.JButton getBtnBack() {
        return btnBack;
    }

    /**
     * @param btnBack the btnBack to set
     */
    public void setBtnBack(javax.swing.JButton btnBack) {
        this.btnBack = btnBack;
    }

    /**
     * @return the btnGet
     */
    public javax.swing.JButton getBtnGet() {
        return btnGet;
    }

    /**
     * @param btnGet the btnGet to set
     */
    public void setBtnGet(javax.swing.JButton btnGet) {
        this.btnGet = btnGet;
    }

    /**
     * @return the cbItem
     */
    public javax.swing.JComboBox getCbItem() {
        return cbItem;
    }

    /**
     * @param cbItem the cbItem to set
     */
    public void setCbItem(javax.swing.JComboBox cbItem) {
        this.cbItem = cbItem;
    }

    /**
     * @return the cbObject
     */
    public javax.swing.JComboBox getCbObject() {
        return cbObject;
    }

    /**
     * @param cbObject the cbObject to set
     */
    public void setCbObject(javax.swing.JComboBox cbObject) {
        this.cbObject = cbObject;
    }

    /**
     * @return the cbType
     */
    public javax.swing.JComboBox getCbType() {
        return cbType;
    }

    /**
     * @param cbType the cbType to set
     */
    public void setCbType(javax.swing.JComboBox cbType) {
        this.cbType = cbType;
    }

    /**
     * @return the jLabel7
     */
    public javax.swing.JLabel getjLabel7() {
        return jLabel7;
    }

    /**
     * @param jLabel7 the jLabel7 to set
     */
    public void setjLabel7(javax.swing.JLabel jLabel7) {
        this.jLabel7 = jLabel7;
    }

    /**
     * @return the lblHeader
     */
    public javax.swing.JLabel getLblHeader() {
        return lblHeader;
    }

    /**
     * @param lblHeader the lblHeader to set
     */
    public void setLblHeader(javax.swing.JLabel lblHeader) {
        this.lblHeader = lblHeader;
    }

    /**
     * @return the lblItem
     */
    public javax.swing.JLabel getLblItem() {
        return lblItem;
    }

    /**
     * @param lblItem the lblItem to set
     */
    public void setLblItem(javax.swing.JLabel lblItem) {
        this.lblItem = lblItem;
    }

    /**
     * @return the lblObject
     */
    public javax.swing.JLabel getLblObject() {
        return lblObject;
    }

    /**
     * @param lblObject the lblObject to set
     */
    public void setLblObject(javax.swing.JLabel lblObject) {
        this.lblObject = lblObject;
    }

    /**
     * @return the lblType
     */
    public javax.swing.JLabel getLblType() {
        return lblType;
    }

    /**
     * @param lblType the lblType to set
     */
    public void setLblType(javax.swing.JLabel lblType) {
        this.lblType = lblType;
    }

    private JPanel home;
    private String item;

    /**
     * Creates new form TMenu
     */
    public TRemoveForm() {
        initComponents();
    }

    public TRemoveForm(JPanel p) {
        initComponents();
        home = p;
        String type;
        String object;
        Connection c = StudentPanels.Database.connectDB();
        if (c == null) System.exit(-1); 
        Statement stmt; 
        ResultSet rs; 
        //these try catch statements allow the choices for type, object, and item to appear in the combo boxes
        try { 
            stmt = c.createStatement();
            rs = stmt.executeQuery("SELECT * FROM type"); 
            while (rs.next()==true) { 
                type = rs.getString("name");
                cbType.addItem(type);
        }
        rs.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage()+"\nrip");
        }
        try { 
            stmt = c.createStatement();
            rs = stmt.executeQuery("SELECT * FROM object"); 
            while (rs.next()==true) { 
                object = rs.getString("name");
                cbObject.addItem(object);
                //System.out.println(rs.getObject(1));
        }
        rs.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage()+"\nrip");
        }
        try { 
            stmt = c.createStatement();
            rs = stmt.executeQuery("SELECT * FROM item"); 
            while (rs.next()==true) { 
                object = rs.getString("name");
                cbItem.addItem(object);
                //System.out.println(rs.getObject(1));
        }
        rs.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage()+"\nrip");
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

        lblHeader = new javax.swing.JLabel();
        lblType = new javax.swing.JLabel();
        lblObject = new javax.swing.JLabel();
        cbType = new javax.swing.JComboBox();
        cbObject = new javax.swing.JComboBox();
        jLabel7 = new javax.swing.JLabel();
        btnGet = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        lblItem = new javax.swing.JLabel();
        cbItem = new javax.swing.JComboBox();

        setPreferredSize(new java.awt.Dimension(1000, 750));

        lblHeader.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lblHeader.setText("Please fill in the following information");

        lblType.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblType.setText("Type");

        lblObject.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblObject.setText("Object");

        cbType.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        cbObject.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        btnGet.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnGet.setText("Confirm");
        btnGet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGetActionPerformed(evt);
            }
        });

        btnBack.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        lblItem.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblItem.setText("Item");

        cbItem.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(64, 64, 64)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnGet))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(212, 212, 212)
                        .addComponent(lblHeader)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(333, 333, 333)
                        .addComponent(lblItem))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblType, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblObject, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(cbObject, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cbType, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(cbItem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(437, 437, 437))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblHeader, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(118, 118, 118)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblType))
                .addGap(106, 106, 106)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbObject, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblObject))
                .addGap(96, 96, 96)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbItem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblItem))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 266, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(25, 25, 25))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGet)
                    .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        CardLayout cl = (CardLayout) getHome().getLayout();
        cl.show(getHome(), "menu");        
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnGetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGetActionPerformed
        //sets item (to remove) to selected item in combo box
        setItem((String) getCbItem().getSelectedItem());
        Connection c = Database.connectDB(); 
        if (c == null) 
            System.exit(-1); 
        Statement stmt; 
        boolean act = false;
        //sets selected item to inactive in DB
        try { 
            stmt = c.createStatement();
            String q = ("UPDATE item SET active = "+act+" WHERE name = '" + getItem() + "' ");
            PreparedStatement pstmt = c.prepareStatement(q); {
            pstmt.executeUpdate();
            System.out.println("Booply");
        }} catch (SQLException e) {
            System.out.println(e.getMessage()+"\nrip");
        }
    }//GEN-LAST:event_btnGetActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnGet;
    private javax.swing.JComboBox cbItem;
    private javax.swing.JComboBox cbObject;
    private javax.swing.JComboBox cbType;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel lblHeader;
    private javax.swing.JLabel lblItem;
    private javax.swing.JLabel lblObject;
    private javax.swing.JLabel lblType;
    // End of variables declaration//GEN-END:variables
}

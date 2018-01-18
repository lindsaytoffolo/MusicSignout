package TeacherPanels;

import java.awt.CardLayout;
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
public class TAddForm extends javax.swing.JPanel {

    JPanel home;

    /**
     * Creates new form TMenu
     */
    public TAddForm() {
        initComponents();
    }

    public TAddForm(JPanel p) {
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

        lblHeader = new javax.swing.JLabel();
        lblType = new javax.swing.JLabel();
        lblObject = new javax.swing.JLabel();
        cbType = new javax.swing.JComboBox();
        cbObject = new javax.swing.JComboBox();
        tfNewType = new javax.swing.JTextField();
        tfNewObject = new javax.swing.JTextField();
        lblCongrats = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        lblBarcode = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(1000, 750));

        lblHeader.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        lblHeader.setText("Please fill in the following information");

        lblType.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblType.setText("Type");

        lblObject.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblObject.setText("Object");

        cbType.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cbType.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Create new type" }));

        cbObject.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cbObject.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Create new object" }));

        tfNewType.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tfNewType.setText("Name of type");

        tfNewObject.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tfNewObject.setText("Name of object");

        lblCongrats.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblCongrats.setText("Congratulations! You added a new item!");

        lblName.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblName.setText("Name:");

        lblBarcode.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblBarcode.setText("Barcode #:");

        btnBack.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnAdd.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnAdd.setText("Add item");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnBack))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(212, 212, 212)
                        .addComponent(lblHeader))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblBarcode)
                            .addComponent(lblName)
                            .addComponent(lblCongrats))))
                .addContainerGap(195, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblType, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblObject, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cbObject, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tfNewType, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbType, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tfNewObject, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(437, 437, 437))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnAdd)
                        .addGap(112, 112, 112))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblHeader, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(118, 118, 118)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblType))
                .addGap(26, 26, 26)
                .addComponent(tfNewType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(93, 93, 93)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbObject, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblObject))
                .addGap(29, 29, 29)
                .addComponent(tfNewObject, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(btnAdd)
                .addGap(20, 20, 20)
                .addComponent(lblCongrats)
                .addGap(43, 43, 43)
                .addComponent(lblName)
                .addGap(35, 35, 35)
                .addComponent(lblBarcode)
                .addGap(25, 80, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnBack)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        CardLayout cl = (CardLayout) home.getLayout();
        cl.show(home, "menu");
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        String object;
        String type;

        if (cbObject.getSelectedIndex() == 0) {
            object = tfNewObject.getText();
            if (cbType.getSelectedIndex() == 0) {
                type = tfNewType.getText();
            } 
            else {
                type = (String) cbType.getSelectedItem();
            }
        } 
        else {
            object = (String) cbObject.getSelectedItem();
            type = (String) cbType.getSelectedItem();
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAddActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnBack;
    private javax.swing.JComboBox cbObject;
    private javax.swing.JComboBox cbType;
    private javax.swing.JLabel lblBarcode;
    private javax.swing.JLabel lblCongrats;
    private javax.swing.JLabel lblHeader;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblObject;
    private javax.swing.JLabel lblType;
    private javax.swing.JTextField tfNewObject;
    private javax.swing.JTextField tfNewType;
    // End of variables declaration//GEN-END:variables
}

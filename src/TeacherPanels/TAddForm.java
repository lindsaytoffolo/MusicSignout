package TeacherPanels;

import static StudentPanels.Database.connectDB;
import java.awt.CardLayout;
import java.awt.Component;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
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

    private JPanel home;
    private String type="";
    private String obj = "";
    private int t_id = 0;
    private int o_id = 0;
    private int i_id = 0;
    private String barcode = "0";
    private Random rdm = new Random();
    private Connection c;

    /**
     * Creates new form TMenu
     */
    public TAddForm() {
        initComponents();
    }

    public TAddForm(JPanel p) {
        initComponents();
        home = p;
        //hides added new item message
        lblCongrats.setText("");
        lblName.setText("");
        lblBarcode.setText("");
        String typ;
        String object;
        c = StudentPanels.Database.connectDB();
        if (c == null) 
            System.exit(-1); 
        Statement stmt; 
        ResultSet rs; 
        //these try catch statements allow the types and objects to appear
        try { 
            stmt = c.createStatement();
            rs = stmt.executeQuery("SELECT * FROM type"); 
            while (rs.next()) { 
                typ = rs.getString("name");
                cbType.addItem(typ);
                //System.out.println(rs.getObject(1));
        }} catch (SQLException e) {
            System.out.println(e.getMessage()+"\nrip");
        }
        try { 
            stmt = c.createStatement();
            rs = stmt.executeQuery("SELECT * FROM object"); 
            while (rs.next()) { 
                object = rs.getString("name");
                cbObject.addItem(object);
                //System.out.println(rs.getObject(1));
        }} catch (SQLException e) {
            System.out.println(e.getMessage()+"\nrip");
        }
    }
    
    public String genBarcode(){
        Statement stmt;
        ResultSet rs;
        String bc = "";
        boolean exist;
        do{
            //randomly generate barcode
            for(int i=0; i<10; i++){
                int num = getRdm().nextInt(10);
                bc = bc+num;
            }
            exist = false;
            //check if bc exists
            try {
            stmt = getC().createStatement();
            rs = stmt.executeQuery("SELECT * FROM item"); 
            while (rs.next()==true) { 
                String bar = rs.getString("barcode");
                if(bar.equals(bc)){
                    exist=true;
                }
            }
            rs.close();
            } catch (SQLException e) {
                System.out.println(e.getMessage()+"\nrip");
            }
            //method will keep generating barcodes until it comes up with one that doesn't already exist
            }while (exist==true);
        //return generated barcodee
        return bc;
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
        cbType.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cbTypeMouseClicked(evt);
            }
        });
        cbType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbTypeActionPerformed(evt);
            }
        });

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
                .addGap(0, 320, Short.MAX_VALUE)
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
        CardLayout cl = (CardLayout) getHome().getLayout();
        cl.show(getHome(), "menu");
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBackActionPerformed

    private void cbTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbTypeActionPerformed
        
    }//GEN-LAST:event_cbTypeActionPerformed

    private void cbTypeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbTypeMouseClicked
        
    }//GEN-LAST:event_cbTypeMouseClicked

    //add item button pressed
    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        //connection and DB set up jazz
        setC(StudentPanels.Database.connectDB());
        if (getC() == null) 
            System.exit(-1);
        Statement stmt; 
        ResultSet rs; 
        
        //sets type to entered type and adds new type to DB
        if(getCbType().getSelectedIndex()==0){
            try { 
                setType(getTfNewType().getText());
                String q = "insert into type(t_id,name) values(DEFAULT,?)";
                PreparedStatement pstmt = getC().prepareStatement(q); {
                pstmt.setString(1, getType());
                pstmt.executeUpdate();
                System.out.println("Boop");
            }} catch (SQLException e) {
                System.out.println(e.getMessage()+"\nrip");
            }
        }
        
        //sets type to selected type
        else{
            setType((String) getCbType().getSelectedItem());
        }
        
        //reset type ID
        setT_id(0);
        int count = 0;
        
        //determines type ID
        try { 
            stmt = getC().createStatement();
            rs = stmt.executeQuery("SELECT * FROM type"); 
            //determines ID of the selected type
            while(rs.next() && getT_id()==0){
                count++;
                String tableType = rs.getString("name");
                if(tableType.equals(getType())){
                    setT_id(getT_id() + 1);
                }
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage()+"\nrip1");
        }
        setT_id(count);
        System.out.println("Type ID: "+getT_id());
        
        //sets object to entered object
        if(getCbObject().getSelectedIndex()==0){
            setObj(getTfNewObject().getText());
        }
        
        //sets object to selected object
        else{
            setObj((String) getCbObject().getSelectedItem());
        }
        
        try { 
            //adds new object, object ID, and type ID to DB
            String q = "insert into object(o_id,t_id,name) values(DEFAULT,?,?)";
            PreparedStatement pstmt = getC().prepareStatement(q); {
                pstmt.setInt(1, getT_id());
                pstmt.setString(2, getObj());
                pstmt.executeUpdate();
                System.out.println("Boop");
        }} catch (SQLException e) {
            System.out.println(e.getMessage()+"\nrip1");
        }
        
        //resets o_id and i_id
        setO_id(0);
        setI_id(0);
        
        try {  
                stmt = getC().createStatement();
                rs = stmt.executeQuery("SELECT * FROM object"); 
                //determine object ID
                while(rs.next()){
                    setO_id(getO_id() + 1);
                }
                rs.close();
                rs = stmt.executeQuery("SELECT * FROM object"); 
                //determine item ID
                while(rs.next()){
                    if((rs.getString("name").equals(getObj()))){
                        setI_id(getI_id() + 1);
                    }
                }
                rs.close();
                System.out.println("i_id of new item: "+getI_id());
                setBarcode(genBarcode());
                //enters item info into item table
                String q = "insert into item(barcode,i_id,o_id,t_id,name,active) values(?,?,?,?,?,?)";
                PreparedStatement pstmt = getC().prepareStatement(q); {
                    pstmt.setString(1, getBarcode());
                    pstmt.setInt(2, getI_id());
                    pstmt.setInt(3, getO_id());
                    pstmt.setInt(4, getT_id());
                    pstmt.setString(5, getObj()+" "+getI_id());
                    pstmt.setBoolean(6, true);
                    pstmt.executeUpdate();
                    System.out.println("Boop");
                }
                rs.close();
            } catch (SQLException e) {
                System.out.println(e.getMessage()+"\nrip");
            }
        //added new item message appears
        getLblCongrats().setText("Congratulations! You added a new item!");
        getLblName().setText("Name: "+getObj()+" "+getI_id());
        getLblBarcode().setText("Barcode #: "+getBarcode());
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
     * @return the type
     */
    public String getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * @return the obj
     */
    public String getObj() {
        return obj;
    }

    /**
     * @param obj the obj to set
     */
    public void setObj(String obj) {
        this.obj = obj;
    }

    /**
     * @return the t_id
     */
    public int getT_id() {
        return t_id;
    }

    /**
     * @param t_id the t_id to set
     */
    public void setT_id(int t_id) {
        this.t_id = t_id;
    }

    /**
     * @return the o_id
     */
    public int getO_id() {
        return o_id;
    }

    /**
     * @param o_id the o_id to set
     */
    public void setO_id(int o_id) {
        this.o_id = o_id;
    }

    /**
     * @return the i_id
     */
    public int getI_id() {
        return i_id;
    }

    /**
     * @param i_id the i_id to set
     */
    public void setI_id(int i_id) {
        this.i_id = i_id;
    }

    /**
     * @return the barcode
     */
    public String getBarcode() {
        return barcode;
    }

    /**
     * @param barcode the barcode to set
     */
    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    /**
     * @return the rdm
     */
    public Random getRdm() {
        return rdm;
    }

    /**
     * @param rdm the rdm to set
     */
    public void setRdm(Random rdm) {
        this.rdm = rdm;
    }

    /**
     * @return the c
     */
    public Connection getC() {
        return c;
    }

    /**
     * @param c the c to set
     */
    public void setC(Connection c) {
        this.c = c;
    }

    /**
     * @return the btnAdd
     */
    public javax.swing.JButton getBtnAdd() {
        return btnAdd;
    }

    /**
     * @param btnAdd the btnAdd to set
     */
    public void setBtnAdd(javax.swing.JButton btnAdd) {
        this.btnAdd = btnAdd;
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
     * @return the lblBarcode
     */
    public javax.swing.JLabel getLblBarcode() {
        return lblBarcode;
    }

    /**
     * @param lblBarcode the lblBarcode to set
     */
    public void setLblBarcode(javax.swing.JLabel lblBarcode) {
        this.lblBarcode = lblBarcode;
    }

    /**
     * @return the lblCongrats
     */
    public javax.swing.JLabel getLblCongrats() {
        return lblCongrats;
    }

    /**
     * @param lblCongrats the lblCongrats to set
     */
    public void setLblCongrats(javax.swing.JLabel lblCongrats) {
        this.lblCongrats = lblCongrats;
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
     * @return the lblName
     */
    public javax.swing.JLabel getLblName() {
        return lblName;
    }

    /**
     * @param lblName the lblName to set
     */
    public void setLblName(javax.swing.JLabel lblName) {
        this.lblName = lblName;
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

    /**
     * @return the tfNewObject
     */
    public javax.swing.JTextField getTfNewObject() {
        return tfNewObject;
    }

    /**
     * @param tfNewObject the tfNewObject to set
     */
    public void setTfNewObject(javax.swing.JTextField tfNewObject) {
        this.tfNewObject = tfNewObject;
    }

    /**
     * @return the tfNewType
     */
    public javax.swing.JTextField getTfNewType() {
        return tfNewType;
    }

    /**
     * @param tfNewType the tfNewType to set
     */
    public void setTfNewType(javax.swing.JTextField tfNewType) {
        this.tfNewType = tfNewType;
    }
}

package StudentPanels;

//package linkedlist; 
import java.sql.*; 

/** * * @author michael.roy-diclemen */ 

public class Database { 
    
    /** * @param args the command line arguments */ 

    public static void main(String[] args) { 
        connectDB();
        readDB();
    }
    
    public static Connection connectDB() { 
        Connection connection = null;
        try { 
            connection = DriverManager.getConnection("jdbc:mysql://10.242.72.28/music_system_el", "music", "doremi");
    } catch (SQLException e) { 
        System.out.println("connection failed\n" + e);
        return null;
    } 
    return connection;
    } 
    
    public static void readDB(){
        Connection c = connectDB(); 
        if (c == null) System.exit(-1); 
        Statement stmt; 
        ResultSet rs; 
        int count = 0;
            //int text text boolean
        try { 
            stmt = c.createStatement();
            rs = stmt.executeQuery("SELECT * FROM item"); 
            // Now do something with the ResultSet .... 
            while (rs.next()==true) { 
                System.out.println(rs.getBoolean("active"));
                count++;
                //System.out.println(rs.getObject(1));
        }} catch (SQLException e) {
            System.out.println(e.getMessage()+"\nrip");
        }
        System.out.println("Count: "+count);
    }
    
    public static void addDB(){
        Connection c = connectDB(); 
        if (c == null) 
            System.exit(-1); 
        Statement stmt; 
        //data types are: int text text boolean
        try { 
            stmt = c.createStatement();
            String q = "insert into item(barcode,i_id,o_id,t_id,name,active) values(?,DEFAULT,?,?,?,?)";
            PreparedStatement pstmt = c.prepareStatement(q); {
            pstmt.setString(1,"12345");
            pstmt.setInt(2,1);
            pstmt.setInt(3, 1);
            pstmt.setString(4,"Instrument 10");
            pstmt.setBoolean(5, true);
            pstmt.executeUpdate();
            System.out.println("Boop");
        }} catch (SQLException e) {
            System.out.println(e.getMessage()+"\nrip");
        }
    }
    
    public static void deleteDB(){
        Connection c = connectDB(); 
        if (c == null) System.exit(-1); 
        try {
            String query = "delete from type";
            PreparedStatement preparedStmt = c.prepareStatement(query);
            preparedStmt.execute();
            /*stmt = c.createStatement();
            rs = stmt.executeQuery("DELETE * FROM object"); */
        } catch (SQLException e) {
            System.out.println(e.getMessage()+"\nrip");
        }
    }
}

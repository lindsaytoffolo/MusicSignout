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
    
    //method that establishes connection to database
    public static Connection connectDB() { 
        Connection connection = null;
        //try connecting then catch connection error
        try { 
            connection = DriverManager.getConnection("jdbc:mysql://10.242.72.28/music_system_el", "music", "doremi");
        } catch (SQLException e) { 
            System.out.println("connection failed\n" + e);
            return null;
        } 
    return connection;
    } 
    
    //method that lets you write to DB
    public static void readDB(){
        //connect
        Connection c = connectDB(); 
        if (c == null) System.exit(-1); 
        //initialize statament and resultset
        Statement stmt; 
        ResultSet rs; 
        int count = 0;
        //try reading from specified column(s) from a specified table
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
    
    //method that lets you read from DB
    public static void addDB(){
        Connection c = connectDB(); 
        if (c == null) 
            System.exit(-1); 
        Statement stmt; 
        //try writing to a table 
        try { 
            stmt = c.createStatement();
            //specifies which table and columns
            String q = "insert into item(barcode,i_id,o_id,t_id,name,active) values(?,DEFAULT,?,?,?,?)";
            PreparedStatement pstmt = c.prepareStatement(q); {
            //specifies what will be entered in the DB
            pstmt.setString(1,"12345");
            pstmt.setInt(2,1);
            pstmt.setInt(3, 1);
            pstmt.setString(4,"Instrument 10");
            pstmt.setBoolean(5, true);
            //adds the info to DB
            pstmt.executeUpdate();
            System.out.println("Boop");
        }} catch (SQLException e) {
            System.out.println(e.getMessage()+"\nrip");
        }
    }
    
    //method that erases data in a DB table
    public static void deleteDB(){
        Connection c = connectDB(); 
        if (c == null) System.exit(-1); 
        try {
            //tells preparedstatament which DB table to delete from (note that this command will clear entire table) 
            String query = "delete from type";
            PreparedStatement preparedStmt = c.prepareStatement(query);
            preparedStmt.execute();
        } catch (SQLException e) {
            System.out.println(e.getMessage()+"\nrip");
        }
    }
}

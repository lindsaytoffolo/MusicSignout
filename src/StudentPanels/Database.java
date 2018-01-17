package StudentPanels;

//package linkedlist; 
import java.sql.*; 

/** * * @author michael.roy-diclemen */ 

public class Database { 
    
    /** * @param args the command line arguments */ 

    public static void main(String[] args) { 
    connectDB();
    }
    
    public static Connection connectDB() { 
        Connection connection = null;
        try { 
            connection = DriverManager.getConnection("jdbc:mysql://10.242.66.224/music_system_el", "music", "doremi");
    } catch (SQLException e) { 
        System.out.println("connection failed\n" + e);
        return null;
    } 
    return connection;
    } 
    
    public void readDB(){
        Connection c = connectDB(); 
        if (c == null) System.exit(-1); 
    Statement stmt; 
    ResultSet rs; 
            //int text text boolean
        try { 
            stmt = c.createStatement();
            rs = stmt.executeQuery("SELECT * FROM student"); 
            // Now do something with the ResultSet .... 
            while (rs.next()==true) { 
                String name = rs.getString("fname");
                String countryId = rs.getString("id"); 
                System.out.println(name + ":" + countryId); 
                //System.out.println(rs.getObject(1));
        }} catch (SQLException e) {
            System.out.println(e.getMessage()+"\n rip");
        }
    }
    
    public void addDB(){
        Connection c = connectDB(); 
        if (c == null) System.exit(-1); 
        Statement stmt; 
        ResultSet rs; 
        //data types are: int text text boolean
        try { 
            stmt = c.createStatement();
            rs = stmt.executeQuery("SELECT * FROM student"); 
            // Now do something with the ResultSet .... 
            while (rs.next()==true) { 
                String name = rs.getString("fname");
                String countryId = rs.getString("id"); 
                System.out.println(name + ":" + countryId); 
                //System.out.println(rs.getObject(1));
                } 
            String q = "insert into student(id,fname,lname,active) values(?,?,?,?)";
            PreparedStatement pstmt = c.prepareStatement(q); {
            pstmt.setInt(1, 2456456);
            pstmt.setString(2, "E");
            pstmt.setString(3, "A");
            pstmt.setBoolean(4, true);
            pstmt.executeUpdate();
            System.out.println("Boop");
        }} catch (SQLException e) {
            System.out.println(e.getMessage()+"\n rip");
        }
    }
}


import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author 072584980
 */
public class Main {

    private static ArrayList<Type> types = new ArrayList<Type>();
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Type t = new Type("books");
        addType(t);
        // TODO code application logic here
    }
    
    public static void addType(Type t){
        types.add(t);
    }
    
}

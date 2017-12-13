package linked.lists;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Emily Anas
 */
public class Patient implements Comparable{
    
    String fName;
    String lName;
    int priority;
    
    public Patient(String fNam, String lNam, int p){
        fName = fNam;
        lName = lNam;
        priority = p;
    }

    @Override
    public int compareTo(Object o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public String toString(){
        return ""+lName+", "+fName+", "+priority;
    }
}

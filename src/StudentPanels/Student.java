package StudentPanels;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author 072584980
 */
public class Student {
    String sNum;
    String fNam;
    String lNam;
    boolean active;
    
    public Student(){
        sNum = "0";
        fNam = "";
        lNam = "";
        active = false;
    }
    
    public Student(String num, String fn, String ln, boolean a){
        sNum = num;
        fNam = fn;
        lNam = ln;
        active = a;
    }
    
    @Override
    public String toString (){
        return lNam+", "+fNam;
    }
}

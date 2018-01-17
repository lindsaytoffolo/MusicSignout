
import java.util.ArrayList;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Emily Anas
 */
public class Methods {
    
    public void readStuFile(){
        Scanner s = new Scanner(System.in);
        s.nextLine();
        while(s.hasNextLine()){
            String line = s.nextLine();
            String info [] = line.split(",");
            int key = Integer.parseInt(info[0]);
            //new Student(key,info[1],info[2],info[3]);
        }
    }
    
}

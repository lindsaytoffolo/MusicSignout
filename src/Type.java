
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
public class Type {
    
    private String name;
    private ArrayList<Object> objects = new ArrayList<Object>();

    public Type(String name){
        this.name = name;
    }
    
    public Type(String name, Object o){
        this(name);
        this.addObject(o);
    }
    
    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the objects
     */
    public ArrayList<Object> getObjects() {
        return objects;
    }

    public void addObject(Object o){
        objects.add(o);
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linked.lists;

/**
 *
 * @author 072584980
 */
public class LinkedLists extends Node{
    
    private Node head = null;
    private Node tail = null;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }

    public LinkedLists(Object insert) {
        super(insert);
    }
    
    public Node get(int pos){
        Node n = head;
        for(int i = 0; i<pos; i++){
            n = n.getNext();
        }
        return n;
    }
    
    public int getSize(){
        Node n = head;
        int count = 1;
        while(n.getNext() != null){
            n = n.getNext();
            count++;
        }
        return count;
    }
    
    @Override
    public String toString(){
        int size = getSize();
        String patients = "";
        for(int i = 0; i<size; i++){
            Node n = get(i);
            patients = patients+n.toString()+"; ";
        }
        return patients;
    }
    
    public void add(Node n){
        
    }
    
    public void add(Node n, int index){
        
    }
    
    public void remove(Node n){
        
    }
    
    public void removes(int index){
        
    }
}

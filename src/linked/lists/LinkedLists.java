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
public class LinkedLists {

    private Node head = null;
    private Node tail = null;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LinkedLists bloop = new LinkedLists();
        //System.out.println(bloop.getSize());
        Patient p = new Patient("Billy","Bob",2);
        Patient q = new Patient("Ferguson","Johnny",72);
        Patient s = new Patient("Amanda","Vasily",-500);
        bloop.add(p);
        bloop.add(q);
        bloop.add(s,2);
        System.out.println(bloop.toString());
        System.out.println(bloop.getSize());
    }

    public LinkedLists() {
     
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

    /**
     * add a patient to the end of a linked list
     * @param p the patient to be added
     */
    public void add(Patient p) {
        Node n = new Node<>(p);
        if (head == null) {
            head = n;
            tail = n;
        } else {
            n.setPrev(tail);
            tail.setNext(n);
            tail = n;
        }
    }

    /**
     * add a patient to a linked list at a set spot
     * @param p the patient to be added 
     * @param index the spot to add the patient (first spot in linked list is index 0)
     */
    public void add(Patient p, int index) {
        Node n = new Node<>(p);
        if (index == getSize() - 1) {
            add(p);
        } 
        else if (index >= getSize()){
            throw new IndexOutOfBoundsException();
        }
        else if (index == 0) {
            n.setNext(head);
            head.setPrev(n);
            head = n;
        } else {
            Node prev = get(index - 1);
            Node next = get(index);
            n.setPrev(prev);
            n.setNext(next);
            prev.setNext(n);
            next.setPrev(n);
        }
    }
    
    public void add(LinkedLists list, int index){
        Node prev = get(index - 1);
        Node next = get(index);
        if (head == null){
            head = list.getHead();
            tail = list.getTail();
        }
        else if (list.head == null){
            return;
        }
        else if (index >= getSize()){
            throw new IndexOutOfBoundsException();
        }
        else if (index == 0){
            head = list.getHead();
        }
        
    }

    public void remove(Patient p) {

    }

    public void remove(int index) {

    }

    /**
     * @return the head
     */
    public Node getHead() {
        return head;
    }

    /**
     * @param head the head to set
     */
    public void setHead(Node head) {
        this.head = head;
    }

    /**
     * @return the tail
     */
    public Node getTail() {
        return tail;
    }

    /**
     * @param tail the tail to set
     */
    public void setTail(Node tail) {
        this.tail = tail;
    }
}

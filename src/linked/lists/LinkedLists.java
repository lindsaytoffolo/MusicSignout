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
public class LinkedLists extends Node {

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

    public Node get(int i) {

    }

    public int getSize() {

    }

    public String toString() {

    }

    public void add(Patient p) {
        Node n = new Node<Patient>(p);
        if (head == null) {
            head = n;
            tail = n;
        } else {
            n.setPrev(tail);
            tail.setNext(n);
            tail = n;
        }
    }

    public void add(Patient p, int index) {
        Node n = new Node<Patient>(p);
        if (index == getSize() - 1) {
            add(n);
        } else if (index == 0) {
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

    public void remove(Patient p) {

    }

    public void remove(int index) {

    }
}

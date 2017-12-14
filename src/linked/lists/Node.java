package linked.lists;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author 072584980
 */
public class Node<I extends Comparable<I>> implements Comparable<Node<I>> {

    private I item = null;
    private Node<I> next = null;
    private Node<I> prev = null;

    public Node(I info, Node<I> next, Node<I> prev) {
        item = info;
        this.next = next;
        this.prev = prev;
    }

    public Node(I info) {
        this(info, null, null);
    }

    public Node(I info, Node<I> next) {
        this(info, next, null);
    }

    public I getItem() {
        return item;
    }

    public void setItem(I item) {
        this.item = item;
    }

    public Node<I> getNext() {
        return next;
    }

    public void setNext(Node<I> item) {
        this.next = item;
    }
    
    public Node<I> getPrev() {
        return prev;
    }

    public void setPrev(Node<I> item) {
        this.prev = item;
    }

    public int compareTo(Node<I> o) {
         return item.compareTo(o.item);
    }
}

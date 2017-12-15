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

    //nodes have a "previous" variable so that the lists can be doubly-linked (because the challenge sounded fun)
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

    /**
     * @return the item
     */
    public I getItem() {
        return item;
    }

    /**
     * @param item the item to set
     */
    public void setItem(I item) {
        this.item = item;
    }

    /**
     * @return the next
     */
    public Node<I> getNext() {
        return next;
    }

    /**
     * @param next the next to set
     */
    public void setNext(Node<I> next) {
        this.next = next;
    }

    /**
     * @return the prev
     */
    public Node<I> getPrev() {
        return prev;
    }

    /**
     * @param prev the prev to set
     */
    public void setPrev(Node<I> prev) {
        this.prev = prev;
    }

    public int compareTo(Node<I> o) {
        return getItem().compareTo(o.getItem());
    }

    public String toString() {
        return getItem().toString();
    }
}

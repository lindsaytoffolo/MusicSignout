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

    /**
     * Create a node with the given information
     * @param info the information to be stored in the node
     * @param next the next node in the list
     * @param prev the previous node in the list
     */
    public Node(I info, Node<I> next, Node<I> prev) {
        item = info;
        this.next = next;
        this.prev = prev;
    }

    /**
     * Create a node with the given information
     * @param info the information to be stored in the node
     */
    public Node(I info) {
        this(info, null, null);
    }

    /**
     * Create a node with the given information
     * @param info the information to be stored in the node
     * @param next the next node in the list
     */
    public Node(I info, Node<I> next) {
        this(info, next, null);
    }

    /**
     * @return the item contained in the node
     */
    public I getItem() {
        return item;
    }

    /**
     * set the information in the node to something else
     * @param item the item to set
     */
    public void setItem(I item) {
        this.item = item;
    }

    /**
     * @return the next node
     */
    public Node<I> getNext() {
        return next;
    }

    /**
     * link a different node as the next node
     * @param next the next to set
     */
    public void setNext(Node<I> next) {
        this.next = next;
    }

    /**
     * @return the previous node
     */
    public Node<I> getPrev() {
        return prev;
    }

    /**
     * link a different node as the previous node
     * @param prev the previous node
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

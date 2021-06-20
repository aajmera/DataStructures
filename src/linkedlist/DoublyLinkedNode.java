package linkedlist;

public class DoublyLinkedNode {
    private int val;
    private DoublyLinkedNode prevNode;
    private DoublyLinkedNode nextNode;

    public DoublyLinkedNode(int val) {
        this.val = val;
    }

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public DoublyLinkedNode getPrevNode() {
        return prevNode;
    }

    public void setPrevNode(DoublyLinkedNode prevNode) {
        this.prevNode = prevNode;
    }

    public DoublyLinkedNode getNextNode() {
        return nextNode;
    }

    public void setNextNode(DoublyLinkedNode nextNode) {
        this.nextNode = nextNode;
    }

    @Override
    public String toString() {
        return String.valueOf(val);
    }
}

package linkedlist;

public class DoublyLinkedList {
    private DoublyLinkedNode head;

    public void insertAtHead(int val) {
        DoublyLinkedNode newNode = new DoublyLinkedNode(val);

        if(head != null) {
            head.setPrevNode(newNode);
        }

        newNode.setNextNode(head);
        head = newNode;

    }

    public int length() {
        int count = 0;
        DoublyLinkedNode node = head;

        while (node != null) {
            count++;
            node = node.getNextNode();
        }

        return count;
    }

    @Override
    public String toString() {
        StringBuilder string = new StringBuilder("{ ");
        DoublyLinkedNode node = head;
        while(node != null) {
            string.append(node).append(", ");
            node = node.getNextNode();
        }
        string.append("}");
        return string.toString();
    }

    public void sort() {
        DoublyLinkedNode node = head;

        while(node != null) {
            DoublyLinkedNode curr = node;
            DoublyLinkedNode prev = curr.getPrevNode();

            while(prev != null) {
                if(curr.getVal() < prev.getVal()) {
                    //if previous node of previous is null or has a smaller/equal value, replace
                    if(prev.getPrevNode() == null || prev.getPrevNode().getVal() <= curr.getVal()) {
                        node = curr.getPrevNode();
                        //current node prev node's next node to point to next node of current
                        curr.getPrevNode().setNextNode(curr.getNextNode());
                        if(curr.getNextNode() != null) {
                            curr.getNextNode().setPrevNode(curr.getPrevNode());
                        }

                        curr.setPrevNode(prev.getPrevNode());
                        curr.setNextNode(prev);

                        if(prev.getPrevNode() != null) {
                            prev.getPrevNode().setNextNode(curr);
                        } else {
                            head = curr;
                        }

                        prev.setPrevNode(curr);

                        break;
                    } else {
                        //if previous node of previous node is higher, change prev to previous node of prev
                        prev = prev.getPrevNode();
                    }
                } else {
                    break;
                }
            }
            node = node.getNextNode();

        }
    }

}

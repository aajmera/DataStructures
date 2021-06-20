package linkedlist;

public class LinkedList {
    private Node head;

    public void insertAtHead(int val) {
        Node node = new Node(val);

        if (head != null) {
            node.setNode(head);
        }

        head = node;
    }

    public int length() {
        int count = 0;
        Node node = head;

        while (node != null) {
            count++;
            node = node.getNode();
        }

        return count;
    }

    public void deleteElement(int val) {
        if(head.getVal() == val) {
            head = head.getNode();
        } else {
            Node node = head;
            while(node.getNode() != null) {
                if(node.getNode().getVal() == val) {
                    node.setNode(node.getNode().getNode());
                    return;
                }
                node = node.getNode();
            }
        }
    }

    public void reverse() {
        Node node = head;
        Node prevNode = null;
        while(node.getNode() != null) {
            Node nextNode = node.getNode();
            if(node == head) {
                node.setNode(null);
            } else {
                node.setNode(prevNode);
            }
            prevNode = node;
            node = nextNode;
        }
        head = node;
        head.setNode(prevNode);
    }

    @Override
    public String toString() {
        StringBuilder string = new StringBuilder("{ ");
        Node node = head;
        while(node != null) {
            string.append(node).append(", ");
            node = node.getNode();
        }
        string.append("}");
        return string.toString();
    }

    public void printReverse() {
        printReverse(head);
    }

    private void printReverse(Node node) {
        if(node == null) {
            return;
        }
        printReverse(node.getNode());
        System.out.print(node.getVal() + ", ");
    }
}

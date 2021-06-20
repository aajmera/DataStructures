package linkedlist;

public class LinkedListDemo {

    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        printList(list);

        list.insertAtHead(1);
        printList(list);

        list.insertAtHead(2);
        printList(list);

        list.insertAtHead(3);
        printList(list);

        list.insertAtHead(4);
        printList(list);

        list.insertAtHead(5);
        printList(list);

        list.reverse();
        printList(list);

        list.printReverse();
    }

    static void printList(LinkedList list) {
        System.out.println("List elements: " + list);
        System.out.println("list length: " + list.length());
        System.out.println("_____________________________");
    }
}

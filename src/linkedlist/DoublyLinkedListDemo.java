package linkedlist;

public class DoublyLinkedListDemo {

    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();

        printList(list);

        list.insertAtHead(1000);

        list.insertAtHead(10);

        list.insertAtHead(85);

        list.insertAtHead(8);

        list.insertAtHead(2);

        list.insertAtHead(1);

        list.insertAtHead(65);

        list.insertAtHead(32);

        list.insertAtHead(0);

        list.insertAtHead(45);

        list.insertAtHead(16);

        list.insertAtHead(12);

        list.insertAtHead(23);

        list.insertAtHead(2000);
        printList(list);

        list.sort();
        printList(list);
    }

    static void printList(DoublyLinkedList list) {
        System.out.println("List elements: " + list);
        System.out.println("list length: " + list.length());
        System.out.println("_____________________________");
    }
}

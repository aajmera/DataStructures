package linkedlist;

public class GenericLinkedList <T> {
    GenericNode<T> head;

    public void add(T data) {
        GenericNode<T> node = new GenericNode<>(data);

        if(head != null) {
            node.setNextNode(head);
        }
        head = node;
    }
}

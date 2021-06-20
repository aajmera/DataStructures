package linkedlist;

public class GenericNode <T> {
    T data;
    GenericNode<T> nextNode;

    public GenericNode (T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public GenericNode<T> getNextNode() {
        return nextNode;
    }

    public void setNextNode(GenericNode<T> nextNode) {
        this.nextNode = nextNode;
    }


}

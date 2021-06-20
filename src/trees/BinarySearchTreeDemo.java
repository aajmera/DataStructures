package trees;

public class BinarySearchTreeDemo {
    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();
        tree.insert(54);
        tree.insert(87);
        tree.insert(34);
        tree.insert(2);
        tree.insert(45);
        tree.insert(12);
        tree.insert(200);
        tree.insert(76);
        tree.insert(67);
        tree.insert(78);
        tree.insert(150);
        tree.insert(8);
        tree.insert(9);
        tree.insert(10);

        System.out.println(tree.height());
        System.out.println();
        tree.levelView();

    }
}

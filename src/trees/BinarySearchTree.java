package trees;

public class BinarySearchTree {
    private TreeNode root;

    public void insert(int val) {
        TreeNode newNode = new TreeNode(val);

        if(root == null) {
            root = newNode;
        } else {
            insertNode(newNode, root);
        }
    }

    private void insertNode(TreeNode newNode, TreeNode subTree) {
        if(newNode.getVal() <= subTree.getVal()) {
            if(subTree.getLeftNode() == null) {
                subTree.setLeftNode(newNode);
            } else {
                insertNode(newNode, subTree.getLeftNode());
            }
        } else {
            if(subTree.getRightNode() == null) {
                subTree.setRightNode(newNode);
            } else {
                insertNode(newNode, subTree.getRightNode());
            }
        }
    }

    public void delete(int val) {
        if(root != null) {
            deleteNode(val, root, root);
        }
    }

    private void deleteNode(int val, TreeNode node, TreeNode parent) {
        if(node.getVal() == val) {
            if(node.getLeftNode() == null &&
            node.getRightNode() == null) {
                if(root == node) {
                    root = null;
                } else {
                    parent.remove(node);
                }
            }
        }
    }

    public void search(int val) {
        searchValue(val, root);
    }

    private void searchValue(int val, TreeNode root) {
        if(root == null) {
            System.out.println(val + " Not Found");
        } else if(val == root.getVal()) {
            System.out.println(root);
            return;
        } else if (val <= root.getVal()) {
            searchValue(val, root.getLeftNode());
        } else {
            searchValue(val, root.getRightNode());
        }
    }

    public int height() {
        return heightTree(root);
    }

    private int heightTree(TreeNode root) {
        int leftHeight = 0;
        int rightHeight = 0;

        if(root.getLeftNode() != null) {
            leftHeight = heightTree(root.getLeftNode());
        }
        if(root.getRightNode() != null) {
            rightHeight = heightTree(root.getRightNode());
        }

        if(leftHeight > rightHeight) {
            return ++leftHeight;
        } else {
            return ++rightHeight;
        }
    }

    public void levelView() {
        int height = height();
        for(int i=1; i<=height; i++) {
            printLevel(root, i);
        }
    }

    private void printLevel(TreeNode node, int level) {
        if(node == null) {
            return;
        }

        if(level == 1) {
            System.out.print(node.getVal() + ", ");
        } else {
            printLevel(node.getLeftNode(), level-1);
            printLevel(node.getRightNode(), level-1);
        }
    }
}

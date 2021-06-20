package trees;

public class TreeNode{
    private int val;
    private TreeNode leftNode;
    private TreeNode rightNode;

    public TreeNode(int val) {
        this.val = val;
    }

    public int getVal() {
        return val;
    }

    public TreeNode getLeftNode() {
        return leftNode;
    }

    public void setLeftNode(TreeNode leftNode) {
        this.leftNode = leftNode;
    }

    public TreeNode getRightNode() {
        return rightNode;
    }

    public void setRightNode(TreeNode rightNode) {
        this.rightNode = rightNode;
    }

    public void remove(TreeNode node) {
        if(leftNode == node) {
            leftNode = null;
        } else if (rightNode == node) {
            rightNode = null;
        }
    }

    @Override
    public String toString() {
        StringBuilder string = new StringBuilder(" " + val);
        if(leftNode != null) {
            string.append(", " + leftNode);
        }
        if(rightNode != null) {
            string.append(", " + rightNode);
        }

        return string.toString();
    }
}

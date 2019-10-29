class BinaryTreeNode {


    private Comparable Node;
    private BinaryTreeNode left, right;

    public BinaryTreeNode(Comparable k, BinaryTreeNode left, BinaryTreeNode right) {
        Node = k;
        this.left = left;
        this.right = right;
    }


    public Comparable getValue() {
        return this.Node;
    }
    public BinaryTreeNode getLeft() {
        return this.left;
    }
    public BinaryTreeNode getRight() {
        return this.right;
    }


    public void setValue(Comparable k) {
        this.Node = k;
    }
    public void setLeft(BinaryTreeNode l) {
        this.left = l;
    }
    public void setRight(BinaryTreeNode r) {
        this.right = r;
    }
}

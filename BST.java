

class BST <T>{

    private BinaryTreeNode root;

    public BST() {
        root = null;
    }
    public void insert(Comparable k){
    
        if (root == null) {
            root = new BinaryTreeNode(k, null, null);
        }
        else {
            insert(root, k);
        }
    }

    public void delete(Comparable k) {
        root = delete(root, k);
    }

  
    public boolean find(Comparable k) {
        return find(root, k);
    }
  
    public void print() {
        print(root);
    }

    private boolean find(BinaryTreeNode Tree, Comparable k) {
        if (Tree == null)
            return false;
        if (Tree.getValue().equals(k))
            return true;
        if (k.compareTo(Tree.getValue()) < 0) {
            return find(Tree.getLeft(), k);
        }
        else {
            return find(Tree.getRight(), k);
        }
    }



    private void insert(BinaryTreeNode T, Comparable k){
      
        if (T.getValue().equals(k)){
            delete(k);
        }
       
        if (k.compareTo(T.getValue()) < 0) {
            if (T.getLeft() == null) {
                T.setLeft(new BinaryTreeNode(k, null, null));
            }
            else {
                insert(T.getLeft(), k);
            }
        }
        else {

            if (T.getRight() == null)
                T.setRight( new BinaryTreeNode(k, null, null) );
            else
                insert(T.getRight(), k);
        }
    }
    //print out all the node in the binary tree
    private void print(BinaryTreeNode T) {
        if(T!= null){
            print(T.getLeft());
            System.out.println(T.getValue());
            print(T.getRight());
        }
    }


    private BinaryTreeNode smallestNode(BinaryTreeNode T)
    {
        if (T.getLeft() == null)
            return T;
        else
            return smallestNode(T.getLeft());
    }


    private BinaryTreeNode delete(BinaryTreeNode T, Comparable k) {
        if (T == null)
            return null;
        if (k.equals(T.getValue())) {

            if (T.getLeft() == null && T.getRight() == null)
                return null;
            if (T.getLeft() == null)
                return T.getRight();
            if (T.getRight() == null)
                return T.getLeft();

            return T;

        }
        else if (k.compareTo(T.getValue()) < 0) {
            T.setLeft( delete(T.getLeft(), k) );
            return T;
        }
        else {
            T.setRight( delete(T.getRight(), k) );
            return T;
        }
    }


}

public class TreeNode {
    // data declaration
    private Object element;
    private TreeNode left;
    private TreeNode right;

    public TreeNode(Object elem) {
        // method definition
        this.element = elem;
        this.left = null;
        this.right = null;
    }

    // this is done recursively
    public void insert(Object elem) {
        // if book serial number is less than the current node
        Book book = (Book) elem;
        Book currentBook = (Book) this.element;

        if (book.getSerialNum() < currentBook.getSerialNum()) {
            // if left node is null, insert new node
            if (this.left == null) {
                this.left = new TreeNode(elem);
            } else {
                // else, insert to left node
                this.left.insert(elem);
            }
        } else {
            // if right node is null, insert new node
            if (this.right == null) {
                this.right = new TreeNode(elem);
            } else {
                // else, insert to right node
                this.right.insert(elem);
            }
        }

    }

    public Book getData() {
        // method definition
        return (Book) this.element;
    }

    public TreeNode getLeft() {
        // method definition
        return this.left;
    }

    public TreeNode getRight() {
        // method definition
        return this.right;
    }

}

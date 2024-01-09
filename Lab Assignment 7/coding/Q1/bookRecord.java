package Q1;
import java.util.LinkedList;

public class bookRecord {
    private TreeNode root;

    public bookRecord() {
        root = null;
    }

    // getter and setter
    public TreeNode getRoot() {
        return root;
    }

    public void setRoot(TreeNode root) {
        this.root = root;
    }

    // count the number of books in the tree
    // the data is already stored in the tree
    // book code is A, B, C, D
    public void countBookCode() {
        // theres code A, B, C, D in the tree
        int[] counts = new int[4];

        // count the book code
        countBookCode(root, counts);

        // print the result
        System.out.println("Book code A: " + counts[0]);
        System.out.println("Book code B: " + counts[1]);
        System.out.println("Book code C: " + counts[2]);
        System.out.println("Book code D: " + counts[3]);
    }

    public void countBookCode(TreeNode node, int[] counts) {
        // if the node is null, return
        if (node == null) {
            return;
        }

        // get the book code
        char code = ((Book) node.getData()).getCode();

        // increment the count
        switch (code) {
            case 'A':
                counts[0]++;
                break;
            case 'B':
                counts[1]++;
                break;
            case 'C':
                counts[2]++;
                break;
            case 'D':
                counts[3]++;
                break;
        }

        // count the left and right node
        countBookCode(node.getLeft(), counts);
        countBookCode(node.getRight(), counts);
    }

    public void searchBook(int serialNum) {
        // search for a book with the given serial number
        // if found, print the book
        // if not found, print not found
        TreeNode node = searchBook(root, serialNum);

        if (node == null) {
            System.out.println("Book not found");
        } else {
            System.out.println(node.getData());
        }
    }

    public TreeNode searchBook(TreeNode node, int serialNum) {
        // if the node is null, return null
        if (node == null) {
            return null;
        }

        // get the serial number
        int nodeSerialNum = ((Book) node.getData()).getSerialNum();

        // if the serial number is the same, return the node
        if (nodeSerialNum == serialNum) {
            return node;
        }

        // search the left and right node
        TreeNode left = searchBook(node.getLeft(), serialNum);
        TreeNode right = searchBook(node.getRight(), serialNum);

        // if the left node is not null, return the left node
        if (left != null) {
            return left;
        }

        // if the right node is not null, return the right node
        if (right != null) {
            return right;
        }

        // if not found, return null
        return null;
    }

    public void displayAll() {
        // display all the books in the tree
        // dont use linked list
        displayAll(root);
    }

    public void displayAll(TreeNode node) {
        // if the node is null, return
        if (node == null) {
            return;
        }

        // print the book
        System.out.println(node.getData() + "\n");

        // display the left and right node
        displayAll(node.getLeft());
        displayAll(node.getRight());
    }
}

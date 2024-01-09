public class BSTCandidate {
    TreeNode root;

    public BSTCandidate() {
        root = null;
    }

    // setter and getter for root
    public TreeNode getRoot() {
        return this.root;
    }

    public void setRoot(TreeNode root) {
        this.root = root;
    }

    // display details of all candidates using recursive method to display detail of
    // candidate name in descending order
    public void displayDetails() {
        displayDetails(root);
    }

    private void displayDetails(TreeNode root) {
        if (root != null) {
            displayDetails(root.getRight());
            System.out.println(root.getData());
            displayDetails(root.getLeft());
        }
    }

    public int countCandidate(char qualification) {
        return countCandidate(root, qualification);
    }

    private int countCandidate(TreeNode root, char qualification) {
        if (root == null) {
            return 0;
        } else {
            int count = 0;
            if (root.getData().getQualification() == qualification) {
                count++;
            }
            count += countCandidate(root.getLeft(), qualification);
            count += countCandidate(root.getRight(), qualification);
            return count;
        }
    }

}

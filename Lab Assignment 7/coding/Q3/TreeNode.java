public class TreeNode {
    JobCandidate data;
    TreeNode left, right;

    public TreeNode(JobCandidate data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }

    public JobCandidate getData() {
        return this.data;
    }

    public void setData(JobCandidate data) {
        this.data = data;
    }

    public TreeNode getLeft() {
        return this.left;
    }

    public void setLeft(TreeNode left) {
        this.left = left;
    }

    public TreeNode getRight() {
        return this.right;
    }

    public void setRight(TreeNode right) {
        this.right = right;
    }

    // toString() method
    public String toString() {
        return data.toString();
    }
}

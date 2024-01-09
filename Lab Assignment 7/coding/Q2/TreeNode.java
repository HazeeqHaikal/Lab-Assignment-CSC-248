public class TreeNode {
    CCrimeComplaint info;
    TreeNode left, right;

    public TreeNode(CCrimeComplaint info) {
        this.info = info;
        left = null;
        right = null;
    }

    public TreeNode(CCrimeComplaint info, TreeNode left, TreeNode right) {
        this.info = info;
        this.left = left;
        this.right = right;
    }

    public CCrimeComplaint getInfo() {
        return info;
    }

    public void setInfo(CCrimeComplaint info) {
        this.info = info;
    }

    public TreeNode getLeft() {
        return left;
    }

    public void setLeft(TreeNode left) {
        this.left = left;
    }

    public TreeNode getRight() {
        return right;
    }

    public void setRight(TreeNode right) {
        this.right = right;
    }

    // tostring method
    public String toString() {
        return info.toString();
    }
}

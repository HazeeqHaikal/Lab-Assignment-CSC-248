public class BSTcCrimeComplaint {
    TreeNode root;

    public BSTcCrimeComplaint() {
        root = null;
    }

    public void insertNode(CCrimeComplaint info) {
        if (root == null) {
            root = new TreeNode(info);
        } else {
            TreeNode current = root;
            TreeNode parent = null;
            while (true) {
                parent = current;
                if (info.getcElement().compareToIgnoreCase(current.getInfo().getcElement()) < 0) {
                    current = current.getLeft();
                    if (current == null) {
                        parent.setLeft(new TreeNode(info));
                        return;
                    }
                } else {
                    current = current.getRight();
                    if (current == null) {
                        parent.setRight(new TreeNode(info));
                        return;
                    }
                }
            }
        }
    }

    // display all but prevent duplicate
    public void cElementDisplayAll() {
        cElementDisplayAll(root);
    }

    public void cElementDisplayAll(TreeNode root) {
        if (root != null) {
            cElementDisplayAll(root.getLeft());
            System.out.println(root.getInfo().getcElement());
            cElementDisplayAll(root.getRight());
        }
    }

    // display specific
    public void displayBySpesific(String cElement) {
        displayBySpesific(root, cElement);
    }

    public void displayBySpesific(TreeNode root, String cElement) {
        if (root != null) {
            displayBySpesific(root.getLeft(), cElement);
            if (root.getInfo().getcElement().equalsIgnoreCase(cElement)) {
                System.out.println(root.getInfo().toString() + "\n");
            }
            displayBySpesific(root.getRight(), cElement);
        }
    }

    public int calTotComplaint(int year) {
        return calTotComplaint(root, year);
    }

    public int calTotComplaint(TreeNode root, int year) {
        if (root == null) {
            return 0;
        } else {
            if (root.getInfo().getYear() == year) {
                return root.getInfo().getNoOfComplaint() + calTotComplaint(root.getLeft(), year)
                        + calTotComplaint(root.getRight(), year);
            } else {
                return calTotComplaint(root.getLeft(), year) + calTotComplaint(root.getRight(), year);
            }
        }
    }

    // other method
    public int countNode() {
        return countNode(root);
    }

    public int countNode(TreeNode root) {
        if (root == null) {
            return 0;
        } else {
            return 1 + countNode(root.getLeft()) + countNode(root.getRight());
        }
    }

    public int countLeaf() {
        return countLeaf(root);
    }

    public int countLeaf(TreeNode root) {
        if (root == null) {
            return 0;
        } else {
            if (root.getLeft() == null && root.getRight() == null) {
                return 1;
            } else {
                return countLeaf(root.getLeft()) + countLeaf(root.getRight());
            }
        }
    }

    // count height
    public int countHeight() {
        return countHeight(root);
    }

    public int countHeight(TreeNode root) {
        if (root == null) {
            return 0;
        } else {
            return 1 + Math.max(countHeight(root.getLeft()), countHeight(root.getRight()));
        }
    }

    // delete node
    public void deleteNode(String cElement) {
        root = deleteNode(root, cElement);
    }

    public TreeNode deleteNode(TreeNode root, String cElement) {
        if (root == null) {
            return root;
        } else {
            if (cElement.compareToIgnoreCase(root.getInfo().getcElement()) < 0) {
                root.setLeft(deleteNode(root.getLeft(), cElement));
            } else if (cElement.compareToIgnoreCase(root.getInfo().getcElement()) > 0) {
                root.setRight(deleteNode(root.getRight(), cElement));
            } else {
                if (root.getLeft() == null) {
                    return root.getRight();
                } else if (root.getRight() == null) {
                    return root.getLeft();
                } else {
                    root.setInfo(findMin(root.getRight()));
                    root.setRight(deleteNode(root.getRight(), root.getInfo().getcElement()));
                }
            }
        }
        return root;
    }

    // delete specific
    public void deleteSpecific(String cElement, int year) {
        root = deleteSpecific(root, cElement, year);
    }

    public TreeNode deleteSpecific(TreeNode root, String cElement, int year) {
        if (root == null) {
            return root;
        } else {
            if (cElement.compareToIgnoreCase(root.getInfo().getcElement()) < 0) {
                root.setLeft(deleteSpecific(root.getLeft(), cElement, year));
            } else if (cElement.compareToIgnoreCase(root.getInfo().getcElement()) > 0) {
                root.setRight(deleteSpecific(root.getRight(), cElement, year));
            } else {
                if (root.getInfo().getYear() == year) {
                    if (root.getLeft() == null) {
                        return root.getRight();
                    } else if (root.getRight() == null) {
                        return root.getLeft();
                    } else {
                        root.setInfo(findMin(root.getRight()));
                        root.setRight(deleteSpecific(root.getRight(), root.getInfo().getcElement(), year));
                    }
                } else {
                    root.setLeft(deleteSpecific(root.getLeft(), cElement, year));
                    root.setRight(deleteSpecific(root.getRight(), cElement, year));
                }
            }
        }
        return root;
    }

    // find min
    public CCrimeComplaint findMin(TreeNode root) {
        if (root == null) {
            return null;
        } else {
            if (root.getLeft() == null) {
                return root.getInfo();
            } else {
                return findMin(root.getLeft());
            }
        }
    }

}

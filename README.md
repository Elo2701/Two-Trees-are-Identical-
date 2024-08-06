# Two-Trees-are-Identical-
/*

public class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;

    public TreeNode(int val) {
        this.val = val;
    }
}

public class Tree {
    public static boolean areIdentical(TreeNode root1, TreeNode root2) {
        if (root1 == null && root2 == null) {
            return true;
        } else if (root1 == null || root2 == null) {
            return false;
        }
        return root1.val == root2.val && areIdentical(root1.left, root2.left) && areIdentical(root1.right, root2.right);
    }

    public static void main(String[] args) {
        TreeNode root1 = new TreeNode(1);
        root1.left = new TreeNode(2);
        root1.right = new TreeNode(3);

        TreeNode root2 = new TreeNode(1);
        root2.left = new TreeNode(2);
        root2.right = new TreeNode(3);

        if (areIdentical(root1, root2)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }

        TreeNode root3 = new TreeNode(4);
        root3.left = new TreeNode(5);
        root3.right = new TreeNode(6);

        TreeNode root4 = new TreeNode(4);
        root4.left = new TreeNode(7);
        root4.right = new TreeNode(8);

        if (areIdentical(root3, root4)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}

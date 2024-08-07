package algorithm;

public class Tree { 
    public static boolean areIdentical(TreeNode root1, TreeNode root2) {
        if (root1 == null && root2 == null) {
            return true;
        } else if (root1 == null || root2 == null) {
            return false; 
        } 
        return root1.val == root2.val &&
               areIdentical(root1.left, root2.left) && 
               areIdentical(root1.right, root2.right);
    }
}

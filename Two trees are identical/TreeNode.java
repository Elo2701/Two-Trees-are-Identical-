package algorithm;

public class TreeNode {
    public int val; 
    public TreeNode left; 
    public TreeNode right;

    public TreeNode(int val) {
        this.val = val;
    }

    public static void main(String[] args) {
        TreeNode root1 = new TreeNode(1);
        root1.left = new TreeNode(2);
        root1.right = new TreeNode(3);

        TreeNode root2 = new TreeNode(1);
        root2.left = new TreeNode(2);
        root2.right = new TreeNode(3);

        // Call the areIdentical method from the Tree class
        if (Tree.areIdentical(root1, root2)) {
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

        // Call the areIdentical method from the Tree class
        if (Tree.areIdentical(root3, root4)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}

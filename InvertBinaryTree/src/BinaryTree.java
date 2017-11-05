import apple.laf.JRSUIUtils;

/**
 * Created by qihuiyang on 4/4/17.
 */
public class BinaryTree {

    TreeNode root;
    public static TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return null;
        }
        TreeNode right = invertTree(root.right);
        TreeNode left = invertTree(root.left);
        root.left = right;
        root.right = left;

        return root;
    }

    public void preOrderPrint(TreeNode node){
        if(node == null){
            return;
        }
        if(node != null){
            System.out.print(node + "");
            preOrderPrint(node.left);
            preOrderPrint(node.right);
        }
    }

    public void insert(TreeNode node, int data){
        root = insert(root, data);
    }
    private TreeNode insert (TreeNode p, )
    public static void main(String[] args){
        int[] a = {1, 5, 2, 7, 4};
        BinaryTree tree = new BinaryTree();


        tree.root = new TreeNode(1);
        tree.root.left = new TreeNode(2);
        tree.root.right = new TreeNode(3);
        tree.root.left.left = new TreeNode(4);
        tree.root.left.right = new TreeNode(5);
        System.out.print("Inverted tree is :");
        tree.invertTree(tree.root);
        tree.preOrderPrint();




    }

}

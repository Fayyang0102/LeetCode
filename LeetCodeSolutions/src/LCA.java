/**
 * Created by qihuiyang on 8/12/17.
 */
public class LCA {
    public TreeNode LCA(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null) {
            return null;
        }
        if (root == p || root == q) {
            return root;
        }
        TreeNode left = LCA(root.left, p, q);
        TreeNode right = LCA(root.right, p, q);
        if (left != null && right != null) {
            return root;
        }
        if (left != null) {
            return left;
        } else {
            return right;
        }
    }

    public static void main(String[] args) {
        LCA lca = new LCA();
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        TreeNode res = lca.LCA(root, root.left, root.right);
        System.out.print(res.val);

    }

}

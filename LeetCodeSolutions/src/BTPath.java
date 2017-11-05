import java.util.ArrayList;
import java.util.List;

/**
 * Created by qihuiyang on 8/14/17.
 */
public class BTPath {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> ans = new ArrayList<>();
        if (root != null) {
            helper(root, "", ans);
        }
        return ans;
    }

    private void helper(TreeNode root, String path, List<String> ans) {

        if (root.left == null && root.right == null) {
            ans.add(path + root.val);
        }
        if (root.left != null) {
            helper(root.left, path + root.val + "->", ans);
        }
        if (root.right != null) {
            helper(root.right, path + root.val + "->", ans);
        }

    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        BTPath b = new BTPath();

        List res = b.binaryTreePaths(root);

        System.out.print("Output: " + res.toString());
    }
}

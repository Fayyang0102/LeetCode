/**
 * Created by qihuiyang on 8/13/17.
 */
public class MergeTwoBT {
    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        if(t1 == null && t2 == null){
            return null;
        }
        int val = (t1 == null ? 0 : t1.val) + (t2 == null ? 0 : t2.val);

        TreeNode newTreeNode = new TreeNode(val);
        newTreeNode.left = mergeTrees(t1== null ? null : t1.left, t2 == null ? null : t2.left);
        newTreeNode.right = mergeTrees(t1 == null ? null : t1.right, t2 == null ? null : t2.right);
        return  newTreeNode;
    }
}

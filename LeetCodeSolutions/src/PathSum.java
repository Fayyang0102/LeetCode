/**
 * Created by qihuiyang on 8/13/17.
 *       5
        / \
     4      8
     /      / \
    11    13  4
   /  \        \
 7    2         1

 sum =22
 */
public class PathSum {
    public boolean hasPathSum(TreeNode root, int sum) {
        if(root == null){
            return false;
        }
        if(root.left == null && root.right == null && sum - root.val ==0){
            return true;
        }
        return hasPathSum(root.left, sum - root.val) || hasPathSum(root.right, sum -root.val);

    }


}

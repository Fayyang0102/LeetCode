/**
 * Created by qihuiyang on 8/13/17.
 *      3
       / \
      4   5
    / \
   1   2

      4
    /   \
   1     2
 */
public class SubtreeOfAnotherTree {
    public boolean isSubtree(TreeNode s, TreeNode t) {
        if(s == null){
            return false;
        }
        if(isSame(s,t)){
            return true;
        }
        return isSubtree(s.left,t) || isSubtree(s.right,t);


    }
    private boolean isSame(TreeNode s, TreeNode t){
        if(s == null && t == null){
            return true;
        }
        if(s== null || t == null){
            return false;
        }
        if(s.val != t.val){
            return false;
        }
        return isSame(s.left,t.left) && isSame(s.right,t.right);

    }

}

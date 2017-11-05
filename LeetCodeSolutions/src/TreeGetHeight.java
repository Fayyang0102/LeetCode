import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by qihuiyang on 8/9/17.
 *          1
 *         /   \
 *         2    3
 *        /
 *       4
 *
 */
public class TreeGetHeight {
    public int getHeight(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left = getHeight(root.left);
        int right = getHeight(root.right);
        return Math.max(left, right) + 1;
    }

    public int getHeightIter(TreeNode root){
        if(root == null){
            return 0;
        }
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        int height =0;
        while(! q.isEmpty()){
            int size = q.size();
            while(size != 0){
                TreeNode node = q.peek();
                q.remove();
                if(node.left != null){
                    q.add(node.left);
                }
                if(node.right != null){
                    q.add(node.right);
                }
                size--;
            }
            height++;
        }
        return height;
    }
    public static void main(String[] args){
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left= new TreeNode(4);
        TreeGetHeight treeGetHeight = new TreeGetHeight();
        int res = treeGetHeight.getHeightIter(root);
        System.out.print(res);

    }
}

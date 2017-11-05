import static java.lang.Math.abs;

/**
 * Created by qihuiyang on 8/9/17.
 *
 * 左右subtree的node个数差
 *
 *           1
 *         /   \
 *        2     3
 *       / \
 *      4   5
 */

public class MaxDiffBetweenChildren {
    public int maxDifffNode(TreeNode root, int global_max, TreeNode solu){
        if(root == null){
            return 0;
        }
        int left = maxDifffNode(root.left,global_max,solu);
        int right = maxDifffNode(root.right,global_max,solu);
        if( abs(left - right ) > global_max){
            global_max = abs(left-right);
            solu=root;
        }

        return left+right+1;
    }
    public static void main(String[] args){
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left= new TreeNode(4);
        root.left.right =new TreeNode(5);
        MaxDiffBetweenChildren maxDiffBetweenChildren = new MaxDiffBetweenChildren();
        int res = maxDiffBetweenChildren.maxDifffNode(root,0,root);
        System.out.print(res);

    }
}

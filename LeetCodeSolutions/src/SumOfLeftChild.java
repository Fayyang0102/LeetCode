/**
 * Created by qihuiyang on 8/9/17.
 *           1(2)
 *         /      \
 *         2(1)    3
 *        /    \
 *       4(0)   5(0)
 */
public class SumOfLeftChild {
    public int findLeft(TreeNode root){
        if(root == null){
            return 0;
        }
        int left = findLeft(root.left);
        int right = findLeft(root.right);
        root.val = left;  //current layer
        return left+right+1;
    }
    public static void main(String[] args){
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left= new TreeNode(4);
        root.left.right =new TreeNode(5);
        SumOfLeftChild sumOfLeftChild = new SumOfLeftChild();
        int res = sumOfLeftChild.findLeft(root);
        System.out.print(res);

    }
}

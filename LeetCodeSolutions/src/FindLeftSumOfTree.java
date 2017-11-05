import com.sun.org.apache.xpath.internal.operations.Bool;

/**
 * Created by qihuiyang on 8/12/17.
 * <p>
 * <p>
 * find how many nodes in left subtree
 */

public class FindLeftSumOfTree {
    /*public void findLeftSum(TreeNode node, boolean isLeft, int sum){
        if(node == null){
            return ;
        }
        if(node.left == null && node.right == null && isLeft){
            sum = sum + node.val;
            findLeftSum(node.left,true,sum);
            findLeftSum(node.right,false,sum);
        }

    }
    public int findLeft(TreeNode root){
        int sum = 0;
        findLeftSum(root,false, sum);
        return sum;
    }*/

    public int findLeftTotal(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int left = findLeftTotal(root.left);
        int right = findLeftTotal(root.right);
        root.val = left;

        return left + right + 1;

    }

    public static void main(String[] args) {
        //     4
        //   /  \
        //  2    5
        //  /\    \
        // 1  3    6

        TreeNode root = new TreeNode(4);

        root.left = new TreeNode(2);
        root.right = new TreeNode(5);

        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);
        root.right.right = new TreeNode(6);

        FindLeftSumOfTree findLeftSumOfTree = new FindLeftSumOfTree();

        int res = findLeftSumOfTree.findLeftTotal(root.left);

        System.out.print(res);
    }
}

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Given a binary tree, return the inorder traversal of its nodes' values.

 For example:
 Given binary tree [1,null,2,3],
 1
    \
     2
    /
   3
 return [1,3,2].
 The key to solve inorder traversal of binary tree includes the following:

 The order of "inorder" is: left child -> parent -> right child
 Use a stack to track nodes
 Understand when to push node into the stack and when to pop node out of the stack
 * Created by qihuiyang on 7/29/17.
 */
public class BinaryTreeInorderTraversal {
    public List<Integer> inorderTraversal(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        ArrayList<Integer> list = new ArrayList<>();
        TreeNode cur = root;
        while(cur != null|| !stack.isEmpty()){
            // push root into stack
            if(cur != null){
                stack.push(cur);
                cur = cur.left;
            }
            else{
                // if stack is not empty but cur does'nt have left child
                TreeNode dealingWithNode = stack.pop();
                list.add(dealingWithNode.val);
                cur = dealingWithNode.right;
            }
        }
        return list;
    }

    public static void main(String[] args){
        TreeNode root = new TreeNode(1);
        TreeNode right1 = new TreeNode(2);
        TreeNode left2 = new TreeNode(3);
        root.right = right1;
        right1.left = left2;

        BinaryTreeInorderTraversal binaryTreeInorderTraversal = new BinaryTreeInorderTraversal();
        List res = binaryTreeInorderTraversal.inorderTraversal(root);
        System.out.print(res);
    }

}

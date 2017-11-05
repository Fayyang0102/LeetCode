/**
 * Created by qihuiyang on 8/14/17.
 */
public class ConvertSortedArrayToBST {
    public TreeNode convertToBST(int[] nums, int low, int high){
        if(nums.length == 0){
            return null;
        }
        if(low > high){
            return null;
        }
        int mid = low + (high - low)/2;
        TreeNode node = new TreeNode(nums[mid]);
        node.left = convertToBST(nums, low, mid -1);
        node.right = convertToBST(nums, mid+1, high);
        return node;

    }
    public static void main(String[] args){
        int[] nums = {1,2,3,4,5};
        int low = 0;
        int high = nums.length -1;
        ConvertSortedArrayToBST convertSortedArrayToBST = new ConvertSortedArrayToBST();
        TreeNode res = convertSortedArrayToBST.convertToBST(nums, low, high);
        System.out.print(res.val);

    }

}

/**
 * Created by FAY on 2/27/17.
 * Given an array containing n distinct numbers taken
 * from 0, 1, 2, ..., n, find the one that is missing from the array.
 * <p>
 * For example,
 * Given nums = [0, 1, 3] return 2.
 * <p>
 * Note:
 * Your algorithm should run in linear runtime complexity.
 * Could you implement it using only constant extra space complexity?
 */
public class MissingNumber {
    public static void main(String[] args) {
        int[] Arr = {0, 1, 2, 4, 5, 6};
        Solution s = new Solution();
        int res = s.missingNumber(Arr);
        System.out.println(res);

    }
}

class Solution {
    public int missingNumber(int[] nums) {
        // Sorted Array
        //Otherwise Arrays.sort(nums);
        int left = 0;
        int right = nums.length-1;

        for (int i = 0; i < nums.length; i++) {
            int mid = (left + right) / 2;
            if (nums[mid] > mid) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }
}
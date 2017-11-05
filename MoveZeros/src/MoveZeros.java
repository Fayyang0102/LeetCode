/**
 * Created by FAY on 2/27/17.
 * Given an array nums, write a function to move all 0's to the end of
 * it while maintaining the relative order of the non-zero elements.
 * <p>
 * For example, given nums = [0, 1, 0, 3, 12], after calling your function,
 * nums should be [1, 3, 12, 0, 0].
 * <p>
 * Note:
 * You must do this in-place without making a copy of the array.
 * Minimize the total number of operations.
 */
public class MoveZeros {
    public static void main(String[] args) {
        int[] Arr = {0, 1, 0, 3, 12};
        Solution s = new Solution();
        s.moveZeroes(Arr);
        for (int i = 0; i < Arr.length; i++) {

            System.out.println(Arr[i]);
        }
    }
}


class Solution {
    public int moveZeroes(int[] nums) {
        //base case
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int n = nums.length;
        int j;
        for (int i = 0; i < n - 1; i++) {
            j = i + 1;
            if (nums[i] == 0) {
                while (nums[j] == 0 && j < n - 1) { //if at pointer j is 0, point to next
                    j++;
                }
                int temp = nums[i]; //swap nums[i] and nums[j]
                nums[i] = nums[j];
                nums[j] = temp;
            } else {
                continue;
            }
        }
        return n;
    }
}
/**
 * Created by FAY on 2/27/17.
 * Given a sorted array, remove the duplicates in place such that
 * each element appear only once and return the new length.
 * <p>
 * Do not allocate extra space for another array, you must do this
 * in place with constant memory.
 * <p>
 * For example,
 * Given input array nums = [1,1,2],
 * <p>
 * Your function should return length = 2, with the first two elements of
 * nums being 1 and 2 respectively. It doesn't matter what you leave beyond
 * the new length.
 */
public class RemoveDuplicateFromSortedArray {
    public static void main(String[] args) {
        int[] Arr = {1, 1, 2, 3, 3};
        Solution s = new Solution();


        int res = s.removeDuplicates(Arr);
        System.out.println(res);


    }
}

class Solution {
    public static int removeDuplicates(int[] nums) {

        if (nums == null || nums.length == 0) {
            return 0;
        }

        int i = 0;
        int j = 1;
        while (j < nums.length) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];

            } else {
                j++;
            }
        }
        return i + 1;// return the length;

    }
}
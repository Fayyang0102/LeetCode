import java.util.HashSet;
import java.util.Set;

/**
 * Created by FAY on 2/28/17.
 * Given an array of integers and an integer k, find out whether there
 * are two distinct indices i and j in the array such that nums[i] = nums[j]
 * and the absolute difference between i and j is at most k.
 */
public class ContainsDuplicateII {
    public static void main(String[] args) {
        int[] arr = {9, 7, 6, 4, 5, 6, 7, 8, 9};
        int k = 5;
        Solution s = new Solution();
        boolean res = s.containsNearbyDuplicate(arr, k);// return type is boolean
        System.out.print(res);
    }

}

class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (i > k) {
                set.remove(nums[i - k - 1]);//only check for diff <= k
            }
            if (!set.add(nums[i])) {
                return true;
            }
        }
        return false;
    }
}
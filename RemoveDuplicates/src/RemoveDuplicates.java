import java.util.HashSet;
import java.util.Set;

/**
 * Created by FAY on 2/28/17.
 * Given an array of integers, find if the array contains any duplicates.
 * Your function should return true if any value appears at least twice in
 * the array, and it should return false if every element is distinct.
 */
public class RemoveDuplicates {
    public static void main(String[] args){
        int[] arr = {1, 2, 3, 4, 5, 5, 6};
        Solution s = new Solution();
        boolean res = s.containsDuplicate(arr);
        System.out.print(res);
    }
}

class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> distinct = new HashSet<>();
        for(int num : nums) {
            if(distinct.contains(num)) { // contains duplicates return true
                return true;
            }
            distinct.add(num);
        }
        return false;
    }
}
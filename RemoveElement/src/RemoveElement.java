/**
 * Created by FAY on 2/28/17.
 * Given an array and a value, remove all instances of that value
 * in place and return the new length.

 Do not allocate extra space for another array, you must do this
 in place with constant memory.

 The order of elements can be changed. It doesn't matter what you
 leave beyond the new length.

 Example:
 Given input array nums = [3,2,2,3], val = 3

 Your function should return length = 2, with the first two elements
 of nums being 2.
 */
public class RemoveElement {
    public static void main(String[] args){
        int[] arr = {3, 2, 2, 3};
        int val = 3;
        Solution s = new Solution();
        int res = s.removeElement(arr, val);
        System.out.print(res);
    }

}

class Solution {
    public int removeElement(int[] nums, int val) {
        int i = 0;
        for(int j = 0; j < nums.length; j++){ // j should start from 0 NOT 1, if its 1, it will skip the first element.
            if(nums[j] != val){ //if the fast pointer != val
                nums[i] = nums[j]; // assign fast value to slow
                i++;
            }
        }
        return i;
    }
}
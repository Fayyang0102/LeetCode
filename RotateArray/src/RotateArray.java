/**
 * Created by qihuiyang on 3/7/17.
 * Rotate an array of n elements to the right by k steps.

 For example, with n = 7 and k = 3, the array [1,2,3,4,5,6,7] is rotated to [5,6,7,1,2,3,4].
 */

/**
 * first rotate the whole array 7 6 5 | 4 3 2 1
 * second rotate first-half   5 6 7 | 4 3 2 1
 * third rotate second-half  5 6 7 | 1 2 3 4
 */

public class RotateArray {
    public void rotate(int[] nums, int k) {
        k = k % nums.length;
        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length - 1);
    }

    public void reverse(int[] nums, int startposition, int endposition) {
        int temp;
        while (startposition < endposition) {
            // swap
            temp = nums[startposition];
            nums[startposition] = nums[endposition];
            nums[endposition] = temp;
            startposition++;
            endposition--;
        }
    }

    public void printArray(int[] nums){
        for(int i = 0 ; i < nums.length; i++){
            System.out.println(nums[i]);
        }
    }


    public static void main(String[] args) {
        int[] Arr = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;
        RotateArray res = new RotateArray();
        res.rotate(Arr, k);
        res.printArray(Arr);

    }
}
// use of RotateArray to define my reesult, and use printArray to print instead of print in main
import java.util.Arrays;

/**
 * Given an array with n objects colored red, white or blue, sort them so that objects of the same color are adjacent,
 with the colors in the order red, white and blue.
 Here, we will use the integers 0, 1, and 2 to represent the color red, white, and blue respectively.

 Note:
 You are not suppose to use the library's sort function for this problem.

 Follow up:
 A rather straight forward solution is a two-pass algorithm using counting sort.
 First, iterate the array counting number of 0's, 1's, and 2's, then overwrite array with total number of 0's,
 then 1's and followed by 2's.

 Could you come up with an one-pass algorithm using only constant space?
 *
 *  Created by qihuiyang on 7/27/17.
 *
 *  two pointer lift  & right, red(0) <-left| white(1) |right-> blue(2)
 *
 *  red red red white white blue blue blue
 *              left        right
 *                          i
 */

public class SortColors {
    public void sortColors(int[] nums) {
        if(nums == null || nums.length <2){
            return;
        }
        int left = 0;
        int right = nums.length -1;
        for(int i = left ; i <= right;){
            if(nums[i]==0){//red
                int temp = nums[i];
                nums[left]= nums[i];
                nums[i]= temp;
                i++;
                left++;

            }
            else if(nums[i] == 2){//blue
                int temp = nums[i];
                nums[i] = nums[right];
                nums[right] = temp;

                right--;
            }
            else{//white
                i++;
            }
        }
    }
    public static void main(String[] args){
        int[] nums = {0,1,2,2,1,0};
        SortColors sc = new SortColors();
        sc.sortColors(nums);
        System.out.print(Arrays.toString(nums));
    }
}

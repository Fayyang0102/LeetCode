import java.util.Arrays;

/**Given an array nums, write a function to move all 0's to the end of it while
 *
 * maintaining the relative order of the non-zero elements.

 For example, given nums = [0, 1, 0, 3, 12], after calling your

 function, nums should be [1, 3, 12, 0, 0].
 *
 * Created by qihuiyang on 7/26/17.
 */

public class MoveZeros {
    public void moveZeroes(int[] nums) {
        int index = 0;
        for(int identify = 0; identify < nums.length; identify++) {
            if(nums[identify] != 0) {
                int temp = nums[index];
                nums[index] = nums[identify];
                nums[identify] = temp;
                index++;
            }
        }
    }
    public static void main(String[] args){
        int[] n = {0,0,1,2,3};
        MoveZeros mz = new MoveZeros();
        mz.moveZeroes(n);
        System.out.print("Atfer moved:" + Arrays.toString(n));
    }
}

import java.util.HashMap;


/**
 * Created by qihuiyang on 3/31/17.
 * Given an array of integers, every element appears twice except for one. Find that single one.
 * Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?
 *
 *  the bitwise XOR in java

     0 ^ N = N
     N ^ N = 0

 */
public class SingleNumber {
    public static void main(String[] args){
        int[] data = {1, 1, 2, 3, 3, 4, 4};
        int res = singleNumber(data);
        System.out.print(res);

    }



    public static int singleNumber( int[] nums) {

        int result = 0;
        for(int i = 0; i < nums.length;i++)
        {
            result ^= nums[i];  /* Get the xor of all elements */
        }
        return result;

    }
}
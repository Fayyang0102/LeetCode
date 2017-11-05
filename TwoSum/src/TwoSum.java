import java.util.HashMap;


/**
 * Created by qihuiyang on 3/31/17.
 * Given an array of integers, return indices of the two numbers such that they add up to a specific target.

 You may assume that each input would have exactly one solution, and you may not use the same element twice.

 Example:
 Given nums = [2, 7, 11, 15], target = 9,

 Because nums[0] + nums[1] = 2 + 7 = 9,
 return [0, 1].
 */


public class TwoSum {
    public static int[] getTwoSum(int[] nums, int target){
        int[] result = new int[2];
        HashMap<Integer, Integer> hm = new HashMap<>();

        for(int i = 0 ; i < nums.length; i++){
            int diff = target - nums[i];
            if(hm.containsKey(diff) ){

                result[0] = hm.get(diff);
                result[1] = i ;

            }
            hm.put(nums[i], i );
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] res = new int[2];

        res = getTwoSum(nums, target);
        System.out.println("result is: [" + res[0] + " , " + res[1] +"]");


    }

}

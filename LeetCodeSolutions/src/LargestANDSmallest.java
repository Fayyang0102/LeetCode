/**
 * Created by qihuiyang on 8/29/17.
 */
public class LargestANDSmallest {
    public static void findLargest(int[] nums) {
        // 0 element
        if (nums == null || nums.length < 1) {
            return;
        }
        int min;
        int max;
        // 1 element
        if (nums.length == 1) {
            min = nums[0];
            max = nums[0];
        }
        // define first min max
        if (nums[0] > nums[1]) {
            min = nums[1];
            max = nums[0];
        } else {
            min = nums[0];
            max = nums[1];
        }
        // even elements
        for (int i = 2; i <= nums.length - 2; ) {
            if (nums[i] > nums[i + 1]) {
                max = Math.max(max, nums[i]);
                min = Math.min(min, nums[i + 1]);
            } else {
                min = Math.min(min, nums[i]);
                max = Math.max(max, nums[i + 1]);
            }
            i = i + 2;
        }
        // odd elements
        if (nums.length % 2 == 1) {
            min = Math.min(min, nums[nums.length - 1]);
            max = Math.max(max, nums[nums.length - 1]);
        }
        System.out.print("max is: " + max + " and min is: " + min);


    }

    public static void main(String[] args) {
        int[] n = {1, 2, 3, 4, 5, 6};
        findLargest(n);

    }
}

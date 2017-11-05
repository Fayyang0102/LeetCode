import java.lang.reflect.Array;
import java.util.Arrays;

/**Given an array of size n, find the majority element. The majority element is the element that appears more than ⌊ n/2 ⌋ times.

 You may assume that the array is non-empty and the majority element always exist in the array.
 * Created by qihuiyang on 7/26/17.
 */
public class MajorityElements {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length/2];
    }
    public static void main(String[] args){
        int[] n = {1, 2, 2, 2, 2, 4};
        MajorityElements me = new MajorityElements();
        int res = me.majorityElement(n);
        System.out.print(res);
    }
}

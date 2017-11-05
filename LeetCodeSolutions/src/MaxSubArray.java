/**
 * Created by qihuiyang on 8/19/17.
 */
public class MaxSubArray {
    public int maxSubArray(int[] nums) {
        int n = nums.length;
        int[] m = new int[n];
        m[0] = nums[0];
        int max = m[0];

        for(int i = 1; i < n; i++){
            m[i] = nums[i] + (m[i - 1] > 0 ? m[i - 1] : 0);
            max = Math.max(max, m[i]);
        }

        return max;
    }
}

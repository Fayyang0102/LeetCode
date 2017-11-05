/**
 * Created by qihuiyang on 8/15/17.
 */
public class LongestAcendingSubArray {
    public int longestAscendingSubArray(int[] nums){
        int length = 1;
        int maxLength = 0;
        for(int i = 1; i<= nums.length-1;i++){
            if(nums[i] > nums[i-1]){
                length ++;
                if(length > maxLength){
                    maxLength = length;
                }
            }else{
                length = 1;
            }
        }
        return maxLength;
    }
    public static void main(String[] args){
        int[] nums = {7,2,3,1,5,6,7,4};
        LongestAcendingSubArray l = new LongestAcendingSubArray();
        int res = l.longestAscendingSubArray(nums);
        System.out.print(res);

    }
}

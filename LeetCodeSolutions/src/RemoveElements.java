/**
 * Created by qihuiyang on 8/14/17.
 *
 * Given an array and a value, remove all instances of that value in place and return the new length.

 Do not allocate extra space for another array, you must do this in place with constant memory.

 The order of elements can be changed. It doesn't matter what you leave beyond the new length.


 */
public class RemoveElements {
    public int removeElement(int[] nums, int val) {
        if(nums.length == 0){
            return 0;
        }
        int count =0;
        for(int i = 0 ; i <= nums.length-1;i++){
            if(nums[i] !=val){
                nums[count++] = nums[i];
            }
        }
        return count;

    }

    public static void main(String[] args){
        int[] nums = {1,2,3,4};
        int val = 2;
        RemoveElements removeElements = new RemoveElements();
        int res = removeElements.removeElement(nums,val);
        System.out.print(res);
    }
}

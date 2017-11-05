import java.util.Arrays;
import java.util.HashSet;

/**
 * Created by qihuiyang on 4/1/17.
 * Given two arrays, write a function to compute their intersection.

 Example:
 Given nums1 = [1, 2, 2, 1], nums2 = [2, 2], return [2].

 Note:
 Each element in the result must be unique.
 The result can be in any order.
 */

public class IntersectionOfTwoArrays {
    public static int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> hs = new HashSet<>();
        HashSet<Integer> inter = new HashSet<>();

        for(int i = 0 ; i< nums1.length; i++){
            hs.add(nums1[i]);
        }
        for(int i = 0; i < nums2.length; i++){
            if(hs.contains(nums2[i])){
                inter.add(nums2[i]);
            }
        }
        int[] res = new int[inter.size()];
        int i = 0;
        for(int num : inter){
            res[i++] = num;
        }
        return res;
    }
    public static void main(String[] args){
        int[] nums1 = {1, 2, 2, 1};
        int[] nums2 = {2, 2};
        int[] ans = intersection(nums1, nums2);

        System.out.print("result is :" + Arrays.toString(ans)); // little trick here to convert array and output
    }



}

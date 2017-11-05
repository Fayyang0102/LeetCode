import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by qihuiyang on 7/23/17.
 */
public class SubsetII {
    //follow up questions: duplicate int input
    // require: No duplicate subset, but can have duplicate number

    public List<List<Integer>> duplicateSubset(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        subsetHelper(nums, 0, res, new ArrayList<>());
        return res;
    }

    private void subsetHelper(int[] nums, int pos, List<List<Integer>> res, List<Integer> tmpRes) {
        // subset means it does not need contain all elements, so the condition is <= rather than ==
        // and do not return after this statement
        if(pos <= nums.length) res.add(new ArrayList<>(tmpRes));

        for(int i=pos; i<nums.length; i++) {
            if(i > pos && nums[i] == nums[i-1]) continue;   // avoid duplicates
            tmpRes.add(nums[i]);
            subsetHelper(nums, i + 1, res, tmpRes);
            tmpRes.remove(tmpRes.size() - 1);
        }
    }

    public static void main(String[] args) {
        int[] n = {1, 2, 2};
        SubsetII getSubset = new SubsetII();
        List<List<Integer>> res2 = getSubset.duplicateSubset(n);

        System.out.println(res2);
    }
}

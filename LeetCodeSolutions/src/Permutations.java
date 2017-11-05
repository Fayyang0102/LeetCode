import java.util.ArrayList;
import java.util.List;

/**Given a collection of distinct numbers, return all possible permutations.

 For example,
 [1,2,3] have the following permutations:
 [
 [1,2,3],
 [1,3,2],
 [2,1,3],
 [2,3,1],
 [3,1,2],
 [3,2,1]
 ]
 * Created by qihuiyang on 7/31/17.
 */
public class Permutations {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        if(nums.length == 0){
            return ans;
        }
        List<Integer> subList = new ArrayList<>();
        subList.add(nums[0]);
        ans.add(subList);
        for(int i = 1 ; i < nums.length;i++){
            List<List<Integer>> new_ans = new ArrayList<>();
            for(int j = 0 ; j <= i ; j++){
                for(List<Integer> x : ans){
                    List<Integer> list = new ArrayList<>(x);
                    list.add(j,nums[i]);
                    new_ans.add(list);
                }
            }
            ans = new_ans;
        }
        return ans;
    }
    public  static void main(String[] args){
        int[] nums = {1,2,3};
        Permutations permutations = new Permutations();
        List<List<Integer>> res = permutations.permute(nums);
        System.out.print(res);
    }
}

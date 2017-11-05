import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

/**
 * Created by qihuiyang on 7/21/17.
 */
public class Subset {
    // Method 1
    /**public List<List<Integer>> subsets(int[] nums) {
        //list
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        Arrays.sort(nums);
        iterator(list, temp, nums, 0);

        return list;

    }

    public void iterator(List<List<Integer>> list, List<Integer> tempList, int[] nums, int start){
        //sublist
        list.add(new ArrayList<>(tempList));
        for(int i = start ; i < nums.length ; i ++){
            tempList.add(nums[i]);
            iterator(list,tempList, nums, i+1 );
            tempList.remove(tempList.size()-1);

        }

    }

     */
    //Method 2
    public List<List<Integer>> permutation(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        recursive(list, nums,new Stack<>(),0);
        return list;
    }

    private void recursive(List<List<Integer>> list,int[] nums, Stack path, int start) {
        if (nums.length == start) {
            list.add(new ArrayList<>(path));
            return;
        }
           path.push(nums[start]);
        start = start +1;

        recursive(list, nums, path, start);
        path.pop();
        recursive(list, nums, path, start);
    }



    public static void main(String[] args){
        int[] n = {1,2,3};
        int[] m = {1,2,2};
        Subset getSubset = new Subset();
        // List<List<Integer>> res = getSubset.subsets(n);
        List<List<Integer>> res2 = getSubset.permutation(n);

        // System.out.println(res);
        System.out.println(res2);
    }
}

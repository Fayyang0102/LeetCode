import java.util.HashSet;

/**
 * Created by qihuiyang on 7/26/17.
 */
public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums){
        HashSet<Integer> hs = new HashSet<>();
        for(int i = 0 ; i < nums.length ; i++){
            hs.add(nums[i]);
        }
        if(hs.size() != nums.length ){
            return true;
        }
        else{
            return false;
        }

    }
    public static void main(String[] args){
        int[] n = {1,2,2,3};
        ContainsDuplicate cd = new ContainsDuplicate();
        boolean res = cd.containsDuplicate(n);
        System.out.print(res);
    }
}

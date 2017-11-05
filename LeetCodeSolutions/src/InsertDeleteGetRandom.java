import java.util.ArrayList;
import java.util.HashMap;

/**
 * Design a data structure that supports all following operations in average O(1) time.

 insert(val): Inserts an item val to the set if not already present.
 remove(val): Removes an item val from the set if present.
 getRandom: Returns a random element from current set of elements. Each element must have the same probability of being returned.
 Example:
 * Created by qihuiyang on 7/11/17.
 */
public class InsertDeleteGetRandom {
    ArrayList<Integer> nums;
    HashMap<Integer,Integer> hm;
    java.util.Random random = new java.util.Random();
    public InsertDeleteGetRandom(){
        nums = new ArrayList<Integer>();
        hm = new HashMap<Integer,Integer>();
    }
    public boolean insert(int val){
        if(hm.containsKey(val)){
            return false;
        }
        hm.put( val, nums.size());
        nums.add(val);
        return true;
    }
    public boolean remove(int val){
        if(! hm.containsKey(val)){
            return false;
        }
        int hmn = hm.get(val);
        if(hmn < nums.size() -1){
            int lastone = nums.get(nums.size()-1);
            nums.set(hmn, lastone);
            hm.put(lastone, hmn);
        }
        hm.remove(val);
        nums.remove(nums.size()-1);
        return true;
    }
    public int getRandom(){
        return nums.get(random.nextInt(nums.size()));
    }

    public static void mian(String[] args){
        InsertDeleteGetRandom obj = new InsertDeleteGetRandom();
        boolean p1 = obj.insert(1);
        boolean p2 = obj.remove(2);
        int p3 = obj.getRandom();
        System.out.println(p1);
        System.out.println(p2);

        System.out.println(p3);

    }

}

import java.util.ArrayList;
import java.util.HashMap;


/**
 * Created by qihuiyang on 3/31/17.
 */
public class RemoveDuplicatesUsingHashMap {
    public static void main(String args[]) {

        //setup hashmap
        int[] data = {1, 1, 1, 2, 2, 3, 3, 3, 3, 4, 4};
        int n = 2;
        HashMap<Integer, Integer> hm = new HashMap<>();
        ArrayList<Integer> res = new ArrayList<>();

        //check repetitions
        for (int i = 0; i < data.length; i++) {
            if (!hm.containsKey(data[i])) {
                hm.put(data[i], 1);
            } else {
                int val = 0;
                val = hm.get(data[i]) + 1;
                if (val <= n && !res.contains(data[i])) {
                    res.add(data[i]);
                }
                hm.put(data[i], val);
            }

            //Print result
            System.out.println("Result is :" + res);
        }
    }
}

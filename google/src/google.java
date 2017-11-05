import java.util.HashMap;

/**
 * Created by qihuiyang on 3/31/17.
 */
public class google {
    public static int[] answer(int[] data, int n) {
        int[] res = {};
        // create a hashmap
        HashMap<Integer, Integer> hm = new HashMap<>();
        // store vales in Hashmap
        for (int key : data) {
            int freq = hm.get(key);
            if (key == 0) {
                freq = 1;
            } else {
                freq++;
            }

            // check repeated times

            if (freq <= n) {
                res.append = hm.get(key, freq);
            }
            return res;
        }
    }

    public static void main(String[] args){
            int[] data = {1, 1, 1, 2, 2, 3, 3, 4, 5, 5};
            int n = 2;
            int[] res = {};
            res = answer(data, n);
            for(int i = 0; i < res.length; i++){
                System.out.print(res[i] + ", ");
            }
    }

}

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by qihuiyang on 4/10/17.
 */
public class Subset {
    public static List<List<Integer>> subsets(int[] list) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        if (list == null && list.length == 0) {
            return res;
        }
        subset_helper(list, 0, new ArrayList<Integer>(), res);
        return res;
    }

    public static void subset_helper(int[] s, int index, List<Integer> row, List<List<Integer>> res) {
        res.add(new ArrayList<Integer>(row));

        for (int i = index; i < s.length; i++) {
            row.add(s[i]);
            subset_helper(s, i + 1, row, res);
            row.remove(row.size() - 1);
        }
    }

    public static void main(String[] args) {
        int[] data = {1,2,3};
        System.out.println(subsets(data));
    }

}

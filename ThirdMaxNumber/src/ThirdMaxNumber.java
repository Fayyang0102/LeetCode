import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Set;

/**
 * Created by FAY on 2/27/17.
 * <p>
 * Given a non-empty array of integers, return the third maximum number in this array.
 * If it does not exist, return the maximum number.
 * The time complexity must be in O(n).
 * <p>
 * Example 1:
 * Input: [3, 2, 1]
 * <p>
 * Output: 1
 * <p>
 * Explanation: The third maximum is 1.
 * Example 2:
 * Input: [1, 2]
 * <p>
 * Output: 2
 * <p>
 * Explanation: The third maximum does not exist, so the maximum (2) is returned instead.
 * Example 3:
 * Input: [2, 2, 3, 1]
 * <p>
 * Output: 1
 * <p>
 * Explanation: Note that the third maximum here means the third maximum distinct number.
 * Both numbers with value 2 are both considered as second maximum.
 */

public class ThirdMaxNumber {
    public static void main(String[] args) {
        int[] Arr1 = {3, 2, 1, 8, 0, 7};
        int[] Arr2 = {2, 5};
        int[] Arr3 = {1};

        Solution s = new Solution();
        int res1 = s.thirdMax(Arr1);
        int res2 = s.thirdMax(Arr2);
        int res3 = s.thirdMax(Arr3);

        System.out.println(res1);
        System.out.println(res2);
        System.out.println(res3);

    }
}

class Solution {
    public int thirdMax(int[] nums) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        Set<Integer> set = new HashSet<>();
        for (int i : nums) {
            if (!set.contains(i)) {
                pq.offer(i);
                set.add(i);
                set.add(i);
                if (pq.size() > 3) {
                    set.remove(pq.poll());
                }
            }

        }
        if (pq.size() < 3) {
            while (pq.size() > 1) {
                pq.poll();
            }
        }
        return pq.peek();

    }
}



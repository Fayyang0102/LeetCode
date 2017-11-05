/**
 * Created by FAY on 2/26/17.
 */
/*
Given a sorted array and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.

You may assume no duplicates in the array.

Here are few examples.
[1,3,5,6], 5 → 2
[1,3,5,6], 2 → 1
[1,3,5,6], 7 → 4
[1,3,5,6], 0 → 0
*/


public class SerachInsertPosition {
    public static void main(String[] args) {
        int[] myList = {1, 3, 5, 6};
        int[] myvalue = {5, 2, 7, 0};

        Solution s = new Solution();
        s.searchInsert(myList, 5);
        for(int i = 0 ; i <= myvalue.length -1; i++){
            int result = s.searchInsert(myList, myvalue[i]);
            System.out.println("myValue  "+ myvalue[i] + "searched index is : "+ result);

        }
    }
}

class Solution {
    public int searchInsert(int[] A, int target) {
        if (A == null || A.length == 0) {
            return 0;
        }

        int low = 0, high = A.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (target == A[mid]) {
                return mid;
            } else if (target < A[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }
}

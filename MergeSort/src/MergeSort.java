import java.util.*;
/**
 * Created by qihuiyang on 4/2/17.
 */
public class MergeSort {
    public static void main(String[] args) {
        int[] list = {14, 32, 67, 76, 23, 41, 58, 85};
        System.out.println("before: " + Arrays.toString(list));
        mergeSort(list);
        System.out.println("after:  " + Arrays.toString(list));
    }
    public static void mergeSort(int[] array) {
        if (array.length > 1) {
            int[] left = leftHalf(array);
            int[] right = rightHalf(array);

            mergeSort(left);
            mergeSort(right);

            merge(array, left, right);
        }
    }
    public static int[] leftHalf(int[] array) {
        int size1 = array.length / 2;
        int[] left = new int[size1];
        for (int i = 0; i < size1; i++) {
            left[i] = array[i];
        }
        return left;
    }

    public static int[] rightHalf(int[] array) {
        int size1 = array.length / 2;
        int size2 = array.length - size1;
        int[] right = new int[size2];
        for (int i = 0; i < size2; i++) {
            right[i] = array[i + size1];
        }
        return right;
    }
    public static void merge(int[] result, int[] left, int[] right) {
        int il = 0;   // index into left array
        int ir = 0;   // index into right array

        for (int i = 0; i < result.length; i++) {
            if (ir >= right.length || (il < left.length &&
                    left[il] <= right[ir])) {
                result[i] = left[il];    // take from left
                il++;
            } else {
                result[i] = right[ir];   // take from right
                ir++;
            }
        }
    }
}

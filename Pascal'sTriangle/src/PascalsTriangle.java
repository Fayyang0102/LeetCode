import java.util.List;
import java.util.Scanner;

/**
 * Created by qihuiyang on 3/31/17.
 * Given numRows, generate the first numRows of Pascal's triangle.

 For example, given numRows = 5,
 Return

 [
      [1],
     [1,1],  --> 1 = 1 + 0
    [1,2,1], --> 2 = 1 + 1
   [1,3,3,1],  --> 3 = 1 + 2
  [1,4,6,4,1] --> 6 = 3 + 3
 ]
 */
public class PascalsTriangle {
    public static void generate(int n) {
        int[] prevRow;
        int[] curRow = {1};
        printArray(curRow);
        prevRow = curRow;
        for (int i = 2; i <= n; i++) {
            curRow = new int[i];
            curRow[0] = 1;
            curRow[i - 1] = 1;
            for (int j = 0; j <= i - 3; j++) {
                curRow[j + 1] = prevRow[j] + prevRow[j + 1];
            }
            printArray(curRow);
            prevRow = curRow;
        }
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the row number upto which Pascal's triangle has to be printed: ");
        int row = scanner.nextInt();
        generate(row);
    }
}

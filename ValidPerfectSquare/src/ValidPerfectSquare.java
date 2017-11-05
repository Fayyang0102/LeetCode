/**
 * Created by qihuiyang on 4/3/17.
 * Given a positive integer num, write a function which returns True if num is a perfect square else False.

 Note: Do not use any built-in library function such as sqrt.

 Example 1:

 Input: 16
 Returns: True
 Example 2:

 Input: 14
 Returns: False

 */
public class ValidPerfectSquare {
    public static boolean isPerfectSquare(int num) {
        int low = 1;
        int high = num;
        while (low <= high) {
            long mid = (low + high) >>> 1;
            //the >>> operator is the unsigned right bit-shift operator.
            // It effectively divides the operand by 2 to the power of the
            // right operand, or just 2 here.
            if (mid * mid == num) {
                return true;
            } else if (mid * mid < num) {
                low = (int) mid + 1;
            } else {
                high = (int) mid - 1;
            }
        }
        return false;

    }

    public static void main(String[] args) {
        int n = 16;

        System.out.print(isPerfectSquare(n));
    }
}

/**
 * Created by qihuiyang on 8/14/17.
 * Ugly numbers are positive numbers whose prime factors only include 2, 3, 5.
 * For example, 6, 8 are ugly while 14 is not ugly since it includes another prime factor 7.

 Note that 1 is typically treated as an ugly number.
 */
public class UglyNumber {
    public boolean isUgly(int num) {
        if(num == 0) {return false;}
        if(num == 1){
            return true;
        }
        if (num % 2 == 0) {
            return isUgly(num/2);
        }
        if (num % 3 == 0) {
            return isUgly(num/3);
        }
        if (num % 5 == 0) {
            return isUgly(num/5);
        }
        return false;
    }
    public static void main(String[] args){
        int n = 14;
        UglyNumber uglyNumber = new UglyNumber();
        boolean res = uglyNumber.isUgly(n);
        System.out.print(res);
    }

}

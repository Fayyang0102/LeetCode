/**
 * Created by qihuiyang on 7/26/17.
 */
public class ReverseInteger {
    public int reverse(int x) {
        long rev= 0;
        while( x != 0){
            rev= rev*10 + x % 10;
            x= x/10;
            //if( rev > Integer.MAX_VALUE || rev < Integer.MIN_VALUE)
                //return 0;
        }
        return (int) rev;
    }
    public static void main(String[] args){
        int a = -234;
        ReverseInteger ri = new ReverseInteger();
        int res = ri.reverse(a);
        System.out.print(res);
    }
}

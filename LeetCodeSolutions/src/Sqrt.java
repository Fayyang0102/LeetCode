/**
 * Implement int sqrt(int x).

 Compute and return the square root of x.

 * Created by qihuiyang on 7/15/17.
 */
public class Sqrt {
    public int findSqrt(int x){
        int left = 0, right = x;
        if(x == 1 || x == 0){
            return x;
        }
        while(left <= right){
            int mid = left + (right - left)/2;
            if(mid == x/mid){
                return mid;
            }
            else if(mid > x/mid){
                right = mid -1;
            }
            else{
                left = mid + 1;
            }
        }
        return right;

    }
    public static void main(String[] args){
        int x = 0;
        Sqrt call = new Sqrt();
        int res = call.findSqrt(x);
        System.out.print(res);

    }
}

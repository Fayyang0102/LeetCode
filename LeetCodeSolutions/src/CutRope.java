/**
 * Created by qihuiyang on 8/16/17.
 */
public class CutRope {
    // recursive
    public int getMaxProduct(int n) {
        if (n <= 1) {
            return 0;
        }
        int maxProduct = 0;
        for (int i = 1; i < n; i++) { // i = meters of rope to cut off
            int best = Math.max(n - i, getMaxProduct(n - i));
            maxProduct = Math.max(maxProduct, i * best);

        }
        return maxProduct;
    }
    //time Complexity O(n*n)


    //DP (左大段 右大段)
    public int cutRope(int n) {
        int[] m = new int[n +1];
        m[0]=0;
        m[1]=0;
        for(int i= 1; i <= n ; i++){
            int curMax = 0;
            for(int j = 1; j <= i/2; j++){  //对称的
                curMax = Math.max(curMax, Math.max(j, m[j])*Math.max((i -j),m[i-j]));
            }
            m[i]= curMax;
        }
        return m[n];

    }

   // time complexity O(n^2)
    // DP2 （左大段 右小段）


    public static void main(String[] args) {
        int n = 5;
        CutRope cutRope = new CutRope();
        int res = cutRope.cutRope(n);
        System.out.print(res);
    }
}

import org.omg.CORBA.MARSHAL;

/**Input: [7, 1, 5, 3, 6, 4]
 Output: 5

 max. difference = 6-1 = 5 (not 7-1 = 6, as selling price needs to be larger than buying price)
 * Created by qihuiyang on 7/27/17.
/*
 */

public class BestTimeToBuyAndSellStack {
    public int maxProfit(int[] prices) {
        int globalMAX = 0;
        int curMAX = 0;
        for(int i = 1; i < prices.length; i++){
            curMAX += prices[i] - prices[i-1];
            curMAX = Math.max(0,curMAX);
            globalMAX = Math.max(curMAX,globalMAX);
        }
        return globalMAX;
    }
    public static void main(String[] args){
        int[] price  = {7,1,5,3,6,4};
        BestTimeToBuyAndSellStack bestTimeToBuyAndSellStack = new BestTimeToBuyAndSellStack();
        int res = bestTimeToBuyAndSellStack.maxProfit(price);
        System.out.print(res);
    }

}

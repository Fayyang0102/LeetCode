/**Say you have an array for which the ith element is the price of a given stock on day i.

 Design an algorithm to find the maximum profit. You may complete as many transactions
 as you like (ie, buy one and sell one share of the stock multiple times). However, you may not engage
 in multiple transactions at the same time (ie, you must sell the stock before you buy again).


 If you talk about multiple day, say 3 days, and the price is 3,1,5, and you thought about 3 buy, 5 sell.
 But actually you will make the most if buy at 1 and sell at 5. If the price is 3,9,5, the best would just do 3->9,
 and forget about the 5. If 3,4,5, you can say 3->5 is the best, but my code will give you 3->4 and 4->5, which is the same.

 * Created by qihuiyang on 7/31/17.
 */
public class BestTimeToBuyAndSellStack2 {
    public int maxProfit(int[] prices) {
        int total = 0;
        for (int i=0; i< prices.length-1; i++) {
            if (prices[i+1]>prices[i]){}
            total += prices[i+1]-prices[i];
        }
        return total;
    }
    public static void main(String[] args){
        int[] price = {3,4,5};
        BestTimeToBuyAndSellStack2 bestTimeToBuyAndSellStack2 = new BestTimeToBuyAndSellStack2();
        int res = bestTimeToBuyAndSellStack2.maxProfit(price);
        System.out.print(res);
    }
}

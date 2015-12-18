package medium;

public class BestTimeToSellAndBuy {
	
	public int maxProfit(int[] prices) {
        int p = 0;
        if(prices.length<1)
          return 0;
        int min = prices[0];
        for (int i = 0; i < prices.length; i++) {
            if (prices[i]>=min){
                p = Math.max(prices[i]-min,p);
            }else {
            	System.out.println(p);
                min = prices[i];
            }
        }
        return p;
    }
}
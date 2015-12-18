package medium;
 
public class Stock {	  
	static int shares;
	public static int value;
	
	 public int maxProfit(int[] prices) {
		int profit = 0;
		
		if(prices.length > 1)
			for(int i = 1;i < prices.length;i++)
				if(prices[i] > prices[i-1])
					profit += prices[i] - prices[i-1];
		
		return profit;
	  }
}

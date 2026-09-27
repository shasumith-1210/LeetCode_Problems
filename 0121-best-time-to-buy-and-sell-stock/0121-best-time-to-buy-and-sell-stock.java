class Solution {
    public int maxProfit(int[] prices) {
        int buyPrice=Integer.MAX_VALUE;   //calculates the min buy price 
        int maxProfit=0;

        for(int i=0;i<prices.length;i++){
            //case 1: when bp<sp
            if(buyPrice < prices[i]){
                int profit=prices[i]-buyPrice; //todays profit
                maxProfit=Math.max(maxProfit,profit);
            }
            else{
                buyPrice=prices[i];   //when bp>sp    ... like if we arent going to make any profit today .. maybe tomorrow we r going to make profit
            }
        }
        return maxProfit;  
    }
}
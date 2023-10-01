package array;

public class BuyingStocksAndSells {
    public static int maxProfit(int stocks[]){
        int n=stocks.length;
        int maxProfit=0;
        int buyingPrice=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
          if( buyingPrice<stocks[i]){
              int profit=stocks[i]-buyingPrice;
              maxProfit=Math.max(maxProfit,profit);
          }
          else {
              buyingPrice = stocks[i];
          }
        }
        return maxProfit;
    }
    public static void main(String[] args) {
      int stocks[]={7,1,5,3,6,4};
        System.out.println(maxProfit(stocks));
    }

}

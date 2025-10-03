package array;

public class buyandsellstock {
    public static int buysell(int price[]){
        int buyprice=Integer.MAX_VALUE;
        int maxprofit=0;
        for (int i=0;i<price.length;i++){
            if(buyprice<price[i])  //profit
            {
                int profit = price[i]-buyprice;//today profit
                maxprofit= Math.max(maxprofit,profit);

            }
            else{
                buyprice=price[i];
            }
        }
        return maxprofit;
    }



    public static void main(String[] args) {
        int price[]={7,1,5,3,6,4};
        System.out.println(buysell(price));
    }
    
}

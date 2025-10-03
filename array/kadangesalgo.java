package array;

public class kadangesalgo{
    public static void kandas(int num[]){
        int currsum=0;
        int maxsum=Integer.MIN_VALUE;
        for(int i=0;i<num.length;i++){
            currsum=currsum+num[i];
            if(currsum<0){
                currsum=0;
            }
            maxsum=Math.max(currsum,maxsum);
        }
        System.out.println("max sum is"+maxsum);
        }
        public static void main(String[] args) {
            int num[]={-2,-3,4,-1,-2,1,5,-3};
            kandas(num);
        }
    }
     
    


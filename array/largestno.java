package array;
import java.util.*;

public class largestno {
    public static int ln(int num[])
    {
        int largest=Integer.MIN_VALUE;
        int smallest=Integer.MAX_VALUE;
        for(int i=0;i<num.length;i++){
            if(largest<num[i]){
                largest=num[i];
            }
            if(smallest>num[i]){
                smallest=num[i];
            }
        }
        System.out.println("smallest value  is "+smallest);
        return largest;
    }
    public static void main(String[] args) {
        int num[]={1,2,3,8,10,5};
        System.out.println("largest value is "+ln(num));

    }

    
}

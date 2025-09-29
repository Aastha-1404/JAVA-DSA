
import java.util.*;
public class sum_n_no {
    public static void main(String args[])
    {
        Scanner input=new Scanner(System.in);
        System.out.println("enter the n element to be added");
        int n=input.nextInt();
        int i=1, sum=0;
        while (i<n) {
            sum=sum+i;
            i++;
        }
        System.out.println("sum is :  "+sum);
    }
    
}

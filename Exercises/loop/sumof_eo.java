package Exercises.loop;
import java.util.*;
public class sumof_eo {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter the no :  ");
        int n=input.nextInt();
        int sum_even=0;
        int sum_odd=0;
        for(int i=1;i<=n;i++)
        {
            if((i%2)==0)
{
    sum_even=sum_even+i;

}
else{
sum_odd=sum_odd+i;
}
        }
        System.out.println("even sum is "+sum_even);
        System.out.println("odd sum  "+sum_odd );
    }
    
}

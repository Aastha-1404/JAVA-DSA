package function;
import java.util.*;
public class factorial {
    public static int f(int n){
        int fact = 1;
        for(int i=1;i<=n;i++){
             fact=fact*i;
        }
        return fact;
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
       int a= f(n);
        System.out.println("factorial of "+n+"  is: "+a);

    }
}

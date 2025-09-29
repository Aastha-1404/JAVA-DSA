package function;
import java.util.*;
public class binomial {
     public static int f(int n){
        int fact = 1;
        for(int i=1;i<=n;i++){
             fact=fact*i;
        }
        return fact;
    }
    public static int binomial_c(int n,int r){
        int n_fact=f(n);
        int r_fact=f(r);
        int nmr_fact=f(n-r);
        int bi=n_fact/(r_fact*nmr_fact);
        return  bi;
    }
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("enter n");
        int n=input.nextInt();
        System.out.println("enter r");
        int r=input.nextInt();
        int binomial_coff=binomial_c(n,r);
        System.out.println("binomial coffecient is ("+n+","+r+")"+binomial_coff);
    }
    
}

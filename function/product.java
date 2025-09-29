package function;
import java.util.*;
public class product {
    public static int multiply(int a,int b){
        int pro=a*b;
        
        return pro;

    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int a =input.nextInt();
        int b=input.nextInt();
       int pro= multiply(a, b);
        System.out.println("multiply of(a*b): "+pro);
        
    }
    
}

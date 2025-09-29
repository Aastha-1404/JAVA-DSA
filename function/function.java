package function;
import java.util.*;

public class function {
    public static int sum(int a,int b)//parameter or formal parameter
    {

int cal =a+b;

return cal;
    }

    public static void main(String[] args) {
       Scanner input=new Scanner(System.in);
int a=input.nextInt();
int b=input.nextInt();
       int cal= sum(a,b);//actual parameter
        System.out.println("sum is: "+cal);
    }
    
}

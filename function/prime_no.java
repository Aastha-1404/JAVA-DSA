package function;
import java.util.*;
public class prime_no {

    public static boolean prime(int n) {
        boolean isprime = true;
        for (int i = 2; i <= n - 1; i++) {
            if ((n % i == 0)) {
                isprime = false;
            //break;
            } 

        }
        if (isprime == true) {
            System.out.println("prime no");

        } else {
            System.out.println("not pime");
        }
        return isprime;
    
    }

    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);
        int n=input.nextInt();
        prime(n);
    }

}

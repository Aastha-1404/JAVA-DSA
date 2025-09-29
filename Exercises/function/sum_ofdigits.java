package Exercises.function;

public class sum_ofdigits {
    public static int sumOfDigits(int n){
        int r,sum=0;
        while(n>0){
            r=n%10;
            sum=sum+r;
            n=n/10;
        }
        return sum;
    }
public static void main(String[] args) {
    int n=1234;
    System.out.println(sumOfDigits(n));
}    
}

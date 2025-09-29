 import java.util.*;
public class isprime {
   
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter the no to check: ");
        int n=input.nextInt();
        boolean isprime=true;
        for(int i=2;i<n-1;i++){
            if(n%i==0){
                isprime=false;
            }
        }
        if(isprime==true)
{
    System.out.println("IT IS PRIME NO");
}
else{
    System.out.println("it is not a prime no");
}
    }
    
}

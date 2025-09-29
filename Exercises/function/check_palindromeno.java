package Exercises.function;

public class check_palindromeno {
    public static boolean palindromeno(int n){
        int r,sum=0,temp;    
        temp=n;    
        while(n>0){    
         r=n%10;  //getting remainder  
         sum=(sum*10)+r;    
         n=n/10;    
        }    
        if(temp==sum)    
         return true;    
        else    
         return false;
    }
    public static void main(String[] args) {
        int n=121;
        System.out.println(palindromeno(n));
    }
    
}

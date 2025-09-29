package Exercises.function;
import java.util.*;
public class even {
public static boolean Even(int n){
    boolean even_no;
    if(n%2==0){
        even_no=true;
    }
    else{
        even_no=false;
    }
    System.out.println("no is even if it is true :"+even_no);
    return even_no;
}
public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
    int n=input.nextInt();
    Even(n);
}
    
}

package Exercises.condition;
import java.util.*;
public class postive_negative {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("enter the integer");
            int n=input.nextInt();
            if(n>0){
                System.out.println("positive no");
            }
            else{
                System.out.println("negative no");
            }
        }
        
    }
    
}

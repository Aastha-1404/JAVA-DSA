package Exercises.condition;
import java.util.*;
public class week {
    public static void main(String[] args) {
    Scanner input= new Scanner(System.in);
        System.out.println("enter the no of days in integer");
        int n=input.nextInt();
        System.out.println("days name is :");
        switch(n){
            case 1:System.out.println("monday");
            break;
            case 2:System.out.println("tuesday");
            break;
            case 3:System.out.println("wednesday");
            break;
            case 4:System.out.println("thruesday");
            break;
            case 5:System.out.println("friday");
            break;
            case 6:System.out.println("saturday");
            break;
            case 7:System.out.println("sunday");
            break;
            default:System.out.println("invalid choice");
        }
    }
    
}

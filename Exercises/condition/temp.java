package Exercises.condition;
import java.util.*;
public class temp {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("enter the temperature in fahrehnhite");
        float temp=input.nextFloat();
        if(temp>100)
        {
            System.out.println("you have fever");
        }
        else{
            System.out.println("you donot have fever");
        }
    }
    
}

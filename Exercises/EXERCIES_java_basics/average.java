//package EXERCIES_java_basics;
import java.util.*;
public class average {

public static void main (String args[])
{
    @SuppressWarnings("resource")
    Scanner input=new Scanner(System.in);

    System.out.println("enter the first number");
    int a=input.nextInt();
    System.out.println("enter the second number");
    int b =input.nextInt();
    System.out.println("enter the third number");
    int c= input.nextInt();
    int average=(a+b+c)/3;
    System.out.println("the Average of three number is  "+average);
    
}    
}

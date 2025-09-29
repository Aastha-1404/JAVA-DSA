package Exercises.loop;
import java.util.*;
public class table {
public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
    System.out.println("enter the table to be enter:  ");
    int n=input.nextInt();
    int table=1;
    for(int i=1;i<=10;i++)
    {
     table=n*i;
     System.out.println("table is "+table);
    }
    
}
    
}



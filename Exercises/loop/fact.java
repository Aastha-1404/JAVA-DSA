package Exercises.loop;

import java.util.*;
public class fact {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
System.out.println("enter the no");
int n=input.nextInt();
int fact=1;
for(int i=1;i<=n;i++)
{
fact=(fact*i);
}
        System.out.println("factorial of "+n+" is "+fact);
    }
    
}

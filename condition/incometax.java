import java.util.*;
public class incometax {
    public static void main(String args[]){
Scanner input=new Scanner(System.in);
System.out.println("enter your sallary");
double sal=input.nextDouble();
double tax_paid;
if(sal<500000)
{
    System.out.println("NO TAX APPLY");

}
else if(sal>500000&&sal<1000000){
     tax_paid=(sal*0.2);
    System.out.println("tax amount"+tax_paid);

}
else{
    tax_paid=(sal*0.3);
    System.out.println("tax amount"+tax_paid);

}
    }
    
}

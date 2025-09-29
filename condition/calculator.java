import java.util.*;
public class calculator {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("enter a");
         int a=input.nextInt();
         System.out.println("enter b");
         int b=input.nextInt();
         System.out.println("enter the operator");
         char operator=input.next().charAt(0);

switch (operator) {
    case '+':System.out.println(a+b);
        
        break;
        case '-':System.out.println(a-b);
        break;
        case '*':System.out.println(a*b);
        break;
        case '/':System.out.println(a/b);
        break;

    default:System.out.println("invalid operataor");
        break;
}
        
    }
    
}

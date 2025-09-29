import java.util.*;
public class continue_stat {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        do{
            System.out.print("enter the no");
            int n=input.nextInt();
            if(n%10==0){
                continue;
            }
            System.out.println("number was:"+n);
        }while(true);
    }
    
}

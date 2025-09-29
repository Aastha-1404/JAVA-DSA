

import java.util.*;
public class square_area {
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        System.out.println("enter the side of the square");
        int a=input.nextInt();
        double area=a*a;
        System.out.println("Area of square is : " +area);
        input.close();
    }
}

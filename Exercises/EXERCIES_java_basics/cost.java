
import java.util.*;
public class cost {
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        System.out.println("enter the pencil price:");
        int pencil=input.nextInt();
        System.out.println("enter the price of pen:");
        int pen=input.nextInt();
        System.out.println("enter the price of the erressor");
        int err=input.nextInt();
        System.out.println("total cost to be paid");
        int paid=pencil+pen+err;
        System.out.println(paid);
        float gst=(int)(paid*0.18);
        System.out.println("gst amount is :"+gst);
        float toatl_ammount=paid+gst;
        System.out.println("gst added to the total accout:"+toatl_ammount);
    }
    
}

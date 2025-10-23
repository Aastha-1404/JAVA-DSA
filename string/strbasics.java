package string;
import java.util.*;

public class strbasics {
    public static void main(String[] args) {
        
        String str1="abcd";
        String str2=new String("xyz");

        //input in string
        Scanner input= new Scanner(System.in);
        String name;
        name= input.nextLine();
    System.out.println(name);
    System.out.println(str1.length());


    //concatenation
    String str3=str1+" "+str2;
    System.out.println(str3);



    }
    
}

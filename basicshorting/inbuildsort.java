package basicshorting;
import java.util.*;

public class inbuildsort {
     public static void main(String[] args) {
        Integer arr[]={5,4,1,2,3};
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
        System.out.println();
        Arrays.sort(arr,Collections.reverseOrder());
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
    }
    
}

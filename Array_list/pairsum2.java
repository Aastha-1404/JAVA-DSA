package Array_list;

import java.util.ArrayList;

public class pairsum2 {
    public static Boolean pairsum(ArrayList<Integer> list , int target){
        int  breakpoint=-1;//means not valid index
        int n=list.size();
       
       for(int i=0;i<list.size()-1;i++){
           if(list.get(i)>list.get(i+1)){
               breakpoint=i;
               break;
           }
       }

       int left=breakpoint+1,right=breakpoint;
        while(left!=right){
            if(list.get(left)+list.get(right)==target){
                return true;
            }
           else if(list.get(left)+list.get(right)<target){
            left=(left+1)%n;
           }
           else{
            right=(n+right-1)%n;
           }
        }
        return false;
    }
    public static void main(String args[]){
        ArrayList<Integer> list= new ArrayList<>();
        list.add(10);
        list.add(11);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(pairsum(list,13));
    }
    
}

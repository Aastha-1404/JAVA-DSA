package array;

public class reverse_array {
    public static void reverse(int num[]){
        int start=0,end=num.length-1;
        while(start<end){
            int temp=num[start];
            num[start]=num[end];
            num[end]=temp;
            start++;
            end--;
        }



    }
    public static void main(String[] args) {
        int num[]={9,8,3,6,7,8};
        reverse(num);
        for(int i=0;i<num.length;i++){
            System.out.print(num[i]+" ");
        }

    }
    
}

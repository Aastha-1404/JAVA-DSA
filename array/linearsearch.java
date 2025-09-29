package array;

public class linearsearch {
    public static int ls(int num[],int key){
        for(int i=0;i<num.length;i++){
            if(num[i]==key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int num[]={2,4,5,6,10,8,9};
        int key=10;
        int index=ls(num,key);
        if(key==-1){
            System.out.println("key not found");

        }
        else{
            System.out.println("key found at index  " +index);
        }
    }
    
}

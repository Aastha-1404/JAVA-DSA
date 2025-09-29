package array;

public class binarysearch {
     public static int bs(int num[], int key){
int start=0,end=num.length-1;
while(start<=end){
    int mid=(start+end)/2;
    if(num[mid]==key){
        return mid;
    }
    if(num[mid]<key){  //search rightside
        start=mid+1;
    }
    else{  // search left side
        end=mid-1;
    }

}
return -1;
    }
    public static void main(String[] args) {
        int num[]={ 2,4,6,8,10,12,14};
        int key=25;
        System.out.println(+num.length);
        System.out.println("  index of searched key is "+bs(num,key));
        if(bs(num,key)==-1){
            System.out.println("not found");
        }
    }
    
}

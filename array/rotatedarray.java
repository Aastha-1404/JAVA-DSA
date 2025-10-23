package array;

public class rotatedarray {
    public static int search(int num[],int target){
        int start=0,end=num.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(num[mid]==target){  //target present in the mid
                return mid;
            }
            //cheaking in left half is shorted or not
            if(num[start]<=num[mid]){
                if(num[start]<=target&&target<num[mid]){
                    end=mid-1;
                }
                else{
                    start=mid+1;
                }

            }
            //cheacking right half is shorted
            else{
                if(num[mid]<target&&target<=num[end]){
                    start=mid+1;
                }
                else{
                    end=mid-1;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int num[]={4,5,6,7,0,1,2};
        int target1=0,target2=3;
        System.out.println(search(num, target1));
        System.out.println(search(num, target2));

    
    }
    
}

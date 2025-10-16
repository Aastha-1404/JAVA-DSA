package basicshorting;

public class bubblesort {
    public static int bubble(int arr[]){
        for(int turn=0;turn<arr.length-1; turn++){
            for(int j=0;j<arr.length-1-turn;j++){
                //check the array
                if(arr[j]>arr[j+1]){
                    //swap
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }

            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
        return 0;

    }
    public static void main(String[] args){
        int arr[]={5,4,1,3,2};
        bubble(arr);
    }
    
    
}

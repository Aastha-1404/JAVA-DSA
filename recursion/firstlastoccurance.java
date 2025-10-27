package recursion;

public class firstlastoccurance {
   
    public static int first(int arr[],int key ,int i){
        if(i==arr.length){
            return -1;
        }
        if(arr[i]==key){
            return i;
        }
        return first(arr,key,i+1);

    }

    public static int last(int arr[],int key ,int i){
        if(i==arr.length){
            return -1;
        }
        int isfound=last(arr,key,i+1);
        if(isfound == -1 && arr[i] == key){
            return i;
        }

        
        return isfound;
       

    }

    public static void main(String[] args) {
        int arr[]={8,3,6,9,5,10,2,5,3};
        //int key=5;
        System.out.println(first(arr,5,0 ));
        System.out.println(last(arr, 5, 0));
    }
    
}

    


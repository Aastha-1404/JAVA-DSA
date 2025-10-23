package array;

public class distinctint {
    public static boolean transverseno(int num[]){
        for(int i=0;i<num.length;i++){
            for(int j=i+1;j<num.length;j++){
                if(num[i]==num[j]){
                    return true;
                }
                
            }
        }
        return false;


    }
    public static void main(String[] args) {
        int num[]={1,2,3,1};
        int num1[]={1,2,3,4};
        int num2[]={1,1,1,3,3,4,3,2,4,2};
        System.out.println("status of repeated elem "+transverseno(num));
        System.out.println("status of repeated elem "+transverseno(num1));
        System.out.println("status of repeated elem "+transverseno(num2));
    }
    
}

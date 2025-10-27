package recursion;

public class sumofnno {
    public static int sum(int n){
        if(n == 1){
            return 1;
        }
        int snm1=sum(n-1);
        int sn=n+sum(n-1);
        return sn;
    }
    public static void main(String[] args) {
         int n=5;
         System.out.println("total sum is  "+sum(n));
        
    }
    
}

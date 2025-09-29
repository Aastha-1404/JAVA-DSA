package function;

public class primeinrange {
    public static boolean prime(int n){
        boolean isprime=true;
        for(int i=2;i<=n-1;i++){
            if((n%i)==0){
                isprime=false;
            }

        }
        return isprime;
    }
    public static void prime_inrange(int n){
for(int i=2;i<=n;i++)
        {
           if(prime(i)){
            System.out.print(i+" ");
        }}
        System.out.println();
    }
    public static void main(String[] args) {
        prime_inrange(20);
        
        
    }
    
}

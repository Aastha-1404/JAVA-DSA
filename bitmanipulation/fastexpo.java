package bitmanipulation;

public class fastexpo {
    public static int expo(int n,int a){
        int ans=1;
        while(n>0){
            if((n & 1)!= 0){ //find lsb
                ans=ans*a;
            }
            a=a*a;
            n=n>>1;
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(expo(82, 5));
    }
    

    
}

package recursion;

public class findxpown {

    public static int power(int x,int n){
        if(n ==0){
            return 1;
        }
       int xnm1 =power(x, n-1);
       int xn= x*xnm1;
       return xn;
    }
    // optimized form o(logn)
    public static int optimizedpower(int a,int n){
         if(n ==0){
            return 1;
        }
        int halfpow= optimizedpower(a, n/2);
        int halfpowsq=halfpow*halfpow;
        // n is odd
        if(n % 2!=0){
            halfpowsq=a*halfpowsq;
        }
        return halfpowsq;
    }


    
    public static void main(String[] args) {
        System.out.println(power(2, 10));
        System.out.println(optimizedpower(2, 10));
    }

}

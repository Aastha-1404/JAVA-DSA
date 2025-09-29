public class butterfly 
{
    public static void butfly(int n){
        for(int i=1;i<=n;i++){//first half
            for(int j=1;j<=i; j++){//star
                System.out.print("*");
            }
            for(int j=1;j<=2*(n-i);j++){//space
                 System.out.print(" ");
            }
             for(int j=1;j<=i;j++){//star
                System.out.print("*");
            }
            System.out.println();
        }
        //second half
         for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            for(int j=1;j<=2*(n-i);j++){
                 System.out.print(" ");
            }
             for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        butfly(4);
    }
    
}

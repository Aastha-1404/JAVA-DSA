public class invertedpyramid {
    public static void invpyr(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){//spaces
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");//stars
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        invpyr(4);
    }

    
}

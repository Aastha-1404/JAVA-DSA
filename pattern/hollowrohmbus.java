public class hollowrohmbus {
    public static void hollroh(int torows, int tocoln){
        for(int i=1;i<=torows;i++){
            for(int j=1;j<=tocoln-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=tocoln;j++){
                if(i==1||i==torows||j==1||j==tocoln){
            System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            for(int j=1;j<=i-1;j++){
                System.out.print(" ");

            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        hollroh(5,5);
    }
    
}

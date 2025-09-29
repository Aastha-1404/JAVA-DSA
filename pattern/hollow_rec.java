public class hollow_rec {
    public static void holl_rec(int torow ,int tocol)

    {
        for(int i=1;i<=torow;i++){// lines
            for(int j=1;j<=tocol;j++){
                //cell-(i,j)
                if(i==1||i==torow){
                    System.out.print("*");

                }
                else if(j==1||j==tocol){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");

                }}
                System.out.println();

            }
            

        }
    
        public static void main(String args[]){
            holl_rec(4,5);

        }
        

        
    }
       


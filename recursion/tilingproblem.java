package recursion;

public class tilingproblem {
    public static int problem(int n){ // 2 x n '(floor size)'  
        //base case
        if(n==0 || n==1){
            return 1;
        }
    //working
    //vertical choice
    int fnm1 =problem(n-1);

    // horizontalchoice
     int fnm2 =problem(n-2);
     int totways =fnm1 +fnm2;
     return totways;
                                
    }
    public static void main(String[] args) {
        System.out.println(problem(5));
        
    }
    
}

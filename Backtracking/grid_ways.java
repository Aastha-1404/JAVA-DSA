// find numbervof ways to reach  from [0,0] to [n-1to m-1]in nxm grid
// allowed moves is down and right

package Backtracking;

public class grid_ways {
    public static int countways(int i,int j, int n,int m){
        // base case
        if( i== n-1 && j ==m-1){// condition for last cell
            return 1;
        }else if(i==n || j==m){//boundary cross condition
            return 0;
        }


         int w1= countways(i, j+1, n, m);
         int w2=countways(i+1, j, n, m);
         return w1+w2;
        
    }
    public static void main(String[] args) {
        int n=3,m=3;
        System.out.println(countways(0, 0, n, m));
    }
    
}

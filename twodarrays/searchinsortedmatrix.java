package twodarrays;

public class searchinsortedmatrix {
    public static boolean staircasesearch(int matrix[][],int key){
        // //  approch 1
        // int row=0, col=matrix[0].length-1;

        // while(row<matrix.length && col>=0){
        //     f(matrix[row][col]==key){
        //         System.out.println("found key at ("+row+","+col+")");
        //          return true;
        //     }
        //     else if(key<matrix[row][col]){
        //         col--;//lefti
        //     }
        //     else{
        //         row++;//down
        //     }
        // }



        // approch 2
        int row=matrix.length-1, col=0;
        while (row>=0 && col<matrix[0].length) {
            if(matrix[row][col]==key){
                System.out.println("found key at ("+row+","+col+")");
                 return true;
            }
            else if(key>matrix[row][col]){
                col++;//right
            }
            else{
                row--;//up
            }

            
        }
        System.out.println("key not found");
        return false;

    }
    public static void main(String[] args) {
        int matrix[][]={{10,20,30,40},{15,25,35,45},{27,29,37,48},{32,33,39,50}};
        int key =33;
        staircasesearch(matrix, key);    }

    
}

package bitmanipulation;

public class chkoddeven {
    public static void oddoreven(int n){
        int bitmask=1;
        if((n & bitmask)==0){
            System.out.println("even no");

        }
        else{
            System.out.println("odd number");
        }



    }
    public static void main(String[] args) {
        oddoreven(5);
    }

    
}

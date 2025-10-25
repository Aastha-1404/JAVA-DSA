package bitmanipulation;

public class countsetbit {
    public static int count(int n){
        int cou=0;
        while(n>0){
            if((n&1)!=0){ //cheking least significant bit
                cou++;
            }
            n=n>>1;

        }
        return cou;
    }
    public static void main(String[] args) {
        System.out.println(count(7));
    }

    
}

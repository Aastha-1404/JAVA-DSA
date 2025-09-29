

public class print_reverse_no {
    public static void main(String[] args) {
        int n=140404;
        while(n>0){
            int lastdigit=n%10;
            System.out.print(lastdigit);
            n=n/10;
        }
    }
    
}

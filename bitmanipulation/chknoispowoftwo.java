package bitmanipulation;

public class chknoispowoftwo {
    public static boolean ispowtwo(int n){
        return (n &(n-1)) ==0;
    }
    public static void main(String[] args) {
        System.out.println(ispowtwo(8));
    }

    
}

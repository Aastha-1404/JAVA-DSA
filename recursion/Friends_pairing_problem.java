package recursion;

public class Friends_pairing_problem {

    public static int friendspairing(int n){
        if(n==1 ||n==2){
            return n;
        }
        // choices
        // single
        int fnm1= friendspairing(n-1);
        //pair
        int fnm2=friendspairing(n-2);
        int pairways =(n-1)*fnm2;
        int totalways=fnm1+pairways;
        return totalways;
    }
    public static void main(String[] args) {
        System.out.println(friendspairing(3));
    }
}

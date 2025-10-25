package bitmanipulation;

public class operations {
    public static int getithbit(int n, int i){
        int bitmask=(1<<i);
        return n & bitmask;
    }
    public static int setithbit(int n,int i)
    {
        int bitmask=(1<<i);
        return n | bitmask;
    }
    public static int clearithbit(int n,int i){
        int bitmask= ~(1<<i);
        return n & bitmask;
    }
    public static int updateithbit(int n, int i,int newbit){
        if(newbit == 0){
            return clearithbit(n, i);
        }
        else{
            return setithbit(n, i);
        }

    }
    public static int clearlastbit(int n, int i){
        int bitmask = ((~0)<<i);
        return n &bitmask;
    }
    public static int clearrangebit(int n, int i,int j){
        int a=((~0)<<(j+1));
        int b=(1<<i)-1;
        int bitmask =a|b;
        return n & bitmask;
    }
    public static void main(String[] args) {
        System.out.println(getithbit(7, 3));
        System.out.println(setithbit(7, 3));
        System.out.println(clearithbit(7, 3));
        System.out.println(updateithbit(7,3,1));
        System.out.println(clearithbit(7, 3));
        System.out.println(clearrangebit(7,2,6));

    }
    
}

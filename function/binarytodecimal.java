package function;

public class binarytodecimal {
    
    public static void bintodec(int binNum){
        int mynum=binNum;
        int pow=0;
        int decNum=0;
        while(binNum>0){
            int ld=binNum%10;
            decNum=decNum+(ld*(int)Math.pow(2,pow));
            pow++;
            binNum=binNum/10;
        }
        System.out.println("decimal of"+mynum+" = "+decNum);
    }
    
    public static void main(String[] args) {
        bintodec(10101011);
    }
    
}

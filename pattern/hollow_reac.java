package pattern;

public class hollow_reac {
    public static void main(String[] args) {
        for(int line=1;line<=4;line++){
            for(int star=1;star<=5;star++){
                 if((line==2)&&(line==3)&&(star==2)&&(star==3)){
                break;

            }
            System.out.print("*");
           
        }
        System.out.println();
    }
}
}

package string;

public class shortestpath {
    public static float findpath(String path){
       int x=0,y=0;
       for(int i=0;i<path.length();i++){
        char dir=path.charAt(i);
        if(dir == 'N'){
            y++;
        }
        else if (dir == 's')
        {
         y--;   
        }
        else if(dir == 'w'){
            x--;
        }
        else{
            x++;
        }
    }
        int x2=x*x;
        int y2=y*y;
        return (float)Math.sqrt(x2+y2);
       


    }
    public static void main(String[] args) {
        String path="WNEENSENNN";
        System.out.println(findpath(path));
    }
    
}

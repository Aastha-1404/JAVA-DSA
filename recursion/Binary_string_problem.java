package recursion;

public class Binary_string_problem {
    public static void printbinarystring(int n, int lastplace,String str){

        //base case
        if(n==0){
            System.out.println(str);
            return;
        }
        // working
         printbinarystring(n-1,0, str+"0");
        if(lastplace == 0){
            // sit 0 on chair n
           
            printbinarystring(n-1, 1, str+"1");
        }
       
    }
    public static void main(String[] args) {
        printbinarystring(3, 0, "");
    }
    
}

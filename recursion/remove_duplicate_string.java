package recursion;

public class remove_duplicate_string {
    public static void duplString(String str, int idx,StringBuilder newstr,boolean[] map){
        if(idx == str.length()){
            System.out.println(newstr);
            return;
        }
        // working
        char currchar = str.charAt(idx);
        if(map[currchar-'a']== true){
            //duplicate
            duplString(str, idx+1, newstr, map);
        }
        else{
            map[currchar-'a']=true;
            duplString(str, idx, newstr.append(currchar), map);
        }

        

    }
    public static void main(String[] args) {
        String str ="aaaaaaabbbbbbbbbbbbffffffffffffffyyyyyyyhhhhhhhhh";
        duplString(str, 0, new StringBuilder(""), new boolean[26]);
    }
    
}

package programs;

import java.util.*;

/**
 * Lots fo static Methods containing Code to regular programming questions.
 */
public class Programs {

    /**
     *String is Palindrome or not.
     */
    public static boolean palindrome(String inp){
        if(inp == null || inp.length() == 0) throw new RuntimeException("Invalid Input");
        else if(inp.length() == 1) return true;
        int len = inp.length();
        for(int i=0, j= len-1;i<=j;i++,j--){
            char x  = inp.charAt(i);
            char y = inp.charAt(j);
            if(x != y) return false;
        }
        return true;
    }

/**
 * Check if float has only integer or not.
 * Example: 1.0 ==> true
 *          11.0 ==> true
 *          11.0002 ==> false;
 */
    public static boolean integer(float inp){
        return inp%1 == 0;
    }

    /**
     * Return List of Permutations.
     */
    //Print permutations.

    public static List<String> permutations(String inp, String tmp, List<String> out){
        if(inp == null || (inp == "" && tmp == ""))
            throw new RuntimeException("Invalid Input");
        else if(inp.length() == 1 && tmp == ""){
            out.add(inp);
            return out;
        }
        else if(inp == ""){
            out.add(tmp);
            return out;
        }
        int len = inp.length();
        for(int i=0;i<len;i++){
            char c = inp.charAt(i);
            String inp_v;
            if(i == 0){
                if(len == 1) inp_v = "";
                else inp_v = inp.substring(1);
            }
            else if(i == len-1){
                inp_v = inp.substring(0,i);
            }else{
                inp_v = inp.substring(0,i) + inp.substring(i+1);
            }
            out = permutations(inp_v, tmp + Character.toString(c), out);
        }
        return out;
    }

    
}

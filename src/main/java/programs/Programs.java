package programs;


/**
 * Lots fo static Methods containing Code to regular programming questions.
 */
public class Programs {

    //String is Palindrome or not.
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



}

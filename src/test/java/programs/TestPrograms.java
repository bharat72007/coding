package programs;

import org.junit.*;

public class TestPrograms {
    @Test
    public void palindrome(){
        String inp1 = "abcba";
        assert (Programs.palindrome(inp1));

        String inp2 = "abbbba";
        assert(Programs.palindrome(inp2));

        String inp3 = "";
        try{
            Programs.palindrome(inp3);
        }catch (RuntimeException ex){
            System.out.println(ex.getMessage() + " for input: " + inp3);
        }

        String inp4 = null;
        try{
            Programs.palindrome(inp4);
        }catch (RuntimeException ex){
            System.out.println(ex.getMessage() + " for input: " + inp4);
        }

        String inp5 = "3";
        assert(Programs.palindrome(inp5));

        String inp6 = "abab";
        assert(!Programs.palindrome(inp6));
    }

}

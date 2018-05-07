package programs;

import org.junit.*;
import java.util.*;

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

    @Test
    public void integer(){
        float inp1 = 1.00000f;
        assert(Programs.integer(inp1));

        float inp2 = 999.000000f;
        assert(Programs.integer((inp2)));

        float inp3 = 7.000001f;
        assert(!Programs.integer(inp3));

        float inp4 = 0f;
        assert(Programs.integer(inp4));

        float inp5 = 6.0001f;
        assert(!Programs.integer(inp5));

        float inp6 = 0.000f;
        assert(Programs.integer(inp6));
    }

    @Test
    public void testpermutations(){
        String inp_v1 = null;
        try{
            Programs.permutations(inp_v1, "", new ArrayList<String>());
        }catch(RuntimeException ex){
            System.out.println(ex.getMessage());
        }

        String inp_v2 = "";
        try{
            Programs.permutations(inp_v2, "", new ArrayList<String>());
        }catch(RuntimeException ex){
            System.out.println(ex.getMessage());
        }

        String inp_v3 = "a";
        List<String> out1 = Programs.permutations(inp_v3, "", new ArrayList<String>());
        System.out.println(out1);
        assert(1 == out1.size());


        String inp_v4 = "abc";
        List<String> out2 = Programs.permutations(inp_v4, "", new ArrayList<String>());
        System.out.println(out2);
        assert(6 == out2.size());

        String inp_v5 = "abcde";
        List<String> out3 = Programs.permutations(inp_v5, "", new ArrayList<String>());
        System.out.println(out3);
        assert(120 == out3.size());
    }






}

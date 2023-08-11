package Recursion;

public class palindrome {
    static boolean is_palindrome(String s)
    {
        if(s.length()<=1)
        {
            return true;
        }
        else if(s.charAt(0)!=s.charAt(s.length()-1))
        {
            return false;
        }
        else
        {
            return is_palindrome(s.substring(1, s.length()-1));
        }
    }
    public static void main(String args[])
    {
        String s = "racecara";
        System.out.println(is_palindrome(s));
    }
}

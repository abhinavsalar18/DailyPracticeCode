import java.util.Scanner;
import java.lang.*;

 class Palindrome
{
     public static boolean isPalindrome(String s) {
        String temp = s.toLowerCase();
        int st = 0, h = temp.length() - 1;
         boolean flag = true;
        while(st <= h)
        {  
            char ch1 = temp.charAt(st);
            char ch2 = temp.charAt(h);
            if(!((ch1 >= 97 && ch1 <= 122) || (ch1 >= 48 && ch1 <= 57)))
            ++st;
           else if(!((ch2 >= 97 && ch2 <= 122) || (ch2 >= 48 && ch2 <= 57)))
            --h;
            else if(ch1 == ch2)
            {
                ++st;
                --h;
            }
            else
            return false;
        }
        return flag;
    }
   public static boolean isPalindromeSpace(String s) {
        String temp = s.toLowerCase();
        
        int count = 0, k = 0 ;
        char str[] = new char[temp.length()];
        for(int i = 0; i < temp.length(); i++)
        {  
            int ch = (int)temp.charAt(i);
            if(ch >= 97 && ch <= 122 || (ch >= 48 && ch <= 57))
            {
                str[k] = temp.charAt(i);
                 ++k; 
            }
            else
            ++count;
        }
        int st = 0, h = temp.length() - count - 1;
         boolean flag = true;
        while(st <= h)
        { 
            if(str[st] != str[h])
            { 
                flag = false;
                break;
            }
            ++st;
            --h;
        }
        return flag;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(isPalindromeSpace(str));
        System.out.println(isPalindrome(str));
    }
}
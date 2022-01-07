import java.util.Scanner;
import java.lang.*;
public class Main {
    public static boolean isPalindrome(int x) {
        if(x < 0)
        return false;
        else
        {
         int temp = x;
         int rev = 0;
         while(temp != 0)
         {
            rev = rev*10 + (temp % 10);
            temp /= 10;
         }
         if(rev == x)
         return true;
         else
         return false;
        }
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean res = isPalindrome(n);
        System.out.println(res);
    }
}
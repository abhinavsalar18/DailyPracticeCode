import java.util.Scanner;
import java.lang.*;
public class Main {
    public static boolean isPalindrome(int x) {
        String str = Integer.toString(x);
        //String temp = str;
        boolean res = true;
        int li = 0, hi = str.length()-1;
        while(li <= hi)
        {
            if(str.charAt(li) != str.charAt(hi))
               {
                   res = false;
               }
            li++;
            hi--;
        }
        return res;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean res = isPalindrome(n);
        System.out.println(res);
    }
}
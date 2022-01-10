import java.util.Scanner;
import java.lang.*;

class DistinctSubString {
    public static int countGoodSubstrings(String str) {
        
        int count = 0;
        for(int i = 0; i < str.length()-2; i++)
        {
            String t = str.substring(i , i+3);
           // System.out.println("t:" + t + " count:" + count);
            if(t.charAt(0) != t.charAt(1) && t.charAt(0) != t.charAt(2) && t.charAt(1) != t.charAt(2))
                count++;
        }
        return count;
    }
    //Driver code
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        int res = countGoodSubstrings(str);
        System.out.println(res);
    }
}
import java.util.Scanner;
import java.lang.*;
public class PairSum
{
    public static int[] getPairSumIndex(int[] arr, int target)
    {
         int start = 0, end = arr.length - 1;
         int lindx = 0, hindx = 0;
         while(start < end)
         {
             int sum = arr[start] + arr[end];
             if(sum == target)
             {
                 lindx = start;
                 hindx = end;
                 break;
             }
             else if(sum > target)
               --end;
              else 
              ++start;
         }
         int[] res = new int[2];
         res[0] = lindx + 1;
         res[1] = hindx + 1;
         return res;
    }
    //driver code
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i = 0; i < n; i++)
            {
                arr[i] = sc.nextInt();
            }

           int target = sc.nextInt();

           int[] res = getPairSumIndex(arr , target);
           System.out.println("["+ res[0] + "," + res[1] + "]");
        }
    }
}
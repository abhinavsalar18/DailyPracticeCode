import java.util.Scanner;
import java.lang.*;
public class MinDiff
{
    public static int getMinDiff(int[] arr, int key)
    {
         int start = 0, end = arr.length - 1;
         int indx=-1;
         int len = arr.length;
         while(start <= end)
         {  int mid = (start + end)/2;
          if(Math.abs(arr[mid] - key) <= Math.abs(arr[(mid-1+len)%len] -key) && Math.abs(arr[mid] - key) <= Math.abs(arr[(mid+1)%len] -key))
             {
                 indx = mid;
                  break;
             }
             else if(key < arr[mid])
               --end;
              else 
              ++start;
         }
        return arr[indx];
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

           int res = getMinDiff(arr , target);
           System.out.println(res);
        }
    }
}
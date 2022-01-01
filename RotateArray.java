import java.util.Scanner;
import java.lang.*;
public class Rotate{
   
    public static void rotateArray(int[] arr, int low, int high)
    { 
         int swap;
         // Rotating elements
         while(low <= high)
         {
             swap = arr[low];
             arr[low] = arr[high];
             arr[high] = swap;
             low++;
             high--;
         }
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            int n = sc.nextInt();
            int r = sc.nextInt();
            int[] arr = new int[n];
            for(int i = 0; i < n; i++)
               arr[i] = sc.nextInt();

            // logic
              r = r % arr.length;
              rotateArray(arr , 0 , r-1);
              rotateArray(arr , r , arr.length - 1);
              rotateArray(arr , 0 , arr.length - 1);
              for(int i = 0; i < arr.length; i++)
              System.out.print(arr[i] + "\t");
              
        }

    }
}
// { Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;
class PairMinDiff
{
   public boolean findPair(int arr[], int size, int n)
    {
        //code here.
        Arrays.sort(arr); // sorting array O(nlogn)
        int l = 0, h = arr.length - 1;
        for(int i = 0; i < arr.length; i++)
        { l = 0;
          h = arr.length - 1;
          int t = arr[i] + n;
          while(l <= h)
          {
              int mid = (l + (h-l)/2);
              if(t == arr[mid])
              return true;
              else if(t > arr[mid])
              l = mid + 1;
              else
              h = mid - 1;
          }
        }
        return false;
    } // find pair ends
    //code  by Nikhil
   public boolean findPair2pointer(int arr[], int size, int n)
    {
        //code here.
        Arrays.sort(arr); // sorting array O(nlogn)
        int k1 = 0, k2 = 1;
          while(k1 < arr.length && k2 < arr.length )
          {
              if(arr[k2] - arr[k1] == n)
              return true;
              else if(arr[k2] - arr[k1] < n)
                 ++k2;
              else 
              ++k1;
          }
        return false;
    }
    public static void main (String[] args)
    {
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int l = sc.nextInt();
            int n = sc.nextInt();
            
            int arr[] =  new int[l];
            
            for(int i = 0;i<l;i++)
                arr[i] = sc.nextInt();
    }
}
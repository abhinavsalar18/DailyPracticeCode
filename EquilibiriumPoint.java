// { Driver Code Starts
import java.io.*;
import java.util.*;

class EquilibriumPoint{

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while (t-- > 0) {
            
            //taking input n
            int n = Integer.parseInt(br.readLine().trim());
            long arr[] = new long[n];
            String inputLine[] = br.readLine().trim().split(" ");
            
            //adding elements to the array
            for (int i = 0; i < n; i++) {
                arr[i] = Long.parseLong(inputLine[i]);
            }
            int res = equilibriumPoint(arr , n);
            System.out.println(res);
        }
    }
    public static int equilibriumPoint(long arr[], int n) {
       if(n == 1)
       return 1;
      
        long asum = 0, bsum = 0;
        int ele = -1;
        for(int i = 1; i < n; i++)
        {
            asum += arr[i];
        }
        for(int i = 1; i < n-1; i++)
        {
            bsum += arr[i-1];
            asum -= arr[i];
            if(asum == bsum)
            {
                ele = i+1;
                break;
            }
        }
        // Your code here
        return ele;
    }
}

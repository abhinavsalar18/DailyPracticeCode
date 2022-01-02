// { Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main(String[] args) throws IOException
	{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while(t-->0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            long a[] = new long[(int)(n)];
            long b[] = new long[(int)(n)];
            
            
            String inputLine[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                a[i] = Long.parseLong(inputLine[i]);
            }
            String inputLine1[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                b[i] = Long.parseLong(inputLine1[i]);
            }
            
            
            Solution obj = new Solution();
            System.out.println(obj.minTime(a, b, n));
        }
	}
}

// } Driver Code Ends


//User function Template for Java

class Solution {

    public long minTime(long a[], long b[], long n) {
        // Your code goes here 
        long timeA = 0;
        long timeB = 0;

        for(int i = 0; i < n; i++)
        {

            if(i % 2 == 0)
            {
                timeA += a[i];
                timeb += b[i];
            }
            else
            {
                timeA += b[i];
                timeb += a[i];
            }
        }
       if(timeA < timeB)
        return timeA;
        else
        return timeB;
    }
}
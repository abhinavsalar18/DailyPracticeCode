// codechef AMSGAME1

import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
    public static int getGCD(int a, int b)
    {
        if(b == 0)
        return a;
        else
        return getGCD(b , a % b); 
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in); 
		int t = sc.nextInt();
		 while(t-- > 0)
		 {
		     int n = sc.nextInt();
		     
		     int arr[] = new int[n];
		     
		     for(int i = 0; i < n; i++)
		     {
		         arr[i] = sc.nextInt();
		     }
		     
		     int gcd = arr[0];
		    
		         for(int i = 0; i < n; i++)
		         {
		             gcd = getGCD(gcd  , arr[i]);
		         }
		         System.out.println(gcd);
		 }
	}
}

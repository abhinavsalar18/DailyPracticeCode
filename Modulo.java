import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Modulo {

    public static void main(String[] args)  throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
      
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int[] arr = new int[n];
            for(int i = 0; i < n; i++)
            {
                 arr[i] = sc.nextInt();
            }
            int distinct = 0, unique = 0;
            for(int i = 0; i < n-1; ++i)
            {
                if(arr[i] != -1)
                {
                    int flag = 0;
                    for(int j = i+1; j < n; ++j)
                    {
                        if(arr[j] != -1)
                        {
                            if(arr[i] % m == arr[j] % m)
                            {
                                flag = 1;
                                arr[j] = -1;
                            }
                        }
                    }
                    ++distinct;
                    if(flag == 0)
                      ++unique;
                }
            }
            System.out.println(distinct + "\n" + unique);
        }
    }
}
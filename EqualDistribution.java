/* This question is based on the primality test
  We have to distribute the number of bananas equally btw some persons
If the no is Not prime then we can distibute them equally
 */

import java.io.*;
import java.util.*;


public class TestClass {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter wr = new PrintWriter(System.out);
        int T = Integer.parseInt(br.readLine().trim());
        for (int t_i = 0; t_i < T; t_i++) {
            int N = Integer.parseInt(br.readLine().trim());
            String out_ = solve(N);
            wr.println(out_);
        }

        wr.close();
        br.close();
    }

    static String solve(int N) {
        // Your code goes here
         boolean status = true;
        for(int div = 2; div*div <= N; div++)
        {
            if(N % div == 0)
            {
                status = false;
                break;
            }
        }
        if(status == true)
        return "No";
        else 
        return "Yes";


    }
}
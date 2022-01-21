import java.util.Scanner;
import java.lang.*;

class  SmallestDiffChar{
    public static char nextGreatestLetter(char[] letters, char target) {
        int start = 0, end = letters.length-1;
        int indx = -1, len = letters.length;
        while(start <= end)
         {
            int mid = (start + end)/2;
          //  System.out.println(mid);
            if(letters[mid] - target > 0 )
            { 
             if(mid == 0 || letters[mid-1] - target <= 0)  //  if mid becomes 0 then this is the required postion
             {
                indx = mid;
                break;
             }
            else if(target > letters[mid])
              start = mid + 1;
             else 
              end = mid - 1;
           }
           else
            start = mid + 1;

         }
        //System.out.println(indx);
        if(indx == -1 && start == len)  //wrapped case; if start goes to last means this is the 
            indx = 0;
        
        return letters[indx];
       

    }
    //Driver code
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        char[] letters = new char[n]; 
        for(int i = 0; i < n; i++)
          letters[i] = sc.next().charAt(0);

          char target = sc.next().charAt(0);
          char res = nextGreatestLetter(letters, target);
          System.out.println(res);
    }
}
import java.io.*;
import java.util.*;

class program
{
  public static void main(String[] args) throws Exception 
  {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[] arr = new int[n];

    for(int i=0 ; i<arr.length ; i++)
       arr[i] = scn.nextInt();

   int[] ans = new int[2];    
        
    long sum   = ((n*(n+1))/2);
    long sqsum = ((n*(n+1)*(2*n+1))/6);

    long x_minus_y = sum;
    long x2_minus_y2 = sqsum;

    for(int val : arr)
    {
        x_minus_y  -= val;
        x2_minus_y2 -= val*val;
    }
           
     long missing = (((x2_minus_y2)/(x_minus_y)) + x_minus_y)/2;
     long repeating = missing - x_minus_y;
        
     ans[0] = (int)missing;   
     ans[1] = (int)repeating;
        
     System.out.println();
     System.out.println();

      for(int val : ans)
       System.out.print(val + "  " );


        
  }
}

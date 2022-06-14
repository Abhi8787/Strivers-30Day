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

   
    int odd = ((n+1)/2)*((n+1)/2);
    int even = (n/2)*((n/2)+1);


    int codd = 0;
    int ceven = 0;

    for(int val : arr)
    {
      if(val % 2 == 0)
        ceven += val;

      else
        codd += val;
    }



    if(odd - codd < 0)
    {
       System.out.println("Missing Number is " + (even - ceven) );
       System.out.println("Repeating Number is " + (codd-odd) );      
    }
     
    else
    {
       System.out.println("Missing Number is " + (odd - codd));
       System.out.println("Repeating Number is " + (ceven-even) );      
    }
    
  }
}

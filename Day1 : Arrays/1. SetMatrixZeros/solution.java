Brute Force Approach :

import java.util.* ;
import java.io.*; 
public class Solution {
    public static void setZeros(int matrix[][]) {
        
        ArrayList<Integer> arr = new ArrayList<>();
        
        for(int i=0 ; i<matrix.length ;i++)
        {
            for(int j=0 ; j<matrix[0].length ;j++)
            {
                if(matrix[i][j] == 0)
                {  
                     arr.add(i);
                     arr.add(j);
                }
            }
        }
        
        for(int i=0 ; i<arr.size() ; i=i+2)
        {
            int row = arr.get(i);
            int col = arr.get(i+1);
            
            for(int ii=0 ; ii<matrix[0].length ;ii++)
                matrix[row][ii] = 0;
            
            for(int jj=0 ; jj<matrix.length ;jj++)
                matrix[jj][col] = 0;
        }    
       
    }

}





Optimized Approach:


class Solution {
    public void setZeroes(int[][] matrix) {
        
        
        boolean row = false;
        boolean col = false;
        
        for(int i=0 ; i<matrix[0].length ;i++)
        {
            if(matrix[0][i] == 0)
                row = true;
        }
        
        for(int i=0 ; i<matrix.length ;i++)
        {
            if(matrix[i][0] == 0)
                col = true;
        }
        
        
        for(int i=1 ; i<matrix.length ;i++)
        {
            for(int j=1 ; j<matrix[0].length ;j++)
            {
                if(matrix[i][j] == 0)
                {
                    matrix[0][j] = 0 ;
                    matrix[i][0] = 0 ;
                }
            }
        }
        
        
        for(int i=1; i<matrix.length ;i++)
        {
            if(matrix[i][0] == 0)
            {
                for(int j=0 ; j<matrix[0].length ;j++)
                {
                    matrix[i][j] = 0;
                }
            }
            
        }
        
        
        for(int i=1 ; i<matrix[0].length ; i++)
        {  
            if(matrix[0][i] == 0)
            {
                for(int j=0 ; j<matrix.length ;j++)
                {
                    matrix[j][i] = 0;
                }
            }
            
        }
        
        
        
        if(row == true)
        {
            for(int i=0 ; i<matrix[0].length ; i++)
            {
                matrix[0][i] = 0;
            }
        }
        
        
        if(col == true)
        {
            for(int i=0 ; i<matrix.length ;i++)
            {
                matrix[i][0] = 0;
            }
        }
        
        
    }
}







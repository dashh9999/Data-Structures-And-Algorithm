import java.util.*;

class Solution {
    public static void printMultiplication(int[][] matrix1,int[][] matrix2,int n) {
        //Write code here and print output
		for(int i=0;i<n;i=i+1)
        {
            for(int j=0;j<n;j=j+1)
            {
                // (i --> 0, j --> 0) --> 0th row of first matrix 
                int currentElement = 0;
                
                for(int k=0;k<n;k=k+1) // changing/ moving the element in that direction 
                {
                    currentElement = currentElement + matrix1[i][k] * matrix2[k][j];
                }
                // (0,0) * (0,0) + (0,1) * (1,0) + (0,2) * (2,0)
				System.out.print(currentElement + " ");
            }
            System.out.println();
        }

	}        
}


public class MatrixMultiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
		while(t-- > 0)
		{
        int n;
        n = sc.nextInt();
        int[][] matrix1 = new int[n][n];
        int[][] matrix2 = new int[n][n];
        
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                matrix1[i][j] = sc.nextInt();
                
                for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                matrix2[i][j] = sc.nextInt();
                
        Solution Obj = new Solution();
        Obj.printMultiplication(matrix1,matrix2,n);
		}
        sc.close();
    }
}

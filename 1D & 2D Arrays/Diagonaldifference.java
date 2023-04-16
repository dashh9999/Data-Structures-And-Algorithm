import java.util.*;
import java.lang.*;
import java.io.*;

public class Diagonaldifference
{
	public static void main (String[] args) throws java.lang.Exception
	{
		//your code here
                   Scanner sc=new Scanner(System.in);
                int n= sc.nextInt();
                int[] []mat=new int[n] [n];
                for(int i=0;i<n;i++)
                        {
                             for(int j=0;j<n;j++)  
                                     {
                                             mat[i][j]=sc.nextInt();
                                     }
                        }      
                                int ps=0;
                                int fs=0;
                    for(int i=0;i<n;i++)
                        {
                             for(int j=0;j<n;j++)  
                                     {
                                             if(i==j)
                                             {
                                                     ps=ps+mat[i][j];
                                             }
                                              if(i+j==n-1)
                                             {
                                                     fs=fs+mat[i][j];
                                             }
                                     }   
                        }              
                    int ans=Math.abs(ps-fs);
                                System.out.println(ans);
	}
}

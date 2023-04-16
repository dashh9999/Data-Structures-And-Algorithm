import java.util.*;
import java.lang.*;
import java.io.*;

public class Transpose
{
	public static void main (String[] args) throws java.lang.Exception
	{
		//your code here
                Scanner sc=new Scanner(System.in);
                int n=sc.nextInt();
                int [][] mat=new int [n][n];
                for(int i=0;i<n;i++)
                        {
                                for(int j=0;j<n;j++)
                                        {
                                                mat[i][j]=sc.nextInt();
                                        }
                        }
                int [][] t=new int [n][n];
                  for(int i=0;i<n;i++)
                        {
                                for(int j=0;j<n;j++)
                                        {
                                              t[i][j]=mat[j][i];
                                        }
                        }
                  for(int i=0;i<n;i++)
                        {
                                for(int j=0;j<n;j++)
                                        {
                                          System.out.print(t[i][j]+" ");
                                        }
                                   System.out.println();
                        }
             
                
              
                        }
	}
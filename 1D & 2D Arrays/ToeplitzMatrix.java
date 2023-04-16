import java.util.*;
import java.lang.*;
import java.io.*;

public class ToeplitzMatrix
{
	public static void main (String[] args) throws java.lang.Exception
	{
		//your code here
                  Scanner sc=new Scanner(System.in);
                int m= sc.nextInt();
                 int n= sc.nextInt();
                int[][]mat=new int[m][n];
                for(int i=0;i<m;i++)
                        {
                             for(int j=0;j<n;j++)  
                                     {
                                             mat[i][j]=sc.nextInt();
                                     }
                        }
                        for(int i=0;i<m-1;i++)
                                {
                                    for(int j=0;j<n-1;j++)
                                            {
                                            if (mat[i][j]!=mat[i+1][j+1])
                                            {
                                                    System.out.println(false);
                                                    return ;
                                            }
                                            }
                                }
                          System.out.println(true);
                        }
}

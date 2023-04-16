import java.util.*;
import java.lang.*;
import java.io.*;

public class Sumofupperandlowertriangle
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
                                int upper=0;
                                int lower=0;
                    for(int i=0;i<n;i++)
                        {
                             for(int j=0;j<n;j++)  
                                     {
                                             if(i<=j)
                                             {
                                                     upper=upper+mat[i][j];
                                             }
                                              if(i>=j)
                                             {
                                                     lower=lower+mat[i][j];
                                             }
                                     }   
                        }              
                                System.out.println(upper + " " + lower);
	}
}
	
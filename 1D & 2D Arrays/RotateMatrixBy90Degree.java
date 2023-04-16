import java.io.*;
import java.util.*;

class Solution {
    public void rotateBy90(int [][]mat,int n,int m) {
        // Your code here
		int t[][]=new int[n][m];
		for(int i=0;i<n;i++)
			{
				for(int j=0;j<m;j++)
					{
						t[i][j]=mat[j][i];
					}
			}
		for(int i=0;i<n;i++)
			{
				int first=0;
				int last=m-1;
				while(first<last)
					{
						int temp=t[i][first];
						t[i][first]=t[i][last];
						t[i][last]=temp;
						first++;
						last--;
					}
				
			}
		for(int i=0;i<n;i++)
			{
				for(int j=0;j<m;j++)
					{
						System.out.print(t[i][j]+" ");
					}
				System.out.println();
			}
		
    }
}

public class RotateMatrixBy90Degree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, m;
        n = sc.nextInt();
        m = sc.nextInt();
        int [][]mat=new int[n][m];
        for(int i=0;i<n;++i){
            for(int j=0;j<m;++j){
                mat[i][j]=sc.nextInt();
            }
        }
        Solution Obj = new Solution();
        Obj.rotateBy90(mat,n,m);
        System.out.println('\n');
    }
}
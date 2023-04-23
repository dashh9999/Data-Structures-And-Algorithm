import java.io.*;
import java.util.*;

class Solution {
	
	
    public void TappingWater(int[] arr, int n) {
        //Write code here and print output
      int left = 0;
		int right = n-1;
		int leftMaxHeight = 0;
		int rightMaxHeight = 0;
		int water = 0;

		while(left<right){
			int leftHeight = arr[left];
			int rightHeight = arr[right];

			if(leftHeight<rightHeight){

					if(leftHeight>=leftMaxHeight){
						leftMaxHeight = leftHeight;
					}else{
						water+= leftMaxHeight - leftHeight;
					}
				left++;
			}else{
				if(rightHeight>=rightMaxHeight){
						rightMaxHeight = rightHeight;
					}else{
						water+= rightMaxHeight - rightHeight;
							}
				right--;
			}
		}

		System.out.println(water);
    }
}

public class TrappingRainWater {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
            int n= sc.nextInt();
      	    int[] arr= new int[n];

      	    for(int i=0;i<n;i++)
                arr[i]=sc.nextInt();
            
        
            Solution Obj = new Solution();
            Obj.TappingWater(arr, n);
            
        
        sc.close();
        
    }
}
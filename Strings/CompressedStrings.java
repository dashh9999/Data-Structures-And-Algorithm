import java.util.*;
import java.io.*;
class Solution {
    public String compressedString(String s) {
        StringBuilder str = new StringBuilder();
		int n = s.length();
		int i = 0;
		while(i<n){
			int count = 0;
			int j = i;
			while(j<n && s.charAt(j) == s.charAt(i))
			{
				count++;
				j++;
			}
			str.append(s.charAt(i));
			if(count>1){
				str.append(count);
			 }
			 i = j;
		}
		String ans = str.toString();
		return ans;

    }
}

public class CompressedStrings {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        while(t-- > 0){
            String s = br.readLine();
            Solution Obj = new Solution();
            System.out.println(Obj.compressedString(s));
        }
    }
}
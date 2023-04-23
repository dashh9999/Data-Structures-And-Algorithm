import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Solution {
    public boolean ExtraBrackets(String exp) {
        // Write your code here
       Stack<Character> st=new Stack<>();
		 for(int i=0;i<exp.length();i++){
			 char ch=exp.charAt(i);
			 // if '('or char or operator push in stack
			 if(ch!=')'){
				 st.push(ch);
			 }
			 else{
				 //we got a closing bkt
				 if(st.peek()=='('){
					 //no expression in btw
					 return true;
				 }else{
					 while(st.peek()!='('){
						 st.pop();//removal of expression in btw
						 
					 }
					 //removing corresponding opening bkt with expression in btwn closing bkt
					 st.pop();
				 }
    }
		 }
			 return false;
}
	}

public class ExtraBrackets {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String exp = br.readLine();
	    Solution Obj = new Solution();
        if(Obj.ExtraBrackets(exp))
            System.out.println("true");
        else
            System.out.println("false");
    }
}
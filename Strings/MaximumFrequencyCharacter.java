import java.util.*;

class Accio {
    public char MaximumFrequencyChar(String s) {
        //Write your code here
            int[] f=new int[26];
            for(int i=0;i<s.length();i++)
                    {
                            char c=s.charAt(i);
                            int idx=c-'a';
                            f[idx]=f[idx]+1;
                    }
            int max=0;
            char maxc='a';
            for(int i=0;i<26;i++)
                    {
                            if(f[i]>max)
                            {
                                    max=f[i];
                                    maxc=(char)('a'+i);
                            }
                    }
            return maxc;
    }
}

public class MaximumFrequencyCharacter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();

        Accio Obj = new Accio();
        System.out.println(Obj.MaximumFrequencyChar(s));
    }
}

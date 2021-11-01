
package uva;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WordScramble_483 {
    public void wordReverse(String input)
    {
        String[] s = new String[input.length()];
        s = input.split(" ");
       
       
        for(int i=0;i<s.length;i++)
        {
            StringBuilder sb = new StringBuilder(s[i]);
            sb=sb.reverse();
            String rev=sb.toString();
            
            if(i>0) 
            {
               System.out.print(" ");  
            }
             System.out.print(rev);
        }
    
        System.out.println();
    }
    
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String s;
        while((s=bf.readLine())!=null)
        {
            new WordScramble_483().wordReverse(s);
        }
    }
}


package uva;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Test {
    final static int No=0,Yes=1;
    public static void main(String[] args) throws IOException {
          BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
          String s; 
          int p=No;
          while((s=bf.readLine())!=null)
          {
            for(int i=0;i<s.length();i++)
            {   
                if(s.charAt(i)=='"' && p==No)
                {
                    p=Yes;
                    System.out.print("``");
                }
                else if(s.charAt(i)=='"' && p==Yes)
                {
                    p=No;
                    System.out.print("''");
                }

                else
                {
                 System.out.print(s.charAt(i));   
                } 
            }
                System.out.println();
          }
    }
}

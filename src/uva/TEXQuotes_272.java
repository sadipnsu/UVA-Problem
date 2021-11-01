
package uva;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class TEXQuotes_272 {
    
    final static int No=0,Yes=1;
    
    public void ConversionText(String s)
    { 
        
        int p=No;
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
         System.out.print("\n");
    }
    public static void main(String[] args) throws IOException {
        
       File file = new File("C:\\Users\\ASUS\\OneDrive\\Documents\\NetBeansProjects\\10.in");
       BufferedReader bf = new BufferedReader(new FileReader(file));
       String s;
        while((s=bf.readLine())!=null)
        {
           new TEXQuotes_272().ConversionText(s);
        }
                
    }
    
}

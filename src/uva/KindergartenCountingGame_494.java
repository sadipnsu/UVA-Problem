
package uva;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class KindergartenCountingGame_494 {
    
    public int countWord(String t)
    {
        int count=0;
        String arr[] = new String[t.length()];
        arr = t.split("[^a-zA-z]");
         
        for(String s:arr)
        {
            if(!s.isEmpty()) 
            {
               count++; 
            }
        }
        return count;
    }
    public static void main(String[] args) throws IOException {
        
        //File file = new File("C:\\Users\\ASUS\\OneDrive\\Documents\\NetBeansProjects\\9.in");
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String s;
        while((s=bf.readLine())!=null)
        {
            int result=new KindergartenCountingGame_494().countWord(s);
            System.out.println(result);    
        }  
    }
}

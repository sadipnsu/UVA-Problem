 


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class PrimeWords_10924 {
    
    public static int charToVal(char ch)
    {
        int asciiVal = (int)ch;
        if(Character.isUpperCase(ch))
        {
            return asciiVal-(int)'A'+27;
        }
        return asciiVal-(int)'a'+1;
    }
    
    public static void IsPrimeWord(String word)
    {    
        boolean flag=false;
        int sum=0;
        for(int i=0;i<word.length();i++)
        {
            int val = charToVal(word.charAt(i));
            sum +=val;
        }
        //System.out.println(sum);
           
       for(int i=2;i<=sum/2;i++)
       {   
           if(sum%i==0)
           {
               flag=true;
               break;
           }   
       }
       
       if(flag==false || sum==1 )
        System.out.println("It is a prime word.");
       else
           System.out.println("It is not a prime word.");
    }
    
    
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("C:\\Users\\ASUS\\OneDrive\\Documents\\NetBeansProjects\\12.in");
        Scanner sc = new Scanner(file);
       // Scanner sc = new Scanner(System.in);
        
       while(sc.hasNext())
       {
           String word = sc.next();
           
           IsPrimeWord(word);
       }
    }
    
}

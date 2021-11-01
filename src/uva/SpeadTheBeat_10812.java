
package uva;

import java.util.Scanner;

public class SpeadTheBeat_10812 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       while(sc.hasNext())
       {
           int n=sc.nextInt();
           for(int i=0;i<n;i++)
           {
            int x=sc.nextInt();
            int y=sc.nextInt();
            if(x<y)
            {
                System.out.println("impossible");
                break;
            } 
              
                int sum = (x+y)/2;
                int diff = (x-y)/2;
                System.out.println(sum+" "+diff);
                 
            }
        }
           
              
    }
}

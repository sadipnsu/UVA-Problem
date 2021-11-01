
package uva;

import java.util.Scanner;

public class JollyJumpers_10038 {
    
    public boolean isJolly(int arr[],int n)
    {
     boolean numSet[]=new boolean[n];
        for(int i=0;i<n-1;i++)
        {
            int diff = Math.abs(arr[i]-arr[i+1]);
            if(diff==0 || diff>n-1 || numSet[diff]==true)
            {
                return false;
            }
            numSet[diff]=true;
        }
//        for(boolean i:numSet)
//        {
//            System.out.println(i);
//        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext())
        {
            int n = sc.nextInt();
            int arr[]= new int[n];
            for(int i=0;i<n;i++)
            {
                arr[i]=sc.nextInt();
            } 
            if(new JollyJumpers_10038().isJolly(arr, n))
            {
                System.out.println("Jolly");
            }
            else
            {
                System.out.println("Not jolly");
            }
        }
        
    }
    
}

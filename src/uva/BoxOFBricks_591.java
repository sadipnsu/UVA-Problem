
package uva;

import java.util.Scanner;

public class BoxOFBricks_591 {
    public int minimumBrickNeeded(int n,int[]arr)
    {
        int total=0;
        for(int i=0;i<n;i++)
        {
            total += arr[i]; 
        }
        int avg=total/n;
        
        //System.out.println(total+"--->"+avg);
        
        int res=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]>avg)
            {
                res +=arr[i]-avg;
            }
        }
        return res;
    }
    
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        int index=1;
        while(sc.hasNext())
        {
            int n = sc.nextInt();
            if(n==0)
            {
                break;
            }
            int arr[]=new int[n];

             for(int i=0;i<n;i++)
             {
                 arr[i]=sc.nextInt();
             }
            int MinBrick = new BoxOFBricks_591().minimumBrickNeeded(n,arr);
            System.out.println("Set #"+index); index++;
            System.out.println("The minimum number of moves is "+MinBrick+".");
            System.out.println();
        }
    }
    
}

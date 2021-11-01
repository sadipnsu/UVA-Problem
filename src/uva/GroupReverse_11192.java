
package uva;


import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;


public class GroupReverse_11192 {
    public String getGroupReverse(String s,int G)
    {
        int group = (s.length())/G;
        //System.out.println(group+"===>"+s.length());
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<s.length();i+=group)
        {
            for(int j=i+(group-1);j>=i;j--)
            {
                sb.append(s.charAt(j));
            }
        }
        return sb.toString();
    }
    
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext())
        {
            int G = sc.nextInt();
            if(G==0)
            {
                break;
            }
            String s = sc.next();
            String GroupreverseResult=new GroupReverse_11192().getGroupReverse(s, G);
            System.out.println(GroupreverseResult);
        }
    }
    
}

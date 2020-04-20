import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        int x=0;
        for(int i=0;i<n;i++)
        {
            String st=sc.next();
            if(st.contains("++"))
            {
                x=x+1;
            }
            else if(st.contains("--"))
            {
                x=x-1;
            }
        }
        System.out.println(x);
    }
}

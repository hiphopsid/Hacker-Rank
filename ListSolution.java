//ANAGRAM USING ARRAY

import java.util.Scanner;

public class Solution {

    static boolean isAnagram(String a, String b) 
    {  
        //check length 
      if(a.length()!=b.length())
      {
          return false;
      }
      //if length is equal
      else
      {
          char[] s1=a.toLowerCase().toCharArray();
          char[] s2=b.toLowerCase().toCharArray();
          Arrays.sort(s1);
          Arrays.sort(s2);

          boolean ret=Arrays.equal(s1,s2);
           return ret;
      }
     
    }

    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}

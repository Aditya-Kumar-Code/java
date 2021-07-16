import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        int a1=A.length();
        int b1=B.length();
        int c1=a1+b1;
        System.out.print(c1);
        System.out.print(System.lineSeparator());
        if(a1<b1){
        System.out.print("Yes");
        System.out.print(System.lineSeparator());
        }
        else{
            System.out.print("No");
            System.out.print(System.lineSeparator());
        }
        String s1 = A.substring(0, 1).toUpperCase();
        String nameCapitalized = s1 + A.substring(1);
        String s2 = B.substring(0, 1).toUpperCase();
        String p = s2 + B.substring(1);

        System.out.print(nameCapitalized+" "+p);
        /* Enter your code here. Print output to STDOUT. */
        
    }
}




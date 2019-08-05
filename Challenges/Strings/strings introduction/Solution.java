import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        System.out.println(A.length()+B.length());
			int i=0;
			
			if((int)A.charAt(i)>(int)B.charAt(i))
				System.out.println("Yes");
			else
				System.out.println("No");
			
			System.out.println();
			System.out.print(A.substring(0,1).toUpperCase()+A.substring(1));
			System.out.println(" ");
			System.out.print(B.substring(0,1).toUpperCase()+B.substring(1));
    }
}




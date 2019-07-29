import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
		Scanner sc=new Scanner(System.in);
		int t=Integer.parseInt(sc.nextLine());
		for(int i=0;i<t;i++){
			String s=sc.nextLine();
			//System.out.println();
			for(int j=0;j<s.length();j++){
				System.out.print(s.charAt(j));
				j++;
			}
			System.out.print(" ");
			//System.out.print("%s");
			for(int j=1;j<s.length();j++){
				System.out.print(s.charAt(j));
				j++;
			}
			System.out.println();
		}
    }
}


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
	
    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";
		
        Scanner scan = new Scanner(System.in);
		//String str=scan.nextLine();
        /* Declare second integer, double, and String variables. */
        //int i2=Integer.parseInt(scan.nextLine());
		int i2=Integer.parseInt(scan.nextLine());
        //double d2=scan.nextDouble();
		double d2=Double.parseDouble(scan.nextLine());
		
				
			
        String str=scan.nextLine();
		//System.out.println(str);

        /* Read and save an integer, double, and String to your variables.*/
        // Note: If you have trouble reading the entire String, please go back and review the Tutorial closely.

        /* Print the sum of both integer variables on a new line. */
        int sum1=i+i2;
        System.out.println(sum1);

        /* Print the sum of the double variables on a new line. */
        double sum2=d+d2;
		System.out.println(sum2);
        /* Concatenate and print the String variables on a new line; 
        	the 's' variable above should be printed first. */
        System.out.println(s.concat(str));
        scan.close();
    }
}
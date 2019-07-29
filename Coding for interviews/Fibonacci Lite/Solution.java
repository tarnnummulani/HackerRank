import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int fact=1;
       /* for(int i=1;i<=num;++i){
             fact*=i;
        }*/
		for(int i=num;i>0;i--){
			fact*=i;
		}
        System.out.println(fact);
    }
}
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
		scanner.close();
		/*----FIRST METHOD------
		int count=0;
		while(n>0){
			int rem=n%2;
			if(rem==1){
				count++;
			}
			else{
				count=0;
			}
			n=n/2;
		}
		System.out.println(count);*/
		
		/*----SECOND METHOD------
		String bs[]=Integer.toString(n,2).split("0"); or
		//String bs[]=Integer.toBinaryString(n).split("0");
		int len=0;
		for(int i=0;i<bs.length;i++){
			if(bs[i].length()>len)
				len=bs[i].length();
		}
		System.out.println(len);*/
		
		/*----THIRD METHOD------
		String bs[]=Integer.toBinaryString(n).split("0");
		Arrays.sort(bs);
		System.out.println(bs[bs.length-1].length());*/
		
		/*----FOURTH METHOD------
		int count=0,max=0;
		while(n>0){
			int rem=n%2;
			if(rem==1)
				count++;
			else
				count=0;
			max=Math.max(count,max);
			n/=2;
		}
		System.out.println(max);*/
		
		/*----FIFTH METHOD------*/
		int max=0,count=0;
		while(n>0){
			count=++count*(n%2);
			max=Math.max(count,max);
			n/=2;
		}
		System.out.println(max);
    }
}



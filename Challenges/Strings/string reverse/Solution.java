import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String A=sc.nextLine();
        /* Enter your code here. Print output to STDOUT. */
		
	String rev="";
	int n=A.length();
       	 for(int i=n-1;i>=0;i--){
			rev+=A.charAt(i);
		}
		/*if(A.equals(rev)){
			System.out.println("Yes");
		}
		else{
			System.out.println("No");
		}
		/*String rev= new StringBuilder(A).reverse().toString();
		System.out.println(A.equals(rev)?"Yes":"No");*/
		if(A.equalsIgnoreCase(rev))
			System.out.println("Yes");
		else
			System.out.println("No");
    }
}




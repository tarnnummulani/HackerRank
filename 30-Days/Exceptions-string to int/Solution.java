import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
		String S = in.next();
		try{
			//String S = in.next();
			int i=Integer.parseInt(S);
			System.out.println(i);
		}
		catch(NumberFormatException e){
			System.out.println("Bad string");
		}
    }
}


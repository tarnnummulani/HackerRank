import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
		/*s.trim();
		String delims="[ !, ?._'@,:;]+";
		String tokens[]=s.split(delims);
		System.out.println(tokens.length);
		for(int i=0;i<tokens.length;i++){
			System.out.println(tokens[i]);
		}*/
		StringTokenizer st=new StringTokenizer(s," \t\n\r\f,.:;?![]'");
		System.out.println(st.countTokens());
		while(st.hasMoreTokens()){
			System.out.println(st.nextToken());
		}
        scan.close();
    }
}


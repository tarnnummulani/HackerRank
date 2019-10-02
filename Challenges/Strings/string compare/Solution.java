import java.util.Scanner;

public class Solution {

    public static void getSmallestAndLargest(String s, int k) {
        String smallest = s.substring(0,k);
        String largest =s.substring(0,k);
		
        for(int i=0;i<=s.length()-k;i++){
			String cStr=s.substring(i,i+k);
			if(smallest.compareTo(cStr)>0)
				smallest=cStr;
			if(largest.compareTo(cStr)<0)
				largest=cStr;
		}
		System.out.println(smallest); 
        System.out.println(largest); 
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        
        //return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
		getSmallestAndLargest(s, k);
        //System.out.println(getSmallestAndLargest(s, k));
    }
}
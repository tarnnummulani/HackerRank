import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


class Difference {
  	private int[] elements;
  	public int maximumDifference;
	Difference(int a[]){
		this.elements=a;
	}
	public void computeDifference(){
		int min=100;
		int max=0;
		for(int i=0;i<elements.length;++i){
			if(min>elements[i])
				min=elements[i];
			if(max<elements[i])
				max=elements[i];
		}
		maximumDifference=max-min;*/
		/*Arrays.sort(elements);
		maximumDifference=elements[elements.length-1]-elements[0];*/
	}

} // End of Difference class

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        Difference difference = new Difference(a);

        difference.computeDifference();

        System.out.print(difference.maximumDifference);
    }
}
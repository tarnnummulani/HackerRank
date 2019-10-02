import java.io.*;
import java.util.*;

public class Solution {
    public static void count(int n,int d){
        int val[]=new int[d];
		//int i=0;
        /*while(i<d){
            val[i]=i+1;
			System.out.println(val[i]);
			i++;
        }*/
		int sum=0;
		int dice1=0,dice2=0;
		for(int j=0;j<n;j++){
			
			for(int i=0;i<d;i++){
				dice1=(int)(Math.random()*d+1);
				//System.out.println(dice1);
				//sum+=dice;
				System.out.print(dice1+" ");
			}
			//dice2=(int)(Math.random()*d-1);
			//System.out.print(dice2+" ");
			System.out.println();
			//System.out.println(dice1+dice2);
		}
		//System.out.println(dice1+dice2);
		//System.out.println(s);
    }
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner s = new Scanner(System.in);
        int n=s.nextInt();
        int d=s.nextInt();
        //int m=s.nextInt();
        //int s=s.nextInt();
		count(n,d);
    }
}


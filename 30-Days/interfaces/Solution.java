import java.io.*;
import java.util.*;

interface AdvancedArithmetic{
	int divisorSum(int n);
} 
class Calculator implements AdvancedArithmetic{
	public int divisorSum(int n){
		int sum=0;
		for(int i=1;i<=n/2;i++){
			if(n%i==0)
				sum+=i;
		}
		sum=sum+n;
		return sum;
	}
}
class Solution{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		sc.close();
		AdvancedArithmetic a= new Calculator();
		System.out.println("I implemented: "+a.getClass().getInterfaces()[0].getName());
		System.out.println(a.divisorSum(n));
	}
}
import java.util.*;
class Solution2{
	static void hasArray(int A[],int arrSize,int n){
		int l,r;
		Arrays.sort(A);
		l=0;
		r=arrSize-1;
		while(l<r){
			if(A[l]+A[r]==n)
				System.out.println(A[l]+" "+A[r]);
			else if(A[l]+A[r]<n)
				l++;
			else
				r--;
		}
	}
	public static void main(String args[]){
		int A[]={1,4,45,6,10,-8};
		int n=16;
		int arrSize=A.length;
		hasArray(A,arrSize,n);
	}
}
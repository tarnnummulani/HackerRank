import java.util.*;
class Solution{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		System.out.print("Input Array: ");
		int num[]=new int[n];
		for(int i=0;i<n;i++){
			num[i]=sc.nextInt();
			System.out.print(" ");
		}
		System.out.println();
		System.out.print("Required sum:");
		int sum=sc.nextInt();
		//int temp=0;
		for(int i=0;i<num.length;i++){
			if(num[i]==sum)
				System.out.println(num[i]);
			for(int j=i+1;j<num.length-1;j++){
				if(num[i]+num[j]==sum)
					System.out.println(num[i]+","+num[j]);
				else if(num[i]+num[j]+num[j+1]==sum)
					System.out.println(num[i]+","+num[j]+","+num[j+1]);
				else if(num[i]+num[j-1]+num[j+1]==sum)
					System.out.println(num[i]+","+num[j-1]+","+num[j+1]);
			}
			/*for(int j=i+1;j<num.length-2;j++){
				if(num[i]+num[j]+num[j+1]==sum)
			}*/
		}
	}
}
		
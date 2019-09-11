import java.util.*;
class Solution3{
	public static void main(String args[]){
		System.out.println("No. of elements:");
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
		Arrays.sort(num);
		for(int i=0;i<num.length;i++){
			if(num[i]==sum)
				System.out.println(num[i]);
			for(int j=i+1;j<num.length-1;j++){
				if(num[i]+num[j]==sum)
					System.out.println(num[i]+","+num[j]);
				for(int k=j+1;k<num.length-i;k++){
					if(num[i]+num[j]+num[k]==sum)
							System.out.println(num[i]+","+num[j]+","+num[k]);
				}
			}
		}
	}
}
import java.util.*;
class Solution4{
	/*public static void subArray(int[] num,int sum){
		for(int i=0;i<num.length;i++){
			if(num[i]==sum)
				System.out.println(num[i]);
		}
	}*/
	static int subArray(int num[],int sum){
			//Arrays.sort(num);
			int i=0;
			int temp=0;
			while(i<num.length){
					temp=temp+num[i];
					if(temp==sum){
						return num[i];
						//System.out.println(num[i]+" ");
						//break;
					}
					
					i++;
				}
			}
		
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
		
		System.out.println(subArray(Arrays.sort(num),sum));
	}
}
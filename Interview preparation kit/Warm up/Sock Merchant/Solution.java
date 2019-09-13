import java.io.*;
import java.util.*;
class Solution{
	public static int sockMerchant(int n,int a[]){
		int pairs=0;
		Set<Integer> colors= new HashSet<>();
		for(int i=0;i<n;i++){
			if(!colors.contains(a[i]))
				colors.add(a[i]);
			else
				pairs++;
				colors.remove(a[i]);
		}
		return pairs;
	}
	private static Scanner sc = new Scanner(System.in);
	public static void main(String args[]) throws IOException{
		BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
		int n=sc.nextInt();
		int a[]=new int[n]; 
		String arr[]=sc.nextLine().split(" ");
		for(int i=0;i<n;i++){
			int array=Integer.parseInt(arr[i]);
			a[i]=array;
			int result = sockMerchant(n, a);

			bw.write(String.valueOf(result));
			bw.newLine();

			bw.close();

			
			}
	}
	//sc.close();
}
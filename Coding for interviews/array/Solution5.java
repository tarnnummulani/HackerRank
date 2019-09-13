import java.io.*; 
import java.util.HashSet; 
  
class Solution5 { 
    static void printpairs(int arr[], int sum) 
    { 
        HashSet<Integer> s = new HashSet<Integer>(); 
        for (int i = 0; i < arr.length; ++i) { 
            int temp = sum - arr[i]; 
  
            // checking for condition 
            if (s.contains(temp)) { 
                System.out.println("Pair with given sum " + sum + " is (" + arr[i] + ", " + temp + ")"); 
				s.add(arr[i]);
            } 
			else{
				for(int j=i+1;j<arr.length-1;j++){
					temp=temp-arr[j];
					if(s.contains(temp)){
					System.out.println(temp+" "+arr[i]+" "+arr[j]);
					s.add(arr[i]);
					s.add(arr[j]);
					}
				}
			}
             
        } 
    } 
  
    // Main to test the above function 
    public static void main(String[] args) 
    { 
        int A[] = { 1, 4, 11, 6, 10, 8 }; 
        int n = 16; 
        printpairs(A, n); 
    } 
}
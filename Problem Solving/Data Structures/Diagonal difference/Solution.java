import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result{
	/*
     * Complete the 'diagonalDifference' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts 2D_INTEGER_ARRAY arr as parameter.
     */
	public static int diagonalDifference(List<List<Integer>> arr){
		int sum1=0,sum2=0;
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				if(i==j)
					sum1+=arr.get(i).get(j);
				if(i+j==(n-1))
					sum2+=arr.get(i).get(j);
			}
		}
		return (int) Math.abs(sum1-sum2);
	}
}
public class Solution{
	BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
	BufferdWriter bw=new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
	int n=Integer.parseInt(br.readLine.trim());
	List<List<Integer>> arr =new ArrayList<>();
	IntStream.range(0,n).forEach(i ->
	{
		try{
			arr.add(Stream.of(br.readLine().replaceAll("\\s+$", "").split("")).map(Integer.parseInt).collect(toList()));
		}
		catch(IOException ex){
			throw new RuntimeException(ex);
		}
	});
	int result=Result.diagonalDifference(arr);
}
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the getWays function below.
    /*static long getWays(long n, long[] c) {
		if(n<0)
			return 0;
		return numways(n,c,m,new HashMap<String,Long>());
    }*/
	static long getWays(long n,long c[],int m,HashMap<String,Long> cache){
		String key = n + "," + m;
		if (cache.containsKey(key)){
			return cache.get(key);
		}
		
		if (m == c.length - 1){
        if (n % c[m] == 0) {
            cache.put(key, 1L);
            return 1;
        } else {
            cache.put(key, 0L);
            return 0;
        }
		}
		
		long ways = 0;
		for (int i = 0; i <= n; i += c[m]) {
			ways += getWays(n - i, c, m + 1, cache);
		}
		/* Cache and return solution */
		cache.put(key, ways);
		return ways;
	}

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nm = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nm[0]);

        int m = Integer.parseInt(nm[1]);

        long[] c = new long[m];

        String[] cItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < m; i++) {
            long cItem = Long.parseLong(cItems[i]);
            c[i] = cItem;
        }

        // Print the number of ways of making change for 'n' units using coins having the values given by 'c'

        long ways = getWays(n,c,m,new HashMap<String,Long>());

        bufferedWriter.close();

        scanner.close();
    }
}

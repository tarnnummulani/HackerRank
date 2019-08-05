//Complete this code or write your own from scratch
import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
		HashMap<String,Integer> map=new HashMap<>();
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            // Write code here
			/*HashMap<String,Integer> map=new HashMap<>();
			String name = in.next();
            int phone = in.nextInt();*/
			map.put(name,phone);
        }
        while(in.hasNext()){
            String s = in.next();
			if(map.containsKey(s))
				System.out.println(s+"="+map.get(s));
			else
				System.out.println("Not found");
        }
        in.close();
    }
}


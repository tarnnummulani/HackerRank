/*Write a program that, given a number n from STDIN, prints out the factorial of n to STDOUT:

If n is 0, n factorial is 1
n! is not defined for negative numbers.*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void factorial(int n){
        int fact=1;
        if(n==0){
            System.out.println(fact);
        }  
        else{
            for(int i=n;i>0;i--){
                fact*=i;
            }
            System.out.println(fact);
        }
    }
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        factorial(n);
    }
}
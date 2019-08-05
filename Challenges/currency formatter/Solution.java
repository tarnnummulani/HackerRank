import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();
		/*Locale locale = new Locale("en","IN");
        NumberFormat india = NumberFormat.getCurrencyInstance(locale);
        System.out.println("India: " + india.format(payment));*/
		NumberFormat india = NumberFormat.getCurrencyInstance(Locale.INDIA);
		System.out.println("India: " + india.format(payment));
		NumberFormat us = NumberFormat.getCurrencyInstance(Locale.US);
		System.out.println("Us: " + us.format(payment));
		NumberFormat china = NumberFormat.getCurrencyInstance(Locale.CHINA);
		System.out.println("China: " + china.format(payment));
		NumberFormat france = NumberFormat.getCurrencyInstance(Locale.FRANCE);
		System.out.println("France: " + france.format(payment));
		
		/*NumberFormat nf = NumberFormat.getInstance(Locale.US);
        us=nf.format(payment);
        System.out.println("Us: " + us);
		NumberFormat nf = NumberFormat.getInstance(Locale.CHINA);
        china=nf.format(payment);
        System.out.println("China: " + china);
		NumberFormat nf = NumberFormat.getInstance(Locale.FRANCE);
        france = nf.format(payment);
        System.out.println("France: " + france);*/
    }
}


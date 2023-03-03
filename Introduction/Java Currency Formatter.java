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
        // Write your code here.


        NumberFormat nFUS = NumberFormat.getCurrencyInstance(Locale.US);
        String us = nFUS.format(payment);
       NumberFormat nFI = NumberFormat.getCurrencyInstance(new Locale("en", "IN"));
        String india = nFI.format(payment);
        NumberFormat nFC = NumberFormat.getCurrencyInstance(Locale.CHINA);
        String china = nFC.format(payment);
        NumberFormat nFF = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        String france = nFF.format(payment);
        
        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}

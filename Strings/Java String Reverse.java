import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        
        String s = new StringBuilder(A).reverse().toString();
        String result = A.equals(s) ? "Yes" : "No";  // if manam -> print yes.
        System.out.println(result);
    }
}





import java.util.Scanner;

public class Solution {

    static boolean isAnagram(String a, String b) {
        // Complete the function
        // Check if strings are of equal length
        if (a.length() != b.length()) {
            return false;
        }
        
        // Convert strings to lowercase and store characters in arrays
        char[] aArray = a.toLowerCase().toCharArray();
        char[] bArray = b.toLowerCase().toCharArray();
        
        // Sort character arrays
        java.util.Arrays.sort(aArray);
        java.util.Arrays.sort(bArray);
        
        // Compare sorted character arrays
        return java.util.Arrays.equals(aArray, bArray);
    }

  public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}

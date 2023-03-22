import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Solution {

    public static String getSmallestAndLargest(String s, int k) {
        List<String> sList = new ArrayList<>();
        for (int i = 0; i <= s.length() - k; i++) {
            sList.add(s.substring(i, i + k));
        }
        Collections.sort(sList);
        String smallest = sList.get(0); // 'smallest' must be the lexicographically smallest substring of length 'k'
        String largest = sList.get(sList.size() - 1); // 'largest' must be the lexicographically largest substring of length 'k'
        return smallest + "\n" + largest;        
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}

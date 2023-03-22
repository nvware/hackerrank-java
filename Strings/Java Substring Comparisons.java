import java.util.Scanner;

public class Solution {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        java.util.List<String> sList=new java.util.ArrayList<>();
        for(int i=0;i<=s.length()-k;i++)
        {            
            //  System.out.println();
             sList.add(s.substring(i,i+k));
        }
        java.util.Collections.sort(sList);
        smallest= sList.get(0);
        largest= sList.get(sList.size()-1);
        
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

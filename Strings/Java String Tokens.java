import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); // He is a very very good boy, isn't he?
        String s = scan.nextLine();
        scan.close();
        
        s= s.trim().replaceAll("[^a-zA-Z0-9]+", " ");
        if (s.length()>0){
            String[] words =s.split(" "); 
            System.out.println(words.length);
            s=s.replaceAll(" ", "\n");
            System.out.print(s);
        }
        else
           System.out.println(0);
        
        
    }
}


import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'findDay' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER month
     *  2. INTEGER day
     *  3. INTEGER year
     */

    public static String findDay(int month, int day, int year) {
        Calendar cal = Calendar.getInstance();
         cal.set(year, month-1, day);

        String dayOfWeek_name="";
        int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);
        
        if (Calendar.SUNDAY == dayOfWeek) {
        dayOfWeek_name="SUNDAY";
        }
        if (Calendar.MONDAY == dayOfWeek) {
        dayOfWeek_name="MONDAY";
        }
        if (Calendar.TUESDAY == dayOfWeek) {
        dayOfWeek_name="TUESDAY";
        }
        if (Calendar.WEDNESDAY == dayOfWeek) {
        dayOfWeek_name="WEDNESDAY";
        }
        if (Calendar.THURSDAY == dayOfWeek) {
        dayOfWeek_name="THURSDAY";
        }
        if (Calendar.FRIDAY == dayOfWeek) {
        dayOfWeek_name="FRIDAY";
        }
        if (Calendar.SATURDAY == dayOfWeek) {
        dayOfWeek_name="SATURDAY";
        }
        return dayOfWeek_name;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int month = Integer.parseInt(firstMultipleInput[0]);

        int day = Integer.parseInt(firstMultipleInput[1]);

        int year = Integer.parseInt(firstMultipleInput[2]);

        String res = Result.findDay(month, day, year);

        bufferedWriter.write(res);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}

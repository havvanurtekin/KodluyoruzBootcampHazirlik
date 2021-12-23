/**
 * 
 */
package LargestRectangle;

/**
 * @author Havva Nur TEKÝN
 *
 */
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
     * Complete the 'largestRectangle' function below.
     *
     * The function is expected to return a LONG_INTEGER.
     * The function accepts INTEGER_ARRAY h as parameter.
     */

    public static long largestRectangle(List<Integer> h)  {
    // Write your code here
    int n = h.size();
    int max = 0;
    int top = 0;
    int area = 0;
    
    Stack<Integer> a = new Stack<Integer>();
    int i = 0;
    while(i<n){
        if(a.isEmpty() || h.get(a.lastElement())<=h.get(i)){
            a.push(i++);
        }else{
            top = a.lastElement();
            a.pop();
            if(a.isEmpty()){
                area = h.get(top)*i;
            }else{
                area = h.get(top)*(i-a.lastElement()-1);
            }
            if(max<area)
                max = area;
        }
    }
    while(!a.isEmpty()){
        top = a.lastElement();
        a.pop();
        
        if(a.isEmpty()){
             area = h.get(top)*i;
        }else{
            area = h.get(top)*(i-a.lastElement()-1);
        }
            
        if(max<area)
            max = area;
    }
    return max;
}
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> h = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        long result = Result.largestRectangle(h);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}

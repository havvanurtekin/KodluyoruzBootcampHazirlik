package IceCreamParlor;

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
     * Complete the 'icecreamParlor' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. INTEGER m
     *  2. INTEGER_ARRAY arr
     */

    public static List<Integer> icecreamParlor(int m, List<Integer> arr) {
    // Write your code here
        int size = arr.size();
        int nm = (int)Math.pow(10,4)+1;
        int y = 0, z = 0;
        int flavors[] = new int[2];
        int trip[] = new int[nm];
        for(int i = 0; i < size; i++){
            
            trip[arr.get(i)] += 1;
        }
        for(int i = 0; i < size; i++){
            
            trip[arr.get(i)] -= 1;
            z = m - arr.get(i);
            if(z>0 && trip[z]>0){
               
                y = i + 1;
                flavors[0] = i + 1;
                break;
            }
        }
        for(int i = y; i < size; i++){
            if(arr.get(i).equals(z)){
                flavors[1] = i +1;
                break;
            }
        }
      
        List<Integer> list = Arrays.stream(flavors).boxed().collect(Collectors.toList());
        return list;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, t).forEach(tItr -> {
            try {
                int m = Integer.parseInt(bufferedReader.readLine().trim());

                int n = Integer.parseInt(bufferedReader.readLine().trim());

                List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                    .map(Integer::parseInt)
                    .collect(toList());

                List<Integer> result = Result.icecreamParlor(m, arr);

                bufferedWriter.write(
                    result.stream()
                        .map(Object::toString)
                        .collect(joining(" "))
                    + "\n"
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
        bufferedWriter.close();
    }
}

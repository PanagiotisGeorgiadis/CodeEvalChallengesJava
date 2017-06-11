package zarchon.EasyChallengeOnCodeEval;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Zarc
 */

public class FibonacciSeries {
    public static int[] fibonacci = new int[]{0,1,1,2,3,5,8,13,21,34,55,89,144,233,377,610,987,1597,2584,4181,6765};
    
    public static void fibonacciSeries(File file){
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line;
            while((line=br.readLine()) != null && !line.trim().isEmpty())
            {
                System.out.println(fibonacci[Integer.parseInt(line)]);
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Error With File: " + ex.getMessage());
        } catch (IOException ex) {
            System.out.println("Error With File: " + ex.getMessage());
        }
    }
    
    public static void main(String[] args) {
        File file = new File("TestingFiles"+File.separator+"testFibonacciSeries.txt");
        fibonacciSeries(file);
    }
}

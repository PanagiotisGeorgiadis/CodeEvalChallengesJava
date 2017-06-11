package zarchon.EasyChallengeOnCodeEval;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

/**
 *
 * @author Zarc
 */

public class SimpleSortingChallenge {
           
    public static void simpleSorting(File file){
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line;
            String[] splittedLine;
            float[] numbers;
            while((line=br.readLine()) != null && !line.trim().isEmpty())
            {
                splittedLine = line.split("\\s");
                numbers = new float[splittedLine.length];
                for(int i=0; i<splittedLine.length; i++)
                {
                    numbers[i] = Float.parseFloat(splittedLine[i]);
                }
                Arrays.sort(numbers);
                for(int i=0; i < numbers.length; i++)
                {
                    System.out.printf("%.3f ", numbers[i]);
                }
                System.out.println();
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Error With File: " + ex.getMessage());
        } catch (IOException ex) {
            System.out.println("Error With File: " + ex.getMessage());
        }
    }
    
    public static void main(String[] args){
        File file = new File("TestingFiles"+File.separator+"testSimpleSorting.txt");
        simpleSorting(file);
    }
}

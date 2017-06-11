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

public class SumOfIntegersFromFileChallenge {
       
    public static void sumOfIntegers(File file){
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line;
            int sum = 0;
            while((line=br.readLine()) != null && !line.trim().isEmpty())
            {
                sum = sum + Integer.parseInt(line);
            }
            System.out.println(sum);
        } catch (FileNotFoundException ex) {
            System.out.println("Error With File: " + ex.getMessage());
        } catch (IOException ex) {
            System.out.println("Error With File: " + ex.getMessage());
        }
    }
    
    public static void main(String[] args) {
        File file = new File("TestingFiles"+File.separator+"testSumOfIntegers.txt");
        sumOfIntegers(file);
    }
}
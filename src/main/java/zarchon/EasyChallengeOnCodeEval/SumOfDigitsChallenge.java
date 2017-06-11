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

public class SumOfDigitsChallenge {
       
    public static void sumOfDigits(File file){
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line;
            int sum;
            while((line=br.readLine()) != null && !line.trim().isEmpty())
            {
                sum = 0;
                for(int i=0; i<line.length(); i++)
                {
                    if(Character.isDigit(line.charAt(i)))
                    {
                        sum = sum + Integer.parseInt(line.charAt(i) + "");
                    }
                }
                System.out.println(sum);
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Error With File: " + ex.getMessage());
        } catch (IOException ex) {
            System.out.println("Error With File: " + ex.getMessage());
        }
    }
    
    public static void main(String[] args) {
        File file = new File("TestingFiles"+File.separator+"testSumOfDigits.txt");
        sumOfDigits(file);
    }
}

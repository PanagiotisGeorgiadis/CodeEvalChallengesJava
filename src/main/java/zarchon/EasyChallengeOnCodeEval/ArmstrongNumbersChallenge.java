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

public class ArmstrongNumbersChallenge {
       
    public static void armstrongNumbers(File file){
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line;
            int sum;
            while((line=br.readLine()) != null && !line.trim().isEmpty())
            {
                sum = 0;
                for(int i=0; i<line.length(); i++)
                {
                    sum = (int) ( sum + Math.pow( Integer.parseInt(line.charAt(i)+""), line.length()));                    
                }
                if(Integer.parseInt(line) == sum)
                {
                    System.out.println("True");
                }
                else
                {
                    System.out.println("False");
                }
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Error With File: " + ex.getMessage());
        } catch (IOException ex) {
            System.out.println("Error With File: " + ex.getMessage());
        }
    }
    
    public static void main(String[] args){
        File file = new File("TestingFiles"+File.separator+"testArmstrongNumbers.txt");
        armstrongNumbers(file);
    }
}

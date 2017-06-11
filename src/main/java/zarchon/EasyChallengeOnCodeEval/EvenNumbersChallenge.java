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
public class EvenNumbersChallenge {
       
    public static void evenNumbers(File file){
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line;
            int number;
            while((line=br.readLine()) != null && !line.trim().isEmpty())
            {
                number = Integer.parseInt(line);
                while(number > 1000)
                {
                    number = number - 1000;
                }
                while(number > 100)
                {
                    number = number - 100;
                }
                while(number > 10)
                {
                    number = number - 10;
                }
                while(number > 1)
                {
                    number = number-2;
                }
                if(number == 1)
                {
                    System.out.println(0);
                }
                else
                {
                    System.out.println(1);
                }
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Error With File: " + ex.getMessage());
        } catch (IOException ex) {
            System.out.println("Error With File: " + ex.getMessage());
        }
    }
    
    public static void main(String[] args){
        File file = new File("TestingFiles"+File.separator+"testEvenNumbers.txt");
        evenNumbers(file);
    }
}

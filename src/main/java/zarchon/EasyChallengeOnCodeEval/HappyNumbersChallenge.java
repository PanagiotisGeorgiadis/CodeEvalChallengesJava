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

public class HappyNumbersChallenge {
       
    public static void happyNumbers(File file){
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line;
            int sum, counter;
            while((line=br.readLine()) != null && !line.trim().isEmpty())
            {       
                counter = 0;
                sum =0;
                while(sum != 1)
                {
                    sum = 0;
                    for(int i=0; i<line.length(); i++)
                    {
                        sum = sum + (Integer.parseInt(line.charAt(i)+"") * Integer.parseInt(line.charAt(i)+""));
                    }
                    if(sum != 1)
                    {
                        line = sum + "";
                    }
                    if(counter == 40)
                    {
                        break;
                    }
                    counter++;
                }
                if(sum == 1)
                {
                    System.out.println(1);
                }
                else
                {
                    System.out.println(0);
                }
                
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Error With File: " + ex.getMessage());
        } catch (IOException ex) {
            System.out.println("Error With File: " + ex.getMessage());
        }
    }
    
    public static void main(String[] args){
        File file = new File("TestingFiles"+File.separator+"testHappyNumbers.txt");
        happyNumbers(file);
    }
}

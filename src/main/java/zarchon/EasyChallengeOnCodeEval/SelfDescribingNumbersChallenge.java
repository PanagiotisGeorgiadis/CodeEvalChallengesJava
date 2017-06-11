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

public class SelfDescribingNumbersChallenge {
       
    public static void selfDescribingNumbers(File file){
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line, result;
            int counter, j;
            while((line=br.readLine()) != null && !line.trim().isEmpty())
            {             
                result = "";
                for(int i=0; i<line.length(); i++)
                {
                    counter = 0;
                    j=0;
                    while(j<line.length())
                    {
                        if(i == Integer.parseInt(line.charAt(j) + ""))
                        {                            
                            counter++;
                        }
                        j++;
                    }
                    if(Integer.parseInt(line.charAt(i) + "") == counter)
                    {
                        result = result + "1";
                    }
                    else
                    {
                        result = result + "0";
                        break;
                    }
                }
                if(result.contains("0"))
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
        File file = new File("TestingFiles"+File.separator+"testSelfDescribingNumbers.txt");
        selfDescribingNumbers(file);
    }
}
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

public class SwapCaseChallenge {
       
    public static void swapCase(File file){
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line, output;
            while((line=br.readLine()) != null && !line.trim().isEmpty())
            {
                output = "";
                for(int i=0; i<line.length(); i++)
                {
                    if(Character.isAlphabetic(line.charAt(i)))
                    {
                        if(Character.isLowerCase(line.charAt(i)))
                        {
                            output = output + Character.toUpperCase(line.charAt(i));
                        }
                        else
                        {
                            output = output + Character.toLowerCase(line.charAt(i));
                        }
                    }
                    else
                    {
                        output = output + line.charAt(i);
                    }
                }
                System.out.println(output);
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Error With File: " + ex.getMessage());
        } catch (IOException ex) {
            System.out.println("Error With File: " + ex.getMessage());
        }
    }
    
    public static void main(String[] args){
        File file = new File("TestingFiles"+File.separator+"testSwapCase.txt");
        swapCase(file);
    }
}

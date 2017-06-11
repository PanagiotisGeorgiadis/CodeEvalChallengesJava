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

public class MultipliesOfANumber {
       
    public static void multipliesOfANumber(File file){
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line;
            String[] splittedLine;
            int x,n,multiplier;
            while((line=br.readLine()) != null && !line.trim().isEmpty())
            {
                splittedLine = line.split(",");
                x = Integer.parseInt(splittedLine[0]);
                n = Integer.parseInt(splittedLine[1]);
                multiplier = 0;
                if(x>=0)
                {
                    while(x >= n*multiplier)
                    {
                        multiplier++;
                    }
                }
                else
                {
                    while(x >= n*multiplier)
                    {
                        multiplier--;
                    }
                }
                System.out.println(n*multiplier);
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Error With File: " + ex.getMessage());
        } catch (IOException ex) {
            System.out.println("Error With File: " + ex.getMessage());
        }
    }
    
    public static void main(String[] args) {
        File file = new File("TestingFiles"+File.separator+"testMultipliesOfANumber.txt");
        multipliesOfANumber(file);
    }
}

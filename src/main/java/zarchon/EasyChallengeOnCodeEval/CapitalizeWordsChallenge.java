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

public class CapitalizeWordsChallenge {
    
    public static void capitalizeWords(File file){
         try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line;
            String[] splittedLine;
            while((line=br.readLine()) != null && !line.trim().isEmpty())
            {
                splittedLine = line.split("\\s");
                line = "";
                for(int i=0; i<splittedLine.length; i++)
                {
                    for(int j=0; j<splittedLine[i].length(); j++)
                    {
                        if(j == 0)
                        {
                            line = line + Character.toUpperCase(splittedLine[i].charAt(j));
                        }
                        else
                        {
                            line = line + splittedLine[i].charAt(j);
                        }
                    }
                    line = line + " ";
                }
                System.out.println(line);
            }
         }catch (FileNotFoundException ex) {
            System.out.println("Error With File: " + ex.getMessage());
        } catch (IOException ex) {
            System.out.println("Error With File: " + ex.getMessage());
        }
    }
    
    public static void main(String[] args){
        File file = new File("TestingFiles"+File.separator+"testCapitalizeWords.txt");
        capitalizeWords(file);
    }
}

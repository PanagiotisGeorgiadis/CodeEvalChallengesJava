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

//"[a-zA-Z]+" as a regex didnt work because it seems that 1992 for example is a word
public class LongestWordChallenge {
       
    public static void longestWord(File file){
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line, longestWord;
            String[] splittedLine;
            while((line=br.readLine()) != null && !line.trim().isEmpty())
            {
                splittedLine = line.split("\\s");
                longestWord = "";
                for(int i=0; i<splittedLine.length; i++)
                {
                    if(splittedLine[i].length() > longestWord.length() && splittedLine[i].matches("\\w+"))
                    {
                        longestWord = splittedLine[i];
                    }
                }
                System.out.println(longestWord);
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Error With File: " + ex.getMessage());
        } catch (IOException ex) {
            System.out.println("Error With File: " + ex.getMessage());
        }
    }
    
    public static void main(String[] args){
        File file = new File("TestingFiles"+File.separator+"testLongestWord.txt");
        longestWord(file);
    }
}

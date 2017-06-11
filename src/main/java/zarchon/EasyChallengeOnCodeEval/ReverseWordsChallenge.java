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

public class ReverseWordsChallenge {
       
    public static void reverseWords(File file){
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line;
            String[] splittedLine;
            while((line=br.readLine()) != null)
            {
                splittedLine = line.split("\\s");
                if(splittedLine.length > 0)
                {
                    System.out.print(splittedLine[splittedLine.length-1]);
                    for(int i=splittedLine.length-2; i>=0; i--)
                    {
                        System.out.print(" " + splittedLine[i]);
                    }
                }
                System.out.println();
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Error With File: " + ex.getMessage());
        } catch (IOException ex) {
            System.out.println("Error With File: " + ex.getMessage());
        }
    }
    
    public static void main(String[] args) {
        File file = new File("TestingFiles"+File.separator+"testReverseWords.txt");
        reverseWords(file);
    }
}

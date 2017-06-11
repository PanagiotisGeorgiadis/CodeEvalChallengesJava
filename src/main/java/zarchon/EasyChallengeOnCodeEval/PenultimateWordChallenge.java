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

public class PenultimateWordChallenge {
       
    public static void penultimateWord(File file){
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line;
            String[] splittedLine;
            while((line=br.readLine()) != null && !line.trim().isEmpty())
            {
                splittedLine = line.split("\\s");
                System.out.println(splittedLine[splittedLine.length-2]);                
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Error With File: " + ex.getMessage());
        } catch (IOException ex) {
            System.out.println("Error With File: " + ex.getMessage());
        }
    }
    
    public static void main(String[] args){
        File file = new File("TestingFiles"+File.separator+"testPenultimateWord.txt");
        penultimateWord(file);
    }
}

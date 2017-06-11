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

public class LowercaseChallenge {
       
    public static void lowercaseChallenge(File file){
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line, newLine;
            while((line=br.readLine()) != null && !line.trim().isEmpty())
            {
                newLine = "";
                for(int i=0; i<line.length(); i++)
                {
                    newLine = newLine + Character.toLowerCase(line.charAt(i));
                }
                System.out.println(newLine);
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Error With File: " + ex.getMessage());
        } catch (IOException ex) {
            System.out.println("Error With File: " + ex.getMessage());
        }
    }
    
    public static void main(String[] args) {
        File file = new File("TestingFiles"+File.separator+"testLowerase.txt");
        lowercaseChallenge(file);
    }
}

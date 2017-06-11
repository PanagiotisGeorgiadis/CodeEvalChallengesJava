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
public class ShortestRepetitionChallenge {
       
    public static void shortestRepetition(File file){
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line;
            int index;
            while((line=br.readLine()) != null && !line.trim().isEmpty())
            {
                index = line.indexOf(line.charAt(0)+"", 1);
                if(index > 0)
                {
                    System.out.println(index);
                }
                else
                {
                    System.out.println(line.length());
                }
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Error With File: " + ex.getMessage());
        } catch (IOException ex) {
            System.out.println("Error With File: " + ex.getMessage());
        }
    }
    
    public static void main(String[] args){
        File file = new File("TestingFiles"+File.separator+"testShortestRepetition.txt");
        shortestRepetition(file);
    }
}


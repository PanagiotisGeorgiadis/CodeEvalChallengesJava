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

public class WordToDigitChallenge {
    
    public static int getDigit(String word){
        
        if(word.matches("zero")){
            return 0;
        } else if(word.matches("one")){
            return 1;
        } else if(word.matches("two")){
            return 2;
        } else if(word.matches("three")){
            return 3;
        } else if(word.matches("four")){
            return 4;
        } else if(word.matches("five")){
            return 5;
        } else if(word.matches("six")){
            return 6;
        } else if(word.matches("seven")){
            return 7;
        } else if(word.matches("eight")){
            return 8;
        } else {
            return 9;
        }
        
    }
       
    public static void wordToDigit(File file){
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line, output;
            String[] words;
            while((line=br.readLine()) != null && !line.trim().isEmpty())
            {
                words = line.split(";");
                output = "";
                for(int i=0; i<words.length; i++)
                {
                    output = output + getDigit(words[i]);
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
        File file = new File("TestingFiles"+File.separator+"testWordToDigit.txt");
        wordToDigit(file);
    }
}

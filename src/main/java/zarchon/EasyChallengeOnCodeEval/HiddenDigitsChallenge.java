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

public class HiddenDigitsChallenge {

    public static String getHiddenDigits(String line){
        String hiddenDigits = "";
        for(int i=0; i<line.length(); i++)
        {
            if(Character.isDigit(line.charAt(i)))
            {
                hiddenDigits = hiddenDigits + line.charAt(i);
            }
        }        
        return hiddenDigits;
    }
    
    public static void hiddenDigits(File file){
        
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line, hiddenDigits;
            while((line=br.readLine()) != null && !line.trim().isEmpty())
            {
                line = line.replace('a', '0');
                line = line.replace('b', '1');
                line = line.replace('c', '2');
                line = line.replace('d', '3');
                line = line.replace('e', '4');
                line = line.replace('f', '5');
                line = line.replace('g', '6');
                line = line.replace('h', '7');
                line = line.replace('i', '8');
                line = line.replace('j', '9');
                hiddenDigits = getHiddenDigits(line);
                if(hiddenDigits.trim().isEmpty())
                {
                    System.out.println("NONE");
                }
                else
                {
                    System.out.println(getHiddenDigits(line));
                }
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Error With File: " + ex.getMessage());
        } catch (IOException ex) {
            System.out.println("Error With File: " + ex.getMessage());
        }
        
    }
    
    public static void main(String args[]){
        File file = new File("TestingFiles"+File.separator+"testHiddenDigits.txt");
        hiddenDigits(file);
    }
}

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

public class ApresetClass {
       
    public static void hiddenDigits(File file){
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line;
            while((line=br.readLine()) != null && !line.trim().isEmpty())
            {
                
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Error With File: " + ex.getMessage());
        } catch (IOException ex) {
            System.out.println("Error With File: " + ex.getMessage());
        }
    }
    
    public static void main(String[] args) {
        File file = new File("TestingFiles"+File.separator+"testHiddenDigits.txt");
        hiddenDigits(file);
    }
}

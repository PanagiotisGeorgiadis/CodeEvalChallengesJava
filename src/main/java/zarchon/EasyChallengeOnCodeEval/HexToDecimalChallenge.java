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

public class HexToDecimalChallenge {
       
    public static void hiddenDigits(File file){
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line;
            int sum, pow;
            while((line=br.readLine()) != null && !line.trim().isEmpty())
            {
                sum = 0;
                pow = 0;
                for(int i=line.length()-1; i>-1; i--)
                {
                    if(line.charAt(i) == 'a') {
                        sum = (int) (sum + 10 * Math.pow(16, pow));
                    } else if (line.charAt(i) == 'b') {
                        sum = (int) (sum + 11 * Math.pow(16, pow));
                    } else if (line.charAt(i) == 'c') {
                        sum = (int) (sum + 12 * Math.pow(16, pow));
                    } else if (line.charAt(i) == 'd') {
                        sum = (int) (sum + 13 * Math.pow(16, pow));
                    } else if (line.charAt(i) == 'e') {
                        sum = (int) (sum + 14 * Math.pow(16, pow));
                    } else if (line.charAt(i) == 'f') {
                        sum = (int) (sum + 15 * Math.pow(16, pow));
                    } else {
                        sum = (int) (sum + Integer.parseInt(line.charAt(i)+"") * Math.pow(16, pow));
                    }
                    pow++;
                }                
                System.out.println(sum);
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Error With File: " + ex.getMessage());
        } catch (IOException ex) {
            System.out.println("Error With File: " + ex.getMessage());
        }
    }
    
    public static void main(String[] args){
        File file = new File("TestingFiles"+File.separator+"testHexToDecimal.txt");
        hiddenDigits(file);
    }
}

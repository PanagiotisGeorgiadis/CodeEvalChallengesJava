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

public class BitPositionsChallenge {
       
    public static void bitPositions(File file){
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line;
            String[] splittedLine;
            while((line=br.readLine()) != null && !line.trim().isEmpty())
            {
                splittedLine = line.split(",");
                line = "";
                splittedLine[0] = Integer.toBinaryString(Integer.parseInt(splittedLine[0]));
                for(int i=splittedLine[0].length()-1; i>=0; i--)
                {
                    line = line + splittedLine[0].charAt(i);
                }
                if(Integer.parseInt(line.charAt(Integer.parseInt(splittedLine[1]) -1)+"") == Integer.parseInt(line.charAt(Integer.parseInt(splittedLine[2]) -1)+""))
                {
                    System.out.println("true");
                }
                else
                {
                    System.out.println("false");
                }
                
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Error With File: " + ex.getMessage());
        } catch (IOException ex) {
            System.out.println("Error With File: " + ex.getMessage());
        }
    }
    
    public static void main(String[] args) {
        File file = new File("TestingFiles"+File.separator+"testBitPositions.txt");
        bitPositions(file);
    }
}

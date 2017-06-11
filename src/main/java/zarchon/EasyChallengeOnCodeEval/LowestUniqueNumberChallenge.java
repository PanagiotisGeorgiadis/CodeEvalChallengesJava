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

public class LowestUniqueNumberChallenge {
       
    public static void lowestUniqueNumber(File file){
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line;
            int position;
            while((line=br.readLine()) != null && !line.trim().isEmpty())
            {
                position = 0;
                for(int i=9; i>0; i--)
                {
                    if(line.indexOf(i + "") == line.lastIndexOf(i + "") && line.indexOf(i + "") != -1)
                    {
                        position = line.indexOf(i + "")/2 + 1;
                    }
                }
                System.out.println(position);
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Error With File: " + ex.getMessage());
        } catch (IOException ex) {
            System.out.println("Error With File: " + ex.getMessage());
        }
    }
    
    public static void main(String[] args){
        File file = new File("TestingFiles"+File.separator+"testLowestUniqueNumber.txt");
        lowestUniqueNumber(file);
    }
}

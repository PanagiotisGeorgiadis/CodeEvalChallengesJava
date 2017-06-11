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

public class NModMChallenge {
       
    public static void getNmodM(File file){
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line;
            String[] splittedLine;
            int n,m;
            while((line=br.readLine()) != null && !line.trim().isEmpty())
            {
                splittedLine = line.split(",");
                n = Integer.parseInt(splittedLine[0]);
                m = Integer.parseInt(splittedLine[1]);
                while(n >= m)
                {
                    n = n - m;
                }                
                System.out.println(n);
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Error With File: " + ex.getMessage());
        } catch (IOException ex) {
            System.out.println("Error With File: " + ex.getMessage());
        }
    }
    
    public static void main(String[] args){
        File file = new File("TestingFiles"+File.separator+"testNmodM.txt");
        getNmodM(file);
    }
}
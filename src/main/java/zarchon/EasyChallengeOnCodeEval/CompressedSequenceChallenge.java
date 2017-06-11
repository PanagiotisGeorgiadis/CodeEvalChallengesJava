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

public class CompressedSequenceChallenge {
    
    public static void compressedSequence(File file){
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line,compressedSequence;
            String[] integers;
            int counter;
            while((line=br.readLine()) != null && !line.trim().isEmpty())
            {
                integers = line.split("\\s");
                counter = 1;
                compressedSequence = "";
                for(int i=0; i < integers.length; i++)
                {
                    if(i+1 < integers.length)
                    {
                        if(Integer.parseInt(integers[i]) == Integer.parseInt(integers[i+1]))
                        {
                            counter++;
                        }
                        else
                        {
                            compressedSequence = compressedSequence + counter + " " + integers[i] + " ";
                            counter = 1;
                        }
                    }
                    else
                    {
                        compressedSequence = compressedSequence + counter + " " + integers[i] + " ";
                    }
                }
                System.out.println(compressedSequence);
            }
            
        } catch (FileNotFoundException ex) {
            System.out.println("Error With File: " + ex.getMessage());
        } catch (IOException ex) {
            System.out.println("Error With File: " + ex.getMessage());
        }
    }
    
    public static void main(String[] args){
        File file = new File("TestingFiles"+File.separator+"testCompressedSequence.txt");
        compressedSequence(file);
    }
    
}

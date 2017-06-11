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

public class SwapElementsChallenge {
       
    public static void swapElements(File file){
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line, sequence, temp;
            String[] splittedLine;
            int[] elements;
            while((line=br.readLine()) != null && !line.trim().isEmpty())
            {
                splittedLine = line.split(":");
                sequence = splittedLine[0] + "";
                line = splittedLine[1] + "";
                line = line.replace(",", "");
                line = line.replace("-", " ");
                splittedLine = line.split("\\s");
                elements = new int[splittedLine.length];
                int j=0;
                for(int i=0; i<splittedLine.length; i++)
                {
                    if(splittedLine[i].matches("\\d+"))
                    {
                        elements[j] = Integer.parseInt(splittedLine[i]);
                        j++;
                    }
                }  
                splittedLine = sequence.split("\\s");
                for(int i=0; i<elements.length-1; i+=2)
                {
                    temp = splittedLine[elements[i]];
                    splittedLine[elements[i]] = splittedLine[elements[i+1]];
                    splittedLine[elements[i+1]] = temp;
                }
                for(int i=0; i<splittedLine.length-1; i++)
                {
                    System.out.print(splittedLine[i] + " ");
                }
                System.out.println(splittedLine[splittedLine.length-1]);
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Error With File: " + ex.getMessage());
        } catch (IOException ex) {
            System.out.println("Error With File: " + ex.getMessage());
        }
    }
    
    public static void main(String[] args){
        File file = new File("TestingFiles"+File.separator+"testSwapElements.txt");
        swapElements(file);
    }
}

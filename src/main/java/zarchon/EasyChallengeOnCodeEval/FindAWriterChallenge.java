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

public class FindAWriterChallenge {
       
    public static void findTheWriter(File file){
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line, writer;
            String[] splittedLine;
            while((line=br.readLine()) != null && !line.trim().isEmpty())
            {
                line = line.replace("|", ";");
                splittedLine = line.split(";");
                line = splittedLine[0];
                splittedLine = splittedLine[1].split("\\s");
                writer = "";
                for(int i=1; i<splittedLine.length; i++)
                {
                    writer = writer + line.charAt(Integer.parseInt(splittedLine[i])-1);
                }
                System.out.println(writer);
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Error With File: " + ex.getMessage());
        } catch (IOException ex) {
            System.out.println("Error With File: " + ex.getMessage());
        }
    }
    
    public static void main(String[] args){
        File file = new File("TestingFiles"+File.separator+"testFindAWriter.txt");
        findTheWriter(file);
    }
}

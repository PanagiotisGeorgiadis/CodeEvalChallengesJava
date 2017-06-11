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

public class UniqueElementsChallenge {
       
    public static void uniqueElements(File file){
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line;
            String[] splittedLine;
            while((line=br.readLine()) != null && !line.trim().isEmpty())
            {
                splittedLine = line.split(",");
                line = "";
                for(int i=0; i<splittedLine.length; i++)
                {
                    if(i+1< splittedLine.length && !splittedLine[i].equals(splittedLine[i+1]))
                    {
                        if(line.equals(""))
                        {
                            line = line + splittedLine[i];
                        }
                        else
                        {
                            line = line + "," + splittedLine[i];
                        }
                    }
                }
                if(!line.contains(splittedLine[splittedLine.length-1]))
                {
                    if(line.equals(""))
                    {
                        line = line + splittedLine[splittedLine.length-1];
                    }
                    else
                    {
                        line = line + "," + splittedLine[splittedLine.length-1];
                    }
                }
                System.out.println(line);
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Error With File: " + ex.getMessage());
        } catch (IOException ex) {
            System.out.println("Error With File: " + ex.getMessage());
        }
    }
    
    public static void main(String[] args){
        File file = new File("TestingFiles"+File.separator+"testUniqueElements.txt");
        uniqueElements(file);
    }
}

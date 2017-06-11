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

public class SetIntersectionChallenge {
       
    public static void setIntersection(File file){
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line;
            String[] firstLine, secondLine;
            while((line=br.readLine()) != null && !line.trim().isEmpty())
            {
                firstLine = line.split(";");
                secondLine = firstLine[1].split(",");
                firstLine = firstLine[0].split(",");
                line = "";                
                for(int i=0; i<firstLine.length; i++)
                {
                    for(int j=0; j<secondLine.length; j++)
                    {
                        if(Integer.parseInt(firstLine[i]) == Integer.parseInt(secondLine[j]))
                        {
                            if(line.equals(""))
                            {
                                line = line + secondLine[j];
                            }
                            else
                            {
                                line = line + "," + secondLine[j];
                            }
                        }
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
        File file = new File("TestingFiles"+File.separator+"testSetIntersection.txt");
        setIntersection(file);
    }
}

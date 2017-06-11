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

public class RacingCharsChallenge {
    
    public static char getDirection(int currentPosition, int nextPosition){
        
        char direction;
        if ((currentPosition - nextPosition) == -1) 
        {
            direction = '\\';
        } 
        else if ((currentPosition - nextPosition) == 1) 
        {
            direction = '/';
        }
        else 
        {
            direction = '|';
        }
        return direction;
    }
    
    public static void racingChars(File file){
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line, firstLine;
            String[] lines = new String[50];
            int currentPosition, nextPosition, counter = 0;
            char direction;
            while((line=br.readLine())!= null && !line.trim().isEmpty())
            {
                lines[counter] = line;
                counter++;
            }
            
            if(lines[0].contains("C"))
                firstLine = lines[0].replace('C','|');
            else
                firstLine = lines[0].replace('_', '|');
            
            for(int i=0; i<lines.length; i++)
            {
                if(lines[i] != null && lines[i+1] != null)
                {
                    currentPosition = lines[i].indexOf('C');
                    if(currentPosition == -1)
                        currentPosition = lines[i].indexOf('_');
                    nextPosition = lines[i+1].indexOf('C');
                    if(nextPosition == -1)
                        nextPosition = lines[i+1].indexOf('_');
                    direction = getDirection(currentPosition, nextPosition);
                    if(lines[i+1].contains("C"))
                    {
                        lines[i] = lines[i+1].replace('C',direction);
                    }
                    else
                    {
                        lines[i] = lines[i+1].replace('_', direction);
                    }
                }
            }
            System.out.println(firstLine);
            for(int i=0;i<lines.length;i++)
            {
                if(i+1 < lines.length-1 && lines[i+1] != null)
                    System.out.println(lines[i]);
            }
            
        } catch (FileNotFoundException ex) {
            System.out.println("Error With File: " + ex.getMessage());
        } catch (IOException ex) {
            System.out.println("Error With File: " + ex.getMessage());
        }
    }
    
    public static void main(String[] args){
        File file = new File("TestingFiles"+File.separator+"testRacingChars.txt");
        racingChars(file);
    }
}

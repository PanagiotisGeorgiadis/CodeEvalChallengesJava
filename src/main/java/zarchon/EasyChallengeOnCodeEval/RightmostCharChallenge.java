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

public class RightmostCharChallenge {
       
    public static void rightmostChar(File file){
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line;
            String[] splittedLine;
            int position;
            while((line=br.readLine()) != null && !line.trim().isEmpty())
            {
                splittedLine = line.split(",");
                position = 0;
//                while(splittedLine[0].indexOf(splittedLine[1],position+1) >=0)
//                {
//                    position = splittedLine[0].indexOf(splittedLine[1],position+1);
//                }
                for(int i=0; i<splittedLine[0].length(); i++)
                {
                    if(splittedLine[0].indexOf(splittedLine[1],position) >= 0)
                    {
                        position = splittedLine[0].indexOf(splittedLine[1], position);
                    }
                    else
                    {
                        break;
                    }
                }
                if(position > 0)
                {
                    System.out.println(position);
                }   
                else
                {
                    System.out.println("-1");
                }
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Error With File: " + ex.getMessage());
        } catch (IOException ex) {
            System.out.println("Error With File: " + ex.getMessage());
        }
    }
    
    public static void main(String[] args){
        File file = new File("TestingFiles"+File.separator+"testRightmostChar.txt");
        rightmostChar(file);
    }
}
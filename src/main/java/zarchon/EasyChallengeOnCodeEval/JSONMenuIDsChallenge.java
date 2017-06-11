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
public class JSONMenuIDsChallenge {
       
    public static void jsonMenuIDs(File file){
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line, jsonMenu = "\"label\": \"Label ", labelID;
            int position, sumOfIDs;
            while((line=br.readLine()) != null && !line.trim().isEmpty())
            {
                position = line.indexOf(jsonMenu);
                sumOfIDs = 0;
                while(position > -1)
                {
                    labelID = "";
                    if(Character.isDigit(line.charAt(position-5)))
                    {
                        labelID = line.substring(position-5, position-2);
                    }
                    else if(Character.isDigit(line.charAt(position-4)))
                    {
                        labelID = line.substring(position-4, position-2);                   
                    }
                    else
                    {
                        labelID = line.charAt(position-3) + "";
                    }
                    sumOfIDs = sumOfIDs + Integer.parseInt(labelID);
                    position = line.indexOf(jsonMenu, position+1);
                }
                System.out.println(sumOfIDs);
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Error With File: " + ex.getMessage());
        } catch (IOException ex) {
            System.out.println("Error With File: " + ex.getMessage());
        }
    }
    
    public static void main(String[] args){
        File file = new File("TestingFiles"+File.separator+"testJSONMenuIDs.txt");
        jsonMenuIDs(file);
    }
}
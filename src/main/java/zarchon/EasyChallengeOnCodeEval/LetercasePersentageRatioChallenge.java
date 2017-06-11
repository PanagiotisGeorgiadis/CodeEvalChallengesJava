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
public class LetercasePersentageRatioChallenge {
    
    public static void letercasePersentageRatioChallenge(File file){
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line;
            while((line = br.readLine()) != null && !line.trim().isEmpty())
            {
                int totalCount = 0;
                float lowercaseCount = 0;
                float uppercaseCount = 0;
                float lowercaseRatio = 0;
                float uppercaseRatio = 0;
                for(int i=0; i<line.length(); i++)
                {
                    if(Character.isUpperCase(line.codePointAt(i)))
                    {
                        uppercaseCount++;
                    }
                    else
                    {
                        lowercaseCount++;
                    }
                    totalCount++;
                }
                lowercaseRatio = (lowercaseCount / totalCount)*100;
                uppercaseRatio = (uppercaseCount / totalCount)*100;
                System.out.printf("lowercase: %.2f uppercase: %.2f \n", lowercaseRatio, uppercaseRatio);
            }
            
        } catch (FileNotFoundException ex) {
            System.out.println("Error With File: " + ex.getMessage());
        } catch (IOException ex) {
            System.out.println("Error With File: " + ex.getMessage());
        }
        
    }
    
    public static void main(String[] args)
    {
        File file = new File("TestingFiles"+File.separator+"testLetercasePersentageRatio.txt");
        letercasePersentageRatioChallenge(file);
    }
    
}

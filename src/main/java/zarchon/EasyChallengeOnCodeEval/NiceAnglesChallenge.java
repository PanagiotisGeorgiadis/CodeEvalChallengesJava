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
public class NiceAnglesChallenge {

    private static void niceAnglesChallenge(File file) 
    {
        try 
        {
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line;
            String endingResult;
            String minsAndSecs = "00'00\"";
            while((line=br.readLine())!= null && !line.trim().isEmpty())
            {
                String[] splittedNumbers = line.split("\\.");
                endingResult = splittedNumbers[0] + ".";
                if(splittedNumbers.length > 1)
                {
                    minsAndSecs = convertDecimalPointOfRadiansToTime(splittedNumbers[1]);
                }
                else
                {
                    System.out.println(endingResult);
                }
                endingResult = endingResult + minsAndSecs;
                System.out.println(endingResult);
            }
        } 
        catch (FileNotFoundException ex) 
        {
            System.out.println("File Read Error: " + ex.getMessage());
        } 
        catch (IOException ex) 
        {
            System.out.println("File Read Error: " + ex.getMessage());
        }
        
    }
    
    public static String convertDecimalPointOfRadiansToTime(String decimals)
    {      
        String minsAndSecsConverted;
        String floatCreation = "0." + decimals;
        float decimalNumber = Float.valueOf(floatCreation) * 60;
        int actualMins = (int) decimalNumber;
        
        if (actualMins > 9)
            minsAndSecsConverted = actualMins + "'";
        else 
            minsAndSecsConverted = "0" + actualMins + "'";
        
        String[] mins = String.valueOf(decimalNumber).split("\\.");
        if (mins.length > 1) 
        {
            floatCreation = "0." + mins[1];
            decimalNumber = Float.valueOf(floatCreation) * 60;
            int actualSecs = (int) decimalNumber;
            
            if (actualSecs > 9) 
                minsAndSecsConverted = minsAndSecsConverted + actualSecs + "\"";
            else 
                minsAndSecsConverted = minsAndSecsConverted + "0" + actualSecs + "\"";    
        } 
        else 
        {
            minsAndSecsConverted = minsAndSecsConverted + "'00\"";
        }
        return minsAndSecsConverted;
    }
    
    public static void main(String[] args)
    {
        File file = new File("TestingFiles"+File.separator+"testNiceAngles.txt");
        niceAnglesChallenge(file);
    }
    
}

    //-**-- --*-- ***-- ***-- -*--- ****- -**-- ****- -**-- -**--
    //*--*- -**-- ---*- ---*- *--*- *---- *---- ---*- *--*- *--*-
    //*--*- --*-- -**-- -**-- ****- ***-- ***-- --*-- -**-- -***-
    //*--*- --*-- *---- ---*- ---*- ---*- *--*- -*--- *--*- ---*-
    //-**-- -***- ****- ***-- ---*- ***-- -**-- -*--- -**-- -**--
    //----- ----- ----- ----- ----- ----- ----- ----- ----- -----  
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

public class BigDigitsChallenge {
      
      public static String[] firstLine = new String[10], secondLine = new String[10],
                thirdLine = new String[10], fourthLine = new String[10],
                fifthLine = new String[10], sixthLine = new String[10];
      
      public static void BigDigitsChallenge(){  
        firstLine[0] =  "-**--";
        secondLine[0] = "*--*-";
        thirdLine[0] =  "*--*-";
        fourthLine[0] = "*--*-";
        fifthLine[0] =  "-**--";
        sixthLine[0] =  "-----";
        
        firstLine[1] =  "--*--";
        secondLine[1] = "-**--";
        thirdLine[1] =  "--*--";
        fourthLine[1] = "--*--";
        fifthLine[1] =  "-***-";
        sixthLine[1] =  "-----";
        
        firstLine[2] =  "***--";
        secondLine[2] = "---*-";
        thirdLine[2] =  "-**--";
        fourthLine[2] = "*----";
        fifthLine[2] =  "****-";
        sixthLine[2] =  "-----";
        
        firstLine[3] =  "***--";
        secondLine[3] = "---*-";
        thirdLine[3] =  "-**--";
        fourthLine[3] = "---*-";
        fifthLine[3] =  "***--";
        sixthLine[3] =  "-----";
        
        firstLine[4] =  "-*---";
        secondLine[4] = "*--*-";
        thirdLine[4] =  "****-";
        fourthLine[4] = "---*-";
        fifthLine[4] =  "---*-";
        sixthLine[4] =  "-----";
        
        firstLine[5] =  "****-";
        secondLine[5] = "*----";
        thirdLine[5] =  "***--";
        fourthLine[5] = "---*-";
        fifthLine[5] =  "***--";
        sixthLine[5] =  "-----";

        firstLine[6] =  "-**--";
        secondLine[6] = "*----";
        thirdLine[6] =  "***--";
        fourthLine[6] = "*--*-";
        fifthLine[6] =  "-**--";
        sixthLine[6] =  "-----";
        
        firstLine[7] =  "****-";
        secondLine[7] = "---*-";
        thirdLine[7] =  "--*--";
        fourthLine[7] = "-*---";
        fifthLine[7] =  "-*---";
        sixthLine[7] =  "-----";
        
        firstLine[8] =  "-**--";
        secondLine[8] = "*--*-";
        thirdLine[8] =  "-**--";
        fourthLine[8] = "*--*-";
        fifthLine[8] =  "-**--";
        sixthLine[8] =  "-----";
        
        firstLine[9] =  "-**--";
        secondLine[9] = "*--*-";
        thirdLine[9] =  "-***-";
        fourthLine[9] = "---*-";
        fifthLine[9] =  "-**--";
        sixthLine[9] =  "-----";       
    }
    
    public static void bigDigits(File file){
        BigDigitsChallenge();
        try { 
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line, digits;
            String[] finalLines;
            int[] digitsArray;
            while((line=br.readLine()) != null && !line.trim().isEmpty())
            {
                digits = "";
                for(int i=0; i<line.length(); i++)
                {
                    if(Character.isDigit(line.charAt(i)))
                    {
                        digits = digits + line.charAt(i) + " ";
                    }
                }
                finalLines = digits.split("\\s");
                digitsArray = new int[finalLines.length];
                for(int i=0; i<finalLines.length; i++)
                {
                    digitsArray[i] = Integer.parseInt(finalLines[i]);
                }
                finalLines = new String[6];
                for(int i=0; i<finalLines.length; i++)
                {
                    finalLines[i] = "";
                }
                for(int i=0; i<digitsArray.length; i++)
                {
                    finalLines[0] = finalLines[0] + firstLine[digitsArray[i]];
                    finalLines[1] = finalLines[1] + secondLine[digitsArray[i]];
                    finalLines[2] = finalLines[2] + thirdLine[digitsArray[i]];
                    finalLines[3] = finalLines[3] + fourthLine[digitsArray[i]];
                    finalLines[4] = finalLines[4] + fifthLine[digitsArray[i]];
                    finalLines[5] = finalLines[5] + sixthLine[digitsArray[i]];
                }
                for(int i=0; i<finalLines.length; i++)
                {
                    System.out.println(finalLines[i]);
                }
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Error Reading File " + ex.getMessage());
        } catch (IOException ex) {
            System.out.println("Error Reading File " + ex.getMessage());
        }
    }
    
    public static void main(String[] args){
        File file = new File("TestingFiles"+File.separator+"testBigDigits.txt");
        bigDigits(file);
    }
}

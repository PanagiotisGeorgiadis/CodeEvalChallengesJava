/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

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
public class RollerCoasterChallenge {
    
    public static void rollerCoasterChallenge(File file)
    {
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            String originalLine;
            String finalLine = "";
            char[] charactersOfOriginalLine;
            String tempChar;
            String stateOfRollerCoaster = "caps";
            while((originalLine=br.readLine()) != null && !originalLine.trim().isEmpty())
            {
                charactersOfOriginalLine = originalLine.toCharArray();
                for(int i=0;i<charactersOfOriginalLine.length;i++)
                {
                    tempChar = originalLine.charAt(i) + "";
                    if(tempChar.matches("[a-zA-Z]"))
                    {
                        if(stateOfRollerCoaster.equalsIgnoreCase("caps"))
                        {
                            finalLine = finalLine + tempChar.toUpperCase();
                            stateOfRollerCoaster = "lowercase";
                        }
                        else
                        {
                            finalLine = finalLine + tempChar.toLowerCase();
                            stateOfRollerCoaster = "caps";
                        }
                    }
                    else
                    {
                        finalLine = finalLine + tempChar;
                    }
                }
                System.out.println(finalLine);
                finalLine = "";
                stateOfRollerCoaster = "caps";
            }
            
        } catch (FileNotFoundException ex) {
            System.out.println("File Read Error: " + ex.getMessage());
        } catch (IOException ex) {
            System.out.println("File Read Error: " + ex.getMessage());
        }
    }
    
    public static void main(String[] args)
    {
        File file = new File("TestingFiles"+File.separator+"testRollerCoaster.txt");
        rollerCoasterChallenge(file);
    }
    
}

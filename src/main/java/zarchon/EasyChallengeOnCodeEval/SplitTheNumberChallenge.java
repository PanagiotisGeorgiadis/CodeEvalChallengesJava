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
public class SplitTheNumberChallenge {
    //leei partialy na to testarw monos mou 
    public static void resultOfLine(File file) {
        if (file.exists() && !file.isDirectory()) 
        {
            try {
                FileReader fr = new FileReader(file);
                BufferedReader br = new BufferedReader(fr);
                String line;
                while ((line = br.readLine()) != null && !line.trim().equals("")) 
                {
                    String[] splittedLine = line.split("\\s");
                    String[] operand = splittedLine[1].split("[a-z]");
                    String[] pattern = splittedLine[1].split("[^a-z]");
                    String[] numbers = new String[pattern.length];
                    long result = 0;
                    for (int j = 0; j < pattern.length; j++) 
                    {
                        if (j == 0) 
                        {
                            numbers[j] = splittedLine[0].substring(j, pattern[j].length());
                        } 
                        else 
                        {
                            numbers[j] = splittedLine[0].substring(pattern[j - 1].length());
                        }
                    }
                    result = Long.parseLong(numbers[0]);
                    if ("+".equals(operand[1])) 
                    {
                        result = result + Long.parseLong(numbers[1]);
                    } 
                    else if ("-".equals(operand[1])) 
                    {
                        result = result - Long.parseLong(numbers[1]);
                    }
                    System.out.println(result);
                }
            } catch (FileNotFoundException ex) {
                System.out.println(ex);
            } catch (IOException ex) {
                System.out.println(ex);
            }
        } 
        else 
        {
            System.out.println("Please Point To An Existant File!");
        }
    }
    
    public static void main(String[] args){
        //File file = new File(args[0]);
        File file = new File("TestingFiles"+File.separator+"test2.txt");
        resultOfLine(file);
    }
    
}

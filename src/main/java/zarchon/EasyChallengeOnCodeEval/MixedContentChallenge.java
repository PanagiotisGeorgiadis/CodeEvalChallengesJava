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

public class MixedContentChallenge {
    
        public static void mixedContent(File file){
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line;
            String[] splittedLine,words,numbers;
            int wordsCounter, numbersCounter, i;
            while((line=br.readLine()) != null && !line.trim().isEmpty())
            {
                splittedLine = line.split(",");
                words = new String[splittedLine.length];
                numbers = new String[splittedLine.length];
                wordsCounter = 0;
                numbersCounter = 0;
                for(i=0; i<splittedLine.length; i++)
                {
                    if(splittedLine[i].matches("[a-zA-Z]+"))
                    {
                        words[wordsCounter] = splittedLine[i];
                        wordsCounter++;
                    }
                    else
                    {
                        numbers[numbersCounter] = splittedLine[i];
                        numbersCounter++;
                    }
                }
                i = 0;
                if(words[i] != null)
                {
                    while(i<wordsCounter-1)
                    {
                        System.out.print(words[i] + ",");
                        i++;
                    }
                    if(numbers[0] != null)
                    {
                        System.out.print(words[i] + "|");
                    }
                    else
                    {
                        System.out.println(words[i]);
                    }
                }
                i = 0;
                if(numbers[i] != null)
                {
                    while(i<numbersCounter-1)
                    {
                        System.out.print(numbers[i] + ",");
                        i++;
                    }
                    System.out.println(numbers[i]);
                }
//                for(int i=0; i<splittedLine.length; i++)
//                {
//                    if(i+1 < splittedLine.length)
//                    {
//                        while(splittedLine[i].matches("\\w"))
//                        {
//                            if(splittedLine[i+1].matches("\\w"))
//                            {
//                                System.out.print(splittedLine[i] + ",");
//                            }
//                            else
//                            {
//                                System.out.print(splittedLine[i] + );
//                            }
//                        }
//                    }
//                    
//                    if(splittedLine[i].matches("\\w"))
//                    {
//                        System.out.print(splittedLine[i] + ",");
//                    }
//                }
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Error With File: " + ex.getMessage());
        } catch (IOException ex) {
            System.out.println("Error With File: " + ex.getMessage());
        }
    }
    
    public static void main(String[] args){
        File file = new File("TestingFiles"+File.separator+"testMixedContent.txt");
        mixedContent(file);        
    }
    
}

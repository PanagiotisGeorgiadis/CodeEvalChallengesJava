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
public class DataRecoveryChallenge {
    
//    public static void dataRecoveryChallenge(File file){
//        try {
//            BufferedReader br = new BufferedReader(new FileReader(file));
//            String line, tempWord;
//            String[] splittedLine, words, numbers;
//            char[] numbersArray;
//            while((line=br.readLine()) != null && !line.trim().isEmpty())
//            {
//                splittedLine = line.split(";");
//                words = splittedLine[0].split("\\s");
//                numbers = splittedLine[1].split("\\s");
//                for(int i=0; i < numbers.length; i++)
//                {
//                    //if(numbers[i] != numbers[Integer.valueOf(numbers[i])-1])
//                    //{
//                        tempWord = words[Integer.valueOf(numbers[i]) -1];
//                        words[Integer.valueOf(numbers[i]) -1] = words[i];
//                        words[i] = tempWord;
//                    //}
//                    //tempWord = words[i];                    
//                }
//                System.out.println(Integer.valueOf(numbers[0]));
//                System.out.println(splittedLine[0]);
//                System.out.println(splittedLine[1]);
//                for(int i=0; i<words.length; i++)
//                    System.out.print(words[i] + " ");
//                System.out.println();
//            }
//        } catch (FileNotFoundException ex) {
//            System.out.println("Error With File: " + ex.getMessage());
//        } catch (IOException ex) {
//            System.out.println("Error With File: " + ex.getMessage());
//        }
//        
//    }
    
    public static void dataRecoveryChallenge(File file){
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line;
            int missingNumber = 0;
            String[] splittedLine, words, numbers, newWords;
            while((line=br.readLine()) != null && !line.trim().isEmpty())
            {
                splittedLine = line.split(";");
                words = splittedLine[0].split("\\s");
                numbers = splittedLine[1].split("\\s");
                newWords = new String[words.length];
                for(int i=1; i <= words.length; i++)
                {
                    int j=0;
                    while(Integer.valueOf(numbers[j]) != i)
                    {
                        j++;
                        if(j == numbers.length)
                        {
                            missingNumber = i;
                            break;
                        }
                    }
                }
                for(int i=0; i<numbers.length; i++)
                {
                    newWords[Integer.valueOf(numbers[i])-1] = words[i];
                }
                newWords[missingNumber-1] = words[words.length-1];
                for(int i=0; i<newWords.length; i++)
                {
                    System.out.print(newWords[i] + " ");
                }
                System.out.println();
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Error With File: " + ex.getMessage());
        } catch (IOException ex) {
            System.out.println("Error With File: " + ex.getMessage());
        }
    }
    
    public static void main(String[] args){
        File file = new File("TestingFiles"+File.separator+"testDataRecovery.txt");
        dataRecoveryChallenge(file);
    }
}

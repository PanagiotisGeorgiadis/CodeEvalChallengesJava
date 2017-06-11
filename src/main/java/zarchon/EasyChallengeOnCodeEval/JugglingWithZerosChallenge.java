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
public class JugglingWithZerosChallenge {
    
    public static long convertBinaryToInt(String binarySequence)
    {
        char binaryChar;
        long finalInteger = 0;
        long exponentialOfTwo = 0;
        for(int i=0; i < binarySequence.length(); i++)
        {
            binaryChar = binarySequence.charAt(binarySequence.length()-1-i);
            exponentialOfTwo = (long)Math.pow(2, i);
            finalInteger = finalInteger + (Character.getNumericValue(binaryChar) * exponentialOfTwo);
        }
        return finalInteger;
    }
        
    public static void jugglingWithZeros(File file)
    {
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line;
            char[] elementsToAppend;
            while((line=br.readLine()) != null && !line.trim().isEmpty())
            {
                String[] lineElements = line.split("\\s");
                String binaryResult = "";
                for(int i=0;i<lineElements.length;i++)
                {
                    if(lineElements[i].equals("0"))
                    {
                        i++;
                        elementsToAppend = lineElements[i].toCharArray();
                        for(int j=0;j<elementsToAppend.length;j++)
                        {
                            binaryResult = binaryResult + "0";
                        }
                    }
                    else
                    {
                        i++;
                        elementsToAppend = lineElements[i].toCharArray();
                        for(int j=0;j<elementsToAppend.length;j++)
                        {
                            binaryResult = binaryResult + "1";
                        }
                    }
                }
                System.out.println(convertBinaryToInt(binaryResult));
            }
            
            
        } catch (FileNotFoundException ex) {
            System.out.println("Error With File: " + ex.getMessage());
        } catch(IOException ex) {
            System.out.println("Error With File: " + ex.getMessage());
        }
        
    }
    //2os tropos me reversedSequence 
//    public static void jugglingWithZeros2(File file)
//    {
//        try {
//            BufferedReader br = new BufferedReader(new FileReader(file));
//            String line;
//            char[] elementsToAppend;
//            while((line=br.readLine()) != null && !line.trim().isEmpty())
//            {
//                String[] lineElements = line.split("\\s");
//                String binaryResult = "";
//                String reversedSequence= "";
//                long finalInteger = 0;
//                for(int i=0;i<lineElements.length;i++)
//                {
//                    if(lineElements[i].equals("0"))
//                    {
//                        i++;
//                        elementsToAppend = lineElements[i].toCharArray();
//                        for(int j=0;j<elementsToAppend.length;j++)
//                        {
//                            binaryResult = binaryResult + "0";
//                        }
//                    }
//                    else
//                    {
//                        i++;
//                        elementsToAppend = lineElements[i].toCharArray();
//                        for(int j=0;j<elementsToAppend.length;j++)
//                        {
//                            binaryResult = binaryResult + "1";
//                        }
//                    }
//                }
//                
//                for(int i=0;i<binaryResult.length();i++)
//                {
//                    reversedSequence = reversedSequence + binaryResult.charAt(binaryResult.length()-1-i);
//                }
//                
//                for(int i=0;i<binaryResult.length();i++)
//                {
//                    if(Character.getNumericValue(reversedSequence.charAt(i)) == 1)
//                    {
//                        finalInteger = finalInteger + (long)Math.pow(2,i);
//                    }
//                }
//                System.out.println(finalInteger);
//            }
//            
//            
//        } catch (FileNotFoundException ex) {
//            System.out.println("Error With File: " + ex.getMessage());
//        } catch(IOException ex) {
//            System.out.println("Error With File: " + ex.getMessage());
//        }
//    }
    
    public static void main(String[] args)
    {
        File file = new File("TestingFiles"+File.separator+"testJugglingWithZeros.txt");
        jugglingWithZeros(file);
    }
    
}

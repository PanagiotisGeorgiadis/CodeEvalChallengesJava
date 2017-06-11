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

public class MorseCodeChallenge {
    
    public static char getMorseChar(String morseSequence){
        
        if (morseSequence.equals(".-")) {
            return 'A';
        } else if (morseSequence.equals("-...")) {
            return 'B';
        } else if (morseSequence.equals("-.-.")) {
            return 'C';
        } else if (morseSequence.equals("-..")) {
            return 'D';
        } else if (morseSequence.equals(".")) {
            return 'E';
        } else if (morseSequence.equals("..-.")) {
            return 'F';
        } else if (morseSequence.equals("--.")) {
            return 'G';
        } else if (morseSequence.equals("....")) {
            return 'H';
        } else if (morseSequence.equals("..")) {
            return 'I';
        } else if (morseSequence.equals(".---")) {
            return 'J';
        } else if (morseSequence.equals("-.-")) {
            return 'K';
        } else if (morseSequence.equals(".-..")) {
            return 'L';
        } else if (morseSequence.equals("--")) {
            return 'M';
        } else if (morseSequence.equals("-.")) {
            return 'N';
        } else if (morseSequence.equals("---")) {
            return 'O';
        } else if (morseSequence.equals(".--.")) {
            return 'P';
        } else if (morseSequence.equals("--.-")) {
            return 'Q';
        } else if (morseSequence.equals(".-.")) {
            return 'R';
        } else if (morseSequence.equals("...")) {
            return 'S';
        } else if (morseSequence.equals("-")) {
            return 'T';
        } else if (morseSequence.equals("..-")) {
            return 'U';
        } else if (morseSequence.equals("...-")) {
            return 'V';
        } else if (morseSequence.equals(".--")) {
            return 'W';
        } else if (morseSequence.equals("-..-")) {
            return 'X';
        } else if (morseSequence.equals("-.--")) {
            return 'Y';
        } else if (morseSequence.equals("--..")) {
            return 'Z';
        } else if (morseSequence.equals(".----")) {
            return '1';
        } else if (morseSequence.equals("..---")) {
            return '2';
        } else if (morseSequence.equals("...--")) {
            return '3';
        } else if (morseSequence.equals("....-")) {
            return '4';
        } else if (morseSequence.equals(".....")) {
            return '5';
        } else if (morseSequence.equals("-....")) {
            return '6';
        } else if (morseSequence.equals("--...")) {
            return '7';
        } else if (morseSequence.equals("---..")) {
            return '8';
        } else if (morseSequence.equals("----.")) {
            return '9';
        } else if (morseSequence.equals("-----")) {
            return '0';
        } else {      
            return ' ';
        }
    } 
    
    public static void decodeMorseCode(File file){
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line, decodedLine, sequence;
            while((line=br.readLine()) != null && !line.trim().isEmpty())
            {
                decodedLine = "";
                sequence = "";
                for(int i=0; i<line.length(); i++)
                {
                    if(Character.isSpaceChar(line.charAt(i)))
                    {
                        decodedLine = decodedLine + getMorseChar(sequence);
                        if(Character.isSpaceChar(line.charAt(i+1)))
                        {
                            decodedLine = decodedLine + " ";
                            i++;
                        }
                        sequence = "";
                    }
                    else
                    {
                        sequence = sequence + line.charAt(i);
                    }
                    if(i==line.length()-1)
                    {
                        decodedLine = decodedLine + getMorseChar(sequence);
                    }
                }
                System.out.println(decodedLine);
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Error With File: " + ex.getMessage());
        } catch (IOException ex) {
            System.out.println("Error With File: " + ex.getMessage());
        }        
    }
    
    public static void main(String args[]){
        File file = new File("TestingFiles"+File.separator+"testMorseCode.txt");
        decodeMorseCode(file);
    }    
}

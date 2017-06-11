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

public class BeautifulStringsChallenge {
    
    public static int[] getLetterCount(String line){

        int[] letterCount = new int[26];
        
        for (int counter = 0; counter < line.length(); counter++)
        {
            if (Character.toLowerCase(line.charAt(counter)) == 'a') {
                letterCount[0]++;
            } else if (Character.toLowerCase(line.charAt(counter)) == 'b') {
                letterCount[1]++;
            } else if (Character.toLowerCase(line.charAt(counter)) == 'c') {
                letterCount[2]++;
            } else if (Character.toLowerCase(line.charAt(counter)) == 'd') {
                letterCount[3]++;
            } else if (Character.toLowerCase(line.charAt(counter)) == 'e') {
                letterCount[4]++;
            } else if (Character.toLowerCase(line.charAt(counter)) == 'f') {
                letterCount[5]++;
            } else if (Character.toLowerCase(line.charAt(counter)) == 'g') {
                letterCount[6]++;
            } else if (Character.toLowerCase(line.charAt(counter)) == 'h') {
                letterCount[7]++;
            } else if (Character.toLowerCase(line.charAt(counter)) == 'i') {
                letterCount[8]++;
            } else if (Character.toLowerCase(line.charAt(counter)) == 'j') {
                letterCount[9]++;
            } else if (Character.toLowerCase(line.charAt(counter)) == 'k') {
                letterCount[10]++;
            } else if (Character.toLowerCase(line.charAt(counter)) == 'l') {
                letterCount[11]++;
            } else if (Character.toLowerCase(line.charAt(counter)) == 'm') {
                letterCount[12]++;
            } else if (Character.toLowerCase(line.charAt(counter)) == 'n') {
                letterCount[13]++;
            } else if (Character.toLowerCase(line.charAt(counter)) == 'o') {
                letterCount[14]++;
            } else if (Character.toLowerCase(line.charAt(counter)) == 'p') {
                letterCount[15]++;
            } else if (Character.toLowerCase(line.charAt(counter)) == 'q') {
                letterCount[16]++;
            } else if (Character.toLowerCase(line.charAt(counter)) == 'r') {
                letterCount[17]++;
            } else if (Character.toLowerCase(line.charAt(counter)) == 's') {
                letterCount[18]++;
            } else if (Character.toLowerCase(line.charAt(counter)) == 't') {
                letterCount[19]++;
            } else if (Character.toLowerCase(line.charAt(counter)) == 'u') {
                letterCount[20]++;
            } else if (Character.toLowerCase(line.charAt(counter)) == 'v') {
                letterCount[21]++;
            } else if (Character.toLowerCase(line.charAt(counter)) == 'w') {
                letterCount[22]++;
            } else if (Character.toLowerCase(line.charAt(counter)) == 'x') {
                letterCount[23]++;
            } else if (Character.toLowerCase(line.charAt(counter)) == 'y') {
                letterCount[24]++;
            } else if (Character.toLowerCase(line.charAt(counter)) == 'z') {
                letterCount[25]++;
            }
        }
        return letterCount;
    }
           
    public static void beautifulStrings(File file){
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line;
            int sum, max, beauty;
            int[] letterCount;
            while((line=br.readLine()) != null && !line.trim().isEmpty())
            {
                letterCount = getLetterCount(line);
                max = 0;
                sum = 0;
                beauty = 26;
                for(int i=0; i<letterCount.length; i++)
                {
                    if(letterCount[i] > max)
                    {
                        max = letterCount[i];
                    }
                }
                while(max > 0)
                {
                    for(int i=0; i<letterCount.length; i++)
                    {
                        if(letterCount[i] == max)
                        {
                            sum = sum + (max*beauty);
                            beauty--;
                        }
                    }
                    max--;
                }
                System.out.println(sum);                
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Error With File: " + ex.getMessage());
        } catch (IOException ex) {
            System.out.println("Error With File: " + ex.getMessage());
        }
    }
    
    public static void main(String[] args){
        File file = new File("TestingFiles"+File.separator+"testBeautifulStrings.txt");
        beautifulStrings(file);
    }
}

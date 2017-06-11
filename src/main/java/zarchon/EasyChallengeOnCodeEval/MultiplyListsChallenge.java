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

public class MultiplyListsChallenge {
        
    public static void multiplyLists(File file){
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line;
            String[] splittedLine;
            int[] leftSide, rightSide;
            while((line=br.readLine()) != null && !line.trim().isEmpty())
            {
                splittedLine = line.split("\\s");
                //1os tropos lyshs
//                leftSide = new int[splittedLine.length/2];
//                rightSide = new int[splittedLine.length/2];
//                for(int i=0; i<splittedLine.length/2; i++)
//                {
//                    leftSide[i] = Integer.parseInt(splittedLine[i]);
//                    System.out.print(leftSide[i] + "...");
//                }                
//                int j = 0;
//                System.out.println();
//                for(int i=splittedLine.length/2+1; i<splittedLine.length; i++)
//                {
//                    rightSide[j] = Integer.parseInt(splittedLine[i]);
//                    System.out.print(rightSide[j] + "...");
//                    j++;
//                }
//                System.out.println("Apotelesmata: ");
//                for(int i=0;i<leftSide.length;i++)
//                {
//                    System.out.print((leftSide[i]*rightSide[i]) + " ");
//                }
//                System.out.println(line);
                int j = splittedLine.length/2+1;
                for(int i=0; i<splittedLine.length/2; i++)
                {
                     System.out.print(Integer.parseInt(splittedLine[i])*Integer.parseInt(splittedLine[j]) + " ");
                     j++;
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
        File file = new File("TestingFiles"+File.separator+"testMultiplyLists.txt");
        multiplyLists(file);
    }
}

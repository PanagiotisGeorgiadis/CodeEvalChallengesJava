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
public class CalculateDistanceChallenge {
       
    public static void calculateDistance(File file){
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line;
            String[] splittedLine;
            //double distance;
            //int x1,x2,y1,y2, distance;
            int distance;
            while((line=br.readLine()) != null && !line.trim().isEmpty())
            {
                line = line.replace("(", "");
                line = line.replace(")", "");
                line = line.replace(",", "");
                splittedLine = line.split("\\s");
               // x1 = Integer.parseInt(splittedLine[0]);
               // x2 = Integer.parseInt(splittedLine[1]);
               // y1 = Integer.parseInt(splittedLine[2]);
               // y2 = Integer.parseInt(splittedLine[3]);
                distance = (int) Math.sqrt(Math.pow(Integer.parseInt(splittedLine[2])-Integer.parseInt(splittedLine[0]),2) 
                        + Math.pow(Integer.parseInt(splittedLine[3])-Integer.parseInt(splittedLine[1]),2));
                System.out.println(distance);
                
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Error With File: " + ex.getMessage());
        } catch (IOException ex) {
            System.out.println("Error With File: " + ex.getMessage());
        }
    }
    
    public static void main(String[] args){
        File file = new File("TestingFiles"+File.separator+"testCalculateDistance.txt");
        calculateDistance(file);
    }
}
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
public class MaxRangeSumChallenge {
           
    public static void maxRangeSumChallenge(File file){
        try {
            
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line;
            String[] splittedLine;
            int days, sum, max;
            int[] gainOrLoss;
            while((line=br.readLine()) != null){
                splittedLine = line.split(";");
                days = Integer.parseInt(splittedLine[0]);
                splittedLine = splittedLine[1].split("\\s");
                gainOrLoss = new int[splittedLine.length];
                for(int i=0; i<splittedLine.length; i++){
                    gainOrLoss[i] = Integer.parseInt(splittedLine[i]);
                }
                max = 0;
                sum = 0;
                for(int i=0; i<=gainOrLoss.length-days; i++){
                    for(int j=0; j<days; j++){
                        sum = sum + gainOrLoss[i + j];
                    }
                    if(max < sum){
                        max = sum;
                    }
                    sum = 0;
                }
                if(max <= 0){
                    System.out.println(0);
                }else{
                    System.out.println(max);
                }                
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Error With File: " + ex.getMessage());
        } catch (IOException ex) {
            System.out.println("Error With File: " + ex.getMessage());
        }
    }
    
    public static void main(String[] args){
        maxRangeSumChallenge(new File("TestingFiles"+File.separator+"testMaxRangeSum.txt"));
    }
}

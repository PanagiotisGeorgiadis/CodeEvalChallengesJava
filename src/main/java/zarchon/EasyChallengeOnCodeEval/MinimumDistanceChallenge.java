package zarchon.EasyChallengeOnCodeEval;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

/**
 *
 * @author Zarc
 */
public class MinimumDistanceChallenge {
    
 public static void minimumDistance(File file){
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line;
            String[] words;
            int[] addresses;
            int optimal = 0, friends = 0,distance;
            while((line = br.readLine()) != null){
                words = line.split("\\s");
                addresses = new int[words.length];
                distance = 0;
                for(int i=1; i<words.length; i++){
                    addresses[i-1] = Integer.parseInt(words[i]);
                }
                friends = Integer.parseInt(words[0]);
                Arrays.sort(addresses);
                if( (friends%2) == 0){
                    optimal = addresses[friends/2];
                }else{
                    optimal = addresses[(friends/2) + 1];
                }
                for(int i=1; i<addresses.length; i++){
                    if(optimal > addresses[i]){
                        distance = distance + (optimal - addresses[i]);
                    }else{
                        distance = distance + (addresses[i] - optimal);
                    }
                }
                System.out.println(distance);
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Error With File: " + ex.getMessage());
        } catch (IOException ex) {
            System.out.println("Error With File: " + ex.getMessage());
        }
    }
      //Solution #2
//    public static void minimumDistance(File file){
//        try {
//            BufferedReader br = new BufferedReader(new FileReader(file));
//            String line;
//            String[] words;
//            int[] addresses;
//            int min = 0,distance,optimal = 0,positionInOrder = 0;
//            while((line = br.readLine()) != null){
//                words = line.split("\\s");
//                addresses = new int[words.length];
//                for(int i=1; i<words.length; i++){
//                    addresses[i-1] = Integer.parseInt(words[i]);
//                }
//                Arrays.sort(addresses);
//                min = 1000000;
//                for(int i=0; i<=addresses[addresses.length-1]; i++){
//                    distance = 0;
//                    for(int j=1; j<addresses.length; j++){
//                        if(i>addresses[j]){
//                            distance = distance + (i-addresses[j]);
//                        }else{
//                            distance = distance + (addresses[j]-i);
//                        }
//                    }
//                    if(distance < min){
//                        min = distance;
//                        optimal = i;
//                    }
//                }
//                for(int i=0; i<addresses.length; i++){
//                    if(optimal == addresses[i]){
//                        positionInOrder = i;
//                    }
//                }
//                System.out.println("Minimum distance is " + min + " and optimal address is " + optimal +
//                        " AND OPTIMAL POSITION IS " + positionInOrder+"/" + words[0]);
//            }
//        } catch (FileNotFoundException ex) {
//            System.out.println("Error With File: " + ex.getMessage());
//        } catch (IOException ex) {
//            System.out.println("Error With File: " + ex.getMessage());
//        }
//    }
    
    public static void main(String[] args){
        File file = new File("TestingFiles"+File.separator+"testMinimumDistance.txt");
        minimumDistance(file);
    }
    
}

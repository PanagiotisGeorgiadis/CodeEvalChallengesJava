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

public class RoadTripChallenge {
    
    //2nd way of sorting the route with Quicksort But as it seems it takes much more memory
//    public static int[] quicksortDistances(int left, int right, int[] routeToFollow){
//        int i, j, mid, x, temp;
//        if (left < right)
//        {
//            i = left;
//            j = right;
//            mid = (left+right)/2;
//            x = routeToFollow[mid];
//            while (i < j)
//            {
//                while (routeToFollow[i] < x)
//                {
//                    i++;
//                }
//                while (routeToFollow[j] > x)
//                {
//                    j--;
//                }
//                if (i < j)
//                {
//                    if (routeToFollow[i] == routeToFollow[j])
//                    {
//                        if (i<mid)
//                        {
//                            i++;
//                        }
//                        if (j>mid)
//                        {
//                            j--;
//                        }
//                    }
//                    else
//                    {
//                        temp = routeToFollow[i];
//                        routeToFollow[i] = routeToFollow[j];
//                        routeToFollow[j] = temp;
//                    }
//                }
//            }
//            quicksortDistances(left,j-1,routeToFollow);
//            quicksortDistances(j+1,right,routeToFollow);
//        }        
//        return routeToFollow;
//    }
    
    public static int[] sortDistances(int[] routeToFollow){
        int temp;
        for(int i = 1; i<routeToFollow.length; i++)
        {
            for(int j=routeToFollow.length-1; j>=i; j--)
            {
                if(routeToFollow[j-1] > routeToFollow[j])
                {
                    temp = routeToFollow[j-1];
                    routeToFollow[j-1] = routeToFollow[j] ;
                    routeToFollow[j] = temp ;
                }
            }
        }
        return routeToFollow;
    }

    public static void roadTrip(File file){
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line;
            String[] splittedLine;
            int[] distances;
            while((line = br.readLine()) != null && !line.trim().isEmpty())
            {
                line = line.replace(" ", "");
                line = line.replace(";"," ");
                line = line.replace(","," ");
                splittedLine = line.split("\\s");
                distances = new int[splittedLine.length/2];
                int j=0;
                for(int i=1; i<splittedLine.length; i+=2)
                {
                    distances[j] = Integer.parseInt(splittedLine[i]);
                    j++;
                }
                distances = sortDistances(distances);
                //distances = quicksortDistances(0,distances.length-1,distances);
                System.out.print(distances[0] + ",");
                for(int i=1; i<distances.length-1; i++)
                {
                    System.out.print(distances[i]-distances[i-1] + ",");
                }
                System.out.println(distances[distances.length-1]-distances[distances.length-2]);
            }
            
        } catch (FileNotFoundException ex) {
            System.out.println("Error With File: " + ex.getMessage());
        } catch (IOException ex) {
            System.out.println("Error With File: " + ex.getMessage());
        }
    }    
    
    public static void main(String[] args){
        File file = new File("TestingFiles"+File.separator+"testRoadTripChallenge.txt");
        roadTrip(file);
    }
    
}

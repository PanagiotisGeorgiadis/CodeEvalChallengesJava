package zarchon.EasyChallengeOnCodeEval;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author Zarc
 *
 */

public class MajorElementChallenge {

    public static void majorElementChallenge(File file) {

        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line;
            while ((line = br.readLine()) != null) 
            {
                int oldTotal = 0, newTotal = 0, numberThatIsRepeatedMost = 0;
                String[] splittedLine = line.split(",");
                int[] numbersArray = new int[splittedLine.length];
                for(int i=0; i<numbersArray.length; i++)
                {
                    numbersArray[i] = Integer.parseInt(splittedLine[i]);
                }
                for (int N=0; N <= 100; N++) 
                {
                    for (int i = 0; i < numbersArray.length; i++) 
                    {
                        if(N == numbersArray[i])
                        {
                            newTotal++;                                
                        }
                    }
                    if(newTotal > oldTotal)
                    {
                        oldTotal = newTotal;
                        numberThatIsRepeatedMost = N;
                    }
                    newTotal = 0;
                }
                if (oldTotal > (numbersArray.length/2)) 
                {
                    System.out.println(numberThatIsRepeatedMost);
                } 
                else 
                {
                    System.out.println("None");
                }
            }
        } catch (IOException ex) {
            System.out.println("An Error Occured!");
        }
    }
    
//    public static int[] sortIntegers(int[] integers){
//        int temp;
//        for(int i = 1; i<integers.length; i++)
//        {
//            for(int j=integers.length-1; j>=i; j--)
//            {
//                if(integers[j-1] > integers[j])
//                {
//                    temp = integers[j-1];
//                    integers[j-1] = integers[j] ;
//                    integers[j] = temp ;
//                }
//            }
//        }
//        return integers;
//    }
//    
//    public static void majorElement(File file){
//        try {
//            BufferedReader br = new BufferedReader(new FileReader(file));
//            String line;
//            String[] splittedLine;
//            while((line = br.readLine()) != null && !line.trim().isEmpty())
//            {
//                int oldTotal = 0, newTotal = 0, numberThatIsRepeatedMost = 0;
//                int[] numbers;
//                splittedLine = line.split(",");
//                numbers = new int[splittedLine.length];
//                for(int i=0; i<splittedLine.length; i++)
//                {
//                    numbers[i] = Integer.parseInt(splittedLine[i]);
//                }
//                numbers = sortIntegers(numbers);
//                for(int i=0; i < numbers.length; i++)
//                {
//                    if(i+1 < numbers.length) 
//                    {
//                        while(numbers[i] == numbers[i+1])
//                        {
//                            newTotal++;
//                            i++;
//                            if(i+1 >= numbers.length)
//                            {
//                                break;
//                            }
//                        }
//                        if(newTotal > oldTotal)
//                        {
//                            oldTotal = newTotal;
//                            numberThatIsRepeatedMost = numbers[i-1];
//                        }
//                        newTotal = 1;
//                    }
//                }
//                if (oldTotal > (numbers.length/2)) 
//                {
//                    System.out.println(numberThatIsRepeatedMost);
//                } 
//                else 
//                {
//                    System.out.println("None");
//                }
//            }
//            
//        } catch (FileNotFoundException ex) {
//            System.out.println("Error With File: " + ex.getMessage());
//        } catch (IOException ex) {
//            System.out.println("Error With File: " + ex.getMessage());
//        }
//        
//    }

    public static void main(String[] args) {
        File file = new File("TestingFiles"+File.separator+"test.txt");
        majorElementChallenge(file);
    }
}

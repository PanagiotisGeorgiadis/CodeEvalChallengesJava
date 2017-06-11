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

public class QueryBoardChallenge {

    public static int[][] board = new int[256][256];
    
    public static void queryBoard(File file){
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line;
            String[] splittedLine;
            int sum;
            for(int i=0; i < board.length; i++)
            {
                for(int j=0; j < board.length; j++)
                {
                    board[i][j] = 0;
                }
            }
            while((line=br.readLine()) != null && !line.trim().isEmpty())
            {
                splittedLine = line.split("\\s");
                sum = 0;
                if(splittedLine[0].equals("SetRow"))
                {
                    for(int i=0; i<board.length; i++)
                    {
                        board[Integer.parseInt(splittedLine[1])][i] = Integer.parseInt(splittedLine[2]);
                    }                    
                }
                else if(splittedLine[0].equals("SetCol"))
                {
                    for(int i=0; i<board.length; i++)
                    {
                        board[i][Integer.parseInt(splittedLine[1])] = Integer.parseInt(splittedLine[2]);
                    }
                }
                else if(splittedLine[0].equals("QueryRow"))
                {
                    for(int i=0; i<board.length; i++)
                    {
                        sum = sum + board[Integer.parseInt(splittedLine[1])][i];
                    }
                    System.out.println(sum);
                }
                else
                {
                    for(int i=0; i<board.length; i++)
                    {
                        sum = sum + board[i][Integer.parseInt(splittedLine[1])];
                    }
                    System.out.println(sum);
                }
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Error With File: " + ex.getMessage());
        } catch (IOException ex) {
            System.out.println("Error With File: " + ex.getMessage());
        }
    }
    
    public static void main(String[] args){
        File file = new File("TestingFiles"+File.separator+"testHiddenDigits.txt");
        queryBoard(file);
    }
}

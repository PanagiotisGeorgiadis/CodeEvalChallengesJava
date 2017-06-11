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

public class MultiplicationTablesChallenge {
       
    public static void main(String[] args) {
        for(int i=1; i<=12; i++)
        {
            if(i==1)
            {
                System.out.print(i);
            }
            else
            {
                if(i<10)
                {
                    System.out.print("   " + i);
                }
                else
                {
                    System.out.print("  " + i);
                }
            }
        }
        System.out.println();
        for(int i=2; i<=12; i++)
        {
            for(int j=1; j<=12; j++)
            {
                if(j==1)
                {
                    System.out.print(i*j);
                }
                else
                {
                    if(i*j<10)
                    {
                        System.out.print("   " + i*j);
                    }
                    else if(i*j<100)
                    {
                        System.out.print("  " + i*j);
                    }
                    else
                    {
                        System.out.print(" " + i*j);
                    }
                }
            }
            System.out.println();
        }
    }
}

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

public class ReadMoreChallenge {
       
    public static void readMore(File file){
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line, output;
            String[] words;
            int i;
            while((line=br.readLine()) != null)
            {
                words = line.split("\\s");
                output = "";
                i = 0;
                if(line.length() > 55)
                {
                    while((output+words[i]).length() < 40)
                    {
                        output = output + words[i] + " ";
                        i++;
                    }
                    if(output.equals(""))
                    {   
                        int j=0;
                        while(output.length() < 40)
                        {
                            output = output + line.charAt(j);
                            j++;
                        }
                    }
                    output = output.trim();
                    output = output + "... <Read More>";
                }
                else
                {
                    output = line;
                }
                System.out.println(output);
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Error With File: " + ex.getMessage());
        } catch (IOException ex) {
            System.out.println("Error With File: " + ex.getMessage());
        }
    }
    
    public static void main(String[] args) {
        File file = new File("TestingFiles"+File.separator+"testReadMore.txt");
        readMore(file);
    }
}

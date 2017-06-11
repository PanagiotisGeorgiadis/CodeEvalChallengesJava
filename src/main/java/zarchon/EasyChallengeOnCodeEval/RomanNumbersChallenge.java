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

public class RomanNumbersChallenge {
     
    public static void cardinalToRoman(File file){
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line, roman;
            int cardinal;
            while((line=br.readLine()) != null && !line.trim().isEmpty())
            {
                cardinal = Integer.parseInt(line);
                roman = "";
                while(cardinal - 1000 >= 0)
                {
                    cardinal = cardinal - 1000;
                    roman = roman + "M";
                }
                if(cardinal - 900 >= 0)
                {
                    cardinal = cardinal - 900;
                    roman = roman + "CM";
                }
                while(cardinal - 500 >= 0)
                {
                    cardinal = cardinal - 500;
                    roman = roman + "D";
                }
                if(cardinal - 400 >= 0)
                {
                    cardinal = cardinal - 400;
                    roman = roman + "CD";
                }
                while(cardinal - 100 >= 0)
                {
                    cardinal = cardinal - 100;
                    roman = roman + "C";
                }
                if(cardinal - 90 >= 0 )
                {
                    cardinal = cardinal - 90;
                    roman = roman + "XC";
                }
                while(cardinal - 50 >= 0)
                {
                    cardinal = cardinal - 50;
                    roman = roman + "L";
                }
                if(cardinal - 40 >= 0 )
                {
                    cardinal = cardinal - 40;
                    roman = roman + "XL";
                }
                while(cardinal - 10 >= 0)
                {
                    cardinal = cardinal - 10;
                    roman = roman + "X";
                }
                if(cardinal - 9 >= 0 )
                {
                    cardinal = cardinal - 9;
                    roman = roman + "IX";
                }
                while(cardinal - 5 >= 0)
                {
                    cardinal = cardinal - 5;
                    roman = roman + "V";
                }
                if(cardinal - 4 >= 0 )
                {
                    cardinal = cardinal - 4;
                    roman = roman + "IV";
                }
                while(cardinal - 1 >= 0)
                {
                    cardinal = cardinal - 1;
                    roman = roman + "I";
                }
                System.out.println(roman);
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Error With File: " + ex.getMessage());
        } catch (IOException ex) {
            System.out.println("Error With File: " + ex.getMessage());
        }
    }
    
    public static void main(String[] args){
        File file = new File("TestingFiles"+File.separator+"testRomanNumbers.txt");
        cardinalToRoman(file);
    }
}

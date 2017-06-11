package zarchon.EasyChallengeOnCodeEval;

import java.io.File;

/**
 *
 * @author Zarc
 */

public class FileSizeChallenge {
           
    public static void main(String[] args) {
        File file = new File("TestingFiles"+File.separator+"testHiddenDigits.txt");
        System.out.println(file.length());
    }
}

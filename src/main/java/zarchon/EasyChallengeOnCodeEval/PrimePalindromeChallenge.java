package zarchon.EasyChallengeOnCodeEval;

/**
 *
 * @author Zarc
 */

public class PrimePalindromeChallenge {
    
    public static boolean isPrime(int number){
         
        for(int i=2; i<=number/2; i++)
        {
            if(number%i == 0)
            {
                return false;
            }
        }
        return true;
    }

    public static boolean isPalindrome(int number){
        
        String palindrome = number + "";
        for(int i=0; i<palindrome.length(); i++)
        {
            if(Character.compare(palindrome.charAt(i), palindrome.charAt(palindrome.length()-1-i)) != 0)
            {
                return false;
            }
        }        
        return true;
    }
       
    public static void primePalindrome(){
        int palindrome = 0;
        for(int number=2; number<1000; number++)
        {
            if(isPrime(number))
            {
                if(isPalindrome(number))
                {
                    palindrome = number;
                }
            }
        }
        System.out.println(palindrome);
    }
    
    public static void main(String[] args) {
        primePalindrome();
    }
}

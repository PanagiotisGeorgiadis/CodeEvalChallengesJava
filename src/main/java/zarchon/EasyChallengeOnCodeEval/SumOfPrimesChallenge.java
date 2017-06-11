package zarchon.EasyChallengeOnCodeEval;

/**
 *
 * @author Zarc
 */

public class SumOfPrimesChallenge {
    
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
       
    public static void sumOfPrimes(){
        int number = 2, sum = 0;
        for(int count=0; count<1000; number++)
        {
            if(isPrime(number))
            {
                sum += number;
                count++;
            }
        }
        System.out.println(sum);
    }
    
    public static void main(String[] args) {
        sumOfPrimes();
    }
}

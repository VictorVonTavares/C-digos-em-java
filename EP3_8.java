
import java.util.Scanner;
 
public class EP3_8 {
    private static Scanner scanner = new Scanner( System.in );
 
    public static void main(String[] args) {
 
        System.out.println("Escreva um numero inteiro postivo");
 
        int count = 0;
        int n = scanner.nextInt();

 
 
        for (int num = 2; count < n; num++)
        {
 
            boolean isPrime = true;
            for (int i=2; i <= num/2; i++)
            {
                if ( num % i == 0)
                {
                    isPrime = false;
                    break;
                }
            }
 
            if ( isPrime == true )
            {
                System.out.println(num);
                count++;
            }
        }
    }
}
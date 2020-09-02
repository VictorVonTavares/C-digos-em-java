
import java.util.Scanner;

public class EP3_2 {
    public static void main(final String[] args) {
        Scanner scanner = new Scanner(System.in);
 System.out.print("Digite um numero inteiro poitivo: ");
 int n = scanner.nextInt();
 for (int i=2; i< n; i++ ){
     if (n%i == 0) {
        System.out.print("NAO");
        break;
    
     }
     else if ( n%i != 0 && n/i == 1) {
        System.out.print("SIM");
        break;

     }


 }


 scanner.close();
 } 





    }



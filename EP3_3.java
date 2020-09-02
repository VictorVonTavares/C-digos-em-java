
import java.util.Scanner;
import java.math.*;

public class EP3_3 {

    static double somaP(Double n) {

        double soma = 0;
        double contador = 0;
        while (contador <= n) {
            soma = soma + ((double)Math.pow(-1, contador )/((2 * contador) +1)) * 4 ;
            contador = contador + 1;      
        }
        return soma;
    }
    public static void main(final String[] args) {
        Scanner scanner = new Scanner(System.in);
 System.out.print("Digite n ");
 double n = scanner.nextDouble();
 System.out.printf("%.3f",somaP(n));
 scanner.close();

    }

}



import java.util.Scanner;

public class EP1_2 {
    public static void main(final String[] args) {
        Scanner scanner = new Scanner(System.in);
 System.out.print("Digite a 1a nota:");
 double nota1 = scanner.nextDouble();
 System.out.print("Digite a 2a nota:");
 double nota2 =scanner.nextDouble();
 System.out.print("Digite a 3a nota:");
 double nota3 = scanner.nextDouble();
 double media = (nota1 + nota2 + nota3) / 3f;
 System.out.printf( "%.2f", media);
 scanner.close();
    }
}
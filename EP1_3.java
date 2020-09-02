
import java.util.Scanner;

public class EP1_3 {
    public static void main(final String[] args) {
        Scanner scanner = new Scanner(System.in);
 System.out.print("Digite o primeiro valor: ");
 int a = scanner.nextInt();
 System.out.print("Digite o segundo valor: ");
 int b = scanner.nextInt();
 System.out.print("Digite o terceiro valor: ");
 int c = scanner.nextInt();
 int Delta = b*b - (4*a*c);
 System.out.print( Delta);
 scanner.close();

    }
}
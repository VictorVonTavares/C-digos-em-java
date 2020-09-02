
import java.util.Scanner;

public class EP2_8 {
    public static void main(final String[] args) {
        Scanner scanner = new Scanner(System.in);
 System.out.print("Digite o valor de x: ");
 int x = scanner.nextInt();
 System.out.print("Digite o valor de y: ");
 int y = scanner.nextInt();
 if (x >= -800 && x <=22 && y >= -20 && y <= 35 ) {

    System.out.print("SIM");
}

else if (x < -800 || x > 22 || y > 35 || y < -20 ) {

    System.out.print("NAO");

}

 scanner.close();

    }
}
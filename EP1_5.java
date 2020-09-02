import java.util.Scanner;

public class EP1_5 {
    public static void main(final String[] args) {
        Scanner scanner = new Scanner(System.in);
 System.out.print("Digite a temperatura em celsius: ");
 Float T = scanner.nextFloat();

 Double Temperatura =(T*1.8) + 32 ;
 System.out.print(Temperatura);
 scanner.close();

    }
}
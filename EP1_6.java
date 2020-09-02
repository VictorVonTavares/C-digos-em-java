import java.util.Scanner;

public class EP1_6 {
    public static void main(final String[] args) {
        Scanner scanner = new Scanner(System.in);
 System.out.print("Digite o valor: ");
 double valor = scanner.nextInt();
 

 Double valor1 = valor - valor*0.10;
 Double valor2 = valor1 - valor1*0.10 ;


 System.out.printf("%.2f", valor2);
 scanner.close();

    }
}
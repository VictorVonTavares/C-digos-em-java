
import java.util.Scanner;

public class EP3_5 {

    
    
    public static void main(final String[] args) {
    int x;
    x = 1;
    int contador;
    contador = 0;
    Scanner scanner = new Scanner(System.in);

    while ( x !=0) {

         System.out.print("Digite o valor: ");
            int a = scanner.nextInt();
            x = a;

            contador = contador + x;

        
        } 
        System.out.print(contador);
        scanner.close();
}}
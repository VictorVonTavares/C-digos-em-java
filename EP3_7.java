
import java.util.Scanner;

public class EP3_7 {

    
    
    public static void main(final String[] args) {
    int x;
    x = 1;
    int contador;
    int contador3;
    int contador5;
    contador = 0;
    contador3 = 0;
    contador5 = 0;
    Scanner scanner = new Scanner(System.in);

    while ( x !=0) {

         System.out.print("Digite o valor: ");
            int a = scanner.nextInt();
            x = a;

            contador = contador + x;
            if(x % 3 == 0){
                contador3 = contador3 +1;


            }
            if(x % 5 == 0){
                contador5 = contador5 +1;


            }

        
        } 
        System.out.println(contador3 - 1);
        System.out.println(contador5 - 1 );

        scanner.close();
}}
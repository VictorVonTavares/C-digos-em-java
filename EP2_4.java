
import java.util.Scanner;

public class EP2_4 {
    public static void main(final String[] args) {
        Scanner scanner = new Scanner(System.in);
 System.out.print("Digite o ano: ");
 int ano = scanner.nextInt();
 if ( (ano % 400 == 0 )|| (ano % 4 == 0 && ano % 100 != 0) ){

    System.out.println ("SIM") ;

 }

 else if (ano % 400 != 0 ) {

    System.out.println ("NAO") ;


 }

 scanner.close();

    }
}
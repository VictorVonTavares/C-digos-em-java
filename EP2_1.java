
import java.util.Scanner;

public class EP2_1 {
    public static void main(final String[] args) {
        Scanner scanner = new Scanner(System.in);

double nota1 = scanner.nextDouble();
double nota2 = scanner.nextDouble();
double media = (nota1 + nota2)/2;
if (media >= 5) {
    System.out.printf("%.2f",media + "\n");
    System.out.printf("APROVADO" + "\n");

}

else if ( media <5) {

    double rec = scanner.nextDouble();
    double mediafinal = (media + rec)/2;
    
    if (mediafinal >=5) {
        System.out.printf("%.2f",media+ "\n");
        System.out.printf("%.2f",mediafinal + "\n");
        System.out.printf("APROVADO" + "\n");




    }

    else if (mediafinal < 5) {

        System.out.printf( "%.2f",media + "\n" );
        System.out.printf( "%.2f",mediafinal + "\n");
        System.out.printf("REPROVADO" );



    }


}

 scanner.close();

 

    }
}
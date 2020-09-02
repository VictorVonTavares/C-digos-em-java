
import java.util.Scanner;

public class EP1_4 {

static double calcularX ( double AX, double BX) {

return (BX - AX)*(BX - AX) ;

}

static double calcularY ( double AY, double BY) {

    return (BY - AY)*(BY - AY) ;
    
    }
    

    public static void main(final String[] args) {
        Scanner scanner = new Scanner(System.in);
 System.out.print("Digite AX: ");
 Double AX = scanner.nextDouble();
 System.out.print("Digite Ay: ");
 Double AY = scanner.nextDouble();
 System.out.print("Digite Bx: ");
 Double BX = scanner.nextDouble();
 System.out.print("Digite By: ");
 Double BY = scanner.nextDouble();
 Double Distânica = Math.sqrt(calcularX(AX, BX) + calcularY(AY, BY));
 System.out.printf("%.2f", Distânica);
 scanner.close();

    }
}
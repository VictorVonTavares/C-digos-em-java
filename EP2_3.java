
import java.util.Scanner;

public class EP2_3 {
    public static void main(final String[] args) {
        Scanner scanner = new Scanner(System.in);
 System.out.print("Digite a temperatura: ");
 float temperatura = scanner.nextFloat();


 if (temperatura <= -20) {
    System.out.print("Muito baixa");
 }
else if (temperatura <= 30 && temperatura > -20) {
    System.out.print("Baixa");
 }
 
 else if (temperatura <= 200 && temperatura > 30) {
    System.out.print("Normal");
 }
 
 else if (temperatura <= 250 && temperatura > 200) {
    System.out.print("Alta");
    
 }

 else if (temperatura > 250) {
    System.out.print("Muito alta");
 }
 
 

 
 scanner.close();
 

    }
}
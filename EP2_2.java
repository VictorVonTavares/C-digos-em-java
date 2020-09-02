import java.util.Scanner;

public class EP2_2 {
    public static void main(final String[] args) {
        Scanner scanner = new Scanner(System.in);
 System.out.print("Digite sua altura em centimetros: ");
 double altura = scanner.nextDouble();
 System.out.print("Digite seu peso em quilogramas: ");
 double peso = scanner.nextDouble();
 altura = altura/100;
 double IMC = peso/(altura*altura);

 if (IMC <= 18.5) {
    System.out.print("Magro");
 }
else if (IMC <= 25.00 && IMC > 18.5) {
    System.out.print("Saudavel");
 }
 
 else if (IMC <= 30.00 && IMC > 25.00) {
    System.out.print("Acima do peso");
 }
 
 else if (IMC <= 35.00 && IMC > 30) {
    System.out.print("Obeso");
    
 }

 else if (IMC > 35) {
    System.out.print("Morbidez");
 }
 
 

 
 scanner.close();

    }
}
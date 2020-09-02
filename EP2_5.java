
import java.util.Scanner;

public class EP2_5 {
    public static void main(final String[] args) {
        Scanner scanner = new Scanner(System.in);
 System.out.print("Digite o primeiro valor: ");
 float lado1 = scanner.nextFloat();
 System.out.print("Digite o segundo valor: ");
 float lado2 = scanner.nextFloat();
 System.out.print("Digite o terceiro valor: ");
 float lado3 = scanner.nextFloat();
 scanner.close();


 if (lado1 > lado2 +lado3){
    System.out.print("INVALIDO");
 }

 else if (lado2 > lado1 + lado3) {
    System.out.print("INVALIDO");

 }

 else if (lado3 > lado1 + lado2){

    System.out.print("INVALIDO");

 }
 
 else if (lado1 < lado2 +lado3){
    System.out.print("VALIDO");
 }

 else if (lado2 < lado1 + lado3) {
    System.out.print("VALIDO");

 }

 else if (lado3 < lado1 + lado2){

    System.out.print("VALIDO");

 }     

    }
}
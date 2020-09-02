
import java.util.Scanner;

public class EP3_4 {


    
    public static void main(final String[] args) {
        Scanner scanner = new Scanner(System.in);
 System.out.print("Digite n");
 int n = scanner.nextInt();
 int contador;
 contador = 0;
 while (contador <= n) {
 for (int i = 1; i<=contador; i++) {
System.out.print(contador);
 }
 contador = contador + 1;
 System.out.print("\n");


}
  



scanner.close();

    }} 

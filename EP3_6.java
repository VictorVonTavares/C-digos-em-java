import java.util.Scanner;
import java.math.*;

public class EP3_6 {

  
    
    public static void main(final String[] args) {
        Scanner scanner = new Scanner(System.in);
 System.out.print("Digite n: ");
 int n = scanner.nextInt(); 
 int contador = 0;
 int soma2;
 soma2 = 0;
 int i;
 i = 1;
 int j;
 j = 1;
for(i=1; i<=n; i++){
    int soma = 0;
    soma2 = 0;

 for(j=1;j<=8;j++) {
     soma = (i + 1)*j ;
     soma2 = soma + soma2;
 }
 contador = contador + soma2;
}
 scanner.close();
System.out.print(contador);
    }

}
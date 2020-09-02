
import java.util.Scanner;

public class EP2_6 {
    public static void main(final String[] args) {
        Scanner scanner = new Scanner(System.in);
 System.out.print("Digite o dia da data 1: ");
 int d1 = scanner.nextInt();
 System.out.print("Digite o mes da data 1: ");
 int m1 = scanner.nextInt();
 System.out.print("Digite o ano da data 1: ");
 int a1 = scanner.nextInt();
 System.out.print("Digite o dia da data 2: ");
 int d2 = scanner.nextInt();
 System.out.print("Digite o mes da data 2: ");
 int m2 = scanner.nextInt();
 System.out.print("Digite o ano da data 2: ");
 int a2 = scanner.nextInt();

 if ( a2 > a1) {
    System.out.print("DATA1");

    
 }

 if ( a2 < a1) {
    System.out.print("DATA2");

    
 }

 if ( a2 == a1 && m2>m1) {
    System.out.print("DATA1");

    
 }
 
 if ( a2 == a1 && m2<m1) {
    System.out.print("DATA2");

    
 }
 
 if ( a2 == a1 && m2==m1 && d2>d1) {
    System.out.print("DATA1");

    
 }
 
 if ( a2 == a1 && m2==m1 && d2<d1) {
    System.out.print("DATA2");

    
 }
 

 
 if ( a2 == a1 && m2==m1 && d2==d1) {
    System.out.print("IGUAIS");

    
 }
 
 scanner.close();

    }
}
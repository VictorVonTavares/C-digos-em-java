
import java.util.Scanner;

public class EP2_7 {
    public static void main(final String[] args) {
        Scanner scanner = new Scanner(System.in);
 System.out.print("Digite o primeiro valor: ");
 int a = scanner.nextInt();
 System.out.print("Digite o segundo valor: ");
 int b = scanner.nextInt();
 System.out.print("Digite o terceiro valor: ");
 int c = scanner.nextInt();
if (a>b && b>c && a>c) {
    System.out.println(c );
    System.out.println(b );
    System.out.println(a);

}
else if (a>b && b<c && a>c) {
    System.out.println(b);
    System.out.println(c);
    System.out.println(a);

}

else if (b>a && a>c && b>c) {
    System.out.println(c);
    System.out.println(a);
    System.out.println(b);

}

else if (b>a && a<c && b>c) {
    System.out.println(a);
    System.out.println(c);
    System.out.println(b);

    
}

else if (c>b && b>a && c>a) {
    System.out.println(a);
    System.out.println(b);
    System.out.println(c);

}
else if (c>b && b<a && c>a) {
    System.out.println(b);
    System.out.println(a);
    System.out.println(c);

}
 scanner.close();

    }
}
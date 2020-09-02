import java.util.Scanner;

public class E2P1 {
    public static void main(final String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira o seu RA");
        long resto;
        resto = 0;
        long soma;
        soma = 0;
        long RA = scanner.nextLong();
        do{
          resto = RA % 10;
          soma = soma + resto;
          RA = (RA / 10);
         
        } while(RA!=0);
        System.out.println("Soma total:" + soma);

        
        scanner.close();
}}
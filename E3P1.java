import java.util.Scanner;


public class E3P1 {

    static int somatoriaN(int n){
        int contador;
        double conta;
        double soma;
        soma =0;
        for (contador = 1; contador <=n; contador++){
            conta = Math.pow(contador,contador);
            soma = soma + conta;
        }
        int i = (int)soma;
        return i;



    }
    public static void main(final String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um numero inteiro maior que 0");
        int n = scanner.nextInt();
        System.out.println("Valor da somatória para o numero " + n + " igual a " + somatoriaN(n));
        scanner.close();
}}
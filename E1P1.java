import java.util.Scanner;
import java.text.DecimalFormat;

public class E1P1 {
    public static void main(String[] args) {
        double gasto;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira o valor da passagem");
        double passagem = scanner.nextDouble();
        System.out.println("Insira o tipo de gasto a ser calculado");
        int tipo = scanner.nextInt();
        if(tipo == 1){
            gasto = (passagem * 5);
            DecimalFormat formatador = new DecimalFormat("0.00");
            System.out.println("Conta para gasto semanal = R$" + formatador.format(gasto));

        }
        if(tipo == 2){
            gasto = (passagem * 22);
            DecimalFormat formatador = new DecimalFormat("0.00");
            System.out.println("Conta para gasto mensal = R$" + formatador.format(gasto));

        }
        if(tipo == 3){
            System.out.println("Insira o numero de meses");
            int meses = scanner.nextInt();
            gasto = (passagem * 22 * meses);
            DecimalFormat formatador = new DecimalFormat("0.00");
            System.out.println("Conta para gasto de meses = R$" + formatador.format(gasto));
        }
        if (tipo > 3 || tipo < 1 ) {
            System.out.println("Tipo inválido! Insira 1,2 ou 3.");

        }
        scanner.close();
    }
}
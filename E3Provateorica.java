import java.util.Scanner;

public class E3Provateorica {
    public static void main(final String[] args) {
        Scanner scan = new Scanner(System.in);
        int i;
        int j;
        System.out.print("Digite o valor de n ");
        int n = scan.nextInt();
        System.out.print("Digite o valor de m");
        int m = scan.nextInt();
        int matriz[][] = new int [n][m];
        int pares = 0;
        int contapares =0;
        double contaimpares = 0;
        double impares = 0;
        double zeros = 0;
        for (i=0;i<matriz.length ;i = i+1){
            for (j=0;j<matriz[0].length ; j = j +1){
                int x = scan.nextInt();
                matriz[i][j] = x;
            }
        }
        for (i=0;i<matriz.length ;i = i+1){
            for (j=0;j<matriz[0].length ; j = j +1){
                if (matriz[i][j] == 0){
                    zeros = zeros + 1;
                }
            }
        }
        for (i=0;i<matriz.length ;i = i+1){
            for (j=0;j<matriz[0].length ; j = j +1){
                if (matriz[i][j] % 2 == 0 && matriz[i][j] !=0){
                    contapares = contapares + 1;

                    pares = pares + matriz[i][j];

                }
            }
        }
        for (i=0;i<matriz.length ;i = i+1){
            for (j=0;j<matriz[0].length ; j = j +1){
                if (matriz[i][j] % 2 != 0){
                    contaimpares = contaimpares + 1;
                    impares = impares + matriz[i][j];

                }
            }
        }

        pares = pares/contapares;
        impares = impares/contaimpares;
        System.out.println("Numero de zeros: " + zeros);
        System.out.println("Numero de elementos pares: " + contapares);
        System.out.println("Média dos elementos pares: " + pares);
        System.out.println("Numero de elementos impares: " + contaimpares);
        System.out.println("Média dos elementos impares: " + impares);




    }}
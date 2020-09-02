import java.util.Scanner;

public class EP5_4 {
    public static void main(final String[] args) {
        Scanner scan = new Scanner(System.in);
        int i;
        int j;
        int swap;
        boolean troca = true;
        System.out.print("Digite o valor de n ");
        int n = scan.nextInt();
        System.out.print("Digite o valor de m");
        int m = scan.nextInt();
        int matriz[][] = new int [n][m];
        for (i=0;i<matriz.length ;i = i+1){
            for (j=0;j<matriz.length ; j = j +1){
                int x = scan.nextInt();
                matriz[i][j] = x;
            }
        }

        while (troca) {
            troca = false;
            for (i=0;i<matriz.length ;i = i+1){
            for (j=0;j<matriz[0].length - 1 ; j = j +1){
                if (matriz[i][j] > matriz[i][j+1]) {
                    swap = matriz[i][j];
                    matriz[i][j] = matriz [i][j+1];
                    matriz[i][j + 1] = swap;
                    troca = true;
                }
            }
        }}
        for (i=0;i<matriz.length ;i = i+1){
            for (j=0;j<matriz.length ; j = j +1){
                System.out.print(matriz[i][j] + "");
    }
    System.out.print("\n");
            
        }

    }}

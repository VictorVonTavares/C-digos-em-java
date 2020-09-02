import java.util.Scanner;

public class EP5_5 {
    public static void main(final String[] args) {
        Scanner scan = new Scanner(System.in);
        int i;
        int j;
        int contador;
        contador = 0;
        System.out.print("Digite o valor de n ");
        int n = scan.nextInt();
        int matriz[][] = new int [n][n];
        for (i=0;i<matriz.length ;i = i+1){
            for (j=0;j<matriz.length ; j = j +1){
                int x = scan.nextInt();
                matriz[i][j] = x;
            }
        }
        for (i=0;i<matriz.length ;i = i+1){
            for (j=0;j<matriz.length ; j = j +1){
                if ( i>j && (matriz[i][j]%2 == 0)){
                    contador = contador + matriz[i][j];
                }
        }
        

    }
        System.out.print(contador);
}}

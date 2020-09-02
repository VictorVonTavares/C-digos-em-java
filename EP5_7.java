import java.util.Scanner;

public class EP5_7 {
    public static void main(final String[] args) {
        Scanner scan = new Scanner(System.in);
        int i;
        int j;
        int contador;
        int incremento;
        incremento = 0;
        contador = 1;
        System.out.print("Digite o valor de n ");
        int n = scan.nextInt();
        int matriz[][] = new int [n][n];
        for (i=0;i<matriz.length ;i = i+1){
            for (j=0;j<matriz.length ; j = j +1){
                matriz[i][j] = contador;
                contador = contador + 1 ;
            }
        incremento = incremento +1;
        contador = incremento + 1;
        }
        for (i=0;i<matriz.length ;i = i+1){
            for (j=0;j<matriz.length ; j = j +1){
                System.out.print(matriz[i][j] + "");
    }
    System.out.print("\n");


}}}
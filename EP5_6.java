import java.util.Scanner;

public class EP5_6 {
    public static void main(final String[] args) {
        Scanner scan = new Scanner(System.in);
        int i;
        int j;
        int contador;  
        System.out.print("Digite o valor de n ");
        int n = scan.nextInt();
        int matriz[][] = new int [n][n];
        int matriz2 [][] = new int [n][n/2];
        int matriz3 [][] = new int [n/2][n/2];
        contador = n;
        for (i=0;i<matriz.length ;i = i+1){
            for (j=0;j<matriz.length ; j = j +1){
                int x = scan.nextInt();
                matriz[i][j] = x;
            }
        }
        for (i=0;i<matriz.length ;i = i+1){
            for (j=0;j<matriz[0].length - n/2 ; j = j +1){
                matriz2[i][j] = matriz[i][j] + matriz[i][n-1];
                n = n - 1;
                System.out.println("valor: " + matriz2[i][j]);
            }
            n = contador;

        }
    
        for (i=0;i<matriz2.length ;i = i+1){
            for (j=0;j<matriz2.length - 1 ; j = j +1){
                System.out.print(matriz2[i][j] + "");
    }
    System.out.print("\n");
            

}}}
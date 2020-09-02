import java.util.Scanner;

public class EP5_8 {
    public static void main(final String[] args) {

    Scanner scan = new Scanner(System.in);
    int i;
    int j;
    int produto;
    int somatorio;
    produto =0;
    System.out.print("Digite o valor de n da matriz a ");
    int n = scan.nextInt();
    System.out.print("Digite o valor de m da matriz a");
    int m = scan.nextInt();
    int matrizA[][] = new int [n][m];
    System.out.print("Digite o valor de n da matriz b ");
    int k = scan.nextInt();
    System.out.print("Digite o valor de m da matriz b ");
    int w = scan.nextInt();
    int matrizB[][] = new int [k][w];
    int matrizC[][] = new int [n][w];


    for (i=0;i<matrizA.length ;i = i+1){
        for (j=0;j<matrizA[0].length ; j = j +1){
            int x = scan.nextInt();
            matrizA[i][j] = x;
        }
    }
    
    for (i=0;i<matrizB.length ;i = i+1){
        for (j=0;j<matrizB[0].length ; j = j +1){
            int x = scan.nextInt();
            matrizB[i][j] = x;
        }
    }
    for (i=0;i<matrizA.length ;i = i+1){
        for (j=0;j<matrizB[0].length ; j = j +1){
            somatorio = 0;
            for (int c = 0; c < matrizA[0].length; c++) {
                produto = matrizA[i][c] * matrizB[c][j];
                somatorio = produto + somatorio;
        }
                matrizC[i][j] = somatorio;
    }

}


for (i=0;i<matrizC.length ;i = i+1){
    for (j=0;j<matrizC[0].length ; j = j +1){
        matrizC[i][j] = matrizC[i][j]*3;
}


}


for (i=0;i<matrizC.length ;i = i+1){
    for (j=0;j<matrizC[0].length ; j = j +1){
        System.out.printf( (matrizC[i][j]) + " ");
}
    System.out.print("\n");


}

}}
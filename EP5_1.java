import java.util.Scanner;
import java.text.DecimalFormat;


public class EP5_1 {
        public static void main(final String[] args) {
            Scanner scan = new Scanner(System.in);
            int i;
            int j;
            double contador;
            double media;
            contador = 0;
            int n = scan.nextInt();
            int m = scan.nextInt();
            int k = m +1;
           

            double matriz[][] = new double [n][m];
            double matrizf[][] = new double [n][k];

            for (i=0;i<matriz.length ;i = i+1){
                for (j=0;j<matriz[0].length ; j = j +1){
                    double x = scan.nextDouble();
                    matriz[i][j] = x;    }
                }
                for (i=0;i<matriz.length ;i = i+1){
                    for (j=0;j<matriz[0].length ; j = j +1){
                    System.out.print(matriz[i][j] + "");
    }
                    System.out.print("\n");
}
              for (i=0;i<matriz.length ;i = i+1){
                for (j=0;j<matriz[0].length ; j = j +1){
                    contador = matriz[i][j] + contador;
                    
            }
            System.out.println("Contador: " + contador);

            media = contador/m;
            matrizf[i][m] = media;
            contador = 0;
            }

            
            for (i=0;i<matriz.length ;i = i+1){
                for (j=0;j<matriz[0].length; j = j +1){ 
                matrizf[i][j] = matriz[i][j]; 
    }

}
            for (i=0;i<matrizf.length ;i = i+1){
                for (j=0;j<matrizf[0].length ; j = j +1){
                    DecimalFormat formatador = new DecimalFormat("0.00");       
                    System.out.printf( formatador.format(matrizf[i][j]) + " ");
}
                System.out.print("\n");


}

}}


    

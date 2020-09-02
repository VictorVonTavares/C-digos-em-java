import java.util.Scanner;

public class E3P2Pratica {
    
    static void imprimeModa ( int vetor[]) {
       int contador =0;
       int moda = 0;
       int contagemmoda = 0;
       int contador2 = 0;
       int x = 0;
 
       for (int i=0;i<vetor.length ; i = i +1){
        contador = 0;

        for (int j=0;j<vetor.length ; j = j +1){
            if(vetor[i] == vetor[j]){
                contador = contador + 1;}
            }
            if(contador2 < contador)
            contador2 = contador;
            moda = vetor[i];
        }

        for (int i = 0; i < vetor.length; i++) {
            contador = 0;
            for (int j = 0; j < vetor.length; j++) {
                if (vetor[j] == vetor[i])
                    contador++;
                }
                if (contador == contador2) {
                    contagemmoda = contagemmoda + 1; ;
            }
            
            }
          x = contagemmoda/(contador2);

            int vetor2[] = new int[x];
            int vetor3[] = new int[x*contador2];
            int k =0;
            
        for (int i = 0; i < vetor.length; i++) {
            contador = 0;
            for (int j = 0; j < vetor.length; j++) {
                if (vetor[j] == vetor[i])
                    contador++;
                }
                if (contador == contador2) {
                    vetor3[k] = vetor[i]  ;
                     k = k+1;
            }

            }

               

       
        int w = 1;

        for (int i = 0; i < vetor2.length; i++) {
            vetor2[i] = vetor3[w];
            w = contador2 + w;
      
               }
               System.out.print("Valores mais frequentes: ");

               for (int i = 0; i < vetor2.length; i++) {
                System.out.print(vetor2[i] + ", ");

          
                   }
                   System.out.print("\n");

                    System.out.println("Vetor com os valores mais frequentes:" + java.util.Arrays.toString(vetor2));

            }

       
           public static void main(final String[] args) {
       
           Scanner scan = new Scanner(System.in);
           int vetor[] = new int [20];
       
           for (int j=0;j<vetor.length ; j = j +1){
               int x = scan.nextInt();
               
               while (x <= 0 || x >= 19) {
                   System.out.print("Entrada inválida");
                    x = scan.nextInt();
               }
               vetor[j] = x;
           }
       System.out.println("vetor de entrada: " + java.util.Arrays.toString(vetor));

imprimeModa(vetor);

       scan.close();    
       }
       
    
}
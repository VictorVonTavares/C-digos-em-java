import java.util.Scanner;


public class E4Provateorica {

    public static void mapeamento(int vetor[]){ ;

        int mapeamento[] = new int [10];
        int contador = 0;

    for (int i = 0; i< mapeamento.length ; i = i +1){      
        for (int j=0;j<vetor.length ; j = j +1){
            if (vetor[j]== i){
                contador = contador + 1;

            }
        }
        mapeamento[i] = contador;
        contador =0;

}
System.out.print("Frequencia dos valores: " +java.util.Arrays.toString(mapeamento));

        
        }


    public static void main(final String[] args) {

    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    int vetor[] = new int [n];
     for (int j=0;j<vetor.length ; j = j +1){
        int x = scan.nextInt();
        vetor[j] = x;
    }

   mapeamento(vetor);

scan.close();    
}



}
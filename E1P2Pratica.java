import java.util.Scanner;


public class E1P2Pratica {

    public static double mediaPonderada(int vetor[]){ ;

        double media;
        media = 0;
        double contador =0;

        for (int j=0;j<vetor.length ; j = j +1){
            contador = vetor[j]*j + contador;
    
  
    
}

media = contador/10;
        return media  ;
        
        }


    public static void main(final String[] args) {

    Scanner scan = new Scanner(System.in);
    int vetor[] = new int [10];

    for (int j=0;j<vetor.length ; j = j +1){
        int x = scan.nextInt();
        
        while (x<=0) {
            System.out.print("Entrada inválida");
             x = scan.nextInt();
        }
        vetor[j] = x;
    }

    System.out.print(mediaPonderada(vetor));

scan.close();    
}



}
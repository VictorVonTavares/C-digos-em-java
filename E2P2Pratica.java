import java.util.Scanner;


public class E2P2Pratica {
    public static void main(final String[] args) {

        Scanner scan = new Scanner(System.in);
        int vetor1[] = new int [5];
        int vetor2[] = new int [5];
        int contador = 0;
    
        for (int j=0;j<vetor1.length; j = j +1){
            int x = scan.nextInt();
            vetor1[j] = x;

        }

        for (int j=0;j<vetor2.length ; j = j +1){
            int x = scan.nextInt();
            vetor2[j] = x;

        }

        
       for (int l=0;l<vetor1.length ; l = l +1){
        for (int w=0;w<vetor2.length ; w = w +1){
            if (vetor1[l]==vetor2[w]){
              
                
                contador = contador + 1;
            }
        }   
        }
   if(contador == 0){
    System.out.println("Não existem elementos em comum");
   }
   else{

         int vetor3[] = new int [contador];
         contador = 0;
            
        for (int k=0;k<vetor1.length ; k = k +1){
            for (int h=0;h<vetor2.length ; h = h +1){
                if (vetor2[h] == vetor1[k]){
                   
                
                        vetor3[contador] = vetor2[h];
                    contador = contador + 1;
                
            }   
            }

    scan.close();    
    }
    System.out.println("Elementos do vetor v2 contidos em v1:" + java.util.Arrays.toString(vetor3));

}
    
}}
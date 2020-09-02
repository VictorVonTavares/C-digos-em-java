import java.util.Arrays;
import java.util.Scanner;


public class E5Provateorica {
static void preencheMatriz(int matriz[][]) {
 Scanner scan = new Scanner(System.in);

    for (int i=0;i<matriz.length ;i = i+1){
        for (int j=0;j<matriz[0].length ; j = j +1){
            int x = scan.nextInt();
            matriz[i][j] = x;
        }
    }

}

static void calculaMedPares(int matriz[][], double medP){

double contapares = 0;
double pares = 0;

    for (int i=0;i<matriz.length ;i = i+1){
        for (int j=0;j<matriz[0].length ; j = j +1){
            if (matriz[i][j] % 2 == 0 && matriz[i][j] !=0){
                contapares = contapares + 1;

                pares = pares + matriz[i][j];

            }
        }
    }
medP = pares/contapares;
System.out.println("Média dos pares na função: " + medP);

}

static int encontraMax(int matriz[][], int max){

    
int maior =0;
    for (int i=0;i<matriz.length ;i = i+1){
        for (int j=0;j<matriz[0].length; j = j +1){
            if (matriz[i][j] > maior) {
                maior = matriz[i][j];
                
            }
        }
}
max = maior;

return max;
}

static String[] encontraVetor(int matriz[][], int n, int m, int vetoraa[], int vetorbb[]){
    int minimo = 0;
    int maximo = 0;

    for (int i=0;i<matriz.length ;i = i+1){       //Vetorbb: Maximo DA linha
        maximo = matriz[i][0];
        for (int j=0;j<matriz[0].length; j = j +1){    
            if (matriz[i][j] > maximo){
                maximo = matriz[i][j];
                
            }
            vetorbb[i] = maximo;
        }
    } 



int matriz2[][] = new int [m][n];

for (int x = 0; x <matriz.length; x++) {     
    for (int y = 0; y <matriz[0].length; y++) {
      matriz2[y][x] = matriz[x][y];
    }
  }



for (int i=0;i<matriz2.length ;i = i+1){   //Vetoraa: MINIMO DA COLUNA
    minimo = matriz2[i][0];
    for (int j=0;j<matriz2[0].length; j = j +1){    
        if (matriz2[i][j] < minimo){
            minimo = matriz2[i][j];
            
        }
        vetoraa[i] = minimo;
    }
}



    String[] vetores = {Arrays.toString(vetoraa) , Arrays.toString(vetorbb) };
    return vetores;
}


static void respostas(){
    System.out.println("Resposta 5.1: Em termos de parametros de entrada,ambas funções recebem a matriz preenchida da função preenche matriz, necessária para realizar os calculos dos métodos. A função calculaMedPares recebe, além da matriz,um double. O double é utilizado pois a função tem como objetivo calcular a média, logo,  é necessário um tipo de variavel que retorne um valor com casas decimais. Já encontraMax recebe além da matriz uma variavel int, pois não é realizado nenhum calculo mais complexo de média, não necessitando as duas casas decimais. Em termos de parametros de saída, o máximo da matriz consegue ser impresso na main pois sua função não retorna um valor vazio, uma vez que é do tipo static int. Ela retorna um valor inteiro, que no caso foi atribuido a variavel max. A média dos pares, no entanto, não consegue retornar nada pois sua função é do tipo void. Isso implica que ela sempre vai retornar um valor vazio quando chamada, mesmo que a variavel de entrada tenha sido modificada. Nesse caso, para ser impresso qualquer coisa, se faz necessário que a função com o void imprima seus resultados dentro da própria função.");
    System.out.println("Resposta 5.2: Uma função void, apesar de não poder, de fato retornar uma matriz, pode modificar variaveis globais (no formato de parametros de entrada!). Isso, além de poder imprimir a matriz e seus conteudos na main, permite que a matriz seja modificada dentro da função e depois utilizada também nos outros métodos. ");

  
}





    public static void main(final String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Digite o valor de n ");
        int n = scan.nextInt(); 
        System.out.print("Digite o valor de m ");
        int m = scan.nextInt();
        int medP;
        int max = 0;
        medP = 0;
        int matriz[][] = new int [n][m];
        int vetoraa[] = new int [m];
        int vetorbb[] = new int [n];

        preencheMatriz(matriz);
        for (int i=0;i<matriz.length ;i = i+1){
            for (int j=0;j<matriz[0].length ; j = j +1){
                System.out.print(matriz[i][j] + " ");
    
            }
            System.out.print("\n");
    
        }      
        calculaMedPares(matriz, medP);
        System.out.println("Média dos pares na main:" + medP);
        System.out.println("Valor máximo: " + encontraMax(matriz, max));

        encontraVetor(matriz, n, m, vetoraa, vetorbb);
        System.out.println("Valores mínimos por coluna e máximo por linha, respectivamente: " + Arrays.toString(encontraVetor(matriz, n, m, vetoraa, vetorbb)));
        respostas();
        
}}
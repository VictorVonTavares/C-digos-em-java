import java.util.Scanner;
public class E6Provateorica {

    public static void main(final String[] args) {

        Scanner entrada = new Scanner(System.in);
        int n = entrada.nextInt();
        int contaP = 0;         // A variavel conta P não foi inicializada
        int vet[] = new int[n]; //O valor inserido pelo usuário fica armazenado na variavel n (em minusculo), não em N (maisculo);
        for(int i =0; i<vet.length; i++){
            vet[i] = i;

        }
    for (int i=0; i<vet.length; i++){ // o loop for não deve continuar na condição de ser igual a extensão do vetor. Se continuar, chegara num ponto onde o indice i não vai existir dentro do vetor. Exemplo: se o vetor tem uma extensão de 5 numeros,o loop vai continuar até a posição i=5. Considerando que os indices começam em 0, o vetor terá posições de 0 a 4. Logo, a posição será invalida.  
        if(vet[i] % 2 == 0) { // para descobrir se um numero é par, utilizamos a operação vet[i] % 2 == 0, pois um numero par dividido por 2  deve ter resto igual a 0;
            contaP = contaP + 1; // o contador não foi atualizado caso achasse um número par, fazendo o if redundante;
        }
    }
    System.out.println("ContaP = " + contaP);

}
}
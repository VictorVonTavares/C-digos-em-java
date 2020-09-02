import java.util.Scanner;



    

public class EP1_7 {


   
            
           
           
    public static void main(final String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final int a = scanner.nextInt();
        scanner.close();
        int numero;
        int n1;
        int n2;
        int n3;
        int n4;
        int total;
        int acumulador;
        numero = a;
        n1 = numero/1000 ;
        if (n1==9){
            n1 = 0;
        }
       else {
        n1 = n1 + 1;
    
       }
        acumulador = numero%1000;
         n2 = acumulador/100;
         if (n2 == 9) {
            n2 = 0;
    
         }
         else {
            n2 = n2 + 1;
    
         }
    
         acumulador = acumulador%100;
         n3 = acumulador/10;
         if (n3 == 9) {
            n3 = 0;
    
         }
         else {
            n3 = n3 + 1;
    
         }
    n4 = acumulador%10;
    if(n4 == 9){
    n4 = 0;
    
    }
    else {
        n4 = n4 + 1;
    
    }
    
    String str1 = Integer.toString(n1);
    String str2 = Integer.toString(n2); 
    String str3 = Integer.toString(n3); 
    String str4 = Integer.toString(n4); 
    
    
    System.out.print (str1 + str2 + str3 + str4);


        


    }
}
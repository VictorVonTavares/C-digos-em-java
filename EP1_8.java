import java.util.Scanner;



    

public class EP1_8 {


    static int carga2 ( int a , int carga1) {

         carga1 = a % 500;
        return carga1/100;


         
        
        }

        static int carga3 ( int a , int carga1) {

            carga1 = a % 500;
            int carga2;
            carga2 =  carga1 % 100;
            return  carga2/25;

   
   
            
           
           }


    
           static int carga4 ( int a , int carga1) {

            carga1 = a % 500;
            int carga2;
            int carga3;
            carga2 =  carga1 % 100;
            carga3 =   carga2 % 25;
            return carga3/1;

   
   
            
           
           }
    public static void main(final String[] args) {
        final Scanner scanner = new Scanner(System.in);
        System.out.print("Digita a capacidade: ");
        final int a = scanner.nextInt();
        scanner.close();

         final int carga1 = a / 500;
        
 System.out.println( carga1);
 System.out.println(carga2(a,carga1));
 System.out.println(carga3(a,carga1));
 System.out.println(carga4(a,carga1));


    }
}
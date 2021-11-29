import java.util.Scanner;

/**
 * Ejer3
 */
public class Ejer3 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        if( n>=10){
            fibonacci(n);
        }
        if(n>=0 && n<10){
            factorial(n);
        }
        if(n<0){
            valorAbsoluto(n);
        }


    }

    public static void fibonacci(int n){
        int a = -1 ;
        int b = 1;
        int c = a+b;
         for (int i = 0; i < n; i++) {
             System.out.print(c+", ");
             a=b;
             b=c;
             c=a+b;
         }
         System.out.println();
    }

    public static void factorial(int n){
        int res=1;
        for (int i = 1; i <= n; i++) {
            res = res*i;
        }
        System.out.println("El factorial es: "+res);
    }

    public static void valorAbsoluto(int n){
        //deducimos que siempre sera negativo
        n = n*-1;
        System.out.println("El valor absoluto sera: "+n);
    }
}
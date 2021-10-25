// Dada una cadena queremos saber si esta es Palindrome, en caso de ser palindrome imprima ”Es Palindrome”, caso contrario ”No es palindrome”. Una cadena
// es palindrome si dicha cadena se lee igual de izquierda a derecha que de derecha
// a izquierda.
// Ejemplo Entrada Ejemplo Salida
// reconocer Es Palindrome
// informatica No es Palindrome

package EjerciciosCadenas;

import java.util.Scanner;

public class Cadenas1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String pal = in.next(); 

        String palinv = "";

        // for (int i = 0; i < pal.length(); i++) {
        //     String d = pal.substring(i, i+1);
        //     palinv = d + palinv;
        //  }
        for (int i = pal.length()-1; i >= 0; i--) {
            String d = pal.substring(i, i+1);
            palinv = palinv + d;
        }

         if(pal.equals(palinv)){
             System.out.println("Es Palindrome");
         }else{
            System.out.println("No es Palindrome");
         }

    }
}

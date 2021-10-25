// Dada una cadena X, y un car´acter a, responda un n´umero que indique la cantidad
// de veces que el car´acter a aparece en la cadena X.
// Ejemplo Entrada Ejemplo Salida
// huehuehuehuehue e 5
// HUEHUEHUEHUEHUE e 0


package EjerciciosCadenas;

import java.util.Scanner;

public class cadenas6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        String pal = in.next();
        String car = in.next();

        int cont = 0 ;

        for (int i = 0; i < pal.length(); i++) {
            String d = pal.substring(i, i+1);
            if(d.equals(car)){
                cont++;
            }
        }

        System.out.println(cont);
    }
}

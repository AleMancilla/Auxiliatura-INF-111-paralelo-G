// 7. Imagina en una cadena que las ‘x’ son pesos de 1 Kg y las ‘o’ son pesos de 2
// Kg. Se te dar´an dos cadenas X, Y de texto cuyos caracteres ´unicamente son ‘o’
// ´o ‘x’. Tu deber es a˜nadirle caracteres a cualquiera de las cadenas de texto con
// el objetivo de que ”pesen”lo mismo, agregando la menor cantidad de caracteres
// posible.
// Ejemplo Entrada Ejemplo Salida
// xoxoxxx xx xoxoxxx xxooox


/// xoxoxxx xx
/// xx xoxoxxx 
/// xoxoxxx xoxoxxx 

package EjerciciosCadenas;

import java.util.Scanner;

public class Cadenas7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        String x = in.next();
        String y = in.next();

        int pesoX = 0;
        int pesoY = 0;

        for (int i = 0; i < x.length(); i++) {
            if( x.substring(i,i+1).equals("x")){
                pesoX = pesoX+1;
            }
            if( x.substring(i,i+1).equals("o")){
                pesoX = pesoX+2;
            }
        }

        
        for (int i = 0; i < y.length(); i++) {
            if( y.substring(i,i+1).equals("x")){
                pesoY = pesoY+1;
            }
            if( y.substring(i,i+1).equals("o")){
                pesoY = pesoY+2;
            }
        }

        System.out.println(pesoX);
        System.out.println(pesoY);

        if(pesoX != pesoY){
            if(pesoX>pesoY){
                //y deberia ser completado
                int diferencia = pesoX - pesoY;
                // System.out.println("diferencia: "+diferencia);

                for (int i = 0; i < diferencia/2; i++) {
                    y = y+"o";
                }
                diferencia = diferencia % 2;
                for (int i = 0; i < diferencia; i++) {
                    y = y+"x";
                }
            }else{
                //x deberia ser completado
                int diferencia = pesoY - pesoX;
                // System.out.println("diferencia: "+diferencia);
                
                for (int i = 0; i < diferencia/2; i++) {
                    x = x+"o";
                }
                diferencia = diferencia % 2;
                for (int i = 0; i < diferencia; i++) {
                    x = x+"x";
                }
            }
        }

        System.out.println(x+"    "+y);

        

    }
}

// Queremos saber si ”Han Solo” o C¸ hewbacca” est´a hablando, ¿C´omo distinguimos
// qui´en est´a hablando?. Se sabe que Chewbacca s´olo conoce dos letras la ’a’ y ’r’.
// Se te dar´a una cadena y debes imprimir qui´en esta hablando, si est´a hablando
// Chewbacca imprimir C¸ hewbacca 2
// si est´a hablando Han Solo imprimir ”Han Solo”.
// Ejemplo Entrada Ejemplo Salida
// este es el problema f´acil Han Solo
// ararrrr Chewbacca

package EjerciciosCadenas;

import java.util.Scanner;

public class Cadenas2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        String habla = in.nextLine();

        boolean esHanSolo=false;

        for (int i = 0; i < habla.length(); i++) {
            String d = habla.substring(i, i+1);
            if(!d.equals("a") && !d.equals("r")){ // pregunta si no es "a" y si no es "r" 
                esHanSolo =true; // eso significa que no es Chewbacca y entonces es han solo
            }
        }

        if( esHanSolo == false ){
            System.out.println("Han Solo");
        }else{
            System.out.println("Chewbacca");
        }

    }
}

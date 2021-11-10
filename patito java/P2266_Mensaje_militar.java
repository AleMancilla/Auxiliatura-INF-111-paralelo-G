
// Problem A: Mensaje militar
// Time Limit: 1 Sec  Memory Limit: 128 MB
// Enviar: 34  Resuelto: 31
// [Enviar][Estado][Foro]
// Descripción
// Los militares cuando quieren mandar mensajes sin que los enemigos entiendan el mensaje utilizan distintos tipos de mensajes encriptados o mensajes ocultos, una de las formas de ocultar mensajes más populares es la siguiente:

// a cada palabra se le captura solamente la primera letra y se concatena todas las letras capturadas para emitir el mensaje final, como por ejemplo con el mensaje “HOLA ORCA LAMPE AIRE” el mensaje oculto resulta “HOLA”

// Entrada
// Se dara una cadena formada con mas de 2 palabras

// Salida
// Debe mostrar el mensaje que oculta la cadena de entrada

// Ejemplo Entrada
// HILO ORCA LAMPE AIRE MANI UVA NIDO DADO ORCA
// Ejemplo Salida
// HOLAMUNDO
// Ayuda
import java.util.Scanner;

public class P2266_Mensaje_militar {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String cadena = in.nextLine();

        cadena = " "+cadena;

        String  resultado = "";

        for (int i = 0; i < cadena.length(); i++) {
            String let = cadena.substring(i, i + 1);
            if(let.equals(" ")){
                String letOficial = cadena.substring(i+1, i + 2);
                resultado = resultado + letOficial;
            }
        }
        System.out.println(resultado);

    }
}

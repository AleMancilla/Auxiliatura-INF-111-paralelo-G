// Problem C: Invirtiendo palabras
// Time Limit: 1 Sec  Memory Limit: 128 MB
// Enviar: 47  Resuelto: 27
// [Enviar][Estado][Foro]
// Descripción
// Queremos jugar un poco con los textos asi que te piden invertir cada palabra de un texto pero mantenerlo en su posición

// Entrada
// Se ingresara una cadena de texto simple

// Salida
// deberá invertir cada palabra y mantenerlo en su posición 

// Ejemplo Entrada
// hola mundo DE INFO
// Ejemplo Salida
// aloh odnum ED OFNI

import java.util.Scanner;

public class P2269_InvirtiendoPalabras {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String cadena = sc.nextLine();

        cadena = cadena +" ";
        String resultado = "";

        String palabraTemp = "";

        for (int i = 0; i < cadena.length(); i++) {
            String let = cadena.substring(i, i+1);
            // resultado = let + resultado ;
            if(let.equals(" ")){
                
                if(i==cadena.length() -1 ){
                    resultado = resultado + palabraTemp;
                }else{
                    resultado = resultado + palabraTemp + " " ;
                }
                palabraTemp = "";
            }else{

                palabraTemp = let + palabraTemp ;
            }

            
        }
        System.out.println(resultado);
    }
}

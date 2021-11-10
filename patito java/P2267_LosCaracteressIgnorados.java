import java.util.Scanner;

// Problem B: Los caracteres ignorados
// Time Limit: 1 Sec  Memory Limit: 128 MB
// Enviar: 45  Resuelto: 27
// [Enviar][Estado][Foro]
// Descripción
// Cada texto u oración usualmente ignora a muchos caracteres sin que nos demos cuenta, asi pues hay podemos entender que hay más de 1 caracter ignorado en cualquier texto pero podria existir algun texto con todos los caracteres del alfabeto, aunque para este ejercicio ignoraremos la “ñ”

// Entrada
// Se ingresara una cadena de texto y se garantiza que todas las letras seran minusculas y no contendra la letra “ñ”

// Salida
// deberá imprimir todos los caracteres del alfabetos que fueron ignorados y en caso de que ninguna letra fuera ignorada imprimir “NO SE IGNORO A NINGUN CARACTER”

// Ejemplo Entrada
// adelante informatica
// Ejemplo Salida
// bghjkpqsuvwxyz
// Ayuda

public class P2267_LosCaracteressIgnorados {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String cadena = in.nextLine();

        //abcdefghijklmnopqrstuvwxyz

        String alfabeto = "abcdefghijklmnopqrstuvwxyz";
        for (int i = 0; i < cadena.length(); i++) {
            String let = cadena.substring(i, i + 1);
            alfabeto = quitarLetra(alfabeto, let);
        }

        if(alfabeto.length() == 0){
            System.out.println("NO SE IGNORO A NINGUN CARACTER");
        }else{
            System.out.println(alfabeto);
        }

        
    }

    public static String quitarLetra(String cadena, String letra){
        String caderaResultado = "";
        for (int i = 0; i < cadena.length(); i++) {
            String let = cadena.substring(i, i + 1);
            if( ! letra.equals(let)){
                caderaResultado = caderaResultado + let;
            }
            
        }
        return caderaResultado;
    }


}

import java.util.Scanner;

public class cadenasEjemplo {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        // "asdasda  jdaks fhasd k" ----- "hdsal"

        String cadena = in.nextLine();
        String x = in.nextLine();

        int lenX = x.length();
        int contador = 0;

        for (int i = 0; i <= cadena.length()-lenX; i++) {
            // System.out.println("___"+cadena.substring(i, i+lenX)+"==="+x.equals(cadena.substring(i, i+lenX)));
            if(x.equals(cadena.substring(i, i+lenX))){
                contador=contador+1;
            }
        }

        System.out.println("Encontro "+contador+" veces");
    }
}

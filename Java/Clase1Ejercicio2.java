import java.util.Scanner;

public class Clase1Ejercicio2 {
    public static void main(String[] arg){ // inicio
        
        Scanner leer = new Scanner(System.in);  // leer datos de consola

        double sueldoBase = leer.nextDouble();

        int venta1 = leer.nextInt();
        int venta2 = leer.nextInt();
        int venta3 = leer.nextInt();

        double c1 = 0.1 * venta1;
        double c2 = 0.1 * venta2;
        double c3 = 0.1 * venta3;

        double comiciones = c1 + c2 + c3;

        double total = sueldoBase + comiciones ;

        System.out.println(total);

        leer.close();
    } // fin

}




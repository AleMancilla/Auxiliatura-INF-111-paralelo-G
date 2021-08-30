import java.util.Scanner;

public class EjercicioCondicional1 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        int monto = 1500;

        System.out.println("INTRODUZCA HORAS: ");
        int horas = leer.nextInt(); // introduzcan datos por teclado

        System.out.println("INTRODUZCA MINUTOS");
        int minutos = leer.nextInt();

        if(minutos > 0){
            horas = horas+1;
        }

        int fin = horas * monto;

        System.out.println("El monto a pagar es: ");
        System.out.println(fin + " Bs.");
    }
}

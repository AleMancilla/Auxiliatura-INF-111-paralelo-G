import java.util.Scanner;

public class SerieOculta {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        double denominador = 2;
        double numerador = 4;

        int serieIntermedia = 3;

        int  a = 1;
        int  b = 0;
        int c = a+b;

        double resultado = 0;

        for (int i = 0; i < n; i++) {
            resultado = resultado + numerador/denominador;
            System.out.println(numerador + "/"+ denominador);
            numerador = numerador + serieIntermedia ;
            serieIntermedia = serieIntermedia + c;

            denominador = denominador +2 ;
            a=b;
            b=c;
            c=a+b;
            
        }

        System.out.println( "el resultado es: "+resultado);
    }
}

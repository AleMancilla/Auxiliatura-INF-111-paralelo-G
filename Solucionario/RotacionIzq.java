import java.util.Scanner;

public class RotacionIzq {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int nn = in.nextInt();
        for(int i = 0 ; i<nn ; i++){
            int x = in.nextInt(); //71893 -- 18937 -- 89371 -- 93718
            int n = in.nextInt(); //3

            int longitud = (int)(Math.log10(x)+1);
            longitud = longitud -1;

            System.out.println(longitud);
            for (int j = 0; j < n; j++) {
                int dig = (int) (x/Math.pow(10, longitud));
                int nuevoNumero = (int) (x%Math.pow(10, longitud));

                nuevoNumero = nuevoNumero *10 +dig;
                x= nuevoNumero;
            }
            System.out.println(x);
        }
    }
}

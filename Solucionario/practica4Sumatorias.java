import java.util.Scanner;

public class practica4Sumatorias {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int x = in.nextInt();

        int serie1 = 1;
        int serie2 = 0;

        int limitSerie1 = 3;
        int limitSerie2 = 3;

        double resultado = 0 ;


        for (int i = 0; i < n; i++) {
            int numerador = (int)Math.pow(x, serie1);
            int factorial = 1;
            for (int j = 1; j <= serie2; j++) {
                factorial = factorial * j;
            }
            
            
            int denominador = factorial;
            if(i == 0 ){
                System.out.println(numerador+"/"+denominador);
                resultado = resultado + numerador/denominador;
            }else{

                if( i % 2 == 0){
                    System.out.println("+"+numerador+"/"+denominador);
                    resultado = resultado + numerador/denominador;
                }else{
                    System.out.println("-"+numerador+"/"+denominador);
                    resultado = resultado - numerador/denominador;
                }
            }

            serie1++;
            serie2++;

            if(serie1 > limitSerie1){
                serie1 =1;
            }
            
            if(serie2 > limitSerie2){
                serie2 =0;
            }
        }

        System.out.println("El resultado es: "+ resultado);

    }
}

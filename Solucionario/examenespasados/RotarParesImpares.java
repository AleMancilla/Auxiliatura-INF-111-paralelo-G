import java.util.Scanner;

public class RotarParesImpares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int roteIzq = sc.nextInt();
        // int roteDer = sc.nextInt();
        int numero = sc.nextInt();

        // System.out.println(rotarIzqPares(numero));

         String cadena = "15";
         String cadena2 = "25";
         int suma = Integer.parseInt(cadena) + Integer.parseInt(cadena2);
            System.out.println(suma);


    }

    public static int rotarIzqPares(int numero){
        // 394120 --- 392104
        // 39012

        int numGuardado = numero;
        int nuevoNumero = 0;
        int potencia = 1;
        while(numGuardado > 0){
            int  d = numGuardado % 10;
            numGuardado = numGuardado / 10;
            // 39

            System.out.println(d);


            if(d % 2 == 0){
                // 39412
                // nuevoNumero = 457
                // 39d12
                // 39012
                // 3901
                // nuevoNumero = 04
                // 39d1
                // 3921
                // 39
                int  numAux = numGuardado;
                int longitud = (int) ((Math.log10(numAux))+1);
                int numeroCompuestoCambiado = 0;
                boolean primerParIzq = false;
                System.out.println("numero a descomponer = "+ numAux);

                while (numAux > 0 ){
                    longitud = longitud -1;
                    int pot = (int)Math.pow(10, longitud);
                    int digito = numAux / pot   ;
                    // System.out.println("numero = "+ numAux + " longitud: "+ longitud+" potencia = " +(int)Math.pow(10, longitud)+" DIGITO = "+digito);
                    numAux = numAux % pot;
                    if(digito % 2 == 0){
                        if(!primerParIzq){
    
                            nuevoNumero = d*potencia + nuevoNumero;
                            // potencia = potencia * 10;
                            // numeroCompuestoCambiado =  numeroCompuestoCambiado * 10+d;
                        }else{
                            numeroCompuestoCambiado =  numeroCompuestoCambiado *10+digito;
                        }
                        primerParIzq = true;
                    }else{
                        numeroCompuestoCambiado =  numeroCompuestoCambiado *10+digito;
                    }
                }
                System.out.println("numero = "+ numGuardado + " numeroCompuestoCambiado = "+ numeroCompuestoCambiado);
                numGuardado = numeroCompuestoCambiado;
            }else{
                nuevoNumero = d*potencia + nuevoNumero;
                potencia = potencia * 10;
            }
        }

        return nuevoNumero;
    }

    public static int rotarDerImpares(int numero){

        return 0;
    }

}

import java.util.Scanner;

public class RotarNumerosParImpar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int izq = sc.nextInt();
        int der = sc.nextInt();
        String numero = sc.next();
        for (int i = 0; i < izq; i++) {
            numero = rotarIzqPar(numero);
            System.out.println("rotando izquierda = "+numero);
        }
        for (int i = 0; i < der; i++) {
            numero = rotarDerImPar(numero);
            System.out.println("rotando derecha = "+numero);
        }

        System.out.println("resultado = "+numero);


    }   
    
    public static String rotarIzqPar(String numero){
        int len = numero.length();
        int posicion = 0;
        boolean esPrimerPar = true;
        String resultado = "";//
        
        String valorARotar = "";


        for (int i = len -1; i >=0; i--) {
            String digito = numero.substring(i, i+1);
            if(esPar(digito)){
                if(esPrimerPar){ 
                    esPrimerPar = false;
                    posicion = i;
                    valorARotar = digito;

                    resultado = digito + resultado;

                }else{
                    String temp = digito;
                    resultado = valorARotar + resultado;
                    valorARotar = temp;
                }
            }else{
                resultado = digito + resultado;
            }
            
        }
        String resultadoFinal = "";

        for (int i = len -1; i >=0; i--) {
            String digito = resultado.substring(i, i+1);
            if(i == posicion){
                resultadoFinal = valorARotar + resultadoFinal;
            }else{
                resultadoFinal = digito + resultadoFinal;
            }
           

        }

        return resultadoFinal;
     }
    public static String rotarDerImPar(String numero){
        int len = numero.length();
        int posicion = 0;
        boolean esPrimerPar = true;
        String resultado = "";//
        
        String valorARotar = "";


        for (int i = 0; i < len; i++) {
            String digito = numero.substring(i, i+1);
            if(esImPar(digito)){
                if(esPrimerPar){ 
                    esPrimerPar = false;
                    posicion = i;
                    valorARotar = digito;

                    resultado =  resultado +digito;

                }else{
                    String temp = digito;
                    resultado =   resultado + valorARotar;
                    valorARotar = temp;
                }
            }else{
                resultado = resultado +digito;
            }
            
        }
        String resultadoFinal = "";

        for (int i = 0; i < len; i++) {
            String digito = resultado.substring(i, i+1);
            if(i == posicion){
                resultadoFinal = resultadoFinal + valorARotar ;
            }else{
                resultadoFinal = resultadoFinal + digito ;
            }
           

        }
        return resultadoFinal;
    }

    public static boolean esPar(String digito){ 
        switch (digito){
            case "0":
                return true;
            case "2":
                return true;
            case "4":
                return true;
            case "6":
                return true;
            case "8":
                return true;
            default:
                return false;
        }
    }

    public static boolean esImPar(String digito){ 
        switch (digito){
            case "1":
                return true;
            case "3":
                return true;
            case "5":
                return true;
            case "7":
                return true;
            case "9":
                return true;
            default:
                return false;
        }
    }
}

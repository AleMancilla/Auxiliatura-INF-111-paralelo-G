import java.util.Scanner;

public class MenuSwitch {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        /*
        dos variables A y B
        1. -- SUMAR
        2. -- RESTAR
        3. -- MULTIPLICAR
        4. -- DIVIDIR
        */
        int resultado = 0;
        System.out.println("Introduzca A: ");
        int a = in.nextInt();
        
        System.out.println("Introduzca B: ");
        int b = in.nextInt();
        
        System.out.println("1. -- SUMAR");
        System.out.println("2. -- RESTAR");
        System.out.println("3. -- MULTIPLICAR");
        System.out.println("4. -- DIVIDIR");

        System.out.println("Introduzca un numero del MENU: ");

        int indice = in.nextInt();


        switch(indice){
            case 1:
            resultado = a+b;
            break;

            case 2:
            resultado = a-b;
            break;

            case 3:
            resultado = a*b;
            break;
            
            case 4:
            resultado = a/b;
            break;

            default:
            resultado = a+b;
            break;

        }

        System.err.print("Tu resultado es: ");
        System.err.println(resultado);

        // if(indice == 1){
        //     resultado = a+b;
        // }
        // if(indice == 2){
        //     resultado = a-b;
        // }
        // if(indice == 3){
        //     resultado = a*b;
        // }
        // if(indice == 4){
        //     resultado = a/b;
        // }
        // if(indice > 4){
        //     resultado = a+b;
        // }

    }
}

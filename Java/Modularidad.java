import java.util.Scanner;

public class Modularidad {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        int resultado = 0;
        System.out.println("Introduzca A: ");
        int a = in.nextInt();
        
        System.out.println("Introduzca B: ");
        int b = in.nextInt();
        
        mostrarMenu();
        int indice = in.nextInt();
        resultado = operacionesDelMenu(a,b,indice);
        
        imprimirResultado(resultado);

        in.close();

    }


    public static void mostrarMenu(){ // procedimiento
        System.out.println("1. -- SUMAR");
        System.out.println("2. -- RESTAR");
        System.out.println("3. -- MULTIPLICAR");
        System.out.println("4. -- DIVIDIR");
        
        System.out.println("Introduzca un numero del MENU: ");
    }
    public static void imprimirResultado(int resu){ // procedimiento

        System.err.print("Tu resultado es: ");
        System.err.println(resu);
    }

    public static int operacionesDelMenu(int a, int b, int indice){ //FUNCION realiza un retorno
        int res = 0;
        switch(indice){
            case 1:
            res = a+b;
            break;

            case 2:
            res = a-b;
            break;

            case 3:
            res = a*b;
            break;
            
            case 4:
            res = a/b;
            break;

            default:
            res = a+b;
            break;

        }
        return res;
    }
}
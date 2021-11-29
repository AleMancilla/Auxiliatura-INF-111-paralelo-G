import java.util.Scanner;

public class Ejer1 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int x = leer.nextInt();

        int len = longitudDeNumero(x);
        // System.out.println(len);

        int[] vec = new int[len];

        vec = llenarVectorDesdeNumero(x,len);
        imprimirV(vec,len);

    }

    public static int longitudDeNumero(int x){
        int n = x;
        int cont = 0;
        while(n>0){
            cont++;
            n=n/10;
        }
        return cont;
    }

    public static int[] llenarVectorDesdeNumero(int x, int len){
        int n = x;
        int[] vecRes = new int[len];
        for (int i = len-1; i >= 0; i--) {
            vecRes[i] = n%10;
            n=n/10;
        }

        return vecRes;
        
    }

    public static void imprimirV(int[] x, int n){
        System.out.print("[ ");
        for (int i = 0; i < n; i++) {
            System.out.print(x[i] + ", ");
        }
        System.out.println(" ]");
    }
    

}

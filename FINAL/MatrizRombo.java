import java.util.Scanner;

public class MatrizRombo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[][] a = new int[n][n];
        llenarMatriz(a, n);
        imprimirMatriz(a, n, n);

    }

    public static void llenarMatriz(int[][] a ,int n){

        int limi = n/2;
        int limd = n/2;
        int snn = 1 ;

        int cambio = 1;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(j>= limi && j <= limd){
                    a[i][j] = snn;
                    snn = snn+1;
                }
            }
            limi = limi + (-1 * cambio);
            limd = limd + (+1 * cambio);

            if(limi == 0){
                cambio = cambio * -1;
            }
            // if(limd == n){

            // }
        }
    }

    
    public static void imprimirMatriz(int[][] mat ,int n,int m){
        for (int i = 0; i < n ; i++) {

            for (int j = 0; j < m ; j++) {
                System.out.print(mat[i][j]+",\t");
            }

            System.out.println();
        }

    }

}

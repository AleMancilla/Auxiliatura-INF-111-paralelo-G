import java.util.Scanner;

public class Matrices {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int m = n;

        int[][] matriz = new int[n][m];


        matrizIdentidadPrincial(matriz, n, m);
        matrizIdentidadSecundaria(matriz, n, m);
        

        imprimirMatriz(matriz, n, m);

    }


    public static void imprimirMatriz(int[][] mat ,int n,int m){
        for (int i = 0; i < n ; i++) {

            for (int j = 0; j < m ; j++) {
                System.out.print(mat[i][j]+", ");
            }

            System.out.println();
        }

    }

    
    public static void matrizIdentidadPrincial(int[][] mat ,int n,int m){
        
        for (int i = 0; i < n ; i++) {

            for (int j = 0; j < m ; j++) {
                if( i == j){

                    mat[i][j] = 1;
                }else{
                    mat[i][j] = 0;

                }


            }
            
        }

    }

    
    public static void matrizIdentidadSecundaria(int[][] mat ,int n,int m){
        
        for (int i = 0; i < n ; i++) {

            mat[i][(n-1)-i] = 1;
            
        }

    }


}

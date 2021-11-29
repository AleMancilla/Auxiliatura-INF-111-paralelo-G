import java.util.Scanner;

public class MatrizRelioj {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        int m = n;

        int[][] mat = new int[n][m];

        int limIzq = 0;
        int limDer = n-1;

        for (int i = 0; i < n/2; i++) {
            for (int j = 0; j < m; j++) {
                System.out.println( i+", "+j+", "+limIzq+", "+limDer);
                if(j>= limIzq && j<= limDer){
                    mat[i][j] = 1;
                }else {
                    mat[i][j] = 0;

                }

            }
            limDer --;
            limIzq++;
        }
        limDer = n /2+1;
        limIzq = n/2-1;
        System.out.println(limDer);
        System.out.println(limIzq);
        for (int i = n/2 ; i < n; i++) {
            for (int j = 0; j < m; j++) {
                // System.out.println( i+", "+j+", "+limIzq+", "+limDer);
                if(j>= limIzq && j< limDer){
                    mat[i][j] = 1;
                }else {
                    mat[i][j] = 0;

                }

            }
            limDer ++;
            limIzq--;
        }
        imprimirMatriz(mat, n, m);


    }


    
    public static void imprimirMatriz(int[][] mat ,int n,int m){
        for (int i = 0; i < n ; i++) {
            for (int j = 0; j < m ; j++) {
                System.out.print(mat[i][j]+", ");
            }
            System.out.println();
        }
    }

}

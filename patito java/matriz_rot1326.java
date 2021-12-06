import java.util.Scanner;

public class matriz_rot1326 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();

        int[][] a= new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                a[i][j] = in.nextInt();
            }
        }


        int x = in.nextInt();
        buscarX(a, n, m, x);

        


    }

    
    public static void imprimirMatriz(int[][] mat ,int n,int m){
        for (int i = 0; i < n ; i++) {

            for (int j = 0; j < m ; j++) {
                System.out.print(mat[i][j]+",\t");
            }

            System.out.println();
        }

    }
    
    public static void buscarX(int[][] mat ,int n,int m, int x){
        
        int mi = n /2;
        int mj = m /2;
        int men = -1;
        System.out.println("entro a buscar");
        for (int i = 0; i < n ; i++) {
            for (int j = 0; j < m ; j++) {
                if(mat[i][j] == x){
                    System.out.println("Encontrado en "+i+"--"+j+" el elemento "+x);
                    //primer cuadrante
                    if(i<=mi && j <= mj){
                        System.out.println("la respuesta es: "+(i+j));
                        if((i+j)<men){
                            men = i+j;
                        }
                    }
                    //segundo cuadrante
                    if(i<=mi && j > mj){
                        System.out.println("la respuesta es: "+(i+m-j));
                        if((i+m-j)<men){
                            men = i+m-j;
                        }
                    }
                    //tercero cuadrante
                    if(i>mi && j <= mj){
                        System.out.println("la respuesta es: "+(n-i+j));
                        if((n-i+j)<men){
                            men = n-i+j;
                        }
                    }
                    //cuarto cuadrante
                    if(i>mi && j >mj){
                        System.out.println("la respuesta es: "+(n-i+m-j));
                        if((n-i+m-j)<men){
                            men = n-i+m-j;
                        }
                    }
                }
            }
        }
        System.out.println("###### "+men);

    }

}

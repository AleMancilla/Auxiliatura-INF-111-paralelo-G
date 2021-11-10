import java.util.Scanner;

public class P2245_RotacionDelArrayDePrefijos {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        int [] v = new int[n];

        // leyendo vector
        for (int i = 0; i < n; i++) {
            v[i] = in.nextInt();
        }

        int suma = 0;
        int[] s = new  int[n];
        for (int i = 0; i < n; i++) {
            suma = suma + v[i];
            s[i] = suma;
        }

        if(s[n-1] %2 == 0){
            s = rotarDer(s);

        }else{
            s = rotarIzq(s);
        }

        for (int i = 0; i < n; i++) {
            if (i == n-1) {
                System.out.print(s[i]);
            }else{
                System.out.print(s[i]+" ");
            }
            
        }
        
    }


    public static int[] rotarDer(int[] vector){
        //rotar der
        int temp = 0;
        for (int i = vector.length -1 ; i > 0 ; i--) {
            if(i==vector.length -1){
                temp = vector[i];
            }
            vector[i] = vector[i-1];
        }
        vector[0] = temp;

        return vector;
    }

    
    public static int[] rotarIzq(int[] vector){
        int temp = 0;
        for (int i = 0; i < vector.length -1; i++) {
            if(i==0){
                temp = vector[i];
            }

            vector[i]=vector[i+1];

        }

        vector[vector.length-1] = temp;
        return vector;
    }
}

//5
//1 4 2 5 7

import java.util.Scanner;

public class ejerordenamiento {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        llenarVector(a);
        if(n%2==0){
            System.err.println("-1");
        }else{
            burbuja(a);
            int mid = n/2;
            System.out.println(a[mid]);;
        }
        
        // burbuja(a);
        // imprimirVector(a);

    }

    public static void burbuja(int[] v){
        for(int i  = 0; i< v.length; i++){
            for( int j = i+1; j< v.length; j++){
                if(v[i] > v[j]){ // v[i] = 5 ---- v[j] = 1
                    int aux = v[i];
                    v[i]=v[j];
                    v[j]=aux;
                }
            }
        }
    }

    
    public static void imprimirVector(int[] a){
        for( int i = 0 ; i<a.length ; i++){
            System.out.print(a[i]+", ");
        }
        System.out.println();
    }

    
    public static void llenarVector(int[] a){
        Scanner in =  new Scanner(System.in);
        for( int i = 0 ; i<a.length ; i++){
            a[i] = in.nextInt();
        }
    }
}

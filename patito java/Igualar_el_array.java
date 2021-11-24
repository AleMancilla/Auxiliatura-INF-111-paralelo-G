import java.util.Scanner;

/**
 Problem A: Igualar el array
Time Limit: 1 Sec  Memory Limit: 128 MB
Enviar: 645  Resuelto: 339
[Enviar][Estado][Foro]
Descripción
Pepe tiene un array  de n enteros definido como A=a0,a1,...,an−1. En una operacion, el puede eliminar un elemento del array. Pepe quiere que todos los elementos del array sean igual a otro. Para esto, el puede eliminar uno o mas elementos del array. Encuentra e imprime el mínimo número de operaciones de eliminación que Pepe debe realizar tal que todos los elementos del array sean iguales.

Entrada
La primera linea contiene un entero n(1≤n≤100), denotando el numero de elementos del array A.

La siguiente línea contiene n números enteros ai(0≤i<n,1≤ai≤100).

Salida
Imprimir en una linea un entero que denota el mínimo numero de elementos que Pepe debe eliminar para que todos los elementos en el array sean iguales. 

Ejemplo Entrada
5
3 3 2 1 3
Ejemplo Salida
2
 */
public class Igualar_el_array {

    public static void main(String[] args) {
        Scanner in =  new Scanner(System.in);
        int n = in.nextInt();

        int[] a = new int[n];
        int[] b = new int[n];

        for(int i = 0 ; i<b.length; i++){
            b[i]=Integer.MIN_VALUE;
        }
        

        llenarVector(a,n);

        int contador = 0;

        int posicionB = 0;

        for(int i = 0 ; i<a.length; i++){
            // a[i]
            boolean res = buscarNum(b,a[i]);
            if(res == true){
                contador = contador+1;
            }else{
                b[posicionB] = a[i];
                posicionB = posicionB+1;
            }
        }

        imprimirVector(b,n);
        System.out.println(contador);

        // imprimirVector(a,n);

        

    }


    public static void llenarVector(int[] a, int n){
        Scanner in =  new Scanner(System.in);
        for( int i = 0 ; i<n ; i++){
            a[i] = in.nextInt();
        }
    }
    
    public static void imprimirVector(int[] a, int n){
        for( int i = 0 ; i<n ; i++){
            System.out.print(a[i]+", ");
        }
        System.out.println();
    }

    public static boolean buscarNum(int[] vec, int num){
        // busqueda secuencial
        boolean encontro = false ;
        for(int i = 0 ; i<vec.length ; i++){ 
            if(vec[i] == num){
                encontro=true;
            }
        }

        // if(encontro){//encontro == true
        //     return true;
        // }else{
        //     return false;
        // }

        return encontro;

    }


}
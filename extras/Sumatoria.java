import java.util.Scanner;

public class Sumatoria {
   public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int x = in.nextInt();
    int a = 5;
    int b = 2;
    int cont = 1;

    double suma = 0;
    for (int i = 0; i < n; i++) {

        // System.out.println("count=>"+cont);
        // System.out.println("a=>"+a);
        // System.out.println("b=>"+b);
        if(cont>3){
            a=a*2;
            b=b+2;
            cont = 1;
        }
        System.out.print("x^"+a+"/"+b+" , ");
        int aux = a;
        a = b;
        b=aux;
        // if(i%2==0){
        //     // System.out.print("x^"+a+"/"+b+" , ");
            suma = suma+ Math.pow(x, a) / b;

        // }else{
        //     // System.out.print("x^"+b+"/"+a+" , ");
        //     suma = suma+ Math.pow(x, b) / a;
        // }

        cont++;
    }

    System.out.println(suma);
   } 
}

import java.util.Scanner;

/**
 * solucionario42000
 */
public class solucionario42000 {

    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);
        int cont =0 ;
        boolean flag = false;

        int xa = 0;

        int x = in.nextInt();
        while (x>0) {
            if(xa % 2 == 1 && x%2==0 ){
                flag = true;
            }else{
                if(flag == true){

                    if(x%2==0){

                        int suma = xa +x;
                        System.out.println("la suma es: "+suma);
                        flag = false;
                    }else{
                        flag = false;
                    }
                }
            }
            xa=x;
            x=in.nextInt();
        }
    }
}
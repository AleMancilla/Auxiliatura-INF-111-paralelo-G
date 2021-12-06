import java.util.Scanner;

public class LiberacionEjer1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int num = 2;
        int den = 2;

        int n = in.nextInt();
        int i = 0;

        int cont = 0;

        int lim = den;

        while(i < n){
            System.out.print(num + "/"+den + ", ");
            i++;
            cont++;

            if(cont >= lim){
                cont = 0;
                lim = lim +2;
                den = den +2;
            }
            if(cont == lim){
                num = num+den+2;
            }else{
                num = num+den;
            }
            
        }

    }
}

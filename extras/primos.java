import java.util.Scanner;

public class primos {
    public static void main(String[] args) {
        // 2,3,5,7,11,13,
        // 7 solo es divisible entre 1 y si mismo 7 / 2,3,4,5,6 ----- 1 7
        // 11 solo es divisible entre 1 y si mismo 7 / 2,3,4,5,6,7,8,9,10 ----- 1 11

        // 15 es divisible 1,3,5,15 ------ 2,4,6,7,8,9,10,11,12,13,14
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int i = 2;
        int c = 0;
        while(c<n) {
            boolean esPrimo = true;
            for (int j = 2; j < i; j++) { // j 10 i 5
                if(i%j==0){
                    esPrimo = false;
                }
            }
            if(esPrimo){
                System.out.println(i);
                c ++;
                esPrimo = false;
            }
            i++;
        }
    }

}

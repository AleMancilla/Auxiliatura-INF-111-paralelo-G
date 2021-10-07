import java.util.Scanner;

public class gradas {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = 0;
        do{
            n = in.nextInt();
            int nroLineas = n*2 +1;
            if(n != -1){
                System.out.println(nroLineas);
            }
        }while(n != -1);
    }
}

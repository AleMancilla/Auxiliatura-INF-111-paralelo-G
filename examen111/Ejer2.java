import java.util.Scanner;

public class Ejer2 {
   public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String x = in.nextLine();
        x= intercambiarExtremos(x);
        System.out.println(x);
   } 

   public static String intercambiarExtremos(String cad){
       int len = cad.length();
       String izq = cad.substring(0, 1);
       String der = cad.substring(len-1,len);
       cad = der + cad.substring(1, len-1) + izq ;
       return cad;
   }
}

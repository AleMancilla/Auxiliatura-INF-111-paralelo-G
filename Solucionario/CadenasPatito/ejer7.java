package CadenasPatito;

import java.util.Scanner;

public class ejer7 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String x = in.next();
        String y = in.next();

        int valorX = 0;
        int valorY = 0;

        for (int i = 0; i < x.length(); i++) {
            if (x.substring(i,i+1).equals("x")) {
                valorX = valorX+1;
            }            
            if (x.substring(i,i+1).equals("o")) {
                valorX = valorX+2;
            }            
        }
        for (int i = 0; i < y.length(); i++) {
            
            if (y.substring(i,i+1).equals("x")) {
                valorY = valorY+1;
            }            
            if (y.substring(i,i+1).equals("o")) {
                valorY = valorY+2;
            }         
        }
        
        System.out.println(valorX);
        System.out.println(valorY);
        int diferencia = 0;

        if(valorX == valorY){
            System.out.println(x + "    "+y);
        }else{

            if(valorX > valorY){
                diferencia=valorX-valorY;
                for (int i = 0; i < diferencia/2 ; i++) {
                    y=y+"o";
                }
                diferencia = diferencia %2;
                for (int i = 0; i < diferencia; i++) {
                    y=y+"x"; 
                }
                System.out.println(x + "    "+y);
            }else{
                diferencia=valorY-valorX;
                for (int i = 0; i < diferencia/2; i++) {
                    x=x+"o";
                }
                diferencia = diferencia %2;
                for (int i = 0; i < diferencia; i++) {
                    x=x+"x"; 
                }
                System.out.println(x + "    "+y);
            }
        }



    }
    
}

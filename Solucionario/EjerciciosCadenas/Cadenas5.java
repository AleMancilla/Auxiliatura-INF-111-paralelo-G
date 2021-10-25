// Dada una cadena X, y un car´acter a, responda un n´umero que indique la posici´on
// de la cadena en la que est´a la primera ocurrencia del car´acter a. Si el car´acter a
// no est´a en la cadena, el n´umero retornado debe ser -1.Se lee la cadena hasta que
// aparezca la palabra end.
// Ejemplo Entrada Ejemplo Salida
// Ejemplo Entrada 
// 	Hola como estas
// 	a
// 	hola mundo
// 	x
// 	end


// Ejemplo Salida 
// 	3
// 	-1



package EjerciciosCadenas;

import java.util.Scanner;

public class Cadenas5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String pal = in.nextLine();
        while ( ! pal.equals("end") ){
            
            String caracter = in.next();
            in.nextLine(); // esto solo despúes de un in.next y si despues se usara un in.nextline

            boolean yaencontro=false;
            for (int i = 0; i < pal.length(); i++) {
                String d = pal.substring(i, i+1);
                if(d.equals(caracter) && yaencontro == false){
                    System.out.println(i);
                    yaencontro=true;
                }
            }

            if( !yaencontro ){ // yaencontro == false
                System.out.println("-1");
            }

            pal = in.nextLine();
        }
        
    }
}

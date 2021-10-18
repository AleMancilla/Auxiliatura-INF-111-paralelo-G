public class Cadenas {
    public static void main(String[] args) {
        
        String nombre = "Alejandro ";
        String apellidos = "Mancilla Huanca";
        // String nombreCompleto = nombre + apellidos; // "Alejandro Mancilla Huanca"
        String nombreCompleto = "hola soy german hola"; // "x soy german"


        // String respuesta =  nombreCompleto.substring(5,8); //"ndr"

        int longitud = nombreCompleto.length();
        int contA = 0;

        String nuevaPal = "";
        for(int i = 0; i<= longitud-4; i=i+4){
            String d = nombreCompleto.substring(i, i+4);
            System.out.println(d);
            

            if( d.equals("hola")){
                contA++;
                nuevaPal = nuevaPal + "x";
            }else{
                nuevaPal = nuevaPal + d;
            }
             
            
        }
        System.out.println("la nueva palabra es = "+nuevaPal);


    }
}

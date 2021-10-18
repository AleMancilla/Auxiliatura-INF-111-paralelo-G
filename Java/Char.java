public class Char {
    public static void main(String[] args) {
        char digitos = 'a';

        String texto = "Hola mundo";

        char d = texto.charAt(3);

        System.out.println(d);

        if(d == 117){
            System.out.println("SI");
        }else{
            System.out.println("NO");
        }

    }
}

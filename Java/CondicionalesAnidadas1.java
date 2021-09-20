import java.util.Scanner;

public class CondicionalesAnidadas1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        if( (n%2 == 0) && (n > 0) ){
            System.out.println("Es par y es positivo");
        }else{
            System.out.println("Es impar o es negativo");
        }
        in.close();
    }
}

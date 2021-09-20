import java.util.Scanner;

public class RepetitivosSerieTriple {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        int SumTwo = 1 ;
        int SumOne = 1;
        int SumNat = 2;

        // series combinadas
        int pcafe = 1;
        int pazul = 5;
        int projo = 2;

        int se = 1;

        int n = in.nextInt();

        for (int i = 0; i < n; i++){

            if(i%3 == 0){ 
                se = pcafe;
                pcafe = pcafe +SumOne;
            }

            if( i%3 == 1){
                se = pazul;
                pazul = pazul + SumNat;
                SumNat = SumNat +1;
            }

            if( i%3 == 2){
                se = projo;
                projo = projo + SumTwo;
            }
            
            System.out.print(se + ", ");
        }
        in.close();

    }
}

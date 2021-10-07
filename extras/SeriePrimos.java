import java.util.Scanner;

public class SeriePrimos {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int i = 1;
        int p = 2;
        int d = 2;

        int a = -1;
        int b=1;
        int c=a+b;

        while(i<=n){
            if(i%2==0){
                System.out.print(c+",");
                i++;
                a=b;
                b=c;
                c=a+b;
            }else{
                if(p%d==0){
                    if(p==d){
                        System.out.print(p+",");
                        i++;
                    }
                    d=2;
                    p=p+1;
                }else{
                    d=d+1;
                }
            }
            
        }

    }
}

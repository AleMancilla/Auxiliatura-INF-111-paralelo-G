import java.util.Scanner;

public class Fechas {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        int anios ;
        int meses;
        int dias;
        int horas;
        int minutos;

        
        int addAnios ;
        int addMeses;
        int addDias;
        int addHoras;
        int addMinutos;

        // Fecha inicial
        System.out.println("Introduzca añios");
        anios = in.nextInt();

        System.out.println("Introduzca meses");
        meses = in.nextInt();

        System.out.println("Introduzca dias");
        dias = in.nextInt();

        System.out.println("Introduzca horas");
        horas = in.nextInt();

        System.out.println("Introduzca minutos");
        minutos = in.nextInt();

        //fecha a adicionar
        System.out.println("Introduzca añios a adicionar");
        addAnios = in.nextInt();

        System.out.println("Introduzca meses a adicionar");
        addMeses = in.nextInt();

        System.out.println("Introduzca dias a adicionar");
        addDias = in.nextInt();

        System.out.println("Introduzca horas a adicionar");
        addHoras = in.nextInt();

        System.out.println("Introduzca minutos a adicionar");
        addMinutos = in.nextInt();



        minutos = minutos + addMinutos;
        horas = horas + addHoras;
        dias = dias  + addDias;
        meses = meses + addMeses;
        anios = anios + addAnios;

        System.out.print(anios);
        System.out.print("/");
        System.out.print(meses);
        System.out.print("/");
        System.out.print(dias);
        System.out.print(" - ");
        System.out.print(horas);
        System.out.print(":");
        System.out.print(minutos);
        
        if(minutos > 60){
            horas = horas + ( minutos / 60);
            minutos = minutos %60;
        }

        if ( horas > 24 ){
            dias = dias + ( horas / 24 );
            horas = horas % 24;
        }

        if(meses == 4 || meses == 6 || meses == 9 || meses == 11){ //mes de 30 dias
            if(dias > 30){
                meses = meses + ( dias / 30 );
                dias = dias % 30;
            }
        }else if(meses == 1 || meses == 3 || meses == 5 || meses == 7 || meses == 8 || meses == 10 || meses == 12){ //mes de 31 dias
            if(dias > 31){
                meses = meses + ( dias / 31 );
                dias = dias %31;
            }
        } else if(meses == 2){
            if(anios %4 == 0 ){ // anio biciesto
                if( dias > 29 ){
                    meses = meses + ( dias / 29 );
                    dias = dias %29;
                }
            }else{
                if( dias > 28 ){
                    meses = meses + ( dias / 28 );
                    dias = dias %28;
                }
            }
        }

        if( meses > 12 ){
            anios = anios + (meses/12);
            meses = meses % 12;
        }


        System.out.println("==============================");
        System.out.print(anios);
        System.out.print("/");
        System.out.print(meses);
        System.out.print("/");
        System.out.print(dias);
        System.out.print(" - ");
        System.out.print(horas);
        System.out.print(":");
        System.out.print(minutos);
        in.close();
    }
}

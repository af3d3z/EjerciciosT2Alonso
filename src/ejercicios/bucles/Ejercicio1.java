package ejercicios.bucles;

import java.util.Scanner;

public class Ejercicio1 {
    /*
     * PRUEBAS:
     * Entrada(hora, segundos) | ResIdeal     | ResObt
     * 20:59:59, 7200          | 22:59:59     | 22:59:59
     * 05:56:59, 156           | 05:58:56     | 05:58:56
     * 15:42:22, 29            | 15:45:51     | 15:45:51
     * */

    public static void main(String[] args) {
        int horas;
        int minutos;
        int segundos;
        int segundosIncrementar;
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el número de horas:");
        horas = sc.nextInt();
        while(horas < 0 || horas > 24){
            System.out.println("En un día sólo hay 24 horas, intentalo de nuevo:");
            horas = sc.nextInt();
        }

        System.out.println("Ingrese el número de minutos:");
        minutos = sc.nextInt();
        while(minutos < 0 || minutos > 59){
            System.out.println("En una hora sólo hay 59 minutos, intentalo de nuevo:");
            minutos = sc.nextInt();
        }

        System.out.println("Ingrese el número de segundos:");
        segundos = sc.nextInt();
        while(segundos < 0 || segundos > 59){
            System.out.println("En un minuto sólo hay 59 segundos, intentalo de nuevo:");
            segundos = sc.nextInt();
        }

        System.out.println("Introduzca el número de segundos que desea añadirle a la hora actual:");
        segundosIncrementar = sc.nextInt();

        if (segundosIncrementar > 3599) {
            horas += segundosIncrementar / 3600;
        } else if(segundosIncrementar > 59) {
            minutos += segundosIncrementar / 60;
            if(minutos > 59){
                minutos = minutos / 60;
                horas++;
            }
        }else{
            segundos += segundosIncrementar;
        }

        System.out.printf("%02d:%02d:%02d\n", horas, minutos, segundos);
    }
}

package ejercicios.condicionales;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio7 {
    /*
    * PRUEBAS:
    * Entrada    | ResIdeal     | ResObt
    * 20:59:59   | 21:00:00     | 21:0:0
    * 5:56:59    | 5:57:00      | 5:57:0
    * 15:42:22   | 15:42:23     | 15:42:23
    * */

    public static void main(String[] args) {
        final int HORAS = 24;
        final int MINUTOS = 60;
        final int SEGUNDOS = 60;

        int horaUsuario, minutoUsuario, segundoUsuario;
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el número de horas:");
        horaUsuario = sc.nextInt();
        while (horaUsuario > 24 || horaUsuario < 0){
            System.out.println("Error: Sólo hay 24 horas en el día. Vuelva a introducir el número de horas:");
            horaUsuario = sc.nextInt();
        }

        System.out.println("Ingrese el número de minutos:");
        minutoUsuario = sc.nextInt();
        while (minutoUsuario > 60 || minutoUsuario < 0){
            System.out.println("Error: Sólo hay 60 minutos en una hora. Vuelva a introducir el número de minutos:");
            minutoUsuario = sc.nextInt();
        }

        System.out.println("Ingrese el número de segundos:");
        segundoUsuario = sc.nextInt();
        while (segundoUsuario > 60 || segundoUsuario < 0){
            System.out.println("Error: Sólo hay 60 segundos en un minuto. Vuelva a introducir el número de segundos:");
            segundoUsuario = sc.nextInt();
        }

        segundoUsuario++;

        if (segundoUsuario >= SEGUNDOS) {
            minutoUsuario++;
            segundoUsuario = 0;
        }

        if (minutoUsuario >= MINUTOS) {
            horaUsuario++;
            minutoUsuario = 0;
        }

        if (horaUsuario >= HORAS)
            horaUsuario = 0;

        System.out.printf("Hora al añadirle un segundo: %d:%d:%d\n", horaUsuario, minutoUsuario, segundoUsuario);
        sc.close();
    }
}

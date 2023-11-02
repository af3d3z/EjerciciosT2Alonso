package ejercicios.condicionales;

import java.util.Scanner;

public class Ejercicio4 {
    /*
    * PRUEBAS:
    * Entrada | ResEsperado    | ResObtenido
    * 63      | sesenta y tres | sesenta y tres
    * 1       | uno            | uno
    * 14      | catorce        | catorce
    * 26      | veintiseis     | veintiseis
    * 98      | noventa y ocho | noventa y ocho
    */
    public static void main(String[] args) {
        int entradaUsuario;
        int d1, d2;
        String numero = "";
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un número del 1 al 99:");
        entradaUsuario = sc.nextInt();
        while(entradaUsuario <= 0 || entradaUsuario > 99){
            System.out.println("Número inválido o fuera de rango. Introduzcalo otra vez:");
            entradaUsuario = sc.nextInt();
        }

        // dividimos el número en dígitos
        d1 = entradaUsuario / 10;
        d2 = entradaUsuario % 10;

        numero += switch(d1){
            case 2 -> {yield("veinti");}
            case 3 -> {yield("treinta y ");}
            case 4 -> {yield("cuarenta y ");}
            case 5 -> {yield("cincuenta y ");}
            case 6 -> {yield("sesenta y ");}
            case 7 -> {yield("setenta y ");}
            case 8 -> {yield("ochenta y ");}
            case 9 -> {yield("noventa y ");}
            default -> "";
        };

        if(d1 != 1){
            numero += switch(d2){
                case 1 -> {yield("uno");}
                case 2 -> {yield("dos");}
                case 3 -> {yield("tres");}
                case 4 -> {yield("cuatro");}
                case 5 -> {yield("cinco");}
                case 6 -> {yield("seis");}
                case 7 -> {yield("siete");}
                case 8 -> {yield("ocho");}
                case 9 -> {yield("nueve");}
                default -> "";
            };

        }

        numero += switch(entradaUsuario){
            case 10 -> {yield("diez");}
            case 11 -> {yield("once");}
            case 12 -> {yield("doce");}
            case 13 -> {yield("trece");}
            case 14 -> {yield("catorce");}
            case 15 -> {yield("quince");}
            case 16 -> {yield("dieciseis");}
            case 17 -> {yield("diecisiete");}
            case 18 -> {yield("dieciocho");}
            case 19 -> {yield("diecinueve");}
            case 20 -> {yield("veinte");}
            case 30 -> {yield("treinta");}
            case 40 -> {yield("cuarenta");}
            case 50 -> {yield("cincuenta");}
            case 60 -> {yield("sesenta");}
            case 70 -> {yield("setenta");}
            case 80 -> {yield("ochenta");}
            case 90 -> {yield("noventa");}
            default -> "";
        };

        System.out.println(numero);
        sc.close();
    }
}

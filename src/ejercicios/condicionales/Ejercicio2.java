package ejercicios.condicionales;

import java.util.Scanner;

public class Ejercicio2 {
    /*
    * PRUEBAS:
    * Entrada    | ResIdeal    | ResObt
    * 28418425   | Q           | Q
    * 22917900   | X           | X
    * 99386162   | B           | B
    * */
    public static void main(String[] args) {
        //TODO: change the structure of the exercise to use a switch case
        long entradaUsuario;
        String letras = "TRWAGMYFPDXBNJZSQVHLCKE";
        int numLetra;
        char letra;
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese su DNI:");
        entradaUsuario = sc.nextLong();

        numLetra = (int) (entradaUsuario % 23);

        letra = switch(numLetra) {
            case 0 -> {yield('T');}
            case 1 -> {yield('R');}
            case 2 -> {yield('W');}
            case 3 -> {yield('A');}
            case 4 -> {yield('G');}
            case 5 -> {yield('M');}
            case 6 -> {yield('Y');}
            case 7 -> {yield('W');}
            case 8 -> {yield('W');}

        }

        letra = letras.charAt(numLetra);

        System.out.printf("Tu DNI completo sería: %d%c", entradaUsuario, letra);
        sc.close();
    }
}

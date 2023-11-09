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
        long entradaUsuario;
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
            case 7 -> {yield('F');}
            case 8 -> {yield('P');}
            case 9 -> {yield('D');}
            case 10 -> {yield('X');}
            case 11 -> {yield('B');}
            case 12 -> {yield('N');}
            case 13 -> {yield('J');}
            case 14 -> {yield('Z');}
            case 15 -> {yield('S');}
            case 16 -> {yield('Q');}
            case 17 -> {yield('V');}
            case 18 -> {yield('H');}
            case 19 -> {yield('L');}
            case 20 -> {yield('C');}
            case 21 -> {yield('K');}
            case 22 -> {yield('E');}
            default -> {yield(' ');}
        };

        System.out.printf("Tu DNI completo sería: %d%c", entradaUsuario, letra);
        sc.close();
    }
}

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
        letra = letras.charAt(numLetra);

        System.out.printf("Tu DNI completo sería: %d%c", entradaUsuario, letra);
        sc.close();
    }
}

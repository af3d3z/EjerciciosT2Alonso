package ejercicios.condicionales;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
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

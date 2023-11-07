package ejercicios.condicionales;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio5 {
    /*
    * PRUEBAS:
    * Entrada | ResEsperado | ResObtenido
    * -9      | 9           | 9
    * 5656    | 5656        | 5656
    * 895     | 895         | 895
    */

    public static void main(String[] args) {
        // guarda el número introducido por el usuario
        int entradaUsuario;
        int nAbsoluto;
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese un número:");
        entradaUsuario = sc.nextInt();

        nAbsoluto = (entradaUsuario < 0) ? entradaUsuario * -1 : entradaUsuario;

        System.out.println("Valor absoluto del número: " + nAbsoluto);
        sc.close();
    }
}

package ejercicios.bucles;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio8 {
    /*
    * PRUEBAS:
    * Entrada            | ResEsperado(nNumeros, nFallos)    | ResObtenido
    * 5 4 6 3 4 8 9 0    | 4, 3                              | 4, 3
    * 9 2 6 1 600 0      | 2, 3                              | 2, 3
    * 90 135 64 78 512 0 | 3, 2                              | 3, 2
    * */

    public static void main(String[] args) {
        int contador = 0;
        int contadorFallos = 0;
        int entradaUsuario = -1;
        int nAnterior = 0;
        Scanner sc = new Scanner(System.in);

        do{
            try {
                System.out.println("Introduzca un número:");
                entradaUsuario = sc.nextInt();

                /* si el numero es anterior al introducido anteriormente mostrará un mensaje
                * en cambio si es mayor se contará como número y se añadirá como número anterior
                * para la siguiente iteración y si es 0 salimos del bucle*/
                if(entradaUsuario == 0){
                    break;
                }
                else if(entradaUsuario < nAnterior){
                    System.out.println("Fallo: Un número no puede ser menor al introducido anteriormente.");
                    contadorFallos++;
                }else {
                    nAnterior = entradaUsuario;
                    contador++;
                }
            }catch(InputMismatchException e){
                System.err.println("Dato erroneo. Intentelo de nuevo.");
            }
        }while(entradaUsuario != 0);

        System.out.printf("Números introducidos: %d\nNúmero de fallos: %d\n", contador, contadorFallos);
    }
}

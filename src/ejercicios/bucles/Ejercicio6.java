package ejercicios.bucles;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio6 {
    /* PRUEBA:
    Entrada: 5
    Salida:
    1
    22
    333
    4444
    55555

    Entrada: 10
    Salida:
    1
    22
    333
    4444
    55555
    666666
    7777777
    88888888
    999999999
    10101010101010101010
     */

    public static void main(String[] args) {
        int numero;
        boolean correcto = false;
        Scanner sc = new Scanner(System.in);

        do{
            try {
                System.out.println("Introduce un número:");
                numero = sc.nextInt();

                /* el primer bucle se encarga de las filas y el segundo bucle imprime el numero de la fila tantas veces
                * como filas haya*/
                for(int i = 1; i <= numero; i++) {
                    for(int j = 1; j <= i; j++){
                        System.out.print(i);
                    }
                    System.out.println();
                }
                correcto = true;
            }catch(InputMismatchException e) {
                System.err.println("Has introducido un dato incorrecto. Intentalo de nuevo.");
                sc.nextLine();
            }
        }while(!correcto);
    }
}

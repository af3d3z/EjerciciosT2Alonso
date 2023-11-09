package ejercicios.bucles;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio2 {
    /*
     * PRUEBAS:
     * Entrada | ResIdeal                   | ResObt
     * 12      | 1 2 3 5 7 11               | 1 2 3 5 7 11
     * 6       | 1 2 3 5                    | 1 2 3 5
     * 26      | 1 2 3 5 7 11 13 17 19 23   | 1 2 3 5 7 11 13 17 19 23
     * */

    public static void main(String[] args) {
        int numero;
        boolean correcto = false;
        Scanner sc = new Scanner(System.in);
        boolean primo = true;

        do {
            try{
                System.out.println("Introduce un número:");
                numero = sc.nextInt();


                for(int i = 1; i <= numero;i++) {
                    primo = true;

                    /* mostramos el 1 y el dos porque sabemos que son primos y
                     que si en los siguientes bucles al contador le damos el valor 1
                     no mostrará ningún dato porque si a uno le quitas uno tienes cero
                     y eso hace que no se cumpla siquiera la condición del bucle for */
                    if(i <= 2)
                        System.out.printf("%d ", i);

                    for (int j = 2; j <= i - 1; j++) {
                        if (i % j == 0) {
                            primo = false;
                            j++;
                        }
                        if (j == i-1 && primo) {
                            System.out.printf("%d ", i);
                        }
                    }
                }
                correcto = true;
            }catch(InputMismatchException e){
                System.err.println("Has introducido un dato incorrecto.");
                sc.nextLine();
            }
        }while(!correcto);
        sc.close();
    }
}

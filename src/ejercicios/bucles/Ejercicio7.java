package ejercicios.bucles;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        int numero;
        boolean correcto = false;
        Scanner sc = new Scanner(System.in);

        do{
            try {
                System.out.println("Introduce un número:");
                numero = sc.nextInt();

                /* el primer for crea las lineas, el segundo para imprimir la primera parte de la pirámide
                * y el tercero para completarla */
                for(int i = 1; i <= numero; i++) {
                    for(int j = 1; j <= i; j++){
                        System.out.print(j);
                    }
                    if(i > 1){
                        for(int k = i-1; k > 0; k--){
                            System.out.print(k);
                        }
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

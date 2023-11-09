package ejercicios.bucles;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio3 {
    /*
     * PRUEBAS:
     * Entrada
     * 4:
     *     *
          * *
         * * *
        * * * *

     * 7:
     *       *
            * *
           * * *
          * * * *
         * * * * *
        * * * * * *
       * * * * * * *
     * */

    public static void main(String[] args) {
        int numero, n;
        Scanner sc = new Scanner(System.in);
        boolean correcto = false;

        do{
            try{
                System.out.println("Ingresa un número:");
                numero = sc.nextInt();
                n = numero;
                for(int i = 1; i <= numero; i++){
                    for(int j = 1; j <= numero; j++){
                        if(j>=n){
                            System.out.print("* ");
                        }else{
                            System.out.print(" ");
                        }
                    }
                    n--;
                    System.out.println();
                }
                correcto = true;
            }catch(InputMismatchException e){
                System.err.println("Valor incorrecto.");
            }
        }while(!correcto);
        sc.close();
    }
}

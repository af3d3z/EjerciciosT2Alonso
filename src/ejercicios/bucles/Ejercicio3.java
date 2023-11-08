package ejercicios.bucles;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        int numero;
        Scanner sc = new Scanner(System.in);
        boolean correcto = false;

        do{
            try{
                System.out.println("Ingresa un número:");
                numero = sc.nextInt();

                for(int i = 0; i < numero; i++){
                    for(int j = 0; j < i; j++){
                        System.out.print(" * ");
                    }
                    System.out.println();
                }
            }catch(InputMismatchException e){
                System.err.println("Valor incorrecto.");
            }
        }while(!correcto);
    }
}

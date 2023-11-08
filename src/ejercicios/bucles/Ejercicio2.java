package ejercicios.bucles;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        // TODO: terminar este ejercicio
        int numero;
        boolean correcto = false;
        Scanner sc = new Scanner(System.in);
        boolean primo = true;
        int j = 2;

        do {
            try{
                System.out.println("Introduce un número:");
                numero = sc.nextInt();


                for(int i = 1; i<= numero;i++){
                    while(j <= i-1 && primo){
                        if(i%j==0){
                            primo = false;
                            j++;
                        }
                        if(primo == true){
                            System.out.printf("%d ", i);
                            continue;
                        }
                    }
                }

                correcto = true;
            }catch(InputMismatchException e){
                System.err.println("Has introducido un dato incorrecto.");
                sc.nextLine();
            }
        }while(!correcto);
    }
}

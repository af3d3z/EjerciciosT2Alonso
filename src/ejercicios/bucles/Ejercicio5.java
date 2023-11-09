package ejercicios.bucles;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        int a, b, temp;
        int mcm = 0;
        int contador;
        Scanner sc = new Scanner(System.in);
        boolean correcto = false;

        do{
            try{
                System.out.println("Introduce un número:");
                a = sc.nextInt();
                System.out.println("Introduce otro número:");
                b = sc.nextInt();

                if(b>a){
                    temp = b;
                    b = a;
                    a = temp;
                }

                temp = a * b;

                for(int i = a; i <= temp; i++){
                    if(a * i == b * i){
                        mcm = i;
                        System.out.println(mcm);
                        break;
                    }
                    System.out.println(i);
                }

                System.out.printf("MCM: %d\n", mcm);
                correcto = true;
            }catch(InputMismatchException e){
                System.out.println("Dato inválido.");
                sc.nextLine();
            }
        }while(!correcto);

    }
}

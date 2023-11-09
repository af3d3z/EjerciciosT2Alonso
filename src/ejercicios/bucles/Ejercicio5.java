package ejercicios.bucles;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio5 {
    /*
     * PRUEBAS:
     * Entrada(a,b) | ResIdeal | ResObt
     * 12, 18       | 36       | 36
     * 180, 324     | 1620     | 1620
     * 2,6          | 6        | 6
     * */
    public static void main(String[] args) {
        int a, b, temp;
        int mcm = 0;
        int mcd = 0;
        int contador;
        int aMultiplo;
        Scanner sc = new Scanner(System.in);
        boolean correcto = false;

        do{
            try{
                System.out.println("Introduce un número:");
                a = sc.nextInt();
                System.out.println("Introduce otro número:");
                b = sc.nextInt();

                // intercambio las variables si 'b' es mayor a 'a'
                if(b>a){
                    temp = b;
                    b = a;
                    a = temp;
                }

                // itera desde a hasta 0 comprobando si los números son divisores.
                for(int i = a; i > 0; i--){
                    if(a % i == 0 && b % i == 0){
                        mcd = i;
                        break;
                    }
                }

                mcm = (a * b) / mcd;

                System.out.printf("MCM: %d\n", mcm);
                correcto = true;
            }catch(InputMismatchException e){
                System.out.println("Dato inválido.");
                sc.nextLine();
            }
        }while(!correcto);

    }
}

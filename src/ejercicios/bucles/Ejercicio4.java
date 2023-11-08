package ejercicios.bucles;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        int a, b, mcd = 0, temp;
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

                for(int i = a; i > 0; i--){
                    if(a % i == 0 && b % i == 0){
                        mcd = i;
                        break;
                    }
                }
                System.out.printf("MCD: %d\n", mcd);
                correcto = true;
            }catch(InputMismatchException e){
                System.out.println("Dato inválido.");
                sc.nextLine();
            }
        }while(!correcto);

    }
}

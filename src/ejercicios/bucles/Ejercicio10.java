package ejercicios.bucles;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio10 {
    /*
     * PRUEBAS:
     * Entrada     | ResEsperado  | ResObtenido
     *  5          | 1            | 1
     *  5645748    | 7            | 7
     *  68         | 2            | 2
     * */

    public static void main(String[] args) {
        int entradaUsuario;
        int numInverso = 0;
        int auxiliar;
        int ultimaCifra;
        Scanner sc = new Scanner(System.in);
        boolean correcto = false;

        do{
            try{
                System.out.println("Introduzca un número:");
                entradaUsuario = sc.nextInt();

                if(entradaUsuario <= 0){
                    System.out.println("Introduzca un número mayor a 0.");
                    sc.nextLine();
                }else{
                    /* mientras que auxiliar sea mayor a 0  se obtiene la ultima cifra y se va sumando al numeroInverso
                    * multiplicado por 10*/
                    auxiliar = entradaUsuario;
                    while(auxiliar > 0) {
                        ultimaCifra = auxiliar % 10;
                        numInverso = numInverso * 10 + ultimaCifra;
                        auxiliar /= 10;
                    }

                    if(entradaUsuario == numInverso) {
                        System.out.printf("El número %d es capicúa.", entradaUsuario);
                    }else {
                        System.out.printf("El número %d no es capicúa.\n", entradaUsuario);
                    }
                    correcto = true;
                }

            }catch(InputMismatchException e){
                System.err.println("El dato introducido es incorrecto.");
                sc.nextLine();
            }
        }while (!correcto);

    }
}

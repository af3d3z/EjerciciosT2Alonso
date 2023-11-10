package ejercicios.bucles;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio9 {
    /*
     * PRUEBAS:
     * Entrada     | ResEsperado  | ResObtenido
     *  5          | 1            | 1
     *  5645748    | 7            | 7
     *  68         | 2            | 2
     * */

    public static void main(String[] args) {
        int nCifras = 0;
        int entradaUsuario;
        Scanner sc = new Scanner(System.in);
        boolean correcto = false;

        do{
            try{
                System.out.print("Introduce un número: ");
                entradaUsuario = sc.nextInt();

                /* comprobamos si es menor o igual a 0, en caso afirmativo manda un mensaje y en caso
                 * contrario ejecuta el bucle y cuenta las cifras*/
                if(entradaUsuario <= 0){
                    System.out.println("Error: Es menor o igual a 0.");
                }else{
                    /* dividimos entre 10 hasta que no se pueda y contamos cada división*/
                    while(entradaUsuario != 0){
                        nCifras++;
                        entradaUsuario /= 10;
                    }

                    System.out.printf("Número de cifras: %d", nCifras);
                    correcto = true;
                }
            }catch(InputMismatchException e){
                System.err.println("Error al introducir los datos. Intentelo de nuevo.");
                sc.nextLine();
            }
        }while(!correcto);

    }

}

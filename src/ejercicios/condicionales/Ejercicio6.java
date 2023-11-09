package ejercicios.condicionales;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio6 {
    /*
     * PRUEBAS:
     * Suma    | Entrada    | ResIdeal                                  | ResObt
     * 85+75   | 160        | Enhorabuena, tu resultado es correcto.    | Enhorabuena, tu resultado es correcto.
     * 29+43   | 3          | Lo siento, tu resultado es incorrecto...  | Lo siento, tu resultado es incorrecto...
     * 77+82   | 123        | Lo siento, tu resultado es incorrecto...  | Lo siento, tu resultado es incorrecto...
     * */
    public static void main(String[] args) {
        // declaramos los números aleatorios
        int n1 = (int) (1 + Math.random() * 99);
        int n2 = (int) (1 + Math.random() * 99);
        int suma = n1 + n2;
        Scanner sc = new Scanner(System.in);
        int entradaUsuario;
        boolean correcto = false;

        do{
            try {
                // pedimos el número al usuario
                System.out.printf("Resuelve esta suma: %d+%d\nTu respuesta: ", n1, n2);
                entradaUsuario = sc.nextInt();

                // comprobamos su resultado
                if(entradaUsuario == suma){
                    System.out.println("Enhorabuena, tu resultado es correcto.");
                }else{
                    System.out.println("Lo siento, tu resultado es incorrecto...");
                }
                correcto = true;
            }catch (InputMismatchException e){
                System.err.println("El dato introducido es incorrecto.");
                sc.nextLine();
            }
        }while(!correcto);

        sc.close();
    }
}

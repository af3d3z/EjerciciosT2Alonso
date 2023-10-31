package ejercicios.condicionales;

import java.util.Scanner;

public class Ejercicio1 {

    /*
    * PRUEBAS:
    * Entrada | ResIdeal      | ResObt
    * 828     | Es capicúa    | Es capicúa.
    * 123     | No es capicúa | No es capicúa.
    * 999     | Es capicúa    | Es capicúa.
    * 2442    | Es capicúa    | Es capicúa.
    * */
    public static void main(String[] args) {
        int entradaUsuario;
        int n1, n2, n3, n4;
        boolean esCapicua = false;
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un número: ");
        entradaUsuario = sc.nextInt();

        if(entradaUsuario > 0 && entradaUsuario <= 9999){
            if(entradaUsuario < 10){
                esCapicua = true;
            }

            n1 = entradaUsuario / 1000;
            n2 = ((entradaUsuario % 1000)/100) % 10;
            n3 = entradaUsuario % 100 / 10;
            n4 = entradaUsuario % 10;

            System.out.println(n1 + " " + n2 + " " + n3 + " " + n4);

            if(entradaUsuario < 100 && n3 == n4){
                esCapicua = true;
            }

            if(entradaUsuario < 1000 && n2 == n4){
                esCapicua = true;
            }

            if(entradaUsuario < 10000 && n1 == n4 && n2 == n3){
                esCapicua = true;
            }

            if (esCapicua){
                System.out.println("Es capicúa.");
            }else {
                System.out.println("No es capicúa.");
            }

        }else {
            System.out.println("El número debe de estar entre 0 y 9999.");
        }
    }
}

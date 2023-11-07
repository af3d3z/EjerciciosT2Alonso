package ejercicios.condicionales;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        int n1 = (int) (1 + Math.random() * 99);
        int n2 = (int) (1 + Math.random() * 99);
        int suma = n1 + n2;
        Scanner sc = new Scanner(System.in);
        int entradaUsuario;

        System.out.printf("Resuelve esta suma: %d+%d\nTu respuesta:", n1, n2);
        entradaUsuario = sc.nextInt();

        if(entradaUsuario == suma){
            System.out.println("Enhorabuena, tu resultado es correcto.");
        }else{
            System.out.println("Lo siento, tu resultado es incorrecto...");
        }

        sc.close();
    }
}

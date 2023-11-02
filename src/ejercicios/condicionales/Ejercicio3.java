package ejercicios.condicionales;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio3 {

    /*
    * PRUEBAS:
    * Entrada (comidaComprada, comidaNecesaria, nAnimales) | ResIdeal      | ResObt
     * 10, 7, 3    | Es suficiente            | Es suficiente
     * 20, 15, 20  | Es suficiente            | Es suficiente
     * 90, 100, 60 | Es insuficiente (1.5kg)  | Es insuficiente (1.5kg)
     * 23, 25, 10  | Es insuficiente (2.3kg)  | Es insuficiente (2.3kg)
     * */
    public static void main(String[] args) {
        // valores que se le solicitarán al usuario
        // cantidad de comida comprada
        double cantidadComida;
        // número de animales
        int nAnimales;
        // kilos de comida que necesitan todos los animales por día
        double cantidadAlimentoNecesitado;
        // kilos de comida que requiere un animal por día.
        double cantidadAlimentoRequeridaPorAnimal;
        double cantidadAlimentoSuministradaPorAnimal;
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);


        System.out.println("Introduce la cantidad de comida comprada: ");
        cantidadComida = sc.nextDouble();
        // si el usuario nos da un valor inválido lo volveremos a preguntar
        while(cantidadComida <= 0){
            System.out.println("Los animales se morirán de hambre. Compra más comida.");
            System.out.println("Introduce la cantidad de comida comprada:");
            cantidadComida = sc.nextDouble();
        }

        System.out.println("Introduce el número de animales:");
        nAnimales = sc.nextInt();
        while(nAnimales <= 0){
            System.out.println("No puedes no tener animales. Vuelve a introducir el número de animales.");
            nAnimales = sc.nextInt();
        }

        System.out.println("Introduce el número de kilos que comen en total los animales por día:");
        cantidadAlimentoNecesitado = sc.nextDouble();
        while(cantidadAlimentoNecesitado <= 0){
            System.out.println("Los animales necesitan comida para vivir. Vuelve a introducir el valor:");
            cantidadAlimentoNecesitado = sc.nextDouble();
        }

        // calculamos la cantidad de alimento que necesita cada animal por día
        cantidadAlimentoRequeridaPorAnimal = cantidadAlimentoNecesitado / nAnimales;
        // calculamos la cantidad de alimento que le tocaría a cada animal
        cantidadAlimentoSuministradaPorAnimal = cantidadComida / nAnimales;

        if(cantidadAlimentoSuministradaPorAnimal < cantidadAlimentoRequeridaPorAnimal){
            System.out.println("La cantidad de alimento es insuficiente.");
            System.out.printf("Cada animal comería %f kilos de comida\n", cantidadAlimentoSuministradaPorAnimal);
        }else {
            System.out.println("La cantidad de alimento suministrada es suficiente.");
        }

        sc.close();
    }
}

package ejercicios.condicionales;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        final double PRECIO_KM = 2.5;
        double distancia, precioBillete;
        int nDias;
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        System.out.println("Ingrese el número de kilómetros que recorerá en tren:");
        distancia = sc.nextDouble();

        System.out.println("Ingrese el número de días de su estancia:");
        nDias = sc.nextInt();

        if(distancia > 800 && nDias > 7){
            precioBillete = (distancia * PRECIO_KM) - (0.3 * (distancia * PRECIO_KM));
        }else {
            precioBillete = distancia * PRECIO_KM;
        }

        System.out.printf("Precio final del billete: %.2f€\nDistancia: %.2f km\nNº días de estancia: %d\n", precioBillete, distancia, nDias);
        sc.close();
    }
}

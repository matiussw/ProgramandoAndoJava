import java.util.Scanner;

import Guia1.GuiaMain;

public class Main {
    public static void main(String[] args) {
        System.out.println("Bienvenido A Programando Ando");
        System.out.println("Aqui Aprenderas Java");
        System.out.println("Ingrese una opcion para El Programa");
        System.out.println("1.Ejercicio Guia 1");

        int opcion;

        Scanner input = new Scanner(System.in);

        opcion = input.nextInt();

        if (opcion == 1) {
            System.out.println("Ingresando A Ejercicios Guia 1");
            GuiaMain Guia1 =new GuiaMain();
            Guia1.Ejercicio10();
        }
    }
}

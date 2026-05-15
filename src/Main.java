import java.util.Scanner;

import javax.swing.JOptionPane;

import Guia1.GuiaMain;

public class Main {
    public static void main(String[] args) {

        
        int opcion = Integer.parseInt(
                JOptionPane.showInputDialog(null, "Bienvenido A Programando Ando \n" +
                        "Aqui Aprenderas Java  \n" +
                        "Ingrese una opcion para El Programa\n" +
                        "1.Ejercicio Guia 1\n" +
                        "2.Ejercicio Guia 1\n"));


        if (opcion == 1) {
            System.out.println("Ingresando A Ejercicios Guia 1");
            GuiaMain Guia1 = new GuiaMain();
            Guia1.Guia1();
        }
         if (opcion == 2) {
            System.out.println("Ingresando A Ejercicios Guia 1");
            GuiaMain Guia1 = new GuiaMain();
            Guia1.Guia1();
        }
    }
}

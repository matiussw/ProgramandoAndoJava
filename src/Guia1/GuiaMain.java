package Guia1;

import java.nio.channels.NetworkChannel;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class GuiaMain {

   public void Guia1() {
  

      Scanner lector = new Scanner(System.in);

      System.out.println("Ingrese una opcion de Ejercicio");
      int opcion = Integer.parseInt(JOptionPane.showInputDialog(null, "Bienvenido a lista de ejercicios Guia 1 \n" +
            "1.Ejercicios Estructuras Condicionales\n" +
            "2.Ejercicios practicos: ciclos for, while y arreglos.\n" +
            "Ingrese una opcion de Ejercicio\n"));

      if (opcion == 1) {
         System.out.println("1.ejercicio Estructuras Condicionales");
         System.out.println("Lista de Ejercicios");
         System.out.println(
               "5.Pida un anio y determine si es bisiesto. Reglas: divisible entre 4, no entre 100, excepto si es divisible entre 400.");
         System.out.println(
               "8.Solicite el valor de una compra y aplique descuento: >$500.000 = 20%, >$200.000 = 15%, >$100.000 = 10%. Mostrar valor original, descuento y total.\n"
                     + //
                     "");
         System.out.println(
               "10.Solicite peso (kg) y altura (m). Calcule IMC = peso / (altura * altura). Clasifique: <18.5 Bajo peso, 18.5-24.9 Normal, 25-29.9 Sobrepeso, >=30 Obesidad.");

         opcion = lector.nextInt();
         if (opcion == 5) {
            Ejercicio5();
         }
         if (opcion == 8) {
            Ejercicio8();
         }
         if (opcion == 10) {
            Ejercicio10();
         }

      } else if (opcion == 2) {
         System.out.println("2.Ejercicios practicos: ciclos for, while y arreglos.");
         System.out.println("17.Mostrar la tabla de multiplicar del numero 7 usando un ciclo for.");
         System.out.println("21.Calcular el factorial de un numero almacenado en una variable usando un ciclo for");
         System.out.println("27.Imprimir un cuadrado de 6x6 asteriscos usando ciclos for anidados.");
         System.out
               .println("29.Recorrer una cadena de texto e imprimir cada caracter en una linea usando un ciclo for.");
         System.out.println("Ingrese una opcion ");
         opcion = lector.nextInt();

         if (opcion == 17) {
            System.out.println("Ingreso al Ejercicio 17");
            Ejercicio17();
         }
         if (opcion == 21) {
            System.out.println("Ingreso al Ejercicio 21");
            Ejercicio21();
         }
         if (opcion == 27) {
            System.out.println("Ingreso al Ejercicio 27");
            Ejercicio27();
         }
         if (opcion == 29) {
            System.out.println("Ingreso al Ejercicio 29");
            Ejercicio29();
         }

      } else {
         System.out.println("Ingreso una opcion Invalidad");
      }

   }

   public void Ejercicio17() {
      Ejercicio17 TablaDel7 = new Ejercicio17();
      TablaDel7.TablaMultiplicarDel7();
   }

   public void Ejercicio21() {
      Ejercicio21 FactorialDeUnNumero = new Ejercicio21();
      FactorialDeUnNumero.FactorialDeUnNumero();
   }

   public void Ejercicio27() {
      Ejercicio27 cuadrado = new Ejercicio27();
      cuadrado.MostraFiguraCuadrada();
   }

   public void Ejercicio29() {
      Ejercicio29 ImprimirLetra = new Ejercicio29();
      ImprimirLetra.ImprimirLetrasDeUnString();
   }

   public void Ejercicio10() {
      Ejercicio10 IMC = new Ejercicio10();
      IMC.CalcularIMC();
   }

   public void Ejercicio5() {
      Ejercicio5 Bisiesto = new Ejercicio5();
      Bisiesto.CalcularAnioBisiesto();
   }

   public void Ejercicio8() {
      Ejercicio8 Ventas = new Ejercicio8();
      Ventas.CalculoVentas();
   }

}

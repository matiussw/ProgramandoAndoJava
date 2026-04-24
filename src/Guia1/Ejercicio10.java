package Guia1;
/*
Solicite peso (kg) y altura (m). Calcule IMC = peso / (altura * altura). 
Clasifique: <18.5 Bajo peso, 18.5-24.9 Normal, 25-29.9 Sobrepeso, >=30 Obesidad.

*/

import java.util.Scanner;

public class Ejercicio10 {

    public void CalcularIMC() {
        double peso;
        double altura;

        Scanner info = new Scanner(System.in);

        System.out.println("Ingreso al ejercicio 10 De La guia 1");
        System.out.println("Ingrese su peso en Kg");
        peso = info.nextDouble();

        System.out.println("Ingrese su Altura en M");
        altura = info.nextDouble();

        double IMC = peso / (altura * altura);

        if (IMC < 18.5) {
            System.out.println("Bajo peso");
        }
          if (IMC >= 18.5 && IMC <= 24.9) {
            System.out.println("Normal");
        }
          if (IMC >= 25 && IMC <= 29.9) {
            System.out.println("Sobrepeso");
        }
         if (IMC >= 30) {
            System.out.println("Obesidad");
        }

    }

}

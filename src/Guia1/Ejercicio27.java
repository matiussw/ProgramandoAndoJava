package Guia1;

import java.util.Scanner;

public class Ejercicio27 {
    
    public void MostraFiguraCuadrada(){

        System.out.println("Ingrese de cuanto va ser el cuadrado ");
        Scanner IngresoCuadrado=new Scanner(System.in);

        int TamanoCuadrado=IngresoCuadrado.nextInt();

        for (int g=1 ; g<TamanoCuadrado;g++){

            for (int z=1 ;z<TamanoCuadrado;z++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }

}

package Guia1;

import java.util.Scanner;

public class Ejercicio29 {
    
    public void ImprimirLetrasDeUnString(){
        System.out.println("Ingrese un texto para imprimir letra por letra en un ciclo");
        Scanner LetraIngre =new Scanner(System.in);

        String Texto = LetraIngre.next();


        for(int j=0 ;j<Texto.length();j++){

            char letra=Texto.charAt(j);
            System.out.println(letra);

        }


    }

}

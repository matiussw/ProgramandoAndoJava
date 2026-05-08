package Guia1;

import java.util.Scanner;

//Solicite el valor de una compra y aplique descuento: >$500.000 = 20%,
//  >$200.000 = 15%, >$100.000 = 10%. Mostrar valor original, descuento y total.
public class Ejercicio8 {

    public void CalculoVentas() {
        Scanner IngresoVentas = new Scanner(System.in);

        System.out.println("Ingrese Un Valor de Ventas ");
        double Ventas = IngresoVentas.nextDouble();

        if (Ventas > 500000) {
            System.out.println("Aplica Para Descuento el valor de Descuento es del 20%");
            System.out.println("El Valor de la venta es de " + Ventas);
            System.out.println("El Descuento es de " + (Ventas * 0.20));
            System.out.println("El total a pagar por la venta es de " + (Ventas - (Ventas * 0.20)));
        } else if (Ventas > 200000) {
            System.out.println("Aplica Para Descuento el valor de Descuento es del 15%");
            System.out.println("El Valor de la venta es de " + Ventas);
            System.out.println("El Descuento es de " + (Ventas * 0.15));
            System.out.println("El total a pagar por la venta es de " + (Ventas - (Ventas * 0.15)));

        }else if (Ventas > 100000) {
            System.out.println("Aplica Para Descuento el valor de Descuento es del 10%");
            System.out.println("El Valor de la venta es de " + Ventas);
            System.out.println("El Descuento es de " + (Ventas * 0.10));
            System.out.println("El total a pagar por la venta es de " + (Ventas - (Ventas * 0.10)));

        }else {
            System.out.println("No aplica para descuento ");
            System.out.println("El Total pagar por la venta "+Ventas);
        }

    }

}

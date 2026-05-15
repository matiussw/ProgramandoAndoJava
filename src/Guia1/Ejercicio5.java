package Guia1;

import java.util.Scanner;

import javax.swing.JOptionPane;

//Pida un anio y determine si es bisiesto. 
// Reglas: divisible entre 4, no entre 100, excepto si es divisible entre 400.
public class Ejercicio5 {

    public void CalcularAnioBisiesto() {
        int anio = Integer.parseInt(JOptionPane.showInputDialog(null,
                "Ingrese un anio Para Saber si es bisiesto o no"));
        if (anio % 4 == 0 && anio % 100 != 0) {
            JOptionPane.showMessageDialog(null, "El Anio ingresado es Bisiesto " + anio);
        } else {
            JOptionPane.showMessageDialog(null, "El Anio ingresado NO es Bisiesto " + anio);
        }
    }
}

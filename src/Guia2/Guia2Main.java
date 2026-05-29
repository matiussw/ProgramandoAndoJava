package Guia2;

import javax.swing.JOptionPane;

public class Guia2Main {
    public void Guia2() {
        JOptionPane.showMessageDialog(null, "Bienvenido a la Guia 2 \n " +
                "Aqui Aprenderas a usar Try catch");

        int numeroA = ingresarEnteros();
        int numeroB = ingresarEnteros();
        int Suma = numeroA + numeroB;
        JOptionPane.showMessageDialog(null, "La suma es " + Suma);
    }

    public int ingresarEnteros() {
        int Numero = 0;
        while (true) {
            try {
                Numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero para sumar Numero"));
                return Numero;
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null,"Ingrese un Numero Entero "+e);
            }
        }
    }

}

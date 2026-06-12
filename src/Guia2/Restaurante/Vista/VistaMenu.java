package Guia2.Restaurante.Vista;

import javax.swing.JOptionPane;
import javax.swing.JTextField;
import Guia2.Restaurante.Controlador.menuControlador;

public class VistaMenu {

    public void mostrarMenu(String userTipe) {
        menuControlador menu = new menuControlador();
        if (userTipe.equals("admin")) {
            JTextField NombrePlato = new JTextField();
            JTextField ValorPlato = new JTextField();

            Object[] campos = {
                    "Nombre plato", NombrePlato,
                    "Valor Plato", ValorPlato
            };

            int opcion = JOptionPane.showConfirmDialog(null, campos, "Insertar Plato",
                    JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
            String Nom_Plato = NombrePlato.getText().trim();
            Double Precio = Double.parseDouble(ValorPlato.getText().trim());
            menu.AdminMenu(userTipe, Nom_Plato, Precio);
        } else {
            JOptionPane.showMessageDialog(null, menu.AdminMenu(userTipe, "test", 2.2));
        }

    }

}

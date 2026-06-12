package Guia2.Restaurante.Vista;

import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import Guia2.Restaurante.Controlador.loginControlador;

public class LoginVista {
    public void mostrarLogin() {
        JTextField campoUsuario = new JTextField();
        JPasswordField campoClave = new JPasswordField();

        Object[] campos = {
                "Usuario", campoUsuario,
                "Password", campoClave
        };

        int opcion = JOptionPane.showConfirmDialog(null, campos, "Iniciar Sesion",
                JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);

        if (opcion != JOptionPane.OK_OPTION) {

            JOptionPane.showMessageDialog(null, "El Usurio cancelo el inicio de sesion");
            return;
        }

        String Usuario = campoUsuario.getText().trim();
        String password = new String(campoClave.getPassword());

        loginControlador login = new loginControlador();

        String tipoUser = login.login(Usuario, password);

        if (tipoUser == "Admin") {
            JOptionPane.showMessageDialog(null, "Bienvenido " + Usuario + "Su Rol " + tipoUser);
        } else {
            JOptionPane.showMessageDialog(null, "Bienvenido " + Usuario + "Su Rol " + tipoUser);
            VistaMenu menuVista =new VistaMenu();
            menuVista.mostrarMenu(tipoUser);
        }

    }

}
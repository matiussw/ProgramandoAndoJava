package Guia2;

import javax.swing.JOptionPane;

import ConexionDb.InicializarDB;
import Guia2.Restaurante.Controlador.loginControlador;
import Guia2.Restaurante.Modelo.CrearTablas;
import Guia2.Restaurante.Modelo.InsertarData;
import Guia2.Restaurante.Vista.LoginVista;

public class MainPersistenciaData {
    public void MenuBaseDeDatos() {
        int opcion = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresando A Ejercicios Base De Datos \n" +
                "1.Actividad 3.3 Guia 2 Crear Base de Ejemplo \n" +
                "2.Actividad 3.4 Creando Sistema Con Login"));

        if (opcion == 1) {
         InicializarDB crearTabDb = new InicializarDB();
         crearTabDb.crearTablas();
        }

        if (opcion == 2) {
        CrearTablas crear = new CrearTablas();
        crear.crearTablaUsers();
        InsertarData insertarData =new InsertarData();
        insertarData.insertarData();
        LoginVista loginVista =new LoginVista();
        loginVista.mostrarLogin();
            

        }
    }
}

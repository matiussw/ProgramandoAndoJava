package Guia2;

import javax.swing.JOptionPane;

import ConexionDb.ConexionDB;

public class MainPersistenciaData {
    public void MenuBaseDeDatos(){
        int opcion=Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresando A Ejercicios Base De Datos \n"+
       "1.Actividad 3.3 Guia 2 Crear Base de Ejemplo \n"+
       "2.Actividad 3.4 Creando Sistema Con Login"));


       if (opcion==1){
        ConexionDB crearDb =new ConexionDB();
        crearDb.getConexion();
       }
    }
}

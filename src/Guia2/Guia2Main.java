package Guia2;
import javax.swing.JOptionPane;

public class Guia2Main {
    public void Guia2() {

        int opcion= Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresando a los Ejercicios De la guia 2 \n"+
       "1.Ejercicios Try Catchn\n"+
       "2.Ingresando A Ejercicios Con Base De Datos"));


       if (opcion==1){
        Ejercicio1 Ejercicio = new Ejercicio1();
        Ejercicio.Division();
       }
       if (opcion==2){
        MainPersistenciaData BaseDatos =new MainPersistenciaData();
        BaseDatos.MenuBaseDeDatos();
       }
      
    }
}

package Guia2.Restaurante.Modelo;

public class Menu {
    private int id_Menu;
    private String nombre_Menu;
    private double precio;

    public Menu(int id_Menu, String nombre_Menu, double precio) {
        this.id_Menu = id_Menu;
        this.nombre_Menu = nombre_Menu;
        this.precio = precio;
    }

    public int getId_Menu() {
        return id_Menu;
    }

    public void setId_Menu(int id_Menu) {
        this.id_Menu = id_Menu;
    }

    public String getNombre_Menu() {
        return nombre_Menu;
    }

    public void setNombre_Menu(String nombre_Menu) {
        this.nombre_Menu = nombre_Menu;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}

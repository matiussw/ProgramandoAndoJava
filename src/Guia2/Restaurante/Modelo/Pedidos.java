package Guia2.Restaurante.Modelo;

public class Pedidos {
    private int id_pedido;
    private int id_menu;
    private int id_mesa;
    private int id_Usuario;

    public Pedidos(int id_pedido, int id_menu, int id_mesa, int id_Usuario) {
        this.id_pedido = id_pedido;
        this.id_menu = id_menu;
        this.id_mesa = id_mesa;
        this.id_Usuario = id_Usuario;
    }

    public int getId_pedido() {
        return id_pedido;
    }

    public void setId_pedido(int id_pedido) {
        this.id_pedido = id_pedido;
    }

    public int getId_menu() {
        return id_menu;
    }

    public void setId_menu(int id_menu) {
        this.id_menu = id_menu;
    }

    public int getId_mesa() {
        return id_mesa;
    }

    public void setId_mesa(int id_mesa) {
        this.id_mesa = id_mesa;
    }

    public int getId_Usuario() {
        return id_Usuario;
    }

    public void setId_Usuario(int id_Usuario) {
        this.id_Usuario = id_Usuario;
    }
}

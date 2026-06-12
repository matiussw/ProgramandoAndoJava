package Guia2.Restaurante.Modelo;

public class Mesas {
    private int id_Mesa;
    private String num_mesa;

    public Mesas(int id_Mesa, String num_mesa) {
        this.id_Mesa = id_Mesa;
        this.num_mesa = num_mesa;
    }

    public int getId_Mesa() {
        return id_Mesa;
    }

    public void setId_Mesa(int id_Mesa) {
        this.id_Mesa = id_Mesa;
    }

    public String getNum_mesa() {
        return num_mesa;
    }

    public void setNum_mesa(String num_mesa) {
        this.num_mesa = num_mesa;
    }

}

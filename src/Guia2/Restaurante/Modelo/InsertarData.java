package Guia2.Restaurante.Modelo;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import ConexionDb.ConexionDB;

public class InsertarData {

    public void insertarData() {
        String seedUsuarios = "INSERT OR IGNORE INTO Usuarios(username, password, user_type) " +
                "VALUES ('admin','1234','admin'), ('juan','abcd','vendedor')";

        String seedMenu = "INSERT OR IGNORE INTO Menu(Nombre_Menu, Precio) " +
                "VALUES ('Bandeja Paisa', 28000), ('Arepa con Queso', 6000), ('Jugo de Lulo', 5000)";

        String seedMesas = "INSERT OR IGNORE INTO Mesas(NumeroMesa) " +
                "VALUES ('1'), ('2'), ('3'), ('4')";

        String seedPedidos = "INSERT INTO Pedidos(id_Menu, id_Mesa, id_Usuario) " +
                "VALUES (" +
                "  (SELECT id_menu FROM Menu  WHERE Nombre_Menu = 'Bandeja Paisa')," +
                "  (SELECT id_mesa FROM Mesas WHERE NumeroMesa  = '1')," +
                "  (SELECT id      FROM Usuarios WHERE username = 'juan')" +
                ")";

        try (
                Connection conn = ConexionDB.getConexion();
                Statement stmt = conn.createStatement()) {
            stmt.execute(seedUsuarios);
            stmt.execute(seedMenu);
            stmt.execute(seedMesas);
            stmt.execute(seedPedidos);
            System.out.println("Data insertada");
        } catch (SQLException e) {
            System.out.println("Error de base de datos: " + e.getMessage());
        }
    }
}

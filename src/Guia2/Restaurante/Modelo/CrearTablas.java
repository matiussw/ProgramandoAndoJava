package Guia2.Restaurante.Modelo;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import ConexionDb.ConexionDB;

public class CrearTablas {

    public void crearTablaUsers() {
        String sql = "CREATE TABLE IF NOT EXISTS Usuarios (" +
                "id       INTEGER PRIMARY KEY AUTOINCREMENT," +
                "username   TEXT    NOT NULL," +
                "password   TEXT    NOT NULL," +
                "user_type TEXT   NOT NULL CHECK(user_type IN ('admin','vendedor')))";

        String slqMenu = "CREATE TABLE IF NOT EXISTS Menu (" +
                "id_menu       INTEGER PRIMARY KEY AUTOINCREMENT," +
                "Nombre_Menu   TEXT    NOT NULL," +
                "Precio   Real    NOT NULL)";

        String slqMesas = "CREATE TABLE IF NOT EXISTS Mesas (" +
                "id_mesa      INTEGER PRIMARY KEY AUTOINCREMENT," +
                "NumeroMesa   TEXT    NOT NULL)";

        String slqPedidos = "CREATE TABLE IF NOT EXISTS Pedidos (" +
                "id_pedido       INTEGER PRIMARY KEY AUTOINCREMENT," +
                "id_Menu   INTEGER," +
                "id_Mesa   INTEGER," +
                "id_Usuario   INTEGER," +
                "FOREIGN KEY (id_Mesa) REFERENCES Menu(id_mesa)," +
                "FOREIGN KEY (id_Menu) REFERENCES Mesas(id_menu)," +
                "FOREIGN KEY (id_Usuario) REFERENCES Usuarios(id)" +
                " )";

        try (
                Connection conn = ConexionDB.getConexion();
                Statement stmt = conn.createStatement()) {
            stmt.execute(sql);
            stmt.execute(slqMenu);
            stmt.execute(slqMesas);
            stmt.execute(slqPedidos);
            System.out.println("Tablas validadas.");
        } catch (SQLException e) {
            System.out.println("Error de base de datos: " + e.getMessage());
        }
    }

}
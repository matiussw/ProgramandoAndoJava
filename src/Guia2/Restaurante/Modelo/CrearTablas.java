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
                "user_type TEXT   NOT NULL CHECK(user_type IN ('admin','vendedor'))) , " +

                "CREATE TABLE IF NOT EXISTS Menu (" +
                "id       INTEGER PRIMARY KEY AUTOINCREMENT," +
                "Nombre_Menu   TEXT    NOT NULL," +
                "Precio   Real    NOT NULL,";
        try (
                Connection conn = ConexionDB.getConexion();
                Statement stmt = conn.createStatement()) {
            stmt.execute(sql);
            System.out.println("Tabla Usuarios validada.");
        } catch (SQLException e) {
            System.out.println("Error de base de datos: " + e.getMessage());
        }
    }

}
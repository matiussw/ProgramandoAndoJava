package Guia2.Restaurante.Modelo;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import ConexionDb.ConexionDB;

public class InsertarData {

    public void insertarData() {
        String sqlSeed = "INSERT OR IGNORE INTO usuarios(username, password, user_type) " +
                "VALUES ('admin','1234','admin'), ('juan','abcd','vendedor')";
        try (
                Connection conn = ConexionDB.getConexion();
                Statement stmt = conn.createStatement()) {
            stmt.execute(sqlSeed);
            System.out.println("Data Insertada");
        } catch (SQLException e) {
            System.out.println("Error de base de datos: " + e.getMessage());
        }
    }
}

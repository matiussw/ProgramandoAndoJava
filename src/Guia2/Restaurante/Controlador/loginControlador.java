package Guia2.Restaurante.Controlador;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import ConexionDb.ConexionDB;
import Guia2.Restaurante.Modelo.Usuarios;

public class loginControlador {

    public String login(String User, String Pass) {
        String select = "SELECT * FROM Usuarios " +
                "WHERE username = ? AND password = ?";
        try (
                Connection conn = ConexionDB.getConexion();
                PreparedStatement stmt = conn.prepareStatement(select)) {

            stmt.setString(1, User);
            stmt.setString(2, Pass);

            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                System.out.println(rs.getString("username"));
                System.out.println(rs.getString("password"));
                System.out.println(rs.getString("user_type"));
                
                Usuarios user = new Usuarios(rs.getString("username"),
                        rs.getString("password"),
                        rs.getString("user_type"));
                return user.getUser_type();
            }

        } catch (SQLException e) {
            System.out.println("Mensaje al consultar en la db " + e.getMessage());
        }
        return null;
    }
}

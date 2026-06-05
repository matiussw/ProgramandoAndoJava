package Guia2.Restaurante.Controlador;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import ConexionDb.ConexionDB;

public class loginControlador {

    public String login(String User, String Pass) {
        String select = "SELECT user_type FROM Usuarios " +
                "WHERE username = ? AND password = ?";
        try (
            Connection conn = ConexionDB.getConexion();
            PreparedStatement stmt = conn.prepareStatement(select)) {
            
                stmt.setString(1, User);
                stmt.setString(2, Pass);

                ResultSet rs = stmt.executeQuery();
                if (rs.next()){
                    return rs.getString("user_type");
                }

        } catch (SQLException e) {
            System.out.println("Mensaje al consultar en la db "+e.getMessage());
        }
        return null ;
    }
}

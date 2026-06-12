package Guia2.Restaurante.Controlador;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import ConexionDb.ConexionDB;
import Guia2.Restaurante.Modelo.Menu;

public class menuControlador {

    public List AdminMenu(String type_user, String nomPlato, double preciDouble) {
        if (type_user.equals("admin")) {
            String seedMenu = "INSERT OR IGNORE INTO Menu(Nombre_Menu, Precio) " +
                    "VALUES (?,?)";

            try (
                    Connection conn = ConexionDB.getConexion();
                    PreparedStatement stmt = conn.prepareStatement(seedMenu)) {
                stmt.setString(1, nomPlato);
                stmt.setDouble(2, preciDouble);

                stmt.execute();
                System.out.println("Data insertada");
            } catch (SQLException e) {
                System.out.println("Error de base de datos: " + e.getMessage());
            }

            return null;

        } else {
            String select = "SELECT * FROM Menu ";
            try (
                    Connection conn = ConexionDB.getConexion();
                    PreparedStatement stmt = conn.prepareStatement(select)) {
                ResultSet rs = stmt.executeQuery();
                System.out.println(rs);
                List<Menu> menus = new ArrayList<>();
                while (rs.next()) {

                    System.out.println(rs.getString("id_menu"));
                    System.out.println(rs.getString("Nombre_Menu"));
                    System.out.println(rs.getString("Precio"));

                    int idMenu = Integer.parseInt(rs.getString("id_menu"));
                    double precio = Double.parseDouble(rs.getString("Precio"));

                    Menu menu = new Menu(idMenu, rs.getString("Nombre_Menu"), precio);
                    menus.add(menu);
                }
                return menus;

            } catch (SQLException e) {
                System.out.println("Mensaje al consultar en la db " + e.getMessage());
            }
            return null;

        }

    }

}

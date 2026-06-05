package ConexionDb;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class InicializarDB {
   public static void crearTablas() {
       String sql = "CREATE TABLE IF NOT EXISTS productos (" +
                    "id       INTEGER PRIMARY KEY AUTOINCREMENT," +
                    "nombre   TEXT    NOT NULL," +
                    "precio   REAL    NOT NULL," +
                    "cantidad INTEGER NOT NULL)";
       try (
        Connection conn = ConexionDB.getConexion();
            Statement stmt = conn.createStatement()) {
           stmt.execute(sql);
           System.out.println("Tabla productos validada/creada.");
       } catch (SQLException e) {
           System.out.println("Error de base de datos: " + e.getMessage());
       }
   }
}

package sv.edu.utec;

import sv.edu.utec.datos.ConexionDB;
import java.sql.Connection;
import  java.sql.SQLException;

public class Main {
    public static void main(String[] args) {

        probarConexion();
    }
        private static void probarConexion() {
            try (Connection cn = ConexionDB.obtenerConexion()) {
                if (cn != null && !cn.isClosed()) {
                    System.out.println("Conexion exitosa a:" + cn.getMetaData().getURL());

                }

            } catch (SQLException e) {
                System.out.println("Error de conexion" + e.getMessage());
            }
        }
}

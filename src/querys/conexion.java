package querys;

import java.sql.*;

/**
 *
 * @author ascen
 */
public class conexion {

    private static Connection conexion;
    private static final String usuario = "root";
    private static final String contraseña = "1205";
    private static final String base = "punto_venta";
    private static final String puerto = "3306";
    private static final String url = "jdbc:mysql://localhost:" + puerto + "/" + base;

    public static Connection abrirConexion() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexion = DriverManager.getConnection(url, usuario, contraseña);
            System.out.println("Conexión exitosa");
        } catch (SQLException | ClassNotFoundException ex) {
            ex.printStackTrace();
        }
        return conexion;
    }

    public static void cerrarConexion() {
        try {
            if (conexion != null && !conexion.isClosed()) {
                conexion.close();
                System.out.println("Conexión cerrada");
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}

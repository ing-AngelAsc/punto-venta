/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package querys;

import java.sql.*;

/**
 *
 * @author ascen
 */
public class login {

    public static boolean autenticar(String usuario, String contraseña) {
        Connection conn = null;
        boolean autenticado = false;

        try {
            // Abrir conexión
            conn = conexion.abrirConexion();

            // Preparar consulta SQL
            String sql = "SELECT * FROM tabla_usuarios WHERE usuario = ? AND password  = ?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, usuario);
            stmt.setString(2, contraseña);

            // Ejecutar consulta
            ResultSet rs = stmt.executeQuery();

            // Validar si existe un resultado
            if (rs.next()) {
                autenticado = true;
            }

            // Cerrar ResultSet y PreparedStatement
            rs.close();
            stmt.close();
        } catch (SQLException e) {
            // Mostrar error para fines de depuración
            e.printStackTrace();
        } finally {
            try {
                if (conn != null) {
                    conn.close(); // Asegurar cierre de la conexión
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        return autenticado;
    }
}

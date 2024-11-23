/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package querys;

import java.sql.*;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ascen
 */
public class cliente {

    public void cargarTablaClientes(DefaultTableModel modelo) {
        Connection conn = null;

        try {
            // Abrir conexión
            conn = conexion.abrirConexion();

            // Preparar consulta SQL
            String sql = "SELECT * FROM tabla_clientes";
            PreparedStatement stmt = conn.prepareStatement(sql);

            // Ejecutar la consulta
            ResultSet rs = stmt.executeQuery();

            // Limpiar el modelo de la tabla
            modelo.setRowCount(0);

            // Iterar sobre los resultados y añadirlos al modelo
            while (rs.next()) {
                Object[] fila = new Object[6];
                fila[0] = rs.getInt("id_cliente");
                fila[1] = rs.getString("nombres");
                fila[2] = rs.getString("apellidos");
                fila[3] = rs.getString("telefono");
                fila[4] = rs.getString("direccion");
                fila[5] = rs.getString("email");

                modelo.addRow(fila);
            }

            // Cerrar recursos
            rs.close();
            stmt.close();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (conn != null) {
                try {
                    conn.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public boolean actualizar(String nombres, String apellidos, String telefono, String direccion, String email, int id) {
        Connection conn = null;
        PreparedStatement stmt = null;

        try {
            // Abrir conexión
            conn = conexion.abrirConexion();

            // Preparar la consulta SQL de actualización
            String sql = "UPDATE tabla_clientes SET nombres = ?, apellidos = ?, telefono = ?, direccion = ?, email = ? WHERE id_cliente = ?";
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, nombres);
            stmt.setString(2, apellidos);
            stmt.setString(3, telefono);
            stmt.setString(4, direccion);
            stmt.setString(5, email);
            stmt.setInt(6, id);

            // Ejecutar la consulta
            int filasActualizadas = stmt.executeUpdate();

            return filasActualizadas > 0;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            try {
                if (stmt != null) {
                    stmt.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public boolean agregar(String nombres, String apellidos, String telefono, String direccion, String email) {
        Connection conn = null;
        PreparedStatement stmt = null;

        try {
            // Abrir conexión
            conn = conexion.abrirConexion();

            // Preparar la consulta SQL de inserción
            String sql = "INSERT INTO tabla_clientes (nombres, apellidos, telefono, direccion, email) VALUES (?, ?, ?, ?, ?)";
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, nombres);
            stmt.setString(2, apellidos);
            stmt.setString(3, telefono);
            stmt.setString(4, direccion);
            stmt.setString(5, email);

            // Ejecutar la consulta
            int filasInsertadas = stmt.executeUpdate();

            return filasInsertadas > 0;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            try {
                if (stmt != null) {
                    stmt.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }


    public boolean eliminar(int idProveedor) {
        Connection conn = null;
        PreparedStatement stmt = null;

        try {
            // Abrir conexión
            conn = conexion.abrirConexion();

            // Preparar la consulta SQL de eliminación
            String sql = "DELETE FROM tabla_clientes WHERE id_cliente = ?";
            stmt = conn.prepareStatement(sql);
            stmt.setInt(1, idProveedor);

            // Ejecutar la consulta
            int filasEliminadas = stmt.executeUpdate();

            return filasEliminadas > 0;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            try {
                if (stmt != null) {
                    stmt.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
